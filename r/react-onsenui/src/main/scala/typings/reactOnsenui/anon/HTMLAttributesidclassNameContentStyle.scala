package typings.reactOnsenui.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  contentStyle :any | undefined,   modifier :string | undefined,   renderModal :(): void | undefined,   renderToolbar :(): void | undefined,   renderBottomToolbar :(): void | undefined,   renderFixed :(): void | undefined,   onInit :(): void | undefined,   onShow :(): void | undefined,   onHide :(): void | undefined,   onInfiniteScroll :(doneCallback : (): void): void | undefined} */
@js.native
trait HTMLAttributesidclassNameContentStyle extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var contentStyle: js.UndefOr[js.Any] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var modifier: js.UndefOr[String] = js.native
  
  var onHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onInfiniteScroll: js.UndefOr[js.Function1[/* doneCallback */ js.Function0[Unit], Unit]] = js.native
  
  var onInit: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  var renderBottomToolbar: js.UndefOr[js.Function0[Unit]] = js.native
  
  var renderFixed: js.UndefOr[js.Function0[Unit]] = js.native
  
  var renderModal: js.UndefOr[js.Function0[Unit]] = js.native
  
  var renderToolbar: js.UndefOr[js.Function0[Unit]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object HTMLAttributesidclassNameContentStyle {
  
  @scala.inline
  def apply(): HTMLAttributesidclassNameContentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributesidclassNameContentStyle]
  }
  
  @scala.inline
  implicit class HTMLAttributesidclassNameContentStyleOps[Self <: HTMLAttributesidclassNameContentStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContentStyle(value: js.Any): Self = this.set("contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentStyle: Self = this.set("contentStyle", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setModifier(value: String): Self = this.set("modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifier: Self = this.set("modifier", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => Unit): Self = this.set("onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnInfiniteScroll(value: /* doneCallback */ js.Function0[Unit] => Unit): Self = this.set("onInfiniteScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInfiniteScroll: Self = this.set("onInfiniteScroll", js.undefined)
    
    @scala.inline
    def setOnInit(value: () => Unit): Self = this.set("onInit", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnInit: Self = this.set("onInit", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setRenderBottomToolbar(value: () => Unit): Self = this.set("renderBottomToolbar", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderBottomToolbar: Self = this.set("renderBottomToolbar", js.undefined)
    
    @scala.inline
    def setRenderFixed(value: () => Unit): Self = this.set("renderFixed", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderFixed: Self = this.set("renderFixed", js.undefined)
    
    @scala.inline
    def setRenderModal(value: () => Unit): Self = this.set("renderModal", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderModal: Self = this.set("renderModal", js.undefined)
    
    @scala.inline
    def setRenderToolbar(value: () => Unit): Self = this.set("renderToolbar", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderToolbar: Self = this.set("renderToolbar", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
