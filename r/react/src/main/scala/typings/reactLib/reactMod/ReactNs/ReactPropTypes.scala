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
  var arrayOf_Original: reactLib.Anon_Type = js.native
  var bool: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean] = js.native
  var element: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactElementLike] = js.native
  @JSName("exact")
  var exact_Original: reactLib.Anon_TypeAnyInferPropsP = js.native
  var func: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]] = js.native
  @JSName("instanceOf")
  var instanceOf_Original: reactLib.Anon_Args = js.native
  var node: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike] = js.native
  var number: propDashTypesLib.propDashTypesMod.Requireable[scala.Double] = js.native
  var `object`: propDashTypesLib.propDashTypesMod.Requireable[js.Object] = js.native
  @JSName("objectOf")
  var objectOf_Original: reactLib.Anon_TypeAny = js.native
  @JSName("oneOfType")
  var oneOfType_Original: reactLib.Anon_TypesAny = js.native
  @JSName("oneOf")
  var oneOf_Original: reactLib.Anon_Types = js.native
  @JSName("shape")
  var shape_Original: reactLib.Anon_TypeAnyInferProps = js.native
  var string: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String] = js.native
  def arrayOf[T](`type`: propDashTypesLib.propDashTypesMod.Validator[T]): propDashTypesLib.propDashTypesMod.Requireable[js.Array[T]] = js.native
  def exact[P /* <: propDashTypesLib.propDashTypesMod.ValidationMap[_] */](`type`: P): propDashTypesLib.propDashTypesMod.Requireable[stdLib.Required[propDashTypesLib.propDashTypesMod.InferProps[P]]] = js.native
  def instanceOf[T](expectedClass: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def objectOf[T](`type`: propDashTypesLib.propDashTypesMod.Validator[T]): propDashTypesLib.propDashTypesMod.Requireable[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof any ]: T}
    */ reactLib.reactLibStrings.ReactPropTypes with js.Any
  ] = js.native
  def oneOf[T](types: js.Array[T]): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def oneOfType[T /* <: propDashTypesLib.propDashTypesMod.Validator[_] */](types: js.Array[T]): propDashTypesLib.propDashTypesMod.Requireable[stdLib.NonNullable[propDashTypesLib.propDashTypesMod.InferType[T]]] = js.native
  def shape[P /* <: propDashTypesLib.propDashTypesMod.ValidationMap[_] */](`type`: P): propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.InferProps[P]] = js.native
}

