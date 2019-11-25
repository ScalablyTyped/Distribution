package typings.senchaUnderscoreTouch.Ext.draw

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IBase
import typings.senchaUnderscoreTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  ] = js.undefined
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
  ] = js.undefined
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
  ] = js.undefined
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
  ] = js.undefined
  /** [Method] Clear the path  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Clone this path
  		* @returns Ext.draw.Path
  		*/
  @JSName("clone")
  var clone_FIPath: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Close this path with a straight line  */
  var closePath: js.UndefOr[js.Function0[Unit]] = js.undefined
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
  ] = js.undefined
  /** [Method] Reconstruct path from cubic bezier curve stripes
  		* @param stripes Array
  		*/
  var fromStripes: js.UndefOr[js.Function1[/* stripes */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Feed the path from svg path string
  		* @param pathString String
  		*/
  var fromSvgString: js.UndefOr[js.Function1[/* pathString */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Get the bounding box of this matrix
  		* @param target Object Optional object to receive the result.
  		* @returns Object Object with x, y, width and height
  		*/
  var getDimension: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Get the bounding box as if the path is transformed by a matrix
  		* @param matrix Ext.draw.Matrix
  		* @param target Object Optional object to receive the result.
  		* @returns Object An object with x, y, width and height.
  		*/
  var getDimensionWithTransform: js.UndefOr[
    js.Function2[/* matrix */ js.UndefOr[IMatrix], /* target */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Test whether the given point is on or inside the path
  		* @param x Number
  		* @param y Number
  		* @returns Boolean
  		*/
  var isPointInPath: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Boolean]] = js.undefined
  /** [Method] A straight line to a position
  		* @param x Number
  		* @param y Number
  		*/
  var lineTo: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Move to a position
  		* @param x Number
  		* @param y Number
  		*/
  var moveTo: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.undefined
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
  ] = js.undefined
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
  ] = js.undefined
  /** [Method] Return an svg path string for this path
  		* @returns String
  		*/
  @JSName("toString")
  var toString_FIPath: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Convert path to bezier curve stripes
  		* @param target Array The optional array to receive the result.
  		* @returns Array
  		*/
  var toStripes: js.UndefOr[js.Function1[/* target */ js.UndefOr[Array], Array]] = js.undefined
  /** [Method] Transform the current path by a matrix
  		* @param matrix Ext.draw.Matrix
  		*/
  var transform: js.UndefOr[js.Function1[/* matrix */ js.UndefOr[IMatrix], Unit]] = js.undefined
}

object IPath {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    arc: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* radius */ js.UndefOr[Double], /* startAngle */ js.UndefOr[Double], /* endAngle */ js.UndefOr[Double], /* anticlockwise */ js.UndefOr[Double]) => Unit = null,
    arcSvg: (/* rx */ js.UndefOr[Double], /* ry */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double], /* fA */ js.UndefOr[Double], /* fS */ js.UndefOr[Double], /* x2 */ js.UndefOr[Double], /* y2 */ js.UndefOr[Double]) => Unit = null,
    arcTo: (/* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double], /* x2 */ js.UndefOr[Double], /* y2 */ js.UndefOr[Double], /* rx */ js.UndefOr[Double], /* ry */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double]) => Unit = null,
    bezierCurveTo: (/* cx1 */ js.UndefOr[Double], /* cy1 */ js.UndefOr[Double], /* cx2 */ js.UndefOr[Double], /* cy2 */ js.UndefOr[Double], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clear: () => Unit = null,
    clone: () => IPath = null,
    closePath: () => Unit = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    ellipse: (/* cx */ js.UndefOr[Double], /* cy */ js.UndefOr[Double], /* radiusX */ js.UndefOr[Double], /* radiusY */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double], /* startAngle */ js.UndefOr[Double], /* endAngle */ js.UndefOr[Double], /* anticlockwise */ js.UndefOr[Double]) => Unit = null,
    extend: java.lang.String = null,
    fromStripes: /* stripes */ js.UndefOr[Array] => Unit = null,
    fromSvgString: /* pathString */ js.UndefOr[java.lang.String] => Unit = null,
    getDimension: /* target */ js.UndefOr[js.Any] => _ = null,
    getDimensionWithTransform: (/* matrix */ js.UndefOr[IMatrix], /* target */ js.UndefOr[js.Any]) => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    isPointInPath: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Boolean = null,
    lineTo: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit = null,
    mixins: js.Any = null,
    moveTo: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit = null,
    platformConfig: js.Any = null,
    quadraticCurveTo: (/* cx */ js.UndefOr[Double], /* cy */ js.UndefOr[Double], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit = null,
    rect: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    toString: () => java.lang.String = null,
    toStripes: /* target */ js.UndefOr[Array] => Array = null,
    transform: /* matrix */ js.UndefOr[IMatrix] => Unit = null,
    uses: Array = null
  ): IPath = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (arc != null) __obj.updateDynamic("arc")(js.Any.fromFunction6(arc))
    if (arcSvg != null) __obj.updateDynamic("arcSvg")(js.Any.fromFunction7(arcSvg))
    if (arcTo != null) __obj.updateDynamic("arcTo")(js.Any.fromFunction7(arcTo))
    if (bezierCurveTo != null) __obj.updateDynamic("bezierCurveTo")(js.Any.fromFunction6(bezierCurveTo))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction0(clear))
    if (clone != null) __obj.updateDynamic("clone")(js.Any.fromFunction0(clone))
    if (closePath != null) __obj.updateDynamic("closePath")(js.Any.fromFunction0(closePath))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (ellipse != null) __obj.updateDynamic("ellipse")(js.Any.fromFunction8(ellipse))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fromStripes != null) __obj.updateDynamic("fromStripes")(js.Any.fromFunction1(fromStripes))
    if (fromSvgString != null) __obj.updateDynamic("fromSvgString")(js.Any.fromFunction1(fromSvgString))
    if (getDimension != null) __obj.updateDynamic("getDimension")(js.Any.fromFunction1(getDimension))
    if (getDimensionWithTransform != null) __obj.updateDynamic("getDimensionWithTransform")(js.Any.fromFunction2(getDimensionWithTransform))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (isPointInPath != null) __obj.updateDynamic("isPointInPath")(js.Any.fromFunction2(isPointInPath))
    if (lineTo != null) __obj.updateDynamic("lineTo")(js.Any.fromFunction2(lineTo))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (moveTo != null) __obj.updateDynamic("moveTo")(js.Any.fromFunction2(moveTo))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (quadraticCurveTo != null) __obj.updateDynamic("quadraticCurveTo")(js.Any.fromFunction4(quadraticCurveTo))
    if (rect != null) __obj.updateDynamic("rect")(js.Any.fromFunction4(rect))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (toString != null) __obj.updateDynamic("toString")(js.Any.fromFunction0(toString))
    if (toStripes != null) __obj.updateDynamic("toStripes")(js.Any.fromFunction1(toStripes))
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPath]
  }
}

