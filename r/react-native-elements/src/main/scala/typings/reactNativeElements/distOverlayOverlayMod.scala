package typings.reactNativeElements

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.reactNative.mod.ModalProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.ModalBasePropsModalPropsI
import typings.reactNativeElements.anon.PickModalBasePropsModalPr
import typings.reactNativeElements.anon.TypeofComponent
import typings.reactNativeElements.distHelpersMod.RneFunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOverlayOverlayMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/overlay/Overlay", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickModalBasePropsModalPr] | ForwardRefExoticComponent[ModalBasePropsModalPropsI] = js.native
  
  @JSImport("react-native-elements/dist/overlay/Overlay", "Overlay")
  @js.native
  val Overlay: RneFunctionComponent[OverlayProps] = js.native
  
  trait OverlayProps
    extends StObject
       with ModalProps {
    
    var ModalComponent: js.UndefOr[
        TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          Component[js.Object, js.Object, js.Object]
        ])
      ] = js.undefined
    
    var backdropStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var fullScreen: js.UndefOr[Boolean] = js.undefined
    
    var isVisible: Boolean
    
    var onBackdropPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var overlayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object OverlayProps {
    
    inline def apply(isVisible: Boolean): OverlayProps = {
      val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverlayProps] (val x: Self) extends AnyVal {
      
      inline def setBackdropStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "backdropStyle", value.asInstanceOf[js.Any])
      
      inline def setBackdropStyleNull: Self = StObject.set(x, "backdropStyle", null)
      
      inline def setBackdropStyleUndefined: Self = StObject.set(x, "backdropStyle", js.undefined)
      
      inline def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
      
      inline def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setModalComponent(
        value: TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              Component[js.Object, js.Object, js.Object]
            ])
      ): Self = StObject.set(x, "ModalComponent", value.asInstanceOf[js.Any])
      
      inline def setModalComponentUndefined: Self = StObject.set(x, "ModalComponent", js.undefined)
      
      inline def setOnBackdropPress(value: () => Unit): Self = StObject.set(x, "onBackdropPress", js.Any.fromFunction0(value))
      
      inline def setOnBackdropPressUndefined: Self = StObject.set(x, "onBackdropPress", js.undefined)
      
      inline def setOverlayStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyleNull: Self = StObject.set(x, "overlayStyle", null)
      
      inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
    }
  }
  
  type _To = FunctionComponent[PickModalBasePropsModalPr] | ForwardRefExoticComponent[ModalBasePropsModalPropsI]
  
  /* This means you don't have to write `default`, but can instead just say `distOverlayOverlayMod.foo` */
  override def _to: FunctionComponent[PickModalBasePropsModalPr] | ForwardRefExoticComponent[ModalBasePropsModalPropsI] = default
}
