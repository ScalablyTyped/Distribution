package typings.reactOnsenui.anon

import typings.react.mod.CSSProperties
import typings.reactOnsenui.mod.PullHookChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  onChange :(e : react-onsenui.react-onsenui.PullHookChangeEvent): void | undefined,   onLoad :(done : (): void): void | undefined,   onPull :(): void | undefined,   disabled :boolean | undefined,   height :number | undefined,   thresholdHeight :number | undefined,   fixedContent :boolean | undefined} */
@js.native
trait HTMLAttributesidclassNameFixedContent extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var fixedContent: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* e */ PullHookChangeEvent, Unit]] = js.native
  
  var onLoad: js.UndefOr[js.Function1[/* done */ js.Function0[Unit], Unit]] = js.native
  
  var onPull: js.UndefOr[js.Function0[Unit]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var thresholdHeight: js.UndefOr[Double] = js.native
}
object HTMLAttributesidclassNameFixedContent {
  
  @scala.inline
  def apply(): HTMLAttributesidclassNameFixedContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributesidclassNameFixedContent]
  }
  
  @scala.inline
  implicit class HTMLAttributesidclassNameFixedContentOps[Self <: HTMLAttributesidclassNameFixedContent] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFixedContent(value: Boolean): Self = this.set("fixedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedContent: Self = this.set("fixedContent", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* e */ PullHookChangeEvent => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnLoad(value: /* done */ js.Function0[Unit] => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnPull(value: () => Unit): Self = this.set("onPull", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPull: Self = this.set("onPull", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setThresholdHeight(value: Double): Self = this.set("thresholdHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThresholdHeight: Self = this.set("thresholdHeight", js.undefined)
  }
}
