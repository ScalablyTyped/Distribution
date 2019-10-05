package typings.reactDashNativeDashNavigation

import typings.reactDashNative.reactDashNativeMod.ComponentProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/components/Store", JSImport.Namespace)
@js.native
object libDistComponentsStoreMod extends js.Object {
  @js.native
  class Store () extends js.Object {
    var componentsByName: js.Any = js.native
    var propsById: js.Any = js.native
    def cleanId(componentId: String): Unit = js.native
    def getComponentClassForName(componentName: String): js.UndefOr[ComponentProvider] = js.native
    def getComponentClassForName(componentName: Double): js.UndefOr[ComponentProvider] = js.native
    def getPropsForId(componentId: String): js.Any = js.native
    def setComponentClassForName(componentName: String, ComponentClass: ComponentProvider): Unit = js.native
    def setComponentClassForName(componentName: Double, ComponentClass: ComponentProvider): Unit = js.native
    def setPropsForId(componentId: String, props: js.Any): Unit = js.native
  }
  
}

