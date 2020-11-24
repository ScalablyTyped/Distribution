package typings.rax.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.propTypes.mod.InferProps
import typings.propTypes.mod.InferType
import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeLike
import typings.rax.anon.Fn0
import typings.rax.anon.Fn1
import typings.rax.anon.Fn2
import typings.rax.anon.Fn3
import typings.rax.anon.FnCall
import typings.rax.anon.FnCallType
import typings.rax.anon.FnCallTypes
import typings.std.Error
import typings.std.NonNullable
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaxPropTypes extends js.Object {
  
  def any(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): Error | Null = js.native
  @JSName("any")
  var any_Original: typings.propTypes.mod.Requireable[_] = js.native
  
  def array(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): Error | Null = js.native
  
  def arrayOf[T](`type`: typings.propTypes.mod.Validator[T]): typings.propTypes.mod.Requireable[js.Array[T]] = js.native
  @JSName("arrayOf")
  var arrayOf_Original: FnCallType = js.native
  
  @JSName("array")
  var array_Original: typings.propTypes.mod.Requireable[js.Array[_]] = js.native
  
  def bool(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): Error | Null = js.native
  @JSName("bool")
  var bool_Original: typings.propTypes.mod.Requireable[Boolean] = js.native
  
  def element(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): Error | Null = js.native
  @JSName("element")
  var element_Original: typings.propTypes.mod.Requireable[ReactElementLike] = js.native
  
  def exact[P /* <: typings.propTypes.mod.ValidationMap[_] */](`type`: P): typings.propTypes.mod.Requireable[Required[InferProps[P]]] = js.native
  @JSName("exact")
  var exact_Original: Fn3 = js.native
  
  def func(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): Error | Null = js.native
  @JSName("func")
  var func_Original: typings.propTypes.mod.Requireable[js.Function1[/* repeated */ _, _]] = js.native
  
  def instanceOf[T](expectedClass: Instantiable1[/* args (repeated) */ js.Any, T]): typings.propTypes.mod.Requireable[T] = js.native
  @JSName("instanceOf")
  var instanceOf_Original: FnCall = js.native
  
  def node(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): Error | Null = js.native
  @JSName("node")
  var node_Original: typings.propTypes.mod.Requireable[ReactNodeLike] = js.native
  
  def number(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): Error | Null = js.native
  @JSName("number")
  var number_Original: typings.propTypes.mod.Requireable[Double] = js.native
  
  def `object`(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): Error | Null = js.native
  
  def objectOf[T](`type`: typings.propTypes.mod.Validator[T]): typings.propTypes.mod.Requireable[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: T}
    */ typings.rax.raxStrings.RaxPropTypes with TopLevel[js.Any]
  ] = js.native
  @JSName("objectOf")
  var objectOf_Original: Fn1 = js.native
  
  @JSName("object")
  var object_Original: typings.propTypes.mod.Requireable[js.Object] = js.native
  
  def oneOf[T](types: js.Array[T]): typings.propTypes.mod.Requireable[T] = js.native
  
  def oneOfType[T /* <: typings.propTypes.mod.Validator[_] */](types: js.Array[T]): typings.propTypes.mod.Requireable[NonNullable[InferType[T]]] = js.native
  @JSName("oneOfType")
  var oneOfType_Original: Fn0 = js.native
  
  @JSName("oneOf")
  var oneOf_Original: FnCallTypes = js.native
  
  def shape[P /* <: typings.propTypes.mod.ValidationMap[_] */](`type`: P): typings.propTypes.mod.Requireable[InferProps[P]] = js.native
  @JSName("shape")
  var shape_Original: Fn2 = js.native
  
  def string(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): Error | Null = js.native
  @JSName("string")
  var string_Original: typings.propTypes.mod.Requireable[String] = js.native
}
