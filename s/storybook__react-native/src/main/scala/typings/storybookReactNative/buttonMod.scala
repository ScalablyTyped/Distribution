package typings.storybookReactNative

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/navigation/button", JSImport.Default)
  @js.native
  class default () extends Button
  
  @js.native
  trait Button
    extends PureComponent[Props, js.Object, js.Any] {
    
    def onPress(): Unit = js.native
  }
  
  @js.native
  trait Props extends StObject {
    
    var active: Boolean = js.native
    
    var id: Double | String = js.native
    
    def onPress(id: String): Unit = js.native
    def onPress(id: Double): Unit = js.native
    
    var testID: js.UndefOr[String] = js.native
  }
}
