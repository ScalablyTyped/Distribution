package typings.reactOnsenui.anon

import typings.reactOnsenui.reactOnsenuiStrings.default
import typings.reactOnsenui.reactOnsenuiStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsCancelable extends StObject {
  
  var animation: js.UndefOr[none | default] = js.native
  
  var animationOptions: js.UndefOr[typings.reactOnsenui.mod.AnimationOptions] = js.native
  
  var isCancelable: js.UndefOr[Boolean] = js.native
  
  var isDisabled: js.UndefOr[Boolean] = js.native
  
  var isOpen: js.UndefOr[Boolean] = js.native
  
  var maskColor: js.UndefOr[String] = js.native
  
  var modifier: js.UndefOr[String] = js.native
  
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPostHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPostShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPreHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPreShow: js.UndefOr[js.Function0[Unit]] = js.native
}
object IsCancelable {
  
  @scala.inline
  def apply(): IsCancelable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsCancelable]
  }
  
  @scala.inline
  implicit class IsCancelableMutableBuilder[Self <: IsCancelable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: none | default): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOptions(value: typings.reactOnsenui.mod.AnimationOptions): Self = StObject.set(x, "animationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOptionsUndefined: Self = StObject.set(x, "animationOptions", js.undefined)
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setIsCancelable(value: Boolean): Self = StObject.set(x, "isCancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCancelableUndefined: Self = StObject.set(x, "isCancelable", js.undefined)
    
    @scala.inline
    def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    @scala.inline
    def setMaskColor(value: String): Self = StObject.set(x, "maskColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskColorUndefined: Self = StObject.set(x, "maskColor", js.undefined)
    
    @scala.inline
    def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    @scala.inline
    def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    @scala.inline
    def setOnPostHide(value: () => Unit): Self = StObject.set(x, "onPostHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPostHideUndefined: Self = StObject.set(x, "onPostHide", js.undefined)
    
    @scala.inline
    def setOnPostShow(value: () => Unit): Self = StObject.set(x, "onPostShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPostShowUndefined: Self = StObject.set(x, "onPostShow", js.undefined)
    
    @scala.inline
    def setOnPreHide(value: () => Unit): Self = StObject.set(x, "onPreHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPreHideUndefined: Self = StObject.set(x, "onPreHide", js.undefined)
    
    @scala.inline
    def setOnPreShow(value: () => Unit): Self = StObject.set(x, "onPreShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPreShowUndefined: Self = StObject.set(x, "onPreShow", js.undefined)
  }
}
