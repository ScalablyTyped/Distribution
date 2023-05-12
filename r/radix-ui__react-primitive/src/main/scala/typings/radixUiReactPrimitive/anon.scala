package typings.radixUiReactPrimitive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AsChild extends StObject {
    
    var asChild: js.UndefOr[Boolean] = js.undefined
  }
  object AsChild {
    
    inline def apply(): AsChild = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsChild]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsChild] (val x: Self) extends AnyVal {
      
      inline def setAsChild(value: Boolean): Self = StObject.set(x, "asChild", value.asInstanceOf[js.Any])
      
      inline def setAsChildUndefined: Self = StObject.set(x, "asChild", js.undefined)
    }
  }
}
