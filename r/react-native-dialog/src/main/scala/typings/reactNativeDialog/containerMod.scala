package typings.reactNativeDialog

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerMod extends Shortcut {
  
  @JSImport("react-native-dialog/lib/Container", JSImport.Default)
  @js.native
  val default: FC[DialogContainerProps] = js.native
  
  /* Inlined react.react.PropsWithChildren<{  blurComponentIOS :react.react.ReactNode | undefined,   buttonSeparatorStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   contentStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   footerStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   headerStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   blurStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   visible :boolean | undefined,   verticalButtons :boolean | undefined,   onBackdropPress :(): void | undefined,   onRequestClose :(): void | undefined,   keyboardVerticalOffset :number | undefined,   useNativeDriver :boolean | undefined}> */
  trait DialogContainerProps extends StObject {
    
    var blurComponentIOS: js.UndefOr[ReactNode] = js.undefined
    
    var blurStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var buttonSeparatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var footerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var headerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var keyboardVerticalOffset: js.UndefOr[Double] = js.undefined
    
    var onBackdropPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onRequestClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var useNativeDriver: js.UndefOr[Boolean] = js.undefined
    
    var verticalButtons: js.UndefOr[Boolean] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object DialogContainerProps {
    
    inline def apply(): DialogContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogContainerProps]
    }
    
    extension [Self <: DialogContainerProps](x: Self) {
      
      inline def setBlurComponentIOS(value: ReactNode): Self = StObject.set(x, "blurComponentIOS", value.asInstanceOf[js.Any])
      
      inline def setBlurComponentIOSUndefined: Self = StObject.set(x, "blurComponentIOS", js.undefined)
      
      inline def setBlurStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "blurStyle", value.asInstanceOf[js.Any])
      
      inline def setBlurStyleNull: Self = StObject.set(x, "blurStyle", null)
      
      inline def setBlurStyleUndefined: Self = StObject.set(x, "blurStyle", js.undefined)
      
      inline def setButtonSeparatorStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonSeparatorStyle", value.asInstanceOf[js.Any])
      
      inline def setButtonSeparatorStyleNull: Self = StObject.set(x, "buttonSeparatorStyle", null)
      
      inline def setButtonSeparatorStyleUndefined: Self = StObject.set(x, "buttonSeparatorStyle", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setFooterStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "footerStyle", value.asInstanceOf[js.Any])
      
      inline def setFooterStyleNull: Self = StObject.set(x, "footerStyle", null)
      
      inline def setFooterStyleUndefined: Self = StObject.set(x, "footerStyle", js.undefined)
      
      inline def setHeaderStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
      
      inline def setHeaderStyleNull: Self = StObject.set(x, "headerStyle", null)
      
      inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      inline def setKeyboardVerticalOffset(value: Double): Self = StObject.set(x, "keyboardVerticalOffset", value.asInstanceOf[js.Any])
      
      inline def setKeyboardVerticalOffsetUndefined: Self = StObject.set(x, "keyboardVerticalOffset", js.undefined)
      
      inline def setOnBackdropPress(value: () => Unit): Self = StObject.set(x, "onBackdropPress", js.Any.fromFunction0(value))
      
      inline def setOnBackdropPressUndefined: Self = StObject.set(x, "onBackdropPress", js.undefined)
      
      inline def setOnRequestClose(value: () => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction0(value))
      
      inline def setOnRequestCloseUndefined: Self = StObject.set(x, "onRequestClose", js.undefined)
      
      inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
      
      inline def setVerticalButtons(value: Boolean): Self = StObject.set(x, "verticalButtons", value.asInstanceOf[js.Any])
      
      inline def setVerticalButtonsUndefined: Self = StObject.set(x, "verticalButtons", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type _To = FC[DialogContainerProps]
  
  /* This means you don't have to write `default`, but can instead just say `containerMod.foo` */
  override def _to: FC[DialogContainerProps] = default
}
