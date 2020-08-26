package typings.senchaTouch.Ext.draw

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMatrix extends IBase {
  /** [Property] (Number) */
  var a: js.UndefOr[Double] = js.native
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
      /* xx */ js.UndefOr[Double], 
      /* xy */ js.UndefOr[Double], 
      /* yx */ js.UndefOr[Double], 
      /* yy */ js.UndefOr[Double], 
      /* dx */ js.UndefOr[Double], 
      /* dy */ js.UndefOr[Double], 
      this.type
    ]
  ] = js.native
  /** [Method] Postpend a matrix onto the current
    * @param matrix Ext.draw.Matrix
    * @returns Ext.draw.Matrix this
    */
  var appendMatrix: js.UndefOr[js.Function1[/* matrix */ js.UndefOr[this.type], this.type]] = js.native
  /** [Method] Clone this matrix
    * @returns Ext.draw.Matrix
    */
  @JSName("clone")
  var clone_FIMatrix: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Determines if this matrix has the same values as another matrix
    * @param matrix Ext.draw.Matrix
    * @returns Boolean
    */
  @JSName("equals")
  var equals_FIMatrix: js.UndefOr[js.Function1[/* matrix */ js.UndefOr[this.type], Boolean]] = js.native
  /** [Method] Horizontally flip the matrix
    * @returns Ext.draw.Matrix this
    */
  var flipX: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Vertically flip the matrix
    * @returns Ext.draw.Matrix this
    */
  var flipY: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Get offset x component of the matrix
    * @returns Number
    */
  var getDX: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Get offset y component of the matrix
    * @returns Number
    */
  var getDY: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Get the x scale of the matrix
    * @returns Number
    */
  var getScaleX: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Get the y scale of the matrix
    * @returns Number
    */
  var getScaleY: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Get x to x component of the matrix
    * @returns Number
    */
  var getXX: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Get x to y component of the matrix
    * @returns Number
    */
  var getXY: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Get y to x component of the matrix
    * @returns Number
    */
  var getYX: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Get y to y component of the matrix
    * @returns Number
    */
  var getYY: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Return a new matrix represents the opposite transformation of the current one
    * @param target Ext.draw.Matrix A target matrix. If present, it will receive the result of inversion to avoid creating a new object.
    * @returns Ext.draw.Matrix
    */
  var inverse: js.UndefOr[js.Function1[/* target */ js.UndefOr[this.type], this.type]] = js.native
  /** [Method] Determines whether this matrix is an identity matrix no transform
    * @returns Boolean
    */
  var isIdentity: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Postpend a matrix onto the current
    * @param matrix Ext.draw.Matrix
    * @returns Ext.draw.Matrix this
    */
  var multiply: js.UndefOr[js.Function1[/* matrix */ js.UndefOr[this.type], this.type]] = js.native
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
      /* xx */ js.UndefOr[Double], 
      /* xy */ js.UndefOr[Double], 
      /* yx */ js.UndefOr[Double], 
      /* yy */ js.UndefOr[Double], 
      /* dx */ js.UndefOr[Double], 
      /* dy */ js.UndefOr[Double], 
      this.type
    ]
  ] = js.native
  /** [Method] Prepend a matrix onto the current
    * @param matrix Ext.draw.Matrix
    * @returns Ext.draw.Matrix this
    */
  var prependMatrix: js.UndefOr[js.Function1[/* matrix */ js.UndefOr[this.type], this.type]] = js.native
  /** [Method] Reset the matrix to identical
    * @returns Ext.draw.Matrix this
    */
  var reset: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Rotate the matrix
    * @param angle Number Radians to rotate
    * @param rcx Number|null Center of rotation.
    * @param rcy Number|null Center of rotation.
    * @param prepend Boolean If true, this will transformation be prepended to the matrix.
    * @returns Ext.draw.Matrix this
    */
  var rotate: js.UndefOr[
    js.Function4[
      /* angle */ js.UndefOr[Double], 
      /* rcx */ js.UndefOr[js.Any], 
      /* rcy */ js.UndefOr[js.Any], 
      /* prepend */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  /** [Method] Rotate the matrix by the angle of a vector
    * @param x Number
    * @param y Number
    * @param prepend Boolean If true, this will transformation be prepended to the matrix.
    * @returns Ext.draw.Matrix this
    */
  var rotateFromVector: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* prepend */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
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
      /* sx */ js.UndefOr[Double], 
      /* sy */ js.UndefOr[Double], 
      /* scx */ js.UndefOr[Double], 
      /* scy */ js.UndefOr[Double], 
      /* prepend */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
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
      /* xx */ js.UndefOr[Double], 
      /* xy */ js.UndefOr[Double], 
      /* yx */ js.UndefOr[Double], 
      /* yy */ js.UndefOr[Double], 
      /* dx */ js.UndefOr[Double], 
      /* dy */ js.UndefOr[Double], 
      this.type
    ]
  ] = js.native
  /** [Method] Skew the matrix
    * @param angle Number
    * @returns Ext.draw.Matrix this
    */
  var skewX: js.UndefOr[js.Function1[/* angle */ js.UndefOr[Double], this.type]] = js.native
  /** [Method] Skew the matrix
    * @param angle Number
    * @returns Ext.draw.Matrix this
    */
  var skewY: js.UndefOr[js.Function1[/* angle */ js.UndefOr[Double], this.type]] = js.native
  /** [Method] Split matrix into Translate Scale Shear and Rotate
    * @returns Object
    */
  var split: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Create an array of elements by horizontal order xx yx dx yx yy dy
    * @returns Array
    */
  var toArray: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Apply the matrix to a drawing context
    * @param ctx Object
    * @returns Ext.draw.Matrix this
    */
  var toContext: js.UndefOr[js.Function1[/* ctx */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Get an array of elements
    * @returns Array
    */
  @JSName("toString")
  var toString_FIMatrix: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Return a string that can be used as transform attribute in SVG
    * @returns String
    */
  var toSvg: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Create an array of elements by vertical order xx xy yx yy dx dy
    * @returns Array|String
    */
  var toVerticalArray: js.UndefOr[js.Function0[_]] = js.native
  /** [Method]
    * @param bbox Object Given as {x: Number, y: Number, width: Number, height: Number}.
    * @param radius Number
    * @param target Object Optional target object to recieve the result. Recommended to use it for better gc.
    * @returns Object Object with x, y, width and height.
    */
  var transformBBox: js.UndefOr[
    js.Function3[
      /* bbox */ js.UndefOr[js.Any], 
      /* radius */ js.UndefOr[Double], 
      /* target */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  /** [Method] Transform a list for points
    * @param list Array
    * @returns Array list
    */
  var transformList: js.UndefOr[js.Function1[/* list */ js.UndefOr[Array], Array]] = js.native
  /** [Method] Transform a point to a new array
    * @param point Array
    * @returns Array
    */
  var transformPoint: js.UndefOr[js.Function1[/* point */ js.UndefOr[Array], Array]] = js.native
  /** [Method] Translate the matrix
    * @param x Number
    * @param y Number
    * @param prepend Boolean If true, this will transformation be prepended to the matrix.
    * @returns Ext.draw.Matrix this
    */
  var translate: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* prepend */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  /** [Method] Transform point returning the x component of the result
    * @param x Number
    * @param y Number
    * @returns Number x component of the result.
    */
  var x: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Double]] = js.native
  /** [Method] Transform point returning the y component of the result
    * @param x Number
    * @param y Number
    * @returns Number y component of the result.
    */
  var y: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Double]] = js.native
}

object IMatrix {
  @scala.inline
  def apply(): IMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMatrix]
  }
  @scala.inline
  implicit class IMatrixOps[Self <: IMatrix] (val x: Self) extends AnyVal {
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
    def setA(value: Double): Self = this.set("a", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteA: Self = this.set("a", js.undefined)
    @scala.inline
    def setAppend(
      value: (/* xx */ js.UndefOr[Double], /* xy */ js.UndefOr[Double], /* yx */ js.UndefOr[Double], /* yy */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double]) => IMatrix
    ): Self = this.set("append", js.Any.fromFunction6(value))
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    @scala.inline
    def setAppendMatrix(value: /* matrix */ js.UndefOr[IMatrix] => IMatrix): Self = this.set("appendMatrix", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAppendMatrix: Self = this.set("appendMatrix", js.undefined)
    @scala.inline
    def setClone(value: () => IMatrix): Self = this.set("clone", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setEquals(value: /* matrix */ js.UndefOr[IMatrix] => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEquals: Self = this.set("equals", js.undefined)
    @scala.inline
    def setFlipX(value: () => IMatrix): Self = this.set("flipX", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFlipX: Self = this.set("flipX", js.undefined)
    @scala.inline
    def setFlipY(value: () => IMatrix): Self = this.set("flipY", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFlipY: Self = this.set("flipY", js.undefined)
    @scala.inline
    def setGetDX(value: () => Double): Self = this.set("getDX", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDX: Self = this.set("getDX", js.undefined)
    @scala.inline
    def setGetDY(value: () => Double): Self = this.set("getDY", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDY: Self = this.set("getDY", js.undefined)
    @scala.inline
    def setGetScaleX(value: () => Double): Self = this.set("getScaleX", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetScaleX: Self = this.set("getScaleX", js.undefined)
    @scala.inline
    def setGetScaleY(value: () => Double): Self = this.set("getScaleY", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetScaleY: Self = this.set("getScaleY", js.undefined)
    @scala.inline
    def setGetXX(value: () => Double): Self = this.set("getXX", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetXX: Self = this.set("getXX", js.undefined)
    @scala.inline
    def setGetXY(value: () => Double): Self = this.set("getXY", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetXY: Self = this.set("getXY", js.undefined)
    @scala.inline
    def setGetYX(value: () => Double): Self = this.set("getYX", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetYX: Self = this.set("getYX", js.undefined)
    @scala.inline
    def setGetYY(value: () => Double): Self = this.set("getYY", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetYY: Self = this.set("getYY", js.undefined)
    @scala.inline
    def setInverse(value: /* target */ js.UndefOr[IMatrix] => IMatrix): Self = this.set("inverse", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInverse: Self = this.set("inverse", js.undefined)
    @scala.inline
    def setIsIdentity(value: () => Boolean): Self = this.set("isIdentity", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsIdentity: Self = this.set("isIdentity", js.undefined)
    @scala.inline
    def setMultiply(value: /* matrix */ js.UndefOr[IMatrix] => IMatrix): Self = this.set("multiply", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMultiply: Self = this.set("multiply", js.undefined)
    @scala.inline
    def setPrepend(
      value: (/* xx */ js.UndefOr[Double], /* xy */ js.UndefOr[Double], /* yx */ js.UndefOr[Double], /* yy */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double]) => IMatrix
    ): Self = this.set("prepend", js.Any.fromFunction6(value))
    @scala.inline
    def deletePrepend: Self = this.set("prepend", js.undefined)
    @scala.inline
    def setPrependMatrix(value: /* matrix */ js.UndefOr[IMatrix] => IMatrix): Self = this.set("prependMatrix", js.Any.fromFunction1(value))
    @scala.inline
    def deletePrependMatrix: Self = this.set("prependMatrix", js.undefined)
    @scala.inline
    def setReset(value: () => IMatrix): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setRotate(
      value: (/* angle */ js.UndefOr[Double], /* rcx */ js.UndefOr[js.Any], /* rcy */ js.UndefOr[js.Any], /* prepend */ js.UndefOr[Boolean]) => IMatrix
    ): Self = this.set("rotate", js.Any.fromFunction4(value))
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setRotateFromVector(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* prepend */ js.UndefOr[Boolean]) => IMatrix
    ): Self = this.set("rotateFromVector", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRotateFromVector: Self = this.set("rotateFromVector", js.undefined)
    @scala.inline
    def setScale(
      value: (/* sx */ js.UndefOr[Double], /* sy */ js.UndefOr[Double], /* scx */ js.UndefOr[Double], /* scy */ js.UndefOr[Double], /* prepend */ js.UndefOr[Boolean]) => IMatrix
    ): Self = this.set("scale", js.Any.fromFunction5(value))
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setSet(
      value: (/* xx */ js.UndefOr[Double], /* xy */ js.UndefOr[Double], /* yx */ js.UndefOr[Double], /* yy */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double]) => IMatrix
    ): Self = this.set("set", js.Any.fromFunction6(value))
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
    @scala.inline
    def setSkewX(value: /* angle */ js.UndefOr[Double] => IMatrix): Self = this.set("skewX", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSkewX: Self = this.set("skewX", js.undefined)
    @scala.inline
    def setSkewY(value: /* angle */ js.UndefOr[Double] => IMatrix): Self = this.set("skewY", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSkewY: Self = this.set("skewY", js.undefined)
    @scala.inline
    def setSplit(value: () => _): Self = this.set("split", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSplit: Self = this.set("split", js.undefined)
    @scala.inline
    def setToArray(value: () => Array): Self = this.set("toArray", js.Any.fromFunction0(value))
    @scala.inline
    def deleteToArray: Self = this.set("toArray", js.undefined)
    @scala.inline
    def setToContext(value: /* ctx */ js.UndefOr[js.Any] => IMatrix): Self = this.set("toContext", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToContext: Self = this.set("toContext", js.undefined)
    @scala.inline
    def setToString(value: () => Array): Self = this.set("toString", js.Any.fromFunction0(value))
    @scala.inline
    def deleteToString: Self = this.set("toString", js.undefined)
    @scala.inline
    def setToSvg(value: () => String): Self = this.set("toSvg", js.Any.fromFunction0(value))
    @scala.inline
    def deleteToSvg: Self = this.set("toSvg", js.undefined)
    @scala.inline
    def setToVerticalArray(value: () => _): Self = this.set("toVerticalArray", js.Any.fromFunction0(value))
    @scala.inline
    def deleteToVerticalArray: Self = this.set("toVerticalArray", js.undefined)
    @scala.inline
    def setTransformBBox(
      value: (/* bbox */ js.UndefOr[js.Any], /* radius */ js.UndefOr[Double], /* target */ js.UndefOr[js.Any]) => _
    ): Self = this.set("transformBBox", js.Any.fromFunction3(value))
    @scala.inline
    def deleteTransformBBox: Self = this.set("transformBBox", js.undefined)
    @scala.inline
    def setTransformList(value: /* list */ js.UndefOr[Array] => Array): Self = this.set("transformList", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransformList: Self = this.set("transformList", js.undefined)
    @scala.inline
    def setTransformPoint(value: /* point */ js.UndefOr[Array] => Array): Self = this.set("transformPoint", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransformPoint: Self = this.set("transformPoint", js.undefined)
    @scala.inline
    def setTranslate(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* prepend */ js.UndefOr[Boolean]) => IMatrix
    ): Self = this.set("translate", js.Any.fromFunction3(value))
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    @scala.inline
    def setX(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Double): Self = this.set("x", js.Any.fromFunction2(value))
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Double): Self = this.set("y", js.Any.fromFunction2(value))
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

