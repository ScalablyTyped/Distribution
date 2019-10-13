package typings.atStorybookReactDashNative

import typings.atStorybookReactDashNative.distPreviewComponentsOnDeviceUINavigationButtonMod.Button
import typings.atStorybookReactDashNative.distPreviewComponentsOnDeviceUINavigationButtonMod.Props
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/navigation/button", JSImport.Namespace)
@js.native
object distPreviewComponentsOnDeviceUINavigationButtonMod extends js.Object {
  @js.native
  trait Button
    extends Component[Props, js.Object, js.Any] {
    def onPress(): Unit = js.native
  }
  
  @js.native
  trait Props extends js.Object {
    var active: Boolean = js.native
    var id: Double | String = js.native
    def onPress(id: String): Unit = js.native
    def onPress(id: Double): Unit = js.native
  }
  
  @js.native
  class default () extends Button
  
}

