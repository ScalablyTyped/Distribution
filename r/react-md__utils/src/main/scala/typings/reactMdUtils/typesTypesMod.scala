package typings.reactMdUtils

import typings.react.mod.ReactElement
import typings.reactMdUtils.anon.Ref
import typings.reactMdUtils.reactMdUtilsStrings.`aria-label`
import typings.reactMdUtils.reactMdUtilsStrings.`aria-labelledby`
import typings.std.Exclude
import typings.std.HTMLElement
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTypesMod {
  
  type ClassNameCloneableChild[T] = ReactElement
  
  trait LabelA11y extends StObject {
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
  }
  object LabelA11y {
    
    inline def apply(): LabelA11y = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelA11y]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LabelA11y] (val x: Self) extends AnyVal {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    }
  }
  
  type LabelRequiredForA11y[Props /* <: LabelA11y */] = RequireAtLeastOne[Props, `aria-label` | `aria-labelledby`]
  
  type Maybe[T, NotFound] = T | NotFound
  
  trait NonNullRef[T] extends StObject {
    
    val current: T
  }
  object NonNullRef {
    
    inline def apply[T](current: T): NonNullRef[T] = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
      __obj.asInstanceOf[NonNullRef[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NonNullRef[?], T] (val x: Self & NonNullRef[T]) extends AnyVal {
      
      inline def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    }
  }
  
  type PropsWithRef[P /* <: js.Object */, E /* <: HTMLElement */] = P & Ref[E]
  
  type RequireAtLeastOne[T, Keys /* <: /* keyof T */ String */] = (Pick[T, Exclude[/* keyof T */ String, Keys]]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in Keys ]: -? std.Required<std.Pick<T, K>> & std.Partial<std.Pick<T, std.Exclude<Keys, K>>>}[Keys] */ js.Any)
}
