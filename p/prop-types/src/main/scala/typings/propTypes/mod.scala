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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prop-types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prop-types", "any")
  @js.native
  val any: Requireable[js.Any] = js.native
  
  @JSImport("prop-types", "array")
  @js.native
  val array: Requireable[js.Array[js.Any]] = js.native
  
  @scala.inline
  def arrayOf[T](`type`: Validator[T]): Requireable[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Requireable[js.Array[T]]]
  
  @JSImport("prop-types", "bool")
  @js.native
  val bool: Requireable[Boolean] = js.native
  
  @scala.inline
  def checkPropTypes(typeSpecs: js.Any, values: js.Any, location: String, componentName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPropTypes")(typeSpecs.asInstanceOf[js.Any], values.asInstanceOf[js.Any], location.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def checkPropTypes(
    typeSpecs: js.Any,
    values: js.Any,
    location: String,
    componentName: String,
    getStack: js.Function0[js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPropTypes")(typeSpecs.asInstanceOf[js.Any], values.asInstanceOf[js.Any], location.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any], getStack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("prop-types", "element")
  @js.native
  val element: Requireable[ReactElementLike] = js.native
  
  @JSImport("prop-types", "elementType")
  @js.native
  val elementType: Requireable[ReactComponentLike] = js.native
  
  @scala.inline
  def exact[P /* <: ValidationMap[js.Any] */](`type`: P): Requireable[Required[InferProps[P]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("exact")(`type`.asInstanceOf[js.Any]).asInstanceOf[Requireable[Required[InferProps[P]]]]
  
  @JSImport("prop-types", "func")
  @js.native
  val func: Requireable[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
  
  @scala.inline
  def instanceOf[T](expectedClass: Instantiable1[/* args (repeated) */ js.Any, T]): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceOf")(expectedClass.asInstanceOf[js.Any]).asInstanceOf[Requireable[T]]
  
  @JSImport("prop-types", "node")
  @js.native
  val node: Requireable[ReactNodeLike] = js.native
  
  @JSImport("prop-types", "nominalTypeHack")
  @js.native
  val nominalTypeHack: js.Symbol = js.native
  
  @JSImport("prop-types", "number")
  @js.native
  val number: Requireable[Double] = js.native
  
  @JSImport("prop-types", "object")
  @js.native
  val `object`: Requireable[js.Object] = js.native
  
  @scala.inline
  def objectOf[T](`type`: Validator[T]): Requireable[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: T}
    */ typings.propTypes.propTypesStrings.objectOf & TopLevel[js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("objectOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Requireable[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: T}
    */ typings.propTypes.propTypesStrings.objectOf & TopLevel[js.Any]
  ]]
  
  @scala.inline
  def oneOf[T](types: js.Array[T]): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(types.asInstanceOf[js.Any]).asInstanceOf[Requireable[T]]
  
  @scala.inline
  def oneOfType[T /* <: Validator[js.Any] */](types: js.Array[T]): Requireable[NonNullable[InferType[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOfType")(types.asInstanceOf[js.Any]).asInstanceOf[Requireable[NonNullable[InferType[T]]]]
  
  @scala.inline
  def resetWarningCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetWarningCache")().asInstanceOf[Unit]
  
  @scala.inline
  def shape[P /* <: ValidationMap[js.Any] */](`type`: P): Requireable[InferProps[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("shape")(`type`.asInstanceOf[js.Any]).asInstanceOf[Requireable[InferProps[P]]]
  
  @JSImport("prop-types", "string")
  @js.native
  val string: Requireable[String] = js.native
  
  @JSImport("prop-types", "symbol")
  @js.native
  val symbol: Requireable[js.Symbol] = js.native
  
  type InferProps[V] = (InferPropsInner[Pick[V, RequiredKeys[V]]]) & (Partial[InferPropsInner[Pick[V, OptionalKeys[V]]]])
  
  type InferPropsInner[V] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: -? prop-types.prop-types.InferType<V[K]>}
    */ typings.propTypes.propTypesStrings.InferPropsInner & TopLevel[V]
  
  type InferType[V] = js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.propTypes.propTypesBooleans.`false`
    - typings.propTypes.propTypesBooleans.`true`
  */
  trait IsOptional[T] extends StObject
  
  type OptionalKeys[V] = Exclude[/* keyof V */ String, RequiredKeys[V]]
  
  type ReactComponentLike = String | (js.Function2[/* props */ js.Any, /* context */ js.UndefOr[js.Any], js.Any]) | (Instantiable2[/* props */ js.Any, /* context */ js.UndefOr[js.Any], js.Any])
  
  trait ReactElementLike
    extends StObject
       with _ReactNodeLike {
    
    var key: String | Double | Null
    
    var props: js.Any
    
    var `type`: ReactComponentLike
  }
  object ReactElementLike {
    
    @scala.inline
    def apply(props: js.Any, `type`: ReactComponentLike): ReactElementLike = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null)
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
    extends StObject
       with Array[ReactNodeLike]
       with _ReactNodeLike
  
  /* Rewritten from type alias, can be one of: 
    - js.Object
    - typings.propTypes.mod.ReactElementLike
    - typings.propTypes.mod.ReactNodeArray
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - scala.Unit
  */
  type ReactNodeLike = js.UndefOr[_ReactNodeLike | js.Object | String | Double | Boolean | Null]
  
  @js.native
  trait Requireable[T]
    extends StObject
       with Validator[js.UndefOr[T | Null]] {
    
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
    */ typings.propTypes.propTypesStrings.ValidationMap & TopLevel[T]
  
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
}
