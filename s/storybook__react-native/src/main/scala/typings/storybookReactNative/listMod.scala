package typings.storybookReactNative

import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.storybookAddons.distMod.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/addons/list", JSImport.Default)
  @js.native
  class default () extends AddonList
  
  @js.native
  trait AddonList
    extends PureComponent[Props, js.Object, js.Any] {
    
    def renderTab(id: String, title: String): Element = js.native
  }
  
  trait Props extends StObject {
    
    var addonSelected: String
    
    def onPressAddon(id: String): Unit
    
    var panels: Collection
  }
  object Props {
    
    inline def apply(addonSelected: String, onPressAddon: String => Unit, panels: Collection): Props = {
      val __obj = js.Dynamic.literal(addonSelected = addonSelected.asInstanceOf[js.Any], onPressAddon = js.Any.fromFunction1(onPressAddon), panels = panels.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAddonSelected(value: String): Self = StObject.set(x, "addonSelected", value.asInstanceOf[js.Any])
      
      inline def setOnPressAddon(value: String => Unit): Self = StObject.set(x, "onPressAddon", js.Any.fromFunction1(value))
      
      inline def setPanels(value: Collection): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
    }
  }
}
