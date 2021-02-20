package typings.reactOnsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageTransitionOptions extends StObject {
  
  var animation: js.UndefOr[NavigatorAnimationTypes] = js.native
  
  var animationOptions: js.UndefOr[AnimationOptions] = js.native
  
  var callback: js.UndefOr[js.Function0[Unit]] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
}
object PageTransitionOptions {
  
  @scala.inline
  def apply(): PageTransitionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageTransitionOptions]
  }
  
  @scala.inline
  implicit class PageTransitionOptionsMutableBuilder[Self <: PageTransitionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: NavigatorAnimationTypes): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOptions(value: AnimationOptions): Self = StObject.set(x, "animationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOptionsUndefined: Self = StObject.set(x, "animationOptions", js.undefined)
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
