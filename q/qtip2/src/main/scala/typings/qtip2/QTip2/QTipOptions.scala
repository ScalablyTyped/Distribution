package typings.qtip2.QTip2

import typings.qtip2.JQuery
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options
  */
@js.native
trait QTipOptions extends js.Object {
  
  var content: js.UndefOr[Text | Content] = js.native
  
  var events: js.UndefOr[Events] = js.native
  
  var hide: js.UndefOr[String | JQuery | Hide] = js.native
  
  var id: js.UndefOr[String | Boolean] = js.native
  
  var metadata: js.UndefOr[js.Any] = js.native
  
  var overwrite: js.UndefOr[Boolean] = js.native
  
  var position: js.UndefOr[String | Position] = js.native
  
  var prerender: js.UndefOr[Boolean] = js.native
  
  var show: js.UndefOr[String | Boolean | JQuery | Show] = js.native
  
  var style: js.UndefOr[String | Style] = js.native
  
  var suppress: js.UndefOr[Boolean] = js.native
}
object QTipOptions {
  
  @scala.inline
  def apply(): QTipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QTipOptions]
  }
  
  @scala.inline
  implicit class QTipOptionsOps[Self <: QTipOptions] (val x: Self) extends AnyVal {
    
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
    def setContentFunction2(value: (/* event */ Event, /* api */ Api) => Unit): Self = this.set("content", js.Any.fromFunction2(value))
    
    @scala.inline
    def setContent(value: Text | Content): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setEvents(value: Events): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setHide(value: String | JQuery | Hide): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setId(value: String | Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
    
    @scala.inline
    def setPosition(value: String | Position): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPrerender(value: Boolean): Self = this.set("prerender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrerender: Self = this.set("prerender", js.undefined)
    
    @scala.inline
    def setShow(value: String | Boolean | JQuery | Show): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setStyle(value: String | Style): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSuppress(value: Boolean): Self = this.set("suppress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppress: Self = this.set("suppress", js.undefined)
  }
}
