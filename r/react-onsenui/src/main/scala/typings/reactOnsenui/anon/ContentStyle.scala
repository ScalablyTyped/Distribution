package typings.reactOnsenui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentStyle extends StObject {
  
  var contentStyle: js.UndefOr[js.Any] = js.native
  
  var modifier: js.UndefOr[String] = js.native
  
  var onHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onInfiniteScroll: js.UndefOr[js.Function1[/* doneCallback */ js.Function0[Unit], Unit]] = js.native
  
  var onInit: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  var renderBottomToolbar: js.UndefOr[js.Function0[Unit]] = js.native
  
  var renderFixed: js.UndefOr[js.Function0[Unit]] = js.native
  
  var renderModal: js.UndefOr[js.Function0[Unit]] = js.native
  
  var renderToolbar: js.UndefOr[js.Function0[Unit]] = js.native
}
object ContentStyle {
  
  @scala.inline
  def apply(): ContentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentStyle]
  }
  
  @scala.inline
  implicit class ContentStyleMutableBuilder[Self <: ContentStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentStyle(value: js.Any): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    @scala.inline
    def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    @scala.inline
    def setOnInfiniteScroll(value: /* doneCallback */ js.Function0[Unit] => Unit): Self = StObject.set(x, "onInfiniteScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInfiniteScrollUndefined: Self = StObject.set(x, "onInfiniteScroll", js.undefined)
    
    @scala.inline
    def setOnInit(value: () => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setRenderBottomToolbar(value: () => Unit): Self = StObject.set(x, "renderBottomToolbar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderBottomToolbarUndefined: Self = StObject.set(x, "renderBottomToolbar", js.undefined)
    
    @scala.inline
    def setRenderFixed(value: () => Unit): Self = StObject.set(x, "renderFixed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderFixedUndefined: Self = StObject.set(x, "renderFixed", js.undefined)
    
    @scala.inline
    def setRenderModal(value: () => Unit): Self = StObject.set(x, "renderModal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderModalUndefined: Self = StObject.set(x, "renderModal", js.undefined)
    
    @scala.inline
    def setRenderToolbar(value: () => Unit): Self = StObject.set(x, "renderToolbar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderToolbarUndefined: Self = StObject.set(x, "renderToolbar", js.undefined)
  }
}
