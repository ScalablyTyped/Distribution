package typings.storybookReactNative

import typings.react.mod.PureComponent
import typings.storybookAddons.distMod.Collection
import typings.storybookReactNative.anon.AddonSelected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrapperMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/addons/wrapper", JSImport.Default)
  @js.native
  class default () extends Wrapper
  /* static members */
  object default {
    
    @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/addons/wrapper", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/addons/wrapper", "default.defaultProps")
    @js.native
    def defaultProps: AddonSelected = js.native
    @scala.inline
    def defaultProps_=(x: AddonSelected): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Props extends StObject {
    
    var addonSelected: String = js.native
    
    var panels: Collection = js.native
  }
  object Props {
    
    @scala.inline
    def apply(addonSelected: String, panels: Collection): Props = {
      val __obj = js.Dynamic.literal(addonSelected = addonSelected.asInstanceOf[js.Any], panels = panels.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddonSelected(value: String): Self = StObject.set(x, "addonSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanels(value: Collection): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Wrapper
    extends PureComponent[Props, js.Object, js.Any]
}
