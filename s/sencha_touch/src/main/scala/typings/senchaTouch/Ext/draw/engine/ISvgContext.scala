package typings.senchaTouch.Ext.draw.engine

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.draw.engine.svgcontext.IGradient
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISvgContext extends IBase {
  /** [Method] Adds points to the subpath such that the arc described by the circumference of the circle described by the arguments
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
  /** [Method] Arc command using svg parameters
    * @param r1 Number
    * @param r2 Number
    * @param rotation Number
    * @param large Number
    * @param swipe Number
    * @param x2 Number
    * @param y2 Number
    */
  var arcSvg: js.UndefOr[
    js.Function7[
      /* r1 */ js.UndefOr[Double], 
      /* r2 */ js.UndefOr[Double], 
      /* rotation */ js.UndefOr[Double], 
      /* large */ js.UndefOr[Double], 
      /* swipe */ js.UndefOr[Double], 
      /* x2 */ js.UndefOr[Double], 
      /* y2 */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Adds an arc with the given control points and radius to the current subpath connected to the previous point by a str
    * @param x1 Number
    * @param y1 Number
    * @param x2 Number
    * @param y2 Number
    * @param radiusX Number
    * @param radiusY Number
    * @param rotation Number
    */
  var arcTo: js.UndefOr[
    js.Function7[
      /* x1 */ js.UndefOr[Double], 
      /* y1 */ js.UndefOr[Double], 
      /* x2 */ js.UndefOr[Double], 
      /* y2 */ js.UndefOr[Double], 
      /* radiusX */ js.UndefOr[Double], 
      /* radiusY */ js.UndefOr[Double], 
      /* rotation */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Resets the current default path  */
  var beginPath: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Adds the given point to the current subpath connected to the previous one by a cubic B zier curve with the given con
    * @param x1 Number
    * @param y1 Number
    * @param x2 Number
    * @param y2 Number
    * @param x3 Number
    * @param y3 Number
    */
  var bezierCurveTo: js.UndefOr[
    js.Function6[
      /* x1 */ js.UndefOr[Double], 
      /* y1 */ js.UndefOr[Double], 
      /* x2 */ js.UndefOr[Double], 
      /* y2 */ js.UndefOr[Double], 
      /* x3 */ js.UndefOr[Double], 
      /* y3 */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Clears the context  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Marks the current subpath as closed and starts a new subpath with a point the same as the start and end of the newly  */
  var closePath: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns an object that represents a linear gradient that paints along the line given by the coordinates represented b
    * @param x0 Number
    * @param y0 Number
    * @param x1 Number
    * @param y1 Number
    * @returns Ext.draw.engine.SvgContext.Gradient
    */
  var createLinearGradient: js.UndefOr[
    js.Function4[
      /* x0 */ js.UndefOr[Double], 
      /* y0 */ js.UndefOr[Double], 
      /* x1 */ js.UndefOr[Double], 
      /* y1 */ js.UndefOr[Double], 
      IGradient
    ]
  ] = js.native
  /** [Method] Returns a CanvasGradient object that represents a radial gradient that paints along the cone given by the circles rep
    * @param x0 Number
    * @param y0 Number
    * @param r0 Number
    * @param x1 Number
    * @param y1 Number
    * @param r1 Number
    * @returns Ext.draw.engine.SvgContext.Gradient
    */
  var createRadialGradient: js.UndefOr[
    js.Function6[
      /* x0 */ js.UndefOr[Double], 
      /* y0 */ js.UndefOr[Double], 
      /* r0 */ js.UndefOr[Double], 
      /* x1 */ js.UndefOr[Double], 
      /* y1 */ js.UndefOr[Double], 
      /* r1 */ js.UndefOr[Double], 
      IGradient
    ]
  ] = js.native
  /** [Method] Draws the given image onto the canvas
    * @param image HTMLElement
    * @param sx Number
    * @param sy Number
    * @param sw Number
    * @param sh Number
    * @param dx Number
    * @param dy Number
    * @param dw Number
    * @param dh Number
    */
  var drawImage: js.UndefOr[
    js.Function9[
      /* image */ js.UndefOr[HTMLElement], 
      /* sx */ js.UndefOr[Double], 
      /* sy */ js.UndefOr[Double], 
      /* sw */ js.UndefOr[Double], 
      /* sh */ js.UndefOr[Double], 
      /* dx */ js.UndefOr[Double], 
      /* dy */ js.UndefOr[Double], 
      /* dw */ js.UndefOr[Double], 
      /* dh */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Adds points to the subpath such that the arc described by the circumference of the ellipse described by the arguments
    * @param x Number
    * @param y Number
    * @param radiusX Number
    * @param radiusY Number
    * @param rotation Number
    * @param startAngle Number
    * @param endAngle Number
    * @param anticlockwise Number
    */
  var ellipse: js.UndefOr[
    js.Function8[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* radiusX */ js.UndefOr[Double], 
      /* radiusY */ js.UndefOr[Double], 
      /* rotation */ js.UndefOr[Double], 
      /* startAngle */ js.UndefOr[Double], 
      /* endAngle */ js.UndefOr[Double], 
      /* anticlockwise */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Fills the subpaths of the current default path or the given path with the current fill style  */
  var fill: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Paints the given rectangle onto the canvas using the current fill style
    * @param x Number
    * @param y Number
    * @param width Number
    * @param height Number
    */
  var fillRect: js.UndefOr[
    js.Function4[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Note After the method guarantees the transform matrix will be inverted
    * @param attr Object The attribute object
    * @param transformFillStroke Boolean Indicate whether to transform fill and stroke. If this is not given, then uses attr.transformFillStroke instead.
    */
  var fillStroke: js.UndefOr[
    js.Function2[/* attr */ js.UndefOr[js.Any], /* transformFillStroke */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Fills the given text at the given position
    * @param text String
    * @param x Number
    * @param y Number
    */
  var fillText: js.UndefOr[
    js.Function3[
      /* text */ js.UndefOr[String], 
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Adds the given point to the current subpath connected to the previous one by a straight line
    * @param x Number
    * @param y Number
    */
  var lineTo: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Creates a new subpath with the given point
    * @param x Number
    * @param y Number
    */
  var moveTo: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Adds a new closed subpath to the path representing the given rectangle
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
  /** [Method] Pops the state stack and restores the state  */
  var restore: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Pushes the context state to the state stack  */
  var save: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Changes the transformation matrix to the matrix given by the arguments as described below
    * @param xx Number
    * @param yx Number
    * @param xy Number
    * @param yy Number
    * @param dx Number
    * @param dy Number
    */
  var setTransform: js.UndefOr[
    js.Function6[
      /* xx */ js.UndefOr[Double], 
      /* yx */ js.UndefOr[Double], 
      /* xy */ js.UndefOr[Double], 
      /* yy */ js.UndefOr[Double], 
      /* dx */ js.UndefOr[Double], 
      /* dy */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Strokes the subpaths of the current default path or the given path with the current stroke style  */
  var stroke: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Paints the box that outlines the given rectangle onto the canvas using the current stroke style
    * @param x Number
    * @param y Number
    * @param width Number
    * @param height Number
    */
  var strokeRect: js.UndefOr[
    js.Function4[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Strokes the given text at the given position
    * @param text String
    * @param x Number
    * @param y Number
    */
  var strokeText: js.UndefOr[
    js.Function3[
      /* text */ js.UndefOr[String], 
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Changes the transformation matrix to apply the matrix given by the arguments as described below
    * @param xx Number
    * @param yx Number
    * @param xy Number
    * @param yy Number
    * @param dx Number
    * @param dy Number
    */
  var transform: js.UndefOr[
    js.Function6[
      /* xx */ js.UndefOr[Double], 
      /* yx */ js.UndefOr[Double], 
      /* xy */ js.UndefOr[Double], 
      /* yy */ js.UndefOr[Double], 
      /* dx */ js.UndefOr[Double], 
      /* dy */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
}

object ISvgContext {
  @scala.inline
  def apply(): ISvgContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISvgContext]
  }
  @scala.inline
  implicit class ISvgContextOps[Self <: ISvgContext] (val x: Self) extends AnyVal {
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
      value: (/* r1 */ js.UndefOr[Double], /* r2 */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double], /* large */ js.UndefOr[Double], /* swipe */ js.UndefOr[Double], /* x2 */ js.UndefOr[Double], /* y2 */ js.UndefOr[Double]) => Unit
    ): Self = this.set("arcSvg", js.Any.fromFunction7(value))
    @scala.inline
    def deleteArcSvg: Self = this.set("arcSvg", js.undefined)
    @scala.inline
    def setArcTo(
      value: (/* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double], /* x2 */ js.UndefOr[Double], /* y2 */ js.UndefOr[Double], /* radiusX */ js.UndefOr[Double], /* radiusY */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double]) => Unit
    ): Self = this.set("arcTo", js.Any.fromFunction7(value))
    @scala.inline
    def deleteArcTo: Self = this.set("arcTo", js.undefined)
    @scala.inline
    def setBeginPath(value: () => Unit): Self = this.set("beginPath", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeginPath: Self = this.set("beginPath", js.undefined)
    @scala.inline
    def setBezierCurveTo(
      value: (/* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double], /* x2 */ js.UndefOr[Double], /* y2 */ js.UndefOr[Double], /* x3 */ js.UndefOr[Double], /* y3 */ js.UndefOr[Double]) => Unit
    ): Self = this.set("bezierCurveTo", js.Any.fromFunction6(value))
    @scala.inline
    def deleteBezierCurveTo: Self = this.set("bezierCurveTo", js.undefined)
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setClosePath(value: () => Unit): Self = this.set("closePath", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClosePath: Self = this.set("closePath", js.undefined)
    @scala.inline
    def setCreateLinearGradient(
      value: (/* x0 */ js.UndefOr[Double], /* y0 */ js.UndefOr[Double], /* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double]) => IGradient
    ): Self = this.set("createLinearGradient", js.Any.fromFunction4(value))
    @scala.inline
    def deleteCreateLinearGradient: Self = this.set("createLinearGradient", js.undefined)
    @scala.inline
    def setCreateRadialGradient(
      value: (/* x0 */ js.UndefOr[Double], /* y0 */ js.UndefOr[Double], /* r0 */ js.UndefOr[Double], /* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double], /* r1 */ js.UndefOr[Double]) => IGradient
    ): Self = this.set("createRadialGradient", js.Any.fromFunction6(value))
    @scala.inline
    def deleteCreateRadialGradient: Self = this.set("createRadialGradient", js.undefined)
    @scala.inline
    def setDrawImage(
      value: (/* image */ js.UndefOr[HTMLElement], /* sx */ js.UndefOr[Double], /* sy */ js.UndefOr[Double], /* sw */ js.UndefOr[Double], /* sh */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double], /* dw */ js.UndefOr[Double], /* dh */ js.UndefOr[Double]) => Unit
    ): Self = this.set("drawImage", js.Any.fromFunction9(value))
    @scala.inline
    def deleteDrawImage: Self = this.set("drawImage", js.undefined)
    @scala.inline
    def setEllipse(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* radiusX */ js.UndefOr[Double], /* radiusY */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double], /* startAngle */ js.UndefOr[Double], /* endAngle */ js.UndefOr[Double], /* anticlockwise */ js.UndefOr[Double]) => Unit
    ): Self = this.set("ellipse", js.Any.fromFunction8(value))
    @scala.inline
    def deleteEllipse: Self = this.set("ellipse", js.undefined)
    @scala.inline
    def setFill(value: () => Unit): Self = this.set("fill", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFillRect(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit
    ): Self = this.set("fillRect", js.Any.fromFunction4(value))
    @scala.inline
    def deleteFillRect: Self = this.set("fillRect", js.undefined)
    @scala.inline
    def setFillStroke(value: (/* attr */ js.UndefOr[js.Any], /* transformFillStroke */ js.UndefOr[Boolean]) => Unit): Self = this.set("fillStroke", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFillStroke: Self = this.set("fillStroke", js.undefined)
    @scala.inline
    def setFillText(
      value: (/* text */ js.UndefOr[String], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit
    ): Self = this.set("fillText", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFillText: Self = this.set("fillText", js.undefined)
    @scala.inline
    def setLineTo(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit): Self = this.set("lineTo", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLineTo: Self = this.set("lineTo", js.undefined)
    @scala.inline
    def setMoveTo(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit): Self = this.set("moveTo", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMoveTo: Self = this.set("moveTo", js.undefined)
    @scala.inline
    def setRect(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit
    ): Self = this.set("rect", js.Any.fromFunction4(value))
    @scala.inline
    def deleteRect: Self = this.set("rect", js.undefined)
    @scala.inline
    def setRestore(value: () => Unit): Self = this.set("restore", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRestore: Self = this.set("restore", js.undefined)
    @scala.inline
    def setSave(value: () => Unit): Self = this.set("save", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    @scala.inline
    def setSetTransform(
      value: (/* xx */ js.UndefOr[Double], /* yx */ js.UndefOr[Double], /* xy */ js.UndefOr[Double], /* yy */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double]) => Unit
    ): Self = this.set("setTransform", js.Any.fromFunction6(value))
    @scala.inline
    def deleteSetTransform: Self = this.set("setTransform", js.undefined)
    @scala.inline
    def setStroke(value: () => Unit): Self = this.set("stroke", js.Any.fromFunction0(value))
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStrokeRect(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit
    ): Self = this.set("strokeRect", js.Any.fromFunction4(value))
    @scala.inline
    def deleteStrokeRect: Self = this.set("strokeRect", js.undefined)
    @scala.inline
    def setStrokeText(
      value: (/* text */ js.UndefOr[String], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit
    ): Self = this.set("strokeText", js.Any.fromFunction3(value))
    @scala.inline
    def deleteStrokeText: Self = this.set("strokeText", js.undefined)
    @scala.inline
    def setTransform(
      value: (/* xx */ js.UndefOr[Double], /* yx */ js.UndefOr[Double], /* xy */ js.UndefOr[Double], /* yy */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double]) => Unit
    ): Self = this.set("transform", js.Any.fromFunction6(value))
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
  
}

