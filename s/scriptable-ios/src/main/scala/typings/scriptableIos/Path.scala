package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _A path describes a shape._
  *
  * Use the methods on the path to create complex shapes.
  * @see https://docs.scriptable.app/path/#-new-path
  */
@JSGlobal("Path")
@js.native
/**
  * _A path describes a shape._
  *
  * Use the methods on the path to create complex shapes.
  * @see https://docs.scriptable.app/path/#-new-path
  */
class Path () extends js.Object {
  /**
    * _Adds a cubic curve to a point._
    *
    * Adds a cubic Bézier curve to the path with the specified end point and control points.
    * @param point - End point of the curve.
    * @param control1 - First control point of the curve.
    * @param control2 - Second control point of the curve.
    * @see https://docs.scriptable.app/path/#-addcurve
    */
  def addCurve(point: Point, control1: Point, control2: Point): Unit = js.native
  /**
    * _Adds an ellipse._
    *
    * Adds an ellipse incapsulated by the provided rectangle to the path.
    * @param rect - Rectangle incapsulating the ellipse.
    * @see https://docs.scriptable.app/path/#-addellipse
    */
  def addEllipse(rect: Rect): Unit = js.native
  /**
    * _Adds a line to a point._
    *
    * Add a line from the current point, e.g. set using the move method, and to the new point.
    * @param point - Point to add line to.
    * @see https://docs.scriptable.app/path/#-addline
    */
  def addLine(point: Point): Unit = js.native
  /**
    * _Adds a set of lines._
    *
    * Adds straight lines between an array of points. Calling this method is equivalent to calling the move function with the first point in the array of points and then calling addLine
    * on the subsequent points in the array.
    * @param points - Points to add lines between.
    * @see https://docs.scriptable.app/path/#-addlines
    */
  def addLines(points: js.Array[Point]): Unit = js.native
  /**
    * _Adds a quadratic curve to a point._
    *
    * Adds a quadratic Bézier curve to the specified end point with the specified control point.
    * @param point - End point of the curve.
    * @param control - Control point of the curve.
    * @see https://docs.scriptable.app/path/#-addquadcurve
    */
  def addQuadCurve(point: Point, control: Point): Unit = js.native
  /**
    * _Adds a rectangle._
    *
    * This is a convenience function for adding a rectangle to the path starting from the lower left corner and drawing the lines counter-clockwise until the rectangle is closed.
    * @param rect - Rectangle to add.
    * @see https://docs.scriptable.app/path/#-addrect
    */
  def addRect(rect: Rect): Unit = js.native
  /**
    * _Adds a set of rectangles._
    *
    * Calling this is equivalent to repeatedly calling addRect.
    * @param rects - Rectangles to add.
    * @see https://docs.scriptable.app/path/#-addrects
    */
  def addRects(rects: js.Array[Rect]): Unit = js.native
  /**
    * _Adds a rounded rectangle._
    *
    * Adds a rounded rectangle to the path. The corner width specifies the horizontal size of the corner and the corner height specifies the the vertical size of the corner.
    * @param rect - Rectangle to add.
    * @param cornerWidth - Horizontal size of the rounded corner.
    * @param cornerHeight - Vertical size of the rounded corner.
    * @see https://docs.scriptable.app/path/#-addroundedrect
    */
  def addRoundedRect(rect: Rect, cornerWidth: Double, cornerHeight: Double): Unit = js.native
  /**
    * _Closes a sub path._
    *
    * Adds a straight line from the current point to the start of the current subpath.
    * @see https://docs.scriptable.app/path/#-closesubpath
    */
  def closeSubpath(): Unit = js.native
  /**
    * _Moves to a point._
    *
    * Moves to a point without drawing a line between the current point and the new point.
    * @param point - Point to move to.
    * @see https://docs.scriptable.app/path/#-move
    */
  def move(point: Point): Unit = js.native
}

