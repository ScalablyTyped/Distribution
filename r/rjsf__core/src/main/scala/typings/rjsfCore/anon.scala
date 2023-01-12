package typings.rjsfCore

import typings.rjsfUtils.anon.AddButton
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ButtonTemplates[T, F] extends StObject {
    
    var ButtonTemplates: js.UndefOr[Partial[AddButton[T, F]]] = js.undefined
  }
  object ButtonTemplates {
    
    inline def apply[T, F](): ButtonTemplates[T, F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonTemplates[T, F]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonTemplates[?, ?], T, F] (val x: Self & (ButtonTemplates[T, F])) extends AnyVal {
      
      inline def setButtonTemplates(value: Partial[AddButton[T, F]]): Self = StObject.set(x, "ButtonTemplates", value.asInstanceOf[js.Any])
      
      inline def setButtonTemplatesUndefined: Self = StObject.set(x, "ButtonTemplates", js.undefined)
    }
  }
}
