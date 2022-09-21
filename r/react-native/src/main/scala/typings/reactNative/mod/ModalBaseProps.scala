package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.fade
import typings.reactNative.reactNativeStrings.none
import typings.reactNative.reactNativeStrings.slide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalBaseProps extends StObject {
  
  /**
    * @deprecated Use animationType instead
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The `animationType` prop controls how the modal animates.
    *
    * - `slide` slides in from the bottom
    * - `fade` fades into view
    * - `none` appears without an animation
    */
  var animationType: js.UndefOr[none | slide | fade] = js.undefined
  
  /**
    * The `onRequestClose` callback is called when the user taps the hardware back button on Android or the menu button on Apple TV.
    *
    * This is required on Apple TV and Android.
    */
  var onRequestClose: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[Any], Unit]] = js.undefined
  
  /**
    * The `onShow` prop allows passing a function that will be called once the modal has been shown.
    */
  var onShow: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[Any], Unit]] = js.undefined
  
  /**
    * The `transparent` prop determines whether your modal will fill the entire view.
    * Setting this to `true` will render the modal over a transparent background.
    */
  var transparent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The `visible` prop determines whether your modal is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ModalBaseProps {
  
  inline def apply(): ModalBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalBaseProps]
  }
  
  extension [Self <: ModalBaseProps](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setAnimationType(value: none | slide | fade): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    inline def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    inline def setOnRequestClose(value: /* event */ NativeSyntheticEvent[Any] => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction1(value))
    
    inline def setOnRequestCloseUndefined: Self = StObject.set(x, "onRequestClose", js.undefined)
    
    inline def setOnShow(value: /* event */ NativeSyntheticEvent[Any] => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
