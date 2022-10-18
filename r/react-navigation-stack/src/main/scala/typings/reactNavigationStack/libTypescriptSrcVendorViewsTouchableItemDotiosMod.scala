package typings.reactNavigationStack

import typings.react.mod.Component
import typings.react.mod.ComponentProps
import typings.reactNavigationStack.anon.Borderless
import typings.reactNavigationStack.anon.PressOpacity
import typings.reactNavigationStack.anon.TypeofBaseButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcVendorViewsTouchableItemDotiosMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/TouchableItem.ios", JSImport.Default)
  @js.native
  open class default () extends TouchableItem
  /* static members */
  object default {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/TouchableItem.ios", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/TouchableItem.ios", "default.defaultProps")
    @js.native
    def defaultProps: Borderless = js.native
    inline def defaultProps_=(x: Borderless): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type Props = ComponentProps[TypeofBaseButton] & PressOpacity
  
  @js.native
  trait TouchableItem
    extends Component[Props, js.Object, Any] {
    
    /* private */ var handleActiveStateChange: Any = js.native
    
    /* private */ var opacity: Any = js.native
  }
}
