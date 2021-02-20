package typings.reactOnsenui.anon

import typings.reactOnsenui.reactOnsenuiStrings.ascend
import typings.reactOnsenui.reactOnsenuiStrings.default
import typings.reactOnsenui.reactOnsenuiStrings.fade
import typings.reactOnsenui.reactOnsenuiStrings.fall
import typings.reactOnsenui.reactOnsenuiStrings.lift
import typings.reactOnsenui.reactOnsenuiStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnDeviceBackButton extends StObject {
  
  var animation: js.UndefOr[default | ascend | lift | fall | fade | none] = js.native
  
  var animationOptions: js.UndefOr[typings.reactOnsenui.mod.AnimationOptions] = js.native
  
  var isOpen: Boolean = js.native
  
  var modifier: js.UndefOr[String] = js.native
  
  var onDeviceBackButton: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPostHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPostShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPreHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPreShow: js.UndefOr[js.Function0[Unit]] = js.native
}
object OnDeviceBackButton {
  
  @scala.inline
  def apply(isOpen: Boolean): OnDeviceBackButton = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDeviceBackButton]
  }
  
  @scala.inline
  implicit class OnDeviceBackButtonMutableBuilder[Self <: OnDeviceBackButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: default | ascend | lift | fall | fade | none): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOptions(value: typings.reactOnsenui.mod.AnimationOptions): Self = StObject.set(x, "animationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOptionsUndefined: Self = StObject.set(x, "animationOptions", js.undefined)
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    @scala.inline
    def setOnDeviceBackButton(value: () => Unit): Self = StObject.set(x, "onDeviceBackButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDeviceBackButtonUndefined: Self = StObject.set(x, "onDeviceBackButton", js.undefined)
    
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
