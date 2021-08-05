package typings.storybookAddonBackgrounds

import typings.storybookAddonBackgrounds.anon.Grid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addParameterMod {
  
  object parameters {
    
    @JSImport("@storybook/addon-backgrounds/dist/preset/addParameter", "parameters")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-backgrounds/dist/preset/addParameter", "parameters.backgrounds")
    @js.native
    def backgrounds: Grid = js.native
    inline def backgrounds_=(x: Grid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backgrounds")(x.asInstanceOf[js.Any])
  }
}
