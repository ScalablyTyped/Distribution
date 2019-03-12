package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMatrix
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Property] (Number) */
  var a: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Postpend a matrix onto the current
  		* @param xx Number Coefficient from x to x.
  		* @param xy Number Coefficient from x to y.
  		* @param yx Number Coefficient from y to x.
  		* @param yy Number Coefficient from y to y.
  		* @param dx Number Offset of x.
  		* @param dy Number Offset of y.
  		* @returns Ext.draw.Matrix this
  		*/
  var append: js.UndefOr[
    js.Function6[
      /* xx */ js.UndefOr[scala.Double], 
      /* xy */ js.UndefOr[scala.Double], 
      /* yx */ js.UndefOr[scala.Double], 
      /* yy */ js.UndefOr[scala.Double], 
      /* dx */ js.UndefOr[scala.Double], 
      /* dy */ js.UndefOr[scala.Double], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Postpend a matrix onto the current
  		* @param matrix Ext.draw.Matrix
  		* @returns Ext.draw.Matrix this
  		*/
  var appendMatrix: js.UndefOr[js.Function1[/* matrix */ js.UndefOr[this.type], this.type]] = js.undefined
  /** [Method] Clone this matrix
  		* @returns Ext.draw.Matrix
  		*/
  @JSName("clone")
  var clone_FIMatrix: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Determines if this matrix has the same values as another matrix
  		* @param matrix Ext.draw.Matrix
  		* @returns Boolean
  		*/
  @JSName("equals")
  var equals_FIMatrix: js.UndefOr[js.Function1[/* matrix */ js.UndefOr[this.type], scala.Boolean]] = js.undefined
  /** [Method] Horizontally flip the matrix
  		* @returns Ext.draw.Matrix this
  		*/
  var flipX: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Vertically flip the matrix
  		* @returns Ext.draw.Matrix this
  		*/
  var flipY: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Get offset x component of the matrix
  		* @returns Number
  		*/
  var getDX: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Get offset y component of the matrix
  		* @returns Number
  		*/
  var getDY: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Get the x scale of the matrix
  		* @returns Number
  		*/
  var getScaleX: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Get the y scale of the matrix
  		* @returns Number
  		*/
  var getScaleY: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Get x to x component of the matrix
  		* @returns Number
  		*/
  var getXX: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Get x to y component of the matrix
  		* @returns Number
  		*/
  var getXY: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Get y to x component of the matrix
  		* @returns Number
  		*/
  var getYX: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Get y to y component of the matrix
  		* @returns Number
  		*/
  var getYY: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Return a new matrix represents the opposite transformation of the current one
  		* @param target Ext.draw.Matrix A target matrix. If present, it will receive the result of inversion to avoid creating a new object.
  		* @returns Ext.draw.Matrix
  		*/
  var inverse: js.UndefOr[js.Function1[/* target */ js.UndefOr[this.type], this.type]] = js.undefined
  /** [Method] Determines whether this matrix is an identity matrix no transform
  		* @returns Boolean
  		*/
  var isIdentity: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Postpend a matrix onto the current
  		* @param matrix Ext.draw.Matrix
  		* @returns Ext.draw.Matrix this
  		*/
  var multiply: js.UndefOr[js.Function1[/* matrix */ js.UndefOr[this.type], this.type]] = js.undefined
  /** [Method] Prepend a matrix onto the current
  		* @param xx Number Coefficient from x to x.
  		* @param xy Number Coefficient from x to y.
  		* @param yx Number Coefficient from y to x.
  		* @param yy Number Coefficient from y to y.
  		* @param dx Number Offset of x.
  		* @param dy Number Offset of y.
  		* @returns Ext.draw.Matrix this
  		*/
  var prepend: js.UndefOr[
    js.Function6[
      /* xx */ js.UndefOr[scala.Double], 
      /* xy */ js.UndefOr[scala.Double], 
      /* yx */ js.UndefOr[scala.Double], 
      /* yy */ js.UndefOr[scala.Double], 
      /* dx */ js.UndefOr[scala.Double], 
      /* dy */ js.UndefOr[scala.Double], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Prepend a matrix onto the current
  		* @param matrix Ext.draw.Matrix
  		* @returns Ext.draw.Matrix this
  		*/
  var prependMatrix: js.UndefOr[js.Function1[/* matrix */ js.UndefOr[this.type], this.type]] = js.undefined
  /** [Method] Reset the matrix to identical
  		* @returns Ext.draw.Matrix this
  		*/
  var reset: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Rotate the matrix
  		* @param angle Number Radians to rotate
  		* @param rcx Number|null Center of rotation.
  		* @param rcy Number|null Center of rotation.
  		* @param prepend Boolean If true, this will transformation be prepended to the matrix.
  		* @returns Ext.draw.Matrix this
  		*/
  var rotate: js.UndefOr[
    js.Function4[
      /* angle */ js.UndefOr[scala.Double], 
      /* rcx */ js.UndefOr[js.Any], 
      /* rcy */ js.UndefOr[js.Any], 
      /* prepend */ js.UndefOr[scala.Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Rotate the matrix by the angle of a vector
  		* @param x Number
  		* @param y Number
  		* @param prepend Boolean If true, this will transformation be prepended to the matrix.
  		* @returns Ext.draw.Matrix this
  		*/
  var rotateFromVector: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      /* prepend */ js.UndefOr[scala.Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Scale the matrix
  		* @param sx Number
  		* @param sy Number
  		* @param scx Number
  		* @param scy Number
  		* @param prepend Boolean If true, this will transformation be prepended to the matrix.
  		* @returns Ext.draw.Matrix this
  		*/
  var scale: js.UndefOr[
    js.Function5[
      /* sx */ js.UndefOr[scala.Double], 
      /* sy */ js.UndefOr[scala.Double], 
      /* scx */ js.UndefOr[scala.Double], 
      /* scy */ js.UndefOr[scala.Double], 
      /* prepend */ js.UndefOr[scala.Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Set the elements of a Matrix
  		* @param xx Number
  		* @param xy Number
  		* @param yx Number
  		* @param yy Number
  		* @param dx Number
  		* @param dy Number
  		* @returns Ext.draw.Matrix this
  		*/
  var set: js.UndefOr[
    js.Function6[
      /* xx */ js.UndefOr[scala.Double], 
      /* xy */ js.UndefOr[scala.Double], 
      /* yx */ js.UndefOr[scala.Double], 
      /* yy */ js.UndefOr[scala.Double], 
      /* dx */ js.UndefOr[scala.Double], 
      /* dy */ js.UndefOr[scala.Double], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Skew the matrix
  		* @param angle Number
  		* @returns Ext.draw.Matrix this
  		*/
  var skewX: js.UndefOr[js.Function1[/* angle */ js.UndefOr[scala.Double], this.type]] = js.undefined
  /** [Method] Skew the matrix
  		* @param angle Number
  		* @returns Ext.draw.Matrix this
  		*/
  var skewY: js.UndefOr[js.Function1[/* angle */ js.UndefOr[scala.Double], this.type]] = js.undefined
  /** [Method] Split matrix into Translate Scale Shear and Rotate
  		* @returns Object
  		*/
  var split: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Create an array of elements by horizontal order xx yx dx yx yy dy
  		* @returns Array
  		*/
  var toArray: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Apply the matrix to a drawing context
  		* @param ctx Object
  		* @returns Ext.draw.Matrix this
  		*/
  var toContext: js.UndefOr[js.Function1[/* ctx */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Get an array of elements
  		* @returns Array
  		*/
  @JSName("toString")
  var toString_FIMatrix: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Return a string that can be used as transform attribute in SVG
  		* @returns String
  		*/
  var toSvg: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Create an array of elements by vertical order xx xy yx yy dx dy
  		* @returns Array|String
  		*/
  var toVerticalArray: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method]
  		* @param bbox Object Given as {x: Number, y: Number, width: Number, height: Number}.
  		* @param radius Number
  		* @param target Object Optional target object to recieve the result. Recommended to use it for better gc.
  		* @returns Object Object with x, y, width and height.
  		*/
  var transformBBox: js.UndefOr[
    js.Function3[
      /* bbox */ js.UndefOr[js.Any], 
      /* radius */ js.UndefOr[scala.Double], 
      /* target */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Transform a list for points
  		* @param list Array
  		* @returns Array list
  		*/
  var transformList: js.UndefOr[
    js.Function1[
      /* list */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Transform a point to a new array
  		* @param point Array
  		* @returns Array
  		*/
  var transformPoint: js.UndefOr[
    js.Function1[
      /* point */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Translate the matrix
  		* @param x Number
  		* @param y Number
  		* @param prepend Boolean If true, this will transformation be prepended to the matrix.
  		* @returns Ext.draw.Matrix this
  		*/
  var translate: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      /* prepend */ js.UndefOr[scala.Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Transform point returning the x component of the result
  		* @param x Number
  		* @param y Number
  		* @returns Number x component of the result.
  		*/
  var x: js.UndefOr[
    js.Function2[/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], scala.Double]
  ] = js.undefined
  /** [Method] Transform point returning the y component of the result
  		* @param x Number
  		* @param y Number
  		* @returns Number y component of the result.
  		*/
  var y: js.UndefOr[
    js.Function2[/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], scala.Double]
  ] = js.undefined
}

object IMatrix {
  @scala.inline
  def apply(
    a: scala.Int | scala.Double = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    append: (/* xx */ js.UndefOr[scala.Double], /* xy */ js.UndefOr[scala.Double], /* yx */ js.UndefOr[scala.Double], /* yy */ js.UndefOr[scala.Double], /* dx */ js.UndefOr[scala.Double], /* dy */ js.UndefOr[scala.Double]) => IMatrix = null,
    appendMatrix: /* matrix */ js.UndefOr[IMatrix] => IMatrix = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clone: () => IMatrix = null,
    config: js.Any = null,
    destroy: () => scala.Unit = null,
    equals: /* matrix */ js.UndefOr[IMatrix] => scala.Boolean = null,
    extend: java.lang.String = null,
    flipX: () => IMatrix = null,
    flipY: () => IMatrix = null,
    getDX: () => scala.Double = null,
    getDY: () => scala.Double = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getScaleX: () => scala.Double = null,
    getScaleY: () => scala.Double = null,
    getXX: () => scala.Double = null,
    getXY: () => scala.Double = null,
    getYX: () => scala.Double = null,
    getYY: () => scala.Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    inverse: /* target */ js.UndefOr[IMatrix] => IMatrix = null,
    isIdentity: () => scala.Boolean = null,
    mixins: js.Any = null,
    multiply: /* matrix */ js.UndefOr[IMatrix] => IMatrix = null,
    platformConfig: js.Any = null,
    prepend: (/* xx */ js.UndefOr[scala.Double], /* xy */ js.UndefOr[scala.Double], /* yx */ js.UndefOr[scala.Double], /* yy */ js.UndefOr[scala.Double], /* dx */ js.UndefOr[scala.Double], /* dy */ js.UndefOr[scala.Double]) => IMatrix = null,
    prependMatrix: /* matrix */ js.UndefOr[IMatrix] => IMatrix = null,
    reset: () => IMatrix = null,
    rotate: (/* angle */ js.UndefOr[scala.Double], /* rcx */ js.UndefOr[js.Any], /* rcy */ js.UndefOr[js.Any], /* prepend */ js.UndefOr[scala.Boolean]) => IMatrix = null,
    rotateFromVector: (/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], /* prepend */ js.UndefOr[scala.Boolean]) => IMatrix = null,
    scale: (/* sx */ js.UndefOr[scala.Double], /* sy */ js.UndefOr[scala.Double], /* scx */ js.UndefOr[scala.Double], /* scy */ js.UndefOr[scala.Double], /* prepend */ js.UndefOr[scala.Boolean]) => IMatrix = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    set: (/* xx */ js.UndefOr[scala.Double], /* xy */ js.UndefOr[scala.Double], /* yx */ js.UndefOr[scala.Double], /* yy */ js.UndefOr[scala.Double], /* dx */ js.UndefOr[scala.Double], /* dy */ js.UndefOr[scala.Double]) => IMatrix = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    skewX: /* angle */ js.UndefOr[scala.Double] => IMatrix = null,
    skewY: /* angle */ js.UndefOr[scala.Double] => IMatrix = null,
    split: () => _ = null,
    statics: js.Any = null,
    toArray: () => senchaUnderscoreTouchLib.ExtNs.Array = null,
    toContext: /* ctx */ js.UndefOr[js.Any] => IMatrix = null,
    toString: () => senchaUnderscoreTouchLib.ExtNs.Array = null,
    toSvg: () => java.lang.String = null,
    toVerticalArray: () => _ = null,
    transformBBox: (/* bbox */ js.UndefOr[js.Any], /* radius */ js.UndefOr[scala.Double], /* target */ js.UndefOr[js.Any]) => _ = null,
    transformList: /* list */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] => senchaUnderscoreTouchLib.ExtNs.Array = null,
    transformPoint: /* point */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] => senchaUnderscoreTouchLib.ExtNs.Array = null,
    translate: (/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], /* prepend */ js.UndefOr[scala.Boolean]) => IMatrix = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null,
    x: (/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double]) => scala.Double = null,
    y: (/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double]) => scala.Double = null
  ): IMatrix = {
    val __obj = js.Dynamic.literal()
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (append != null) __obj.updateDynamic("append")(js.Any.fromFunction6(append))
    if (appendMatrix != null) __obj.updateDynamic("appendMatrix")(js.Any.fromFunction1(appendMatrix))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clone != null) __obj.updateDynamic("clone")(js.Any.fromFunction0(clone))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction1(equals))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (flipX != null) __obj.updateDynamic("flipX")(js.Any.fromFunction0(flipX))
    if (flipY != null) __obj.updateDynamic("flipY")(js.Any.fromFunction0(flipY))
    if (getDX != null) __obj.updateDynamic("getDX")(js.Any.fromFunction0(getDX))
    if (getDY != null) __obj.updateDynamic("getDY")(js.Any.fromFunction0(getDY))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getScaleX != null) __obj.updateDynamic("getScaleX")(js.Any.fromFunction0(getScaleX))
    if (getScaleY != null) __obj.updateDynamic("getScaleY")(js.Any.fromFunction0(getScaleY))
    if (getXX != null) __obj.updateDynamic("getXX")(js.Any.fromFunction0(getXX))
    if (getXY != null) __obj.updateDynamic("getXY")(js.Any.fromFunction0(getXY))
    if (getYX != null) __obj.updateDynamic("getYX")(js.Any.fromFunction0(getYX))
    if (getYY != null) __obj.updateDynamic("getYY")(js.Any.fromFunction0(getYY))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (inverse != null) __obj.updateDynamic("inverse")(js.Any.fromFunction1(inverse))
    if (isIdentity != null) __obj.updateDynamic("isIdentity")(js.Any.fromFunction0(isIdentity))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (multiply != null) __obj.updateDynamic("multiply")(js.Any.fromFunction1(multiply))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (prepend != null) __obj.updateDynamic("prepend")(js.Any.fromFunction6(prepend))
    if (prependMatrix != null) __obj.updateDynamic("prependMatrix")(js.Any.fromFunction1(prependMatrix))
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction0(reset))
    if (rotate != null) __obj.updateDynamic("rotate")(js.Any.fromFunction4(rotate))
    if (rotateFromVector != null) __obj.updateDynamic("rotateFromVector")(js.Any.fromFunction3(rotateFromVector))
    if (scale != null) __obj.updateDynamic("scale")(js.Any.fromFunction5(scale))
    if (self != null) __obj.updateDynamic("self")(self)
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction6(set))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (skewX != null) __obj.updateDynamic("skewX")(js.Any.fromFunction1(skewX))
    if (skewY != null) __obj.updateDynamic("skewY")(js.Any.fromFunction1(skewY))
    if (split != null) __obj.updateDynamic("split")(js.Any.fromFunction0(split))
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (toArray != null) __obj.updateDynamic("toArray")(js.Any.fromFunction0(toArray))
    if (toContext != null) __obj.updateDynamic("toContext")(js.Any.fromFunction1(toContext))
    if (toString != null) __obj.updateDynamic("toString")(js.Any.fromFunction0(toString))
    if (toSvg != null) __obj.updateDynamic("toSvg")(js.Any.fromFunction0(toSvg))
    if (toVerticalArray != null) __obj.updateDynamic("toVerticalArray")(js.Any.fromFunction0(toVerticalArray))
    if (transformBBox != null) __obj.updateDynamic("transformBBox")(js.Any.fromFunction3(transformBBox))
    if (transformList != null) __obj.updateDynamic("transformList")(js.Any.fromFunction1(transformList))
    if (transformPoint != null) __obj.updateDynamic("transformPoint")(js.Any.fromFunction1(transformPoint))
    if (translate != null) __obj.updateDynamic("translate")(js.Any.fromFunction3(translate))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (x != null) __obj.updateDynamic("x")(js.Any.fromFunction2(x))
    if (y != null) __obj.updateDynamic("y")(js.Any.fromFunction2(y))
    __obj.asInstanceOf[IMatrix]
  }
}

