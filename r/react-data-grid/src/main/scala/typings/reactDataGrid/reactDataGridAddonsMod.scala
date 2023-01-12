package typings.reactDataGrid

import typings.reactDataGrid.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactDataGridAddonsMod {
  
  // attach to window
  object global {
    
    trait Window extends StObject {
      
      var ReactDataGridPlugins: Data
    }
    object Window {
      
      inline def apply(ReactDataGridPlugins: Data): Window = {
        val __obj = js.Dynamic.literal(ReactDataGridPlugins = ReactDataGridPlugins.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def setReactDataGridPlugins(value: Data): Self = StObject.set(x, "ReactDataGridPlugins", value.asInstanceOf[js.Any])
      }
    }
  }
}
