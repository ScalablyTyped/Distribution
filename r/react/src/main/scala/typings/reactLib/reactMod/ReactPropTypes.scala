package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactPropTypes extends js.Object {
  @JSName("any")
  var any_Original: propDashTypesLib.propDashTypesMod.Requireable[_] = js.native
  @JSName("arrayOf")
  var arrayOf_Original: reactLib.Anon_Type = js.native
  @JSName("array")
  var array_Original: propDashTypesLib.propDashTypesMod.Requireable[js.Array[_]] = js.native
  @JSName("bool")
  var bool_Original: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean] = js.native
  @JSName("element")
  var element_Original: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactElementLike] = js.native
  @JSName("exact")
  var exact_Original: reactLib.Anon_TypeAnyInferPropsP = js.native
  @JSName("func")
  var func_Original: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]] = js.native
  @JSName("instanceOf")
  var instanceOf_Original: reactLib.Anon_Args = js.native
  @JSName("node")
  var node_Original: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike] = js.native
  @JSName("number")
  var number_Original: propDashTypesLib.propDashTypesMod.Requireable[scala.Double] = js.native
  @JSName("objectOf")
  var objectOf_Original: reactLib.Anon_TypeAny = js.native
  @JSName("object")
  var object_Original: propDashTypesLib.propDashTypesMod.Requireable[js.Object] = js.native
  @JSName("oneOfType")
  var oneOfType_Original: reactLib.Anon_TypesAny = js.native
  @JSName("oneOf")
  var oneOf_Original: reactLib.Anon_Types = js.native
  @JSName("shape")
  var shape_Original: reactLib.Anon_TypeAnyInferProps = js.native
  @JSName("string")
  var string_Original: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String] = js.native
  def any(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def array(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def arrayOf[T](`type`: propDashTypesLib.propDashTypesMod.Validator[T]): propDashTypesLib.propDashTypesMod.Requireable[js.Array[T]] = js.native
  def bool(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def element(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def exact[P /* <: propDashTypesLib.propDashTypesMod.ValidationMap[_] */](`type`: P): propDashTypesLib.propDashTypesMod.Requireable[stdLib.Required[propDashTypesLib.propDashTypesMod.InferProps[P]]] = js.native
  def func(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def instanceOf[T](expectedClass: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def node(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def number(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def `object`(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def objectOf[T](`type`: propDashTypesLib.propDashTypesMod.Validator[T]): propDashTypesLib.propDashTypesMod.Requireable[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof any ]: T}
    */ reactLib.reactLibStrings.ReactPropTypes with js.Any
  ] = js.native
  def oneOf[T](types: js.Array[T]): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def oneOfType[T /* <: propDashTypesLib.propDashTypesMod.Validator[_] */](types: js.Array[T]): propDashTypesLib.propDashTypesMod.Requireable[stdLib.NonNullable[propDashTypesLib.propDashTypesMod.InferType[T]]] = js.native
  def shape[P /* <: propDashTypesLib.propDashTypesMod.ValidationMap[_] */](`type`: P): propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.InferProps[P]] = js.native
  def string(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
}

