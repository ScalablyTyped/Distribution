package typings.reactNativeNavigation

import typings.reactNative.mod.ComponentProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appRegistryServiceMod {
  
  @JSImport("react-native-navigation/lib/dist/adapters/AppRegistryService", "AppRegistryService")
  @js.native
  class AppRegistryService () extends StObject {
    
    def registerComponent(appKey: String, getComponentFunc: ComponentProvider): Unit = js.native
  }
}
