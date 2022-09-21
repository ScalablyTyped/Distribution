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
import typings.std.NonNullable
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaxPropTypes extends StObject {
  
  def any(
    props: StringDictionary[Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null
  @JSName("any")
  var any_Original: typings.propTypes.mod.Requireable[Any]
  
  def array(
    props: StringDictionary[Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null
  
  def arrayOf[T](`type`: typings.propTypes.mod.Validator[T]): typings.propTypes.mod.Requireable[js.Array[T]]
  @JSName("arrayOf")
  var arrayOf_Original: FnCallType
  
  @JSName("array")
  var array_Original: typings.propTypes.mod.Requireable[js.Array[Any]]
  
  def bool(
    props: StringDictionary[Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null
  @JSName("bool")
  var bool_Original: typings.propTypes.mod.Requireable[Boolean]
  
  def element(
    props: StringDictionary[Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null
  @JSName("element")
  var element_Original: typings.propTypes.mod.Requireable[ReactElementLike]
  
  def exact[P /* <: typings.propTypes.mod.ValidationMap[Any] */](`type`: P): typings.propTypes.mod.Requireable[Required[InferProps[P]]]
  @JSName("exact")
  var exact_Original: Fn3
  
  def func(
    props: StringDictionary[Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null
  @JSName("func")
  var func_Original: typings.propTypes.mod.Requireable[js.Function1[/* repeated */ Any, Any]]
  
  def instanceOf[T](expectedClass: Instantiable1[/* args (repeated) */ Any, T]): typings.propTypes.mod.Requireable[T]
  @JSName("instanceOf")
  var instanceOf_Original: FnCall
  
  def node(
    props: StringDictionary[Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null
  @JSName("node")
  var node_Original: typings.propTypes.mod.Requireable[ReactNodeLike]
  
  def number(
    props: StringDictionary[Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null
  @JSName("number")
  var number_Original: typings.propTypes.mod.Requireable[Double]
  
  def `object`(
    props: StringDictionary[Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null
  
  def objectOf[T](`type`: typings.propTypes.mod.Validator[T]): typings.propTypes.mod.Requireable[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: T}
    */ typings.rax.raxStrings.RaxPropTypes & TopLevel[Any]
  ]
  @JSName("objectOf")
  var objectOf_Original: Fn1
  
  @JSName("object")
  var object_Original: typings.propTypes.mod.Requireable[js.Object]
  
  def oneOf[T](types: js.Array[T]): typings.propTypes.mod.Requireable[T]
  
  def oneOfType[T /* <: typings.propTypes.mod.Validator[Any] */](types: js.Array[T]): typings.propTypes.mod.Requireable[NonNullable[InferType[T]]]
  @JSName("oneOfType")
  var oneOfType_Original: Fn0
  
  @JSName("oneOf")
  var oneOf_Original: FnCallTypes
  
  def shape[P /* <: typings.propTypes.mod.ValidationMap[Any] */](`type`: P): typings.propTypes.mod.Requireable[InferProps[P]]
  @JSName("shape")
  var shape_Original: Fn2
  
  def string(
    props: StringDictionary[Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null
  @JSName("string")
  var string_Original: typings.propTypes.mod.Requireable[String]
}
object RaxPropTypes {
  
  inline def apply(
    any: typings.propTypes.mod.Requireable[Any],
    array: typings.propTypes.mod.Requireable[js.Array[Any]],
    arrayOf: FnCallType,
    bool: typings.propTypes.mod.Requireable[Boolean],
    element: typings.propTypes.mod.Requireable[ReactElementLike],
    exact: Fn3,
    func: typings.propTypes.mod.Requireable[js.Function1[/* repeated */ Any, Any]],
    instanceOf: FnCall,
    node: typings.propTypes.mod.Requireable[ReactNodeLike],
    number: typings.propTypes.mod.Requireable[Double],
    `object`: typings.propTypes.mod.Requireable[js.Object],
    objectOf: Fn1,
    oneOf: FnCallTypes,
    oneOfType: Fn0,
    shape: Fn2,
    string: typings.propTypes.mod.Requireable[String]
  ): RaxPropTypes = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], arrayOf = arrayOf.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], instanceOf = instanceOf.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], objectOf = objectOf.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any], oneOfType = oneOfType.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaxPropTypes]
  }
  
  extension [Self <: RaxPropTypes](x: Self) {
    
    inline def setAny(value: typings.propTypes.mod.Requireable[Any]): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
    
    inline def setArray(value: typings.propTypes.mod.Requireable[js.Array[Any]]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayOf(value: FnCallType): Self = StObject.set(x, "arrayOf", value.asInstanceOf[js.Any])
    
    inline def setBool(value: typings.propTypes.mod.Requireable[Boolean]): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
    
    inline def setElement(value: typings.propTypes.mod.Requireable[ReactElementLike]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setExact(value: Fn3): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setFunc(value: typings.propTypes.mod.Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    inline def setInstanceOf(value: FnCall): Self = StObject.set(x, "instanceOf", value.asInstanceOf[js.Any])
    
    inline def setNode(value: typings.propTypes.mod.Requireable[ReactNodeLike]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: typings.propTypes.mod.Requireable[Double]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setObject(value: typings.propTypes.mod.Requireable[js.Object]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectOf(value: Fn1): Self = StObject.set(x, "objectOf", value.asInstanceOf[js.Any])
    
    inline def setOneOf(value: FnCallTypes): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    inline def setOneOfType(value: Fn0): Self = StObject.set(x, "oneOfType", value.asInstanceOf[js.Any])
    
    inline def setShape(value: Fn2): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setString(value: typings.propTypes.mod.Requireable[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}
