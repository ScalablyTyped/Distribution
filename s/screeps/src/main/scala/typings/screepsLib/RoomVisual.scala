package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RoomVisual")
@js.native
class RoomVisual () extends js.Object {
  /**
       * You can create new RoomVisual object using its constructor.
       * @param roomName The room name. If undefined, visuals will be posted to all rooms simultaneously.
       */
  def this(roomName: java.lang.String) = this()
  /**
       * The name of the room.
       */
  var roomName: java.lang.String = js.native
  /**
       * Draw a circle.
       * @param pos The position object of the center.
       * @param style An object describing the style.
       * @returns The RoomVisual object itself, so that you can chain calls.
       */
  def circle(pos: RoomPosition): RoomVisual = js.native
  /**
       * Draw a circle.
       * @param pos The position object of the center.
       * @param style An object describing the style.
       * @returns The RoomVisual object itself, so that you can chain calls.
       */
  def circle(pos: RoomPosition, style: CircleStyle): RoomVisual = js.native
  /**
       * Draw a circle.
       * @param x The X coordinate of the center.
       * @param y The Y coordinate of the center.
       * @param style The (optional) style.
       * @returns The RoomVisual object, for chaining.
       */
  def circle(x: scala.Double, y: scala.Double): RoomVisual = js.native
  /**
       * Draw a circle.
       * @param x The X coordinate of the center.
       * @param y The Y coordinate of the center.
       * @param style The (optional) style.
       * @returns The RoomVisual object, for chaining.
       */
  def circle(x: scala.Double, y: scala.Double, style: CircleStyle): RoomVisual = js.native
  /**
       * Remove all visuals from the room.
       * @returns The RoomVisual object, for chaining.
       */
  def clear(): RoomVisual = js.native
  /**
       * Get the stored size of all visuals added in the room in the current tick.
       * It must not exceed 512,000 (500 KB).
       * @returns The size of the visuals in bytes.
       */
  def getSize(): scala.Double = js.native
  /**
       * Draw a line.
       * @param pos1 The start position object.
       * @param pos2 The finish position object.
       * @param style The (optional) style.
       * @returns The RoomVisual object, for chaining.
       */
  def line(pos1: RoomPosition, pos2: RoomPosition): RoomVisual = js.native
  /**
       * Draw a line.
       * @param pos1 The start position object.
       * @param pos2 The finish position object.
       * @param style The (optional) style.
       * @returns The RoomVisual object, for chaining.
       */
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
  def line(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): RoomVisual = js.native
  /**
       * Draw a line.
       * @param x1 The start X coordinate.
       * @param y1 The start Y coordinate.
       * @param x2 The finish X coordinate.
       * @param y2 The finish Y coordinate.
       * @param style The (optional) style.
       * @returns The RoomVisual object, for chaining.
       */
  def line(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, style: LineStyle): RoomVisual = js.native
  /**
       * Draw a polygon.
       * @param points An array of points. Every array item should be either an array with 2 numbers (i.e. [10,15]), or a RoomPosition object.
       * @param style The (optional) style.
       * @returns The RoomVisual object, for chaining.
       */
  def poly(points: js.Array[(js.Tuple2[scala.Double, scala.Double]) | RoomPosition]): RoomVisual = js.native
  /**
       * Draw a polygon.
       * @param points An array of points. Every array item should be either an array with 2 numbers (i.e. [10,15]), or a RoomPosition object.
       * @param style The (optional) style.
       * @returns The RoomVisual object, for chaining.
       */
  def poly(points: js.Array[(js.Tuple2[scala.Double, scala.Double]) | RoomPosition], style: PolyStyle): RoomVisual = js.native
  /**
       * Draw a line.
       * @param topLeftPos The position object of the top-left corner.
       * @param width The width of the rectangle.
       * @param height The height of the rectangle.
       * @param style An object describing the style.
       * @returns The RoomVisual object itself, so that you can chain calls.
       */
  def rect(topLeftPos: RoomPosition, width: scala.Double, height: scala.Double): RoomVisual = js.native
  /**
       * Draw a line.
       * @param topLeftPos The position object of the top-left corner.
       * @param width The width of the rectangle.
       * @param height The height of the rectangle.
       * @param style An object describing the style.
       * @returns The RoomVisual object itself, so that you can chain calls.
       */
  def rect(topLeftPos: RoomPosition, width: scala.Double, height: scala.Double, style: PolyStyle): RoomVisual = js.native
  /**
       * Draw a rectangle.
       * @param x The X coordinate of the top-left corner.
       * @param y The Y coordinate of the top-left corner.
       * @param w The width of the rectangle.
       * @param h The height of the rectangle.
       * @param style The (optional) style.
       * @returns The RoomVisual object, for chaining.
       */
  def rect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): RoomVisual = js.native
  /**
       * Draw a rectangle.
       * @param x The X coordinate of the top-left corner.
       * @param y The Y coordinate of the top-left corner.
       * @param w The width of the rectangle.
       * @param h The height of the rectangle.
       * @param style The (optional) style.
       * @returns The RoomVisual object, for chaining.
       */
  def rect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, style: PolyStyle): RoomVisual = js.native
  /**
       * Draw a text label. You can use any valid Unicode characters, including emoji.
       * @param text The text message.
       * @param pos The position object of the center.
       * @param style An object describing the style.
       * @returns The RoomVisual object itself, so that you can chain calls.
       */
  def text(text: java.lang.String, pos: RoomPosition): RoomVisual = js.native
  /**
       * Draw a text label. You can use any valid Unicode characters, including emoji.
       * @param text The text message.
       * @param pos The position object of the center.
       * @param style An object describing the style.
       * @returns The RoomVisual object itself, so that you can chain calls.
       */
  def text(text: java.lang.String, pos: RoomPosition, style: TextStyle): RoomVisual = js.native
  /**
       * Draw a text label.
       * @param text The text message.
       * @param x The X coordinate of the label baseline center point.
       * @param y The Y coordinate of the label baseline center point.
       * @param style The (optional) text style.
       * @returns The RoomVisual object, for chaining.
       */
  def text(text: java.lang.String, x: scala.Double, y: scala.Double): RoomVisual = js.native
  /**
       * Draw a text label.
       * @param text The text message.
       * @param x The X coordinate of the label baseline center point.
       * @param y The Y coordinate of the label baseline center point.
       * @param style The (optional) text style.
       * @returns The RoomVisual object, for chaining.
       */
  def text(text: java.lang.String, x: scala.Double, y: scala.Double, style: TextStyle): RoomVisual = js.native
}

