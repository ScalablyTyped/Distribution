package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomVisual extends js.Object {
  
  /**
    * Draw a circle.
    * @param pos The position object of the center.
    * @param style An object describing the style.
    * @returns The RoomVisual object itself, so that you can chain calls.
    */
  def circle(pos: RoomPosition): RoomVisual = js.native
  def circle(pos: RoomPosition, style: CircleStyle): RoomVisual = js.native
  /**
    * Draw a circle.
    * @param x The X coordinate of the center.
    * @param y The Y coordinate of the center.
    * @param style The (optional) style.
    * @returns The RoomVisual object, for chaining.
    */
  def circle(x: Double, y: Double): RoomVisual = js.native
  def circle(x: Double, y: Double, style: CircleStyle): RoomVisual = js.native
  
  /**
    * Remove all visuals from the room.
    * @returns The RoomVisual object, for chaining.
    */
  def clear(): RoomVisual = js.native
  
  /**
    * Returns a compact representation of all visuals added in the room in the current tick.
    * @returns A string with visuals data. There's not much you can do with the string besides store them for later.
    */
  def export(): String = js.native
  
  /**
    * Get the stored size of all visuals added in the room in the current tick.
    * It must not exceed 512,000 (500 KB).
    * @returns The size of the visuals in bytes.
    */
  def getSize(): Double = js.native
  
  /**
    * Add previously exported (with `RoomVisual.export`) room visuals to the room visual data of the current tick.
    * @param data The string returned from `RoomVisual.export`.
    * @returns The RoomVisual object itself, so that you can chain calls.
    */
  def `import`(data: String): RoomVisual = js.native
  
  /**
    * Draw a line.
    * @param pos1 The start position object.
    * @param pos2 The finish position object.
    * @param style The (optional) style.
    * @returns The RoomVisual object, for chaining.
    */
  def line(pos1: RoomPosition, pos2: RoomPosition): RoomVisual = js.native
  def line(pos1: RoomPosition, pos2: RoomPosition, style: LineStyle): RoomVisual = js.native
  /**
    * Draw a line.
    * @param x1 The start X coordinate.
    * @param y1 The start Y coordinate.
    * @param x2 The finish X coordinate.
    * @param y2 The finish Y coordinate.
    * @param style The (optional) style.
    * @returns The RoomVisual object, for chaining.
    */
  def line(x1: Double, y1: Double, x2: Double, y2: Double): RoomVisual = js.native
  def line(x1: Double, y1: Double, x2: Double, y2: Double, style: LineStyle): RoomVisual = js.native
  
  /**
    * Draw a polygon.
    * @param points An array of points. Every array item should be either an array with 2 numbers (i.e. [10,15]), or a RoomPosition object.
    * @param style The (optional) style.
    * @returns The RoomVisual object, for chaining.
    */
  def poly(points: js.Array[(js.Tuple2[Double, Double]) | RoomPosition]): RoomVisual = js.native
  def poly(points: js.Array[(js.Tuple2[Double, Double]) | RoomPosition], style: PolyStyle): RoomVisual = js.native
  
  /**
    * Draw a line.
    * @param topLeftPos The position object of the top-left corner.
    * @param width The width of the rectangle.
    * @param height The height of the rectangle.
    * @param style An object describing the style.
    * @returns The RoomVisual object itself, so that you can chain calls.
    */
  def rect(topLeftPos: RoomPosition, width: Double, height: Double): RoomVisual = js.native
  def rect(topLeftPos: RoomPosition, width: Double, height: Double, style: PolyStyle): RoomVisual = js.native
  /**
    * Draw a rectangle.
    * @param x The X coordinate of the top-left corner.
    * @param y The Y coordinate of the top-left corner.
    * @param w The width of the rectangle.
    * @param h The height of the rectangle.
    * @param style The (optional) style.
    * @returns The RoomVisual object, for chaining.
    */
  def rect(x: Double, y: Double, w: Double, h: Double): RoomVisual = js.native
  def rect(x: Double, y: Double, w: Double, h: Double, style: PolyStyle): RoomVisual = js.native
  
  /**
    * The name of the room.
    */
  var roomName: String = js.native
  
  /**
    * Draw a text label. You can use any valid Unicode characters, including emoji.
    * @param text The text message.
    * @param pos The position object of the center.
    * @param style An object describing the style.
    * @returns The RoomVisual object itself, so that you can chain calls.
    */
  def text(text: String, pos: RoomPosition): RoomVisual = js.native
  def text(text: String, pos: RoomPosition, style: TextStyle): RoomVisual = js.native
  /**
    * Draw a text label.
    * @param text The text message.
    * @param x The X coordinate of the label baseline center point.
    * @param y The Y coordinate of the label baseline center point.
    * @param style The (optional) text style.
    * @returns The RoomVisual object, for chaining.
    */
  def text(text: String, x: Double, y: Double): RoomVisual = js.native
  def text(text: String, x: Double, y: Double, style: TextStyle): RoomVisual = js.native
}
