package typings.storybookAddonLinks

import typings.storybookAddonLinks.linkMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMod {
  
  @JSImport("@storybook/addon-links/dist/react", JSImport.Default)
  @js.native
  class default ()
    extends typings.storybookAddonLinks.linkMod.default
  /* static members */
  object default {
    
    @JSImport("@storybook/addon-links/dist/react", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-links/dist/react", "default.defaultProps")
    @js.native
    def defaultProps: Props = js.native
    inline def defaultProps_=(x: Props): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
