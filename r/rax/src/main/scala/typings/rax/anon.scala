package typings.rax

import org.scalablytyped.runtime.Instantiable1
import typings.propTypes.mod.InferProps
import typings.propTypes.mod.InferType
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.ValidationMap
import typings.propTypes.mod.Validator
import typings.rax.mod.Component
import typings.rax.mod.RaxNode
import typings.std.NonNullable
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: js.UndefOr[RaxNode] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: RaxNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
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
    
    var __html: String
  }
  object Html {
    
    inline def apply(__html: String): Html = {
      val __obj = js.Dynamic.literal(__html = __html.asInstanceOf[js.Any])
      __obj.asInstanceOf[Html]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
      
      inline def set__html(value: String): Self = StObject.set(x, "__html", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* props */ Any, Component[Any, js.Object, Any]]
  
  /* Inlined std.Readonly<{  children :rax.rax.RaxNode | undefined}> */
  trait ReadonlychildrenRaxNodeun extends StObject {
    
    val children: js.UndefOr[RaxNode] = js.undefined
  }
  object ReadonlychildrenRaxNodeun {
    
    inline def apply(): ReadonlychildrenRaxNodeun = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlychildrenRaxNodeun]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlychildrenRaxNodeun] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: RaxNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
