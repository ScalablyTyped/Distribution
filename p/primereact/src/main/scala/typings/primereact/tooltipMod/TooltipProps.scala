package typings.primereact.tooltipMod

import typings.primereact.anon.TargetHTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipProps extends js.Object {
  
  var appendTo: js.UndefOr[js.Object] = js.native
  
  var at: js.UndefOr[String] = js.native
  
  var autoZIndex: js.UndefOr[Boolean] = js.native
  
  var baseZIndex: js.UndefOr[Double] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var content: js.UndefOr[String] = js.native
  
  var event: js.UndefOr[String] = js.native
  
  var hideEvent: js.UndefOr[String] = js.native
  
  var mouseTrack: js.UndefOr[Boolean] = js.native
  
  var mouseTrackLeft: js.UndefOr[Double] = js.native
  
  var mouseTrackTop: js.UndefOr[Double] = js.native
  
  var my: js.UndefOr[String] = js.native
  
  var onBeforeHide: js.UndefOr[js.Function1[/* e */ TargetHTMLElement, Unit]] = js.native
  
  var onBeforeShow: js.UndefOr[js.Function1[/* e */ TargetHTMLElement, Unit]] = js.native
  
  var onHide: js.UndefOr[js.Function1[/* e */ TargetHTMLElement, Unit]] = js.native
  
  var onShow: js.UndefOr[js.Function1[/* e */ TargetHTMLElement, Unit]] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var showEvent: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var target: js.UndefOr[js.Any] = js.native
}
object TooltipProps {
  
  @scala.inline
  def apply(): TooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipProps]
  }
  
  @scala.inline
  implicit class TooltipPropsOps[Self <: TooltipProps] (val x: Self) extends AnyVal {
    
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
    def setAppendTo(value: js.Object): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    
    @scala.inline
    def setAt(value: String): Self = this.set("at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAt: Self = this.set("at", js.undefined)
    
    @scala.inline
    def setAutoZIndex(value: Boolean): Self = this.set("autoZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoZIndex: Self = this.set("autoZIndex", js.undefined)
    
    @scala.inline
    def setBaseZIndex(value: Double): Self = this.set("baseZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseZIndex: Self = this.set("baseZIndex", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setHideEvent(value: String): Self = this.set("hideEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideEvent: Self = this.set("hideEvent", js.undefined)
    
    @scala.inline
    def setMouseTrack(value: Boolean): Self = this.set("mouseTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseTrack: Self = this.set("mouseTrack", js.undefined)
    
    @scala.inline
    def setMouseTrackLeft(value: Double): Self = this.set("mouseTrackLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseTrackLeft: Self = this.set("mouseTrackLeft", js.undefined)
    
    @scala.inline
    def setMouseTrackTop(value: Double): Self = this.set("mouseTrackTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseTrackTop: Self = this.set("mouseTrackTop", js.undefined)
    
    @scala.inline
    def setMy(value: String): Self = this.set("my", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMy: Self = this.set("my", js.undefined)
    
    @scala.inline
    def setOnBeforeHide(value: /* e */ TargetHTMLElement => Unit): Self = this.set("onBeforeHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeHide: Self = this.set("onBeforeHide", js.undefined)
    
    @scala.inline
    def setOnBeforeShow(value: /* e */ TargetHTMLElement => Unit): Self = this.set("onBeforeShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeShow: Self = this.set("onBeforeShow", js.undefined)
    
    @scala.inline
    def setOnHide(value: /* e */ TargetHTMLElement => Unit): Self = this.set("onHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnShow(value: /* e */ TargetHTMLElement => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setShowEvent(value: String): Self = this.set("showEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowEvent: Self = this.set("showEvent", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
