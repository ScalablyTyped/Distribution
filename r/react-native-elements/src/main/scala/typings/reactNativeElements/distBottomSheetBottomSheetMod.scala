package typings.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.reactNative.mod.ModalProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.BottomSheetPropsPartialTh
import typings.reactNativeElements.anon.PickBottomSheetPropsParti
import typings.reactNativeElements.distHelpersMod.RneFunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBottomSheetBottomSheetMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/bottomSheet/BottomSheet", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickBottomSheetPropsParti] | ForwardRefExoticComponent[BottomSheetPropsPartialTh] = js.native
  
  @JSImport("react-native-elements/dist/bottomSheet/BottomSheet", "BottomSheet")
  @js.native
  val BottomSheet: RneFunctionComponent[BottomSheetProps] = js.native
  
  trait BottomSheetProps extends StObject {
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var isVisible: js.UndefOr[Boolean] = js.undefined
    
    var modalProps: js.UndefOr[ModalProps] = js.undefined
  }
  object BottomSheetProps {
    
    inline def apply(): BottomSheetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BottomSheetProps]
    }
    
    extension [Self <: BottomSheetProps](x: Self) {
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
      
      inline def setModalProps(value: ModalProps): Self = StObject.set(x, "modalProps", value.asInstanceOf[js.Any])
      
      inline def setModalPropsUndefined: Self = StObject.set(x, "modalProps", js.undefined)
    }
  }
  
  type _To = FunctionComponent[PickBottomSheetPropsParti] | ForwardRefExoticComponent[BottomSheetPropsPartialTh]
  
  /* This means you don't have to write `default`, but can instead just say `distBottomSheetBottomSheetMod.foo` */
  override def _to: FunctionComponent[PickBottomSheetPropsParti] | ForwardRefExoticComponent[BottomSheetPropsPartialTh] = default
}
