package typings.rcTooltip

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait KeepParent extends StObject {
    
    var keepParent: js.UndefOr[Boolean] = js.undefined
  }
  object KeepParent {
    
    inline def apply(): KeepParent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeepParent]
    }
    
    extension [Self <: KeepParent](x: Self) {
      
      inline def setKeepParent(value: Boolean): Self = StObject.set(x, "keepParent", value.asInstanceOf[js.Any])
      
      inline def setKeepParentUndefined: Self = StObject.set(x, "keepParent", js.undefined)
    }
  }
}
