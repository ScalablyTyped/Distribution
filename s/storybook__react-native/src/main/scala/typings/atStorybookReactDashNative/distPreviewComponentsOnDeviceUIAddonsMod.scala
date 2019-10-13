package typings.atStorybookReactDashNative

import typings.atStorybookAddons.distMod.Collection
import typings.atStorybookReactDashNative.distPreviewComponentsOnDeviceUIAddonsMod.Addons
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/addons", JSImport.Namespace)
@js.native
object distPreviewComponentsOnDeviceUIAddonsMod extends js.Object {
  @js.native
  trait Addons
    extends Component[js.Object, Anon_AddonSelected, js.Any] {
    var panels: Collection = js.native
    def onPressAddon(addonSelected: String): Unit = js.native
  }
  
  @js.native
  class default protected () extends Addons {
    def this(props: js.Object) = this()
  }
  
}

