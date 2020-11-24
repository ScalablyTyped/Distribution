package typings.reactSAlert.mod.SAlert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SAlertConfigProps extends js.Object {
  
  var beep: js.UndefOr[String | Boolean | SAlertBeepProps] = js.native
  
  var contentTemplate: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var customFields: js.UndefOr[js.Object] = js.native
  
  var effect: js.UndefOr[String] = js.native
  
  var html: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var stack: js.UndefOr[Boolean | SAlertStackProps] = js.native
  
  var timeout: js.UndefOr[String | Double] = js.native
}
object SAlertConfigProps {
  
  @scala.inline
  def apply(): SAlertConfigProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SAlertConfigProps]
  }
  
  @scala.inline
  implicit class SAlertConfigPropsOps[Self <: SAlertConfigProps] (val x: Self) extends AnyVal {
    
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
    def setBeep(value: String | Boolean | SAlertBeepProps): Self = this.set("beep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeep: Self = this.set("beep", js.undefined)
    
    @scala.inline
    def setContentTemplate(value: /* repeated */ js.Any => _): Self = this.set("contentTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteContentTemplate: Self = this.set("contentTemplate", js.undefined)
    
    @scala.inline
    def setCustomFields(value: js.Object): Self = this.set("customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFields: Self = this.set("customFields", js.undefined)
    
    @scala.inline
    def setEffect(value: String): Self = this.set("effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffect: Self = this.set("effect", js.undefined)
    
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setStack(value: Boolean | SAlertStackProps): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    
    @scala.inline
    def setTimeout(value: String | Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
