package typings.senchaTouch.Ext.draw

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPath extends IBase {
  /** [Method] Create an circular arc
    * @param x Number
    * @param y Number
    * @param radius Number
    * @param startAngle Number
    * @param endAngle Number
    * @param anticlockwise Number
    */
  var arc: js.UndefOr[
    js.Function6[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* radius */ js.UndefOr[Double], 
      /* startAngle */ js.UndefOr[Double], 
      /* endAngle */ js.UndefOr[Double], 
      /* anticlockwise */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] http  www w3 org TR SVG implnote html ArcImplementationNotes
    * @param rx Number
    * @param ry Number
    * @param rotation Number Differ from svg spec, this is radian.
    * @param fA Number
    * @param fS Number
    * @param x2 Number
    * @param y2 Number
    */
  var arcSvg: js.UndefOr[
    js.Function7[
      /* rx */ js.UndefOr[Double], 
      /* ry */ js.UndefOr[Double], 
      /* rotation */ js.UndefOr[Double], 
      /* fA */ js.UndefOr[Double], 
      /* fS */ js.UndefOr[Double], 
      /* x2 */ js.UndefOr[Double], 
      /* y2 */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Create a elliptic arc curve compatible with SVG s arc to instruction
    * @param x1 Number
    * @param y1 Number
    * @param x2 Number
    * @param y2 Number
    * @param rx Number
    * @param ry Number
    * @param rotation Number
    */
  var arcTo: js.UndefOr[
    js.Function7[
      /* x1 */ js.UndefOr[Double], 
      /* y1 */ js.UndefOr[Double], 
      /* x2 */ js.UndefOr[Double], 
      /* y2 */ js.UndefOr[Double], 
      /* rx */ js.UndefOr[Double], 
      /* ry */ js.UndefOr[Double], 
      /* rotation */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] A cubic bezier curve to a position
    * @param cx1 Number
    * @param cy1 Number
    * @param cx2 Number
    * @param cy2 Number
    * @param x Number
    * @param y Number
    */
  var bezierCurveTo: js.UndefOr[
    js.Function6[
      /* cx1 */ js.UndefOr[Double], 
      /* cy1 */ js.UndefOr[Double], 
      /* cx2 */ js.UndefOr[Double], 
      /* cy2 */ js.UndefOr[Double], 
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Clear the path  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Clone this path
    * @returns Ext.draw.Path
    */
  @JSName("clone")
  var clone_FIPath: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Close this path with a straight line  */
  var closePath: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Create an elliptic arc
    * @param cx Number
    * @param cy Number
    * @param radiusX Number
    * @param radiusY Number
    * @param rotation Number
    * @param startAngle Number
    * @param endAngle Number
    * @param anticlockwise Number
    */
  var ellipse: js.UndefOr[
    js.Function8[
      /* cx */ js.UndefOr[Double], 
      /* cy */ js.UndefOr[Double], 
      /* radiusX */ js.UndefOr[Double], 
      /* radiusY */ js.UndefOr[Double], 
      /* rotation */ js.UndefOr[Double], 
      /* startAngle */ js.UndefOr[Double], 
      /* endAngle */ js.UndefOr[Double], 
      /* anticlockwise */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Reconstruct path from cubic bezier curve stripes
    * @param stripes Array
    */
  var fromStripes: js.UndefOr[js.Function1[/* stripes */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Feed the path from svg path string
    * @param pathString String
    */
  var fromSvgString: js.UndefOr[js.Function1[/* pathString */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Get the bounding box of this matrix
    * @param target Object Optional object to receive the result.
    * @returns Object Object with x, y, width and height
    */
  var getDimension: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Get the bounding box as if the path is transformed by a matrix
    * @param matrix Ext.draw.Matrix
    * @param target Object Optional object to receive the result.
    * @returns Object An object with x, y, width and height.
    */
  var getDimensionWithTransform: js.UndefOr[
    js.Function2[/* matrix */ js.UndefOr[IMatrix], /* target */ js.UndefOr[js.Any], _]
  ] = js.native
  /** [Method] Test whether the given point is on or inside the path
    * @param x Number
    * @param y Number
    * @returns Boolean
    */
  var isPointInPath: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Boolean]] = js.native
  /** [Method] A straight line to a position
    * @param x Number
    * @param y Number
    */
  var lineTo: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Move to a position
    * @param x Number
    * @param y Number
    */
  var moveTo: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] A quadratic bezier curve to a position
    * @param cx Number
    * @param cy Number
    * @param x Number
    * @param y Number
    */
  var quadraticCurveTo: js.UndefOr[
    js.Function4[
      /* cx */ js.UndefOr[Double], 
      /* cy */ js.UndefOr[Double], 
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Draw a rectangle and close it
    * @param x Number
    * @param y Number
    * @param width Number
    * @param height Number
    */
  var rect: js.UndefOr[
    js.Function4[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Return an svg path string for this path
    * @returns String
    */
  @JSName("toString")
  var toString_FIPath: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Convert path to bezier curve stripes
    * @param target Array The optional array to receive the result.
    * @returns Array
    */
  var toStripes: js.UndefOr[js.Function1[/* target */ js.UndefOr[Array], Array]] = js.native
  /** [Method] Transform the current path by a matrix
    * @param matrix Ext.draw.Matrix
    */
  var transform: js.UndefOr[js.Function1[/* matrix */ js.UndefOr[IMatrix], Unit]] = js.native
}

object IPath {
  @scala.inline
  def apply(): IPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPath]
  }
  @scala.inline
  implicit class IPathOps[Self <: IPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArc(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* radius */ js.UndefOr[Double], /* startAngle */ js.UndefOr[Double], /* endAngle */ js.UndefOr[Double], /* anticlockwise */ js.UndefOr[Double]) => Unit
    ): Self = this.set("arc", js.Any.fromFunction6(value))
    @scala.inline
    def deleteArc: Self = this.set("arc", js.undefined)
    @scala.inline
    def setArcSvg(
      value: (/* rx */ js.UndefOr[Double], /* ry */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double], /* fA */ js.UndefOr[Double], /* fS */ js.UndefOr[Double], /* x2 */ js.UndefOr[Double], /* y2 */ js.UndefOr[Double]) => Unit
    ): Self = this.set("arcSvg", js.Any.fromFunction7(value))
    @scala.inline
    def deleteArcSvg: Self = this.set("arcSvg", js.undefined)
    @scala.inline
    def setArcTo(
      value: (/* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double], /* x2 */ js.UndefOr[Double], /* y2 */ js.UndefOr[Double], /* rx */ js.UndefOr[Double], /* ry */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double]) => Unit
    ): Self = this.set("arcTo", js.Any.fromFunction7(value))
    @scala.inline
    def deleteArcTo: Self = this.set("arcTo", js.undefined)
    @scala.inline
    def setBezierCurveTo(
      value: (/* cx1 */ js.UndefOr[Double], /* cy1 */ js.UndefOr[Double], /* cx2 */ js.UndefOr[Double], /* cy2 */ js.UndefOr[Double], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit
    ): Self = this.set("bezierCurveTo", js.Any.fromFunction6(value))
    @scala.inline
    def deleteBezierCurveTo: Self = this.set("bezierCurveTo", js.undefined)
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setClone(value: () => IPath): Self = this.set("clone", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setClosePath(value: () => Unit): Self = this.set("closePath", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClosePath: Self = this.set("closePath", js.undefined)
    @scala.inline
    def setEllipse(
      value: (/* cx */ js.UndefOr[Double], /* cy */ js.UndefOr[Double], /* radiusX */ js.UndefOr[Double], /* radiusY */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double], /* startAngle */ js.UndefOr[Double], /* endAngle */ js.UndefOr[Double], /* anticlockwise */ js.UndefOr[Double]) => Unit
    ): Self = this.set("ellipse", js.Any.fromFunction8(value))
    @scala.inline
    def deleteEllipse: Self = this.set("ellipse", js.undefined)
    @scala.inline
    def setFromStripes(value: /* stripes */ js.UndefOr[Array] => Unit): Self = this.set("fromStripes", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFromStripes: Self = this.set("fromStripes", js.undefined)
    @scala.inline
    def setFromSvgString(value: /* pathString */ js.UndefOr[String] => Unit): Self = this.set("fromSvgString", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFromSvgString: Self = this.set("fromSvgString", js.undefined)
    @scala.inline
    def setGetDimension(value: /* target */ js.UndefOr[js.Any] => _): Self = this.set("getDimension", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetDimension: Self = this.set("getDimension", js.undefined)
    @scala.inline
    def setGetDimensionWithTransform(value: (/* matrix */ js.UndefOr[IMatrix], /* target */ js.UndefOr[js.Any]) => _): Self = this.set("getDimensionWithTransform", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetDimensionWithTransform: Self = this.set("getDimensionWithTransform", js.undefined)
    @scala.inline
    def setIsPointInPath(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Boolean): Self = this.set("isPointInPath", js.Any.fromFunction2(value))
    @scala.inline
    def deleteIsPointInPath: Self = this.set("isPointInPath", js.undefined)
    @scala.inline
    def setLineTo(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit): Self = this.set("lineTo", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLineTo: Self = this.set("lineTo", js.undefined)
    @scala.inline
    def setMoveTo(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit): Self = this.set("moveTo", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMoveTo: Self = this.set("moveTo", js.undefined)
    @scala.inline
    def setQuadraticCurveTo(
      value: (/* cx */ js.UndefOr[Double], /* cy */ js.UndefOr[Double], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit
    ): Self = this.set("quadraticCurveTo", js.Any.fromFunction4(value))
    @scala.inline
    def deleteQuadraticCurveTo: Self = this.set("quadraticCurveTo", js.undefined)
    @scala.inline
    def setRect(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit
    ): Self = this.set("rect", js.Any.fromFunction4(value))
    @scala.inline
    def deleteRect: Self = this.set("rect", js.undefined)
    @scala.inline
    def setToString(value: () => String): Self = this.set("toString", js.Any.fromFunction0(value))
    @scala.inline
    def deleteToString: Self = this.set("toString", js.undefined)
    @scala.inline
    def setToStripes(value: /* target */ js.UndefOr[Array] => Array): Self = this.set("toStripes", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToStripes: Self = this.set("toStripes", js.undefined)
    @scala.inline
    def setTransform(value: /* matrix */ js.UndefOr[IMatrix] => Unit): Self = this.set("transform", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
  
}

