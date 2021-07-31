package typings.railsUjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object startMod {
  
  @JSImport("@rails/ujs/start", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def start(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[Unit]
  
  object global {
    
    trait Window extends StObject {
      
      var _rails_loaded: js.UndefOr[Boolean] = js.undefined
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
