package typings.reactOnsenui.anon

import typings.reactOnsenui.reactOnsenuiStrings.ascend
import typings.reactOnsenui.reactOnsenuiStrings.default
import typings.reactOnsenui.reactOnsenuiStrings.fade
import typings.reactOnsenui.reactOnsenuiStrings.fall
import typings.reactOnsenui.reactOnsenuiStrings.lift
import typings.reactOnsenui.reactOnsenuiStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDeviceBackButton extends StObject {
  
  var animation: js.UndefOr[default | ascend | lift | fall | fade | none] = js.undefined
  
  var animationOptions: js.UndefOr[typings.reactOnsenui.mod.AnimationOptions] = js.undefined
  
  var isOpen: Boolean
  
  var modifier: js.UndefOr[String] = js.undefined
  
  var onDeviceBackButton: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPostHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPostShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPreHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPreShow: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object OnDeviceBackButton {
  
  inline def apply(isOpen: Boolean): OnDeviceBackButton = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDeviceBackButton]
  }
  
  extension [Self <: OnDeviceBackButton](x: Self) {
    
    inline def setAnimation(value: default | ascend | lift | fall | fade | none): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationOptions(value: typings.reactOnsenui.mod.AnimationOptions): Self = StObject.set(x, "animationOptions", value.asInstanceOf[js.Any])
    
    inline def setAnimationOptionsUndefined: Self = StObject.set(x, "animationOptions", js.undefined)
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setOnDeviceBackButton(value: () => Unit): Self = StObject.set(x, "onDeviceBackButton", js.Any.fromFunction0(value))
    
    inline def setOnDeviceBackButtonUndefined: Self = StObject.set(x, "onDeviceBackButton", js.undefined)
    
    inline def setOnPostHide(value: () => Unit): Self = StObject.set(x, "onPostHide", js.Any.fromFunction0(value))
    
    inline def setOnPostHideUndefined: Self = StObject.set(x, "onPostHide", js.undefined)
    
    inline def setOnPostShow(value: () => Unit): Self = StObject.set(x, "onPostShow", js.Any.fromFunction0(value))
    
    inline def setOnPostShowUndefined: Self = StObject.set(x, "onPostShow", js.undefined)
    
    inline def setOnPreHide(value: () => Unit): Self = StObject.set(x, "onPreHide", js.Any.fromFunction0(value))
    
    inline def setOnPreHideUndefined: Self = StObject.set(x, "onPreHide", js.undefined)
    
    inline def setOnPreShow(value: () => Unit): Self = StObject.set(x, "onPreShow", js.Any.fromFunction0(value))
    
    inline def setOnPreShowUndefined: Self = StObject.set(x, "onPreShow", js.undefined)
  }
}
