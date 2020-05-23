package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Structure representing a rectangle._
  *
  * Constructs a new rectangle placed in a two-dimensional coordinate system.
  * @see https://docs.scriptable.app/rect/#-new-rect
  */
@JSGlobal("Rect")
@js.native
class Rect protected ()
  extends typings.scriptableIos.Rect {
  /**
    * _Structure representing a rectangle._
    *
    * Constructs a new rectangle placed in a two-dimensional coordinate system.
    * @param x - X coordinate.
    * @param y - Y coordinate.
    * @param width - Width of rectangle.
    * @param height - Height of rectangle.
    * @see https://docs.scriptable.app/rect/#-new-rect
    */
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  /**
    * _Height of rectangle._
    *
    * The height of the rectangle.
    * @see https://docs.scriptable.app/rect/#height
    */
  /* CompleteClass */
  override var height: Double = js.native
  /**
    * _Maximum X value._
    *
    * The greatest x-coordinate in the rectangle.
    * @see https://docs.scriptable.app/rect/#maxx
    */
  /* CompleteClass */
  override var maxX: Double = js.native
  /**
    * _Maximum Y value._
    *
    * The greatest y-coordinate in the rectangle.
    * @see https://docs.scriptable.app/rect/#maxy
    */
  /* CompleteClass */
  override var maxY: Double = js.native
  /**
    * _Minimum X value._
    *
    * The smallest x-coordinate in the rectangle.
    * @see https://docs.scriptable.app/rect/#minx
    */
  /* CompleteClass */
  override var minX: Double = js.native
  /**
    * _Minimum Y value._
    *
    * The smallest y-coordinate in the rectangle.
    * @see https://docs.scriptable.app/rect/#miny
    */
  /* CompleteClass */
  override var minY: Double = js.native
  /**
    * _Point that specifies the rectangles origin._
    *
    * The x- and y-coordinate that specifies the rectangles origin as a Point structure.
    * @see https://docs.scriptable.app/rect/#origin
    */
  /* CompleteClass */
  override var origin: typings.scriptableIos.Point = js.native
  /**
    * _Size of the rectangle._
    *
    * The width and height of the rectangle as a Size structure.
    * @see https://docs.scriptable.app/rect/#size
    */
  /* CompleteClass */
  override var size: typings.scriptableIos.Size = js.native
  /**
    * _Width of rectangle._
    *
    * The width of the rectangle.
    * @see https://docs.scriptable.app/rect/#width
    */
  /* CompleteClass */
  override var width: Double = js.native
  /**
    * _X value._
    *
    * The x-coordinate of the rectangle.
    * @see https://docs.scriptable.app/rect/#x
    */
  /* CompleteClass */
  override var x: Double = js.native
  /**
    * _Y value._
    *
    * The y-coordinate of the rectangle.
    * @see https://docs.scriptable.app/rect/#y
    */
  /* CompleteClass */
  override var y: Double = js.native
}

