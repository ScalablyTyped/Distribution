package typings.reactNativeTabView

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.ViewProps
import typings.reactNativeTabView.anon.PressColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchableItemMod {
  
  @JSImport("react-native-tab-view/lib/typescript/src/TouchableItem", JSImport.Default)
  @js.native
  class default () extends TouchableItem
  /* static members */
  object default {
    
    @JSImport("react-native-tab-view/lib/typescript/src/TouchableItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-tab-view/lib/typescript/src/TouchableItem", "default.defaultProps")
    @js.native
    def defaultProps: PressColor = js.native
    inline def defaultProps_=(x: PressColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait Props
    extends StObject
       with ViewProps {
    
    var borderless: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var delayPressIn: js.UndefOr[Double] = js.undefined
    
    var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def onPress(): Unit
    
    var pressColor: String
    
    var pressOpacity: js.UndefOr[Double] = js.undefined
  }
  object Props {
    
    inline def apply(onPress: () => Unit, pressColor: String): Props = {
      val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction0(onPress), pressColor = pressColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
      
      inline def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDelayPressIn(value: Double): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
      
      inline def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
      
      inline def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
      
      inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      inline def setPressColor(value: String): Self = StObject.set(x, "pressColor", value.asInstanceOf[js.Any])
      
      inline def setPressOpacity(value: Double): Self = StObject.set(x, "pressOpacity", value.asInstanceOf[js.Any])
      
      inline def setPressOpacityUndefined: Self = StObject.set(x, "pressOpacity", js.undefined)
    }
  }
  
  @js.native
  trait TouchableItem
    extends Component[Props, js.Object, js.Any]
}
