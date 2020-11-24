package typings.storybookReactNative

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/navigation/button", JSImport.Namespace)
@js.native
object buttonMod extends js.Object {
  
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
    
    var testID: js.UndefOr[String] = js.native
  }
  
  @js.native
  class default () extends Button
}
