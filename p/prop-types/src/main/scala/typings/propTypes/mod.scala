package typings.propTypes

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
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
  val any: Requireable[Any] = js.native
  
  @JSImport("prop-types", "array")
  @js.native
  val array: Requireable[js.Array[Any]] = js.native
  
  inline def arrayOf[T](`type`: Validator[T]): Requireable[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Requireable[js.Array[T]]]
  
  @JSImport("prop-types", "bool")
  @js.native
  val bool: Requireable[Boolean] = js.native
  
  inline def checkPropTypes(typeSpecs: Any, values: Any, location: String, componentName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPropTypes")(typeSpecs.asInstanceOf[js.Any], values.asInstanceOf[js.Any], location.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkPropTypes(typeSpecs: Any, values: Any, location: String, componentName: String, getStack: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPropTypes")(typeSpecs.asInstanceOf[js.Any], values.asInstanceOf[js.Any], location.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any], getStack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("prop-types", "element")
  @js.native
  val element: Requireable[ReactElementLike] = js.native
  
  @JSImport("prop-types", "elementType")
  @js.native
  val elementType: Requireable[ReactComponentLike] = js.native
  
  inline def exact[P /* <: ValidationMap[Any] */](`type`: P): Requireable[Required[InferProps[P]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("exact")(`type`.asInstanceOf[js.Any]).asInstanceOf[Requireable[Required[InferProps[P]]]]
  
  @JSImport("prop-types", "func")
  @js.native
  val func: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
  
  inline def instanceOf[T](expectedClass: Instantiable1[/* args (repeated) */ Any, T]): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceOf")(expectedClass.asInstanceOf[js.Any]).asInstanceOf[Requireable[T]]
  
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
  
  inline def objectOf[T](`type`: Validator[T]): Requireable[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof any ]: T} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("objectOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Requireable[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof any ]: T} */ js.Any
  ]]
  
  inline def oneOf[T](types: js.Array[T]): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(types.asInstanceOf[js.Any]).asInstanceOf[Requireable[T]]
  
  inline def oneOfType[T /* <: Validator[Any] */](types: js.Array[T]): Requireable[NonNullable[InferType[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOfType")(types.asInstanceOf[js.Any]).asInstanceOf[Requireable[NonNullable[InferType[T]]]]
  
  inline def resetWarningCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetWarningCache")().asInstanceOf[Unit]
  
  inline def shape[P /* <: ValidationMap[Any] */](`type`: P): Requireable[InferProps[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("shape")(`type`.asInstanceOf[js.Any]).asInstanceOf[Requireable[InferProps[P]]]
  
  @JSImport("prop-types", "string")
  @js.native
  val string: Requireable[String] = js.native
  
  @JSImport("prop-types", "symbol")
  @js.native
  val symbol: Requireable[js.Symbol] = js.native
  
  type InferProps[V] = (InferPropsInner[Pick[V, RequiredKeys[V]]]) & (Partial[InferPropsInner[Pick[V, OptionalKeys[V]]]])
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof V ]: -? prop-types.prop-types.InferType<V[K]>}
    }}}
    */
  @js.native
  trait InferPropsInner[V] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    V extends prop-types.prop-types.Validator<infer T> ? T : any
    }}}
    */
  @js.native
  trait InferType[V] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    undefined extends T ? true : false
    }}}
    */
  type IsOptional[T] = true
  
  type OptionalKeys[V] = Exclude[/* keyof V */ String, RequiredKeys[V]]
  
  type ReactComponentLike = String | (js.Function2[/* props */ Any, /* context */ js.UndefOr[Any], Any]) | (Instantiable2[/* props */ Any, /* context */ js.UndefOr[Any], Any])
  
  trait ReactElementLike extends StObject {
    
    var key: String | Double | Null
    
    var props: Any
    
    var `type`: ReactComponentLike
  }
  object ReactElementLike {
    
    inline def apply(props: Any, `type`: ReactComponentLike): ReactElementLike = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactElementLike]
    }
    
    extension [Self <: ReactElementLike](x: Self) {
      
      inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setType(value: ReactComponentLike): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeFunction2(value: (/* props */ Any, /* context */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "type", js.Any.fromFunction2(value))
    }
  }
  
  type ReactNodeArray = js.Iterable[ReactNodeLike]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ReactNodeLike = prop-types.prop-types.ReactElementLike | prop-types.prop-types.ReactNodeArray | string | number | boolean | null | undefined
  }}}
  to avoid circular code involving: 
  - prop-types.prop-types.ReactNodeArray
  - prop-types.prop-types.ReactNodeLike
  */
  type ReactNodeLike = js.UndefOr[ReactElementLike | Any | String | Double | Boolean | Null]
  
  @js.native
  trait Requireable[T]
    extends StObject
       with Validator[js.UndefOr[T | Null]] {
    
    def isRequired(
      props: StringDictionary[Any],
      propName: String,
      componentName: String,
      location: String,
      propFullName: String
    ): js.Error | Null = js.native
    @JSName("isRequired")
    var isRequired_Original: Validator[NonNullable[T]] = js.native
  }
  
  type RequiredKeys[V] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof V ]: -? std.Exclude<V[K], undefined> extends prop-types.prop-types.Validator<infer T>? prop-types.prop-types.IsOptional<T> extends true? never : K : never}[keyof V] */ js.Any
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]:? prop-types.prop-types.Validator<T[K]>}
    }}}
    */
  @js.native
  trait ValidationMap[T] extends StObject
  
  @js.native
  trait Validator[T] extends StObject {
    
    def apply(
      props: StringDictionary[Any],
      propName: String,
      componentName: String,
      location: String,
      propFullName: String
    ): js.Error | Null = js.native
  }
}
