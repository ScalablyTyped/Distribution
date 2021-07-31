package typings.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _A path describes a shape._
  *
  * Use the methods on the path to create complex shapes.
  * @see https://docs.scriptable.app/path/#-new-path
  */
trait Path extends StObject {
  
  /**
    * _Adds a cubic curve to a point._
    *
    * Adds a cubic Bézier curve to the path with the specified end point and control points.
    * @param point - End point of the curve.
    * @param control1 - First control point of the curve.
    * @param control2 - Second control point of the curve.
    * @see https://docs.scriptable.app/path/#-addcurve
    */
  def addCurve(point: Point, control1: Point, control2: Point): Unit
  
  /**
    * _Adds an ellipse._
    *
    * Adds an ellipse incapsulated by the provided rectangle to the path.
    * @param rect - Rectangle incapsulating the ellipse.
    * @see https://docs.scriptable.app/path/#-addellipse
    */
  def addEllipse(rect: Rect): Unit
  
  /**
    * _Adds a line to a point._
    *
    * Add a line from the current point, e.g. set using the move method, and to the new point.
    * @param point - Point to add line to.
    * @see https://docs.scriptable.app/path/#-addline
    */
  def addLine(point: Point): Unit
  
  /**
    * _Adds a set of lines._
    *
    * Adds straight lines between an array of points. Calling this method is equivalent to calling the move function with the first point in the array of points and then calling addLine
    * on the subsequent points in the array.
    * @param points - Points to add lines between.
    * @see https://docs.scriptable.app/path/#-addlines
    */
  def addLines(points: js.Array[Point]): Unit
  
  /**
    * _Adds a quadratic curve to a point._
    *
    * Adds a quadratic Bézier curve to the specified end point with the specified control point.
    * @param point - End point of the curve.
    * @param control - Control point of the curve.
    * @see https://docs.scriptable.app/path/#-addquadcurve
    */
  def addQuadCurve(point: Point, control: Point): Unit
  
  /**
    * _Adds a rectangle._
    *
    * This is a convenience function for adding a rectangle to the path starting from the lower left corner and drawing the lines counter-clockwise until the rectangle is closed.
    * @param rect - Rectangle to add.
    * @see https://docs.scriptable.app/path/#-addrect
    */
  def addRect(rect: Rect): Unit
  
  /**
    * _Adds a set of rectangles._
    *
    * Calling this is equivalent to repeatedly calling addRect.
    * @param rects - Rectangles to add.
    * @see https://docs.scriptable.app/path/#-addrects
    */
  def addRects(rects: js.Array[Rect]): Unit
  
  /**
    * _Adds a rounded rectangle._
    *
    * Adds a rounded rectangle to the path. The corner width specifies the horizontal size of the corner and the corner height specifies the the vertical size of the corner.
    * @param rect - Rectangle to add.
    * @param cornerWidth - Horizontal size of the rounded corner.
    * @param cornerHeight - Vertical size of the rounded corner.
    * @see https://docs.scriptable.app/path/#-addroundedrect
    */
  def addRoundedRect(rect: Rect, cornerWidth: Double, cornerHeight: Double): Unit
  
  /**
    * _Closes a sub path._
    *
    * Adds a straight line from the current point to the start of the current subpath.
    * @see https://docs.scriptable.app/path/#-closesubpath
    */
  def closeSubpath(): Unit
  
  /**
    * _Moves to a point._
    *
    * Moves to a point without drawing a line between the current point and the new point.
    * @param point - Point to move to.
    * @see https://docs.scriptable.app/path/#-move
    */
  def move(point: Point): Unit
}
object Path {
  
  @scala.inline
  def apply(
    addCurve: (Point, Point, Point) => Unit,
    addEllipse: Rect => Unit,
    addLine: Point => Unit,
    addLines: js.Array[Point] => Unit,
    addQuadCurve: (Point, Point) => Unit,
    addRect: Rect => Unit,
    addRects: js.Array[Rect] => Unit,
    addRoundedRect: (Rect, Double, Double) => Unit,
    closeSubpath: () => Unit,
    move: Point => Unit
  ): Path = {
    val __obj = js.Dynamic.literal(addCurve = js.Any.fromFunction3(addCurve), addEllipse = js.Any.fromFunction1(addEllipse), addLine = js.Any.fromFunction1(addLine), addLines = js.Any.fromFunction1(addLines), addQuadCurve = js.Any.fromFunction2(addQuadCurve), addRect = js.Any.fromFunction1(addRect), addRects = js.Any.fromFunction1(addRects), addRoundedRect = js.Any.fromFunction3(addRoundedRect), closeSubpath = js.Any.fromFunction0(closeSubpath), move = js.Any.fromFunction1(move))
    __obj.asInstanceOf[Path]
  }
  
  @scala.inline
  implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddCurve(value: (Point, Point, Point) => Unit): Self = StObject.set(x, "addCurve", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAddEllipse(value: Rect => Unit): Self = StObject.set(x, "addEllipse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddLine(value: Point => Unit): Self = StObject.set(x, "addLine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddLines(value: js.Array[Point] => Unit): Self = StObject.set(x, "addLines", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddQuadCurve(value: (Point, Point) => Unit): Self = StObject.set(x, "addQuadCurve", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddRect(value: Rect => Unit): Self = StObject.set(x, "addRect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddRects(value: js.Array[Rect] => Unit): Self = StObject.set(x, "addRects", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddRoundedRect(value: (Rect, Double, Double) => Unit): Self = StObject.set(x, "addRoundedRect", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCloseSubpath(value: () => Unit): Self = StObject.set(x, "closeSubpath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMove(value: Point => Unit): Self = StObject.set(x, "move", js.Any.fromFunction1(value))
  }
}
