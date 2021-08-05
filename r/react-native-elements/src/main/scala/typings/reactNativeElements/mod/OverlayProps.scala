package typings.reactNativeElements.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactNative.mod.ModalProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlayProps
  extends StObject
     with ModalProps {
  
  /**
    *  Override React Native `Modal` component (usable for web-platform)
    */
  var ModalComponent: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
  
  /**
    * Style for the backdrop
    */
  var backdropStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Content of the overlay
    */
  var children: ReactElement
  
  /**
    * If to take up full screen width and height
    *
    * @default false
    */
  var fullScreen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, the overlay is visible
    */
  var isVisible: Boolean
  
  /**
    * Callback when user touches the backdrop
    */
  var onBackdropPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Style of the actual overlay
    */
  var overlayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object OverlayProps {
  
  inline def apply(children: ReactElement, isVisible: Boolean): OverlayProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayProps]
  }
  
  extension [Self <: OverlayProps](x: Self) {
    
    inline def setBackdropStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "backdropStyle", value.asInstanceOf[js.Any])
    
    inline def setBackdropStyleNull: Self = StObject.set(x, "backdropStyle", null)
    
    inline def setBackdropStyleUndefined: Self = StObject.set(x, "backdropStyle", js.undefined)
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
    
    inline def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setModalComponent(value: ComponentClass[js.Object, ComponentState]): Self = StObject.set(x, "ModalComponent", value.asInstanceOf[js.Any])
    
    inline def setModalComponentUndefined: Self = StObject.set(x, "ModalComponent", js.undefined)
    
    inline def setOnBackdropPress(value: () => Unit): Self = StObject.set(x, "onBackdropPress", js.Any.fromFunction0(value))
    
    inline def setOnBackdropPressUndefined: Self = StObject.set(x, "onBackdropPress", js.undefined)
    
    inline def setOverlayStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
    
    inline def setOverlayStyleNull: Self = StObject.set(x, "overlayStyle", null)
    
    inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
  }
}
