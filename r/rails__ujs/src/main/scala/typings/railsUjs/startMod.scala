package typings.railsUjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object startMod {
  
  @JSImport("@rails/ujs/start", "start")
  @js.native
  def start(): Unit = js.native
  
  object global {
    
    @js.native
    trait Window extends StObject {
      
      var _rails_loaded: js.UndefOr[Boolean] = js.native
    }
    object Window {
      
      @scala.inline
      def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set_rails_loaded(value: Boolean): Self = StObject.set(x, "_rails_loaded", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_rails_loadedUndefined: Self = StObject.set(x, "_rails_loaded", js.undefined)
      }
    }
  }
}
