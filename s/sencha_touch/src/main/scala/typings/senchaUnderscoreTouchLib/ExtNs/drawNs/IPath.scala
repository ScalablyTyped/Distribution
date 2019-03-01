package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPath
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
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
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      /* radius */ js.UndefOr[scala.Double], 
      /* startAngle */ js.UndefOr[scala.Double], 
      /* endAngle */ js.UndefOr[scala.Double], 
      /* anticlockwise */ js.UndefOr[scala.Double], 
      scala.Unit
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
      /* rx */ js.UndefOr[scala.Double], 
      /* ry */ js.UndefOr[scala.Double], 
      /* rotation */ js.UndefOr[scala.Double], 
      /* fA */ js.UndefOr[scala.Double], 
      /* fS */ js.UndefOr[scala.Double], 
      /* x2 */ js.UndefOr[scala.Double], 
      /* y2 */ js.UndefOr[scala.Double], 
      scala.Unit
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
      /* x1 */ js.UndefOr[scala.Double], 
      /* y1 */ js.UndefOr[scala.Double], 
      /* x2 */ js.UndefOr[scala.Double], 
      /* y2 */ js.UndefOr[scala.Double], 
      /* rx */ js.UndefOr[scala.Double], 
      /* ry */ js.UndefOr[scala.Double], 
      /* rotation */ js.UndefOr[scala.Double], 
      scala.Unit
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
      /* cx1 */ js.UndefOr[scala.Double], 
      /* cy1 */ js.UndefOr[scala.Double], 
      /* cx2 */ js.UndefOr[scala.Double], 
      /* cy2 */ js.UndefOr[scala.Double], 
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Clear the path  */
  var clear: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Clone this path
  		* @returns Ext.draw.Path
  		*/
  @JSName("clone")
  var clone_FIPath: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Close this path with a straight line  */
  var closePath: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
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
      /* cx */ js.UndefOr[scala.Double], 
      /* cy */ js.UndefOr[scala.Double], 
      /* radiusX */ js.UndefOr[scala.Double], 
      /* radiusY */ js.UndefOr[scala.Double], 
      /* rotation */ js.UndefOr[scala.Double], 
      /* startAngle */ js.UndefOr[scala.Double], 
      /* endAngle */ js.UndefOr[scala.Double], 
      /* anticlockwise */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Reconstruct path from cubic bezier curve stripes
  		* @param stripes Array
  		*/
  var fromStripes: js.UndefOr[
    js.Function1[/* stripes */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Feed the path from svg path string
  		* @param pathString String
  		*/
  var fromSvgString: js.UndefOr[js.Function1[/* pathString */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
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
  var isPointInPath: js.UndefOr[
    js.Function2[/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], scala.Boolean]
  ] = js.undefined
  /** [Method] A straight line to a position
  		* @param x Number
  		* @param y Number
  		*/
  var lineTo: js.UndefOr[
    js.Function2[/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], scala.Unit]
  ] = js.undefined
  /** [Method] Move to a position
  		* @param x Number
  		* @param y Number
  		*/
  var moveTo: js.UndefOr[
    js.Function2[/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], scala.Unit]
  ] = js.undefined
  /** [Method] A quadratic bezier curve to a position
  		* @param cx Number
  		* @param cy Number
  		* @param x Number
  		* @param y Number
  		*/
  var quadraticCurveTo: js.UndefOr[
    js.Function4[
      /* cx */ js.UndefOr[scala.Double], 
      /* cy */ js.UndefOr[scala.Double], 
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      scala.Unit
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
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      scala.Unit
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
  var toStripes: js.UndefOr[
    js.Function1[
      /* target */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Transform the current path by a matrix
  		* @param matrix Ext.draw.Matrix
  		*/
  var transform: js.UndefOr[js.Function1[/* matrix */ js.UndefOr[IMatrix], scala.Unit]] = js.undefined
}

object IPath {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    arc: js.Function6[
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      /* radius */ js.UndefOr[scala.Double], 
      /* startAngle */ js.UndefOr[scala.Double], 
      /* endAngle */ js.UndefOr[scala.Double], 
      /* anticlockwise */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    arcSvg: js.Function7[
      /* rx */ js.UndefOr[scala.Double], 
      /* ry */ js.UndefOr[scala.Double], 
      /* rotation */ js.UndefOr[scala.Double], 
      /* fA */ js.UndefOr[scala.Double], 
      /* fS */ js.UndefOr[scala.Double], 
      /* x2 */ js.UndefOr[scala.Double], 
      /* y2 */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    arcTo: js.Function7[
      /* x1 */ js.UndefOr[scala.Double], 
      /* y1 */ js.UndefOr[scala.Double], 
      /* x2 */ js.UndefOr[scala.Double], 
      /* y2 */ js.UndefOr[scala.Double], 
      /* rx */ js.UndefOr[scala.Double], 
      /* ry */ js.UndefOr[scala.Double], 
      /* rotation */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    bezierCurveTo: js.Function6[
      /* cx1 */ js.UndefOr[scala.Double], 
      /* cy1 */ js.UndefOr[scala.Double], 
      /* cx2 */ js.UndefOr[scala.Double], 
      /* cy2 */ js.UndefOr[scala.Double], 
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clear: js.Function0[scala.Unit] = null,
    clone: js.Function0[IPath] = null,
    closePath: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    ellipse: js.Function8[
      /* cx */ js.UndefOr[scala.Double], 
      /* cy */ js.UndefOr[scala.Double], 
      /* radiusX */ js.UndefOr[scala.Double], 
      /* radiusY */ js.UndefOr[scala.Double], 
      /* rotation */ js.UndefOr[scala.Double], 
      /* startAngle */ js.UndefOr[scala.Double], 
      /* endAngle */ js.UndefOr[scala.Double], 
      /* anticlockwise */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    extend: java.lang.String = null,
    fromStripes: js.Function1[/* stripes */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    fromSvgString: js.Function1[/* pathString */ js.UndefOr[java.lang.String], scala.Unit] = null,
    getDimension: js.Function1[/* target */ js.UndefOr[js.Any], _] = null,
    getDimensionWithTransform: js.Function2[/* matrix */ js.UndefOr[IMatrix], /* target */ js.UndefOr[js.Any], _] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    isPointInPath: js.Function2[/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], scala.Boolean] = null,
    lineTo: js.Function2[/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], scala.Unit] = null,
    mixins: js.Any = null,
    moveTo: js.Function2[/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], scala.Unit] = null,
    platformConfig: js.Any = null,
    quadraticCurveTo: js.Function4[
      /* cx */ js.UndefOr[scala.Double], 
      /* cy */ js.UndefOr[scala.Double], 
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    rect: js.Function4[
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    toString: js.Function0[java.lang.String] = null,
    toStripes: js.Function1[
      /* target */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ] = null,
    transform: js.Function1[/* matrix */ js.UndefOr[IMatrix], scala.Unit] = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IPath = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (arc != null) __obj.updateDynamic("arc")(arc)
    if (arcSvg != null) __obj.updateDynamic("arcSvg")(arcSvg)
    if (arcTo != null) __obj.updateDynamic("arcTo")(arcTo)
    if (bezierCurveTo != null) __obj.updateDynamic("bezierCurveTo")(bezierCurveTo)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (clone != null) __obj.updateDynamic("clone")(clone)
    if (closePath != null) __obj.updateDynamic("closePath")(closePath)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (ellipse != null) __obj.updateDynamic("ellipse")(ellipse)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fromStripes != null) __obj.updateDynamic("fromStripes")(fromStripes)
    if (fromSvgString != null) __obj.updateDynamic("fromSvgString")(fromSvgString)
    if (getDimension != null) __obj.updateDynamic("getDimension")(getDimension)
    if (getDimensionWithTransform != null) __obj.updateDynamic("getDimensionWithTransform")(getDimensionWithTransform)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (isPointInPath != null) __obj.updateDynamic("isPointInPath")(isPointInPath)
    if (lineTo != null) __obj.updateDynamic("lineTo")(lineTo)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (moveTo != null) __obj.updateDynamic("moveTo")(moveTo)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (quadraticCurveTo != null) __obj.updateDynamic("quadraticCurveTo")(quadraticCurveTo)
    if (rect != null) __obj.updateDynamic("rect")(rect)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (toString != null) __obj.updateDynamic("toString")(toString)
    if (toStripes != null) __obj.updateDynamic("toStripes")(toStripes)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IPath]
  }
}

