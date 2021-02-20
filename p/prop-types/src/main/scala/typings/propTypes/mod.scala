package typings.propTypes

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Array
import typings.std.Error
import typings.std.Exclude
import typings.std.NonNullable
import typings.std.Partial
import typings.std.Pick
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prop-types", "any")
  @js.native
  val any: Requireable[js.Any] = js.native
  
  @JSImport("prop-types", "array")
  @js.native
  val array: Requireable[js.Array[js.Any]] = js.native
  
  @JSImport("prop-types", "arrayOf")
  @js.native
  def arrayOf[T](`type`: Validator[T]): Requireable[js.Array[T]] = js.native
  
  @JSImport("prop-types", "bool")
  @js.native
  val bool: Requireable[Boolean] = js.native
  
  @JSImport("prop-types", "checkPropTypes")
  @js.native
  def checkPropTypes(typeSpecs: js.Any, values: js.Any, location: String, componentName: String): Unit = js.native
  @JSImport("prop-types", "checkPropTypes")
  @js.native
  def checkPropTypes(
    typeSpecs: js.Any,
    values: js.Any,
    location: String,
    componentName: String,
    getStack: js.Function0[_]
  ): Unit = js.native
  
  @JSImport("prop-types", "element")
  @js.native
  val element: Requireable[ReactElementLike] = js.native
  
  @JSImport("prop-types", "elementType")
  @js.native
  val elementType: Requireable[ReactComponentLike] = js.native
  
  @JSImport("prop-types", "exact")
  @js.native
  def exact[P /* <: ValidationMap[_] */](`type`: P): Requireable[Required[InferProps[P]]] = js.native
  
  @JSImport("prop-types", "func")
  @js.native
  val func: Requireable[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
  
  @JSImport("prop-types", "instanceOf")
  @js.native
  def instanceOf[T](expectedClass: Instantiable1[/* args (repeated) */ js.Any, T]): Requireable[T] = js.native
  
  @JSImport("prop-types", "node")
  @js.native
  val node: Requireable[ReactNodeLike] = js.native
  
  @JSImport("prop-types", "nominalTypeHack")
  @js.native
  val nominalTypeHack: js.Symbol = js.native
  
  @JSImport("prop-types", "number")
  @js.native
  val number: Requireable[Double] = js.native
  
  @JSImport("prop-types", "objectOf")
  @js.native
  def objectOf[T](`type`: Validator[T]): Requireable[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: T}
    */ typings.propTypes.propTypesStrings.objectOf with TopLevel[js.Any]
  ] = js.native
  
  @JSImport("prop-types", "oneOf")
  @js.native
  def oneOf[T](types: js.Array[T]): Requireable[T] = js.native
  
  @JSImport("prop-types", "oneOfType")
  @js.native
  def oneOfType[T /* <: Validator[_] */](types: js.Array[T]): Requireable[NonNullable[InferType[T]]] = js.native
  
  @JSImport("prop-types", "resetWarningCache")
  @js.native
  def resetWarningCache(): Unit = js.native
  
  @JSImport("prop-types", "shape")
  @js.native
  def shape[P /* <: ValidationMap[_] */](`type`: P): Requireable[InferProps[P]] = js.native
  
  @JSImport("prop-types", "string")
  @js.native
  val string: Requireable[String] = js.native
  
  @JSImport("prop-types", "symbol")
  @js.native
  val symbol: Requireable[js.Symbol] = js.native
  
  type InferProps[V] = (InferPropsInner[Pick[V, RequiredKeys[V]]]) with (Partial[InferPropsInner[Pick[V, OptionalKeys[V]]]])
  
  type InferPropsInner[V] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: -? prop-types.prop-types.InferType<V[K]>}
    */ typings.propTypes.propTypesStrings.InferPropsInner with TopLevel[V]
  
  type InferType[V] = js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.propTypes.propTypesBooleans.`false`
    - typings.propTypes.propTypesBooleans.`true`
  */
  trait IsOptional[T] extends StObject
  
  type OptionalKeys[V] = Exclude[/* keyof V */ String, RequiredKeys[V]]
  
  type ReactComponentLike = String | (js.Function2[/* props */ js.Any, /* context */ js.UndefOr[js.Any], js.Any]) | (Instantiable2[/* props */ js.Any, /* context */ js.UndefOr[js.Any], js.Any])
  
  @js.native
  trait ReactElementLike extends _ReactNodeLike {
    
    var key: String | Double | Null = js.native
    
    var props: js.Any = js.native
    
    var `type`: ReactComponentLike = js.native
  }
  object ReactElementLike {
    
    @scala.inline
    def apply(props: js.Any, `type`: ReactComponentLike): ReactElementLike = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactElementLike]
    }
    
    @scala.inline
    implicit class ReactElementLikeMutableBuilder[Self <: ReactElementLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
      
      @scala.inline
      def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: ReactComponentLike): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeFunction2(value: (/* props */ js.Any, /* context */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "type", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ReactNodeArray
    extends Array[ReactNodeLike]
       with _ReactNodeLike
  
  /* Rewritten from type alias, can be one of: 
    - js.Object
    - typings.propTypes.mod.ReactElementLike
    - typings.propTypes.mod.ReactNodeArray
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - js.UndefOr[scala.Nothing]
  */
  type ReactNodeLike = js.UndefOr[_ReactNodeLike | js.Object | String | Double | Boolean | Null]
  
  @js.native
  trait Requireable[T]
    extends Validator[js.UndefOr[T | Null]] {
    
    def isRequired(
      props: StringDictionary[js.Any],
      propName: String,
      componentName: String,
      location: String,
      propFullName: String
    ): Error | Null = js.native
    @JSName("isRequired")
    var isRequired_Original: Validator[NonNullable[T]] = js.native
  }
  
  type RequiredKeys[V] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof V ]: -? std.Exclude<V[K], undefined> extends prop-types.prop-types.Validator<infer T>? prop-types.prop-types.IsOptional<any> extends true? never : K : never}[keyof V] */ js.Any
  
  type ValidationMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? prop-types.prop-types.Validator<T[K]>}
    */ typings.propTypes.propTypesStrings.ValidationMap with TopLevel[T]
  
  @js.native
  trait Validator[T] extends StObject {
    
    def apply(
      props: StringDictionary[js.Any],
      propName: String,
      componentName: String,
      location: String,
      propFullName: String
    ): Error | Null = js.native
  }
  
  trait _ReactNodeLike extends StObject
  
  @JSImport("prop-types", "object")
  @js.native
  val `object`: Requireable[js.Object] = js.native
}
