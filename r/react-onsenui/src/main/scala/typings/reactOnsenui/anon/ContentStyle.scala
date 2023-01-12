package typings.reactOnsenui.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentStyle extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var contentStyle: js.UndefOr[Any] = js.undefined
  
  var modifier: js.UndefOr[String] = js.undefined
  
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onInfiniteScroll: js.UndefOr[js.Function1[/* doneCallback */ js.Function0[Unit], Unit]] = js.undefined
  
  var onInit: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var renderBottomToolbar: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var renderFixed: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var renderModal: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var renderToolbar: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object ContentStyle {
  
  inline def apply(): ContentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentStyle] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setContentStyle(value: Any): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnInfiniteScroll(value: /* doneCallback */ js.Function0[Unit] => Unit): Self = StObject.set(x, "onInfiniteScroll", js.Any.fromFunction1(value))
    
    inline def setOnInfiniteScrollUndefined: Self = StObject.set(x, "onInfiniteScroll", js.undefined)
    
    inline def setOnInit(value: () => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction0(value))
    
    inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
    
    inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setRenderBottomToolbar(value: () => Unit): Self = StObject.set(x, "renderBottomToolbar", js.Any.fromFunction0(value))
    
    inline def setRenderBottomToolbarUndefined: Self = StObject.set(x, "renderBottomToolbar", js.undefined)
    
    inline def setRenderFixed(value: () => Unit): Self = StObject.set(x, "renderFixed", js.Any.fromFunction0(value))
    
    inline def setRenderFixedUndefined: Self = StObject.set(x, "renderFixed", js.undefined)
    
    inline def setRenderModal(value: () => Unit): Self = StObject.set(x, "renderModal", js.Any.fromFunction0(value))
    
    inline def setRenderModalUndefined: Self = StObject.set(x, "renderModal", js.undefined)
    
    inline def setRenderToolbar(value: () => Unit): Self = StObject.set(x, "renderToolbar", js.Any.fromFunction0(value))
    
    inline def setRenderToolbarUndefined: Self = StObject.set(x, "renderToolbar", js.undefined)
  }
}
