package typings.storybookReactNative

import typings.react.mod.PureComponent
import typings.storybookAddons.ts39Mod.Collection
import typings.storybookReactNative.anon.AddonSelected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addonsMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/addons", JSImport.Default)
  @js.native
  open class default protected () extends Addons {
    def this(props: js.Object) = this()
  }
  
  @js.native
  trait Addons
    extends PureComponent[js.Object, AddonSelected, Any] {
    
    def onPressAddon(addonSelected: String): Unit = js.native
    
    var panels: Collection = js.native
  }
}
