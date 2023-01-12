package typings.rmcTabs

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsMod {
  
  object Models {
    
    trait TabData
      extends StObject
         with /** for user's custom extends */
    /* key */ StringDictionary[Any] {
      
      var key: js.UndefOr[String] = js.undefined
      
      var title: ReactNode
    }
    object TabData {
      
      inline def apply(): TabData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TabData]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TabData] (val x: Self) extends AnyVal {
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
  }
}
