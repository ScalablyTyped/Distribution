package typings.storybookCoreClient

import typings.storybookUi.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerMod {
  
  @JSImport("@storybook/core-client/dist/ts3.9/manager/provider", JSImport.Default)
  @js.native
  open class default () extends ReactProvider
  
  @js.native
  trait ReactProvider extends Provider {
    
    /* private */ var addons: Any = js.native
    
    /* private */ var channel: Any = js.native
    
    /* private */ var serverChannel: Any = js.native
  }
}
