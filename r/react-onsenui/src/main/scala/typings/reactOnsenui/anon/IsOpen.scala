package typings.reactOnsenui.anon

import typings.reactOnsenui.reactOnsenuiStrings.fade
import typings.reactOnsenui.reactOnsenuiStrings.lift
import typings.reactOnsenui.reactOnsenuiStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsOpen extends StObject {
  
  var animation: js.UndefOr[fade | lift | none] = js.undefined
  
  var animationOptions: js.UndefOr[typings.reactOnsenui.mod.AnimationOptions] = js.undefined
  
  var isOpen: js.UndefOr[Boolean] = js.undefined
  
  var onDeviceBackButton: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPostHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPostShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPreHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPreShow: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IsOpen {
  
  inline def apply(): IsOpen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsOpen]
  }
  
  extension [Self <: IsOpen](x: Self) {
    
    inline def setAnimation(value: fade | lift | none): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationOptions(value: typings.reactOnsenui.mod.AnimationOptions): Self = StObject.set(x, "animationOptions", value.asInstanceOf[js.Any])
    
    inline def setAnimationOptionsUndefined: Self = StObject.set(x, "animationOptions", js.undefined)
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
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
