package typings.reactNavigationStack

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.Component
import typings.react.mod.ComponentProps
import typings.reactNativeGestureHandler.mod.BaseButton
import typings.reactNavigationStack.anon.ActiveOpacity
import typings.reactNavigationStack.anon.Enabled
import typings.reactNavigationStack.anon.ReadonlyBaseButtonPropert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchableItemIosMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/TouchableItem.ios", JSImport.Default)
  @js.native
  class default () extends TouchableItem
  /* static members */
  object default {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/TouchableItem.ios", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/TouchableItem.ios", "default.defaultProps")
    @js.native
    def defaultProps: Enabled = js.native
    inline def defaultProps_=(x: Enabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type Props = (ComponentProps[Instantiable1[/* props */ ReadonlyBaseButtonPropert, BaseButton]]) & ActiveOpacity
  
  @js.native
  trait TouchableItem
    extends Component[Props, js.Object, js.Any] {
    
    /* private */ var handleActiveStateChange: js.Any = js.native
    
    /* private */ var opacity: js.Any = js.native
  }
}
