package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// No static is available
@js.native
trait MapVisual extends js.Object {
  
  /**
    * Draw a circle.
    * @param pos The position object of the center.
    * @param style The optional style
    * @returns The MapVisual object, for chaining.
    */
  def circle(pos: RoomPosition): MapVisual = js.native
  def circle(pos: RoomPosition, style: MapCircleStyle): MapVisual = js.native
  
  /**
    * Remove all visuals from the map.
    * @returns The MapVisual object, for chaining
    */
  def clear(): MapVisual = js.native
  
  /**
    * Returns a compact representation of all visuals added on the map in the current tick.
    * @returns A string with visuals data. There's not much you can do with the string besides store them for later.
    */
  def export(): String = js.native
  
  /**
    * Get the stored size of all visuals added on the map in the current tick. It must not exceed 1024,000 (1000 KB).
    * @returns The size of the visuals in bytes.
    */
  def getSize(): Double = js.native
  
  /**
    * Add previously exported (with `Game.map.visual.export`) map visuals to the map visual data of the current tick.
    * @param data The string returned from `Game.map.visual.export`.
    * @returns The MapVisual object itself, so that you can chain calls.
    */
  def `import`(data: String): MapVisual = js.native
  
  /**
    * Draw a line.
    * @param pos1 The start position object.
    * @param pos2 The finish position object.
    * @param style The optional style
    * @returns The MapVisual object, for chaining.
    */
  def line(pos1: RoomPosition, pos2: RoomPosition): MapVisual = js.native
  def line(pos1: RoomPosition, pos2: RoomPosition, style: MapLineStyle): MapVisual = js.native
  
  /**
    * Draw a polyline.
    * @param points An array of points. Every item should be a `RoomPosition` object.
    * @param style The optional style
    * @returns The MapVisual object, for chaining.
    */
  def poly(points: js.Array[RoomPosition]): MapVisual = js.native
  def poly(points: js.Array[RoomPosition], style: MapPolyStyle): MapVisual = js.native
  
  /**
    * Draw a rectangle.
    * @param topLeftPos The position object of the top-left corner.
    * @param width The width of the rectangle.
    * @param height The height of the rectangle.
    * @param style The optional style
    * @returns The MapVisual object, for chaining.
    */
  def rect(topLeftPos: RoomPosition, width: Double, height: Double): MapVisual = js.native
  def rect(topLeftPos: RoomPosition, width: Double, height: Double, style: MapPolyStyle): MapVisual = js.native
  
  /**
    * Draw a text label. You can use any valid Unicode characters, including emoji.
    * @param text The text message.
    * @param pos The position object of the label baseline.
    * @param style The optional style
    * @returns The MapVisual object, for chaining
    */
  def text(text: String, pos: RoomPosition): MapVisual = js.native
  def text(text: String, pos: RoomPosition, style: MapTextStyle): MapVisual = js.native
}
