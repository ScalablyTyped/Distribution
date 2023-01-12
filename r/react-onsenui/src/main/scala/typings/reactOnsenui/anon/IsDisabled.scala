package typings.reactOnsenui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDisabled extends StObject {
  
  var animation: js.UndefOr[String] = js.undefined
  
  var animationOptions: js.UndefOr[js.Object] = js.undefined
  
  var isCancelable: js.UndefOr[Boolean] = js.undefined
  
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  
  var isOpen: js.UndefOr[Boolean] = js.undefined
  
  var maskColor: js.UndefOr[String] = js.undefined
  
  var modifier: js.UndefOr[String] = js.undefined
  
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onDeviceBackButton: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPostHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPostShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPreHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPreShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object IsDisabled {
  
  inline def apply(): IsDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsDisabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsDisabled] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationOptions(value: js.Object): Self = StObject.set(x, "animationOptions", value.asInstanceOf[js.Any])
    
    inline def setAnimationOptionsUndefined: Self = StObject.set(x, "animationOptions", js.undefined)
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setIsCancelable(value: Boolean): Self = StObject.set(x, "isCancelable", value.asInstanceOf[js.Any])
    
    inline def setIsCancelableUndefined: Self = StObject.set(x, "isCancelable", js.undefined)
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    inline def setMaskColor(value: String): Self = StObject.set(x, "maskColor", value.asInstanceOf[js.Any])
    
    inline def setMaskColorUndefined: Self = StObject.set(x, "maskColor", js.undefined)
    
    inline def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
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
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
