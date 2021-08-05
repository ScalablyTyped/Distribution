package typings.storybookAddonBackgrounds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("@storybook/addon-backgrounds/dist/constants", "ADDON_ID")
  @js.native
  val ADDON_ID: /* "storybook/background" */ String = js.native
  
  object EVENTS {
    
    @JSImport("@storybook/addon-backgrounds/dist/constants", "EVENTS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-backgrounds/dist/constants", "EVENTS.UPDATE")
    @js.native
    def UPDATE: String = js.native
    inline def UPDATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPDATE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/addon-backgrounds/dist/constants", "GRID_PARAM_KEY")
  @js.native
  val GRID_PARAM_KEY: /* "grid" */ String = js.native
  
  @JSImport("@storybook/addon-backgrounds/dist/constants", "PARAM_KEY")
  @js.native
  val PARAM_KEY: /* "backgrounds" */ String = js.native
}
