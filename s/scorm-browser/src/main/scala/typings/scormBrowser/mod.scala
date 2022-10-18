package typings.scormBrowser

import typings.scormBrowser.`1Dot2Mod`.SCORM12
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    trait Window extends StObject {
      
      var API: js.UndefOr[SCORM12] = js.undefined
    }
    object Window {
      
      inline def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setAPI(value: SCORM12): Self = StObject.set(x, "API", value.asInstanceOf[js.Any])
        
        inline def setAPIUndefined: Self = StObject.set(x, "API", js.undefined)
      }
    }
  }
}
