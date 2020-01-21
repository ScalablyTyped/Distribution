package typings.reactNativeNavigation

import typings.reactNative.mod.ComponentProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/adapters/AppRegistryService", JSImport.Namespace)
@js.native
object appRegistryServiceMod extends js.Object {
  @js.native
  class AppRegistryService () extends js.Object {
    def registerComponent(appKey: String, getComponentFunc: ComponentProvider): Unit = js.native
  }
  
}

