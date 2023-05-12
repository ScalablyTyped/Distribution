package typings.react

import org.scalablytyped.runtime.Instantiable1
import typings.propTypes.mod.InferProps
import typings.propTypes.mod.InferType
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.ValidationMap
import typings.propTypes.mod.Validator
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.std.NonNullable
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait Default[T /* <: ComponentType[Any] */] extends StObject {
    
    var default: T
  }
  object Default {
    
    inline def apply[T /* <: ComponentType[Any] */](default: T): Default[T] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Default[?], T /* <: ComponentType[Any] */] (val x: Self & Default[T]) extends AnyVal {
      
      inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply[T /* <: Validator[Any] */](types: js.Array[T]): Requireable[NonNullable[InferType[T]]] = js.native
  }
  
  @js.native
  trait Fn1 extends StObject {
    
    def apply[T](`type`: Validator[T]): Requireable[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof any ]: T} */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Fn2 extends StObject {
    
    def apply[P /* <: ValidationMap[Any] */](`type`: P): Requireable[InferProps[P]] = js.native
  }
  
  @js.native
  trait Fn3 extends StObject {
    
    def apply[P /* <: ValidationMap[Any] */](`type`: P): Requireable[Required[InferProps[P]]] = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T](expectedClass: Instantiable1[/* args (repeated) */ Any, T]): Requireable[T] = js.native
  }
  
  @js.native
  trait FnCallType extends StObject {
    
    def apply[T](`type`: Validator[T]): Requireable[js.Array[T]] = js.native
  }
  
  @js.native
  trait FnCallTypes extends StObject {
    
    def apply[T](types: js.Array[T]): Requireable[T] = js.native
  }
  
  trait Html extends StObject {
    
    // Should be InnerHTML['innerHTML'].
    // But unfortunately we're mixing renderer-specific type declarations.
    var __html: String | TrustedHTML
  }
  object Html {
    
    inline def apply(__html: String | TrustedHTML): Html = {
      val __obj = js.Dynamic.literal(__html = __html.asInstanceOf[js.Any])
      __obj.asInstanceOf[Html]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
      
      inline def set__html(value: String | TrustedHTML): Self = StObject.set(x, "__html", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* props */ Any, Component[Any, js.Object, Any]]
  
  @js.native
  trait UNDEFINEDVOIDONLY extends StObject
}
