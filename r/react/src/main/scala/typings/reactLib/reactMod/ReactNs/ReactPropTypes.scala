package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactPropTypes extends js.Object {
  var any: propDashTypesLib.propDashTypesMod.Requireable[_] = js.native
  var array: propDashTypesLib.propDashTypesMod.Requireable[js.Array[_]] = js.native
  @JSName("arrayOf")
  var arrayOf_Original: js.Function1[
    /* type */ propDashTypesLib.propDashTypesMod.Validator[_], 
    propDashTypesLib.propDashTypesMod.Requireable[js.Array[_]]
  ] = js.native
  var bool: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean] = js.native
  var element: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactElementLike] = js.native
  @JSName("exact")
  var exact_Original: js.Function1[
    /* type */ propDashTypesLib.propDashTypesMod.ValidationMap[_], 
    propDashTypesLib.propDashTypesMod.Requireable[
      stdLib.Required[
        propDashTypesLib.propDashTypesMod.InferProps[propDashTypesLib.propDashTypesMod.ValidationMap[_]]
      ]
    ]
  ] = js.native
  var func: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */_, _]] = js.native
  @JSName("instanceOf")
  var instanceOf_Original: js.Function1[
    /* expectedClass */ ScalablyTyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any], 
    propDashTypesLib.propDashTypesMod.Requireable[_]
  ] = js.native
  var node: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike] = js.native
  var number: propDashTypesLib.propDashTypesMod.Requireable[scala.Double] = js.native
  var `object`: propDashTypesLib.propDashTypesMod.Requireable[js.Object] = js.native
  @JSName("objectOf")
  var objectOf_Original: js.Function1[
    /* type */ propDashTypesLib.propDashTypesMod.Validator[_], 
    propDashTypesLib.propDashTypesMod.Requireable[reactLib.reactLibStrings.ReactPropTypes with js.Any]
  ] = js.native
  @JSName("oneOfType")
  var oneOfType_Original: js.Function1[
    /* types */ js.Array[propDashTypesLib.propDashTypesMod.Validator[_]], 
    propDashTypesLib.propDashTypesMod.Requireable[
      stdLib.NonNullable[
        propDashTypesLib.propDashTypesMod.InferType[propDashTypesLib.propDashTypesMod.Validator[_]]
      ]
    ]
  ] = js.native
  @JSName("oneOf")
  var oneOf_Original: js.Function1[/* types */ js.Array[_], propDashTypesLib.propDashTypesMod.Requireable[_]] = js.native
  @JSName("shape")
  var shape_Original: js.Function1[
    /* type */ propDashTypesLib.propDashTypesMod.ValidationMap[_], 
    propDashTypesLib.propDashTypesMod.Requireable[
      propDashTypesLib.propDashTypesMod.InferProps[propDashTypesLib.propDashTypesMod.ValidationMap[_]]
    ]
  ] = js.native
  var string: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String] = js.native
  def arrayOf[T](`type`: propDashTypesLib.propDashTypesMod.Validator[T]): propDashTypesLib.propDashTypesMod.Requireable[js.Array[T]] = js.native
  def exact[P /* <: propDashTypesLib.propDashTypesMod.ValidationMap[_] */](`type`: P): propDashTypesLib.propDashTypesMod.Requireable[stdLib.Required[propDashTypesLib.propDashTypesMod.InferProps[P]]] = js.native
  def instanceOf[T](expectedClass: ScalablyTyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def objectOf[T](`type`: propDashTypesLib.propDashTypesMod.Validator[T]): propDashTypesLib.propDashTypesMod.Requireable[reactLib.reactLibStrings.ReactPropTypes with js.Any] = js.native
  def oneOf[T](types: js.Array[T]): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def oneOfType[T /* <: propDashTypesLib.propDashTypesMod.Validator[_] */](types: js.Array[T]): propDashTypesLib.propDashTypesMod.Requireable[stdLib.NonNullable[propDashTypesLib.propDashTypesMod.InferType[T]]] = js.native
  def shape[P /* <: propDashTypesLib.propDashTypesMod.ValidationMap[_] */](`type`: P): propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.InferProps[P]] = js.native
}

