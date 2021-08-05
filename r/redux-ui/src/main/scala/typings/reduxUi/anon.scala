package typings.reduxUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Pure extends StObject {
    
    var pure: js.UndefOr[Boolean] = js.undefined
    
    var withRef: js.UndefOr[Boolean] = js.undefined
  }
  object Pure {
    
    inline def apply(): Pure = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pure]
    }
    
    extension [Self <: Pure](x: Self) {
      
      inline def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
      
      inline def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
      
      inline def setWithRef(value: Boolean): Self = StObject.set(x, "withRef", value.asInstanceOf[js.Any])
      
      inline def setWithRefUndefined: Self = StObject.set(x, "withRef", js.undefined)
    }
  }
}
