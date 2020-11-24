package typings.reactCustomScrollbars.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.NativeUIEvent
import typings.react.mod.StatelessComponent
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollbarProps
  extends AllHTMLAttributes[Scrollbars]
     with ClassAttributes[Scrollbars] {
  
  var autoHeight: js.UndefOr[Boolean] = js.native
  
  var autoHeightMax: js.UndefOr[Double | String] = js.native
  
  var autoHeightMin: js.UndefOr[Double | String] = js.native
  
  var autoHide: js.UndefOr[Boolean] = js.native
  
  var autoHideDuration: js.UndefOr[Double] = js.native
  
  var autoHideTimeout: js.UndefOr[Double] = js.native
  
  var hideTracksWhenNotNeeded: js.UndefOr[Boolean] = js.native
  
  var onScrollFrame: js.UndefOr[js.Function1[/* values */ positionValues, Unit]] = js.native
  
  var onScrollStart: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onScrollStop: js.UndefOr[js.Function0[Unit]] = js.native
  
  @JSName("onScroll")
  var onScroll_ScrollbarProps: js.UndefOr[UIEventHandler[_]] = js.native
  
  var onUpdate: js.UndefOr[js.Function1[/* values */ positionValues, Unit]] = js.native
  
  var renderThumbHorizontal: js.UndefOr[StatelessComponent[_]] = js.native
  
  var renderThumbVertical: js.UndefOr[StatelessComponent[_]] = js.native
  
  var renderTrackHorizontal: js.UndefOr[StatelessComponent[_]] = js.native
  
  var renderTrackVertical: js.UndefOr[StatelessComponent[_]] = js.native
  
  var renderView: js.UndefOr[StatelessComponent[_]] = js.native
  
  var tagName: js.UndefOr[String] = js.native
  
  var thumbMinSize: js.UndefOr[Double] = js.native
  
  var thumbSize: js.UndefOr[Double] = js.native
  
  var universal: js.UndefOr[Boolean] = js.native
}
object ScrollbarProps {
  
  @scala.inline
  def apply(): ScrollbarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollbarProps]
  }
  
  @scala.inline
  implicit class ScrollbarPropsOps[Self <: ScrollbarProps] (val x: Self) extends AnyVal {
    
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
    def setAutoHeight(value: Boolean): Self = this.set("autoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHeight: Self = this.set("autoHeight", js.undefined)
    
    @scala.inline
    def setAutoHeightMax(value: Double | String): Self = this.set("autoHeightMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHeightMax: Self = this.set("autoHeightMax", js.undefined)
    
    @scala.inline
    def setAutoHeightMin(value: Double | String): Self = this.set("autoHeightMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHeightMin: Self = this.set("autoHeightMin", js.undefined)
    
    @scala.inline
    def setAutoHide(value: Boolean): Self = this.set("autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHide: Self = this.set("autoHide", js.undefined)
    
    @scala.inline
    def setAutoHideDuration(value: Double): Self = this.set("autoHideDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHideDuration: Self = this.set("autoHideDuration", js.undefined)
    
    @scala.inline
    def setAutoHideTimeout(value: Double): Self = this.set("autoHideTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHideTimeout: Self = this.set("autoHideTimeout", js.undefined)
    
    @scala.inline
    def setHideTracksWhenNotNeeded(value: Boolean): Self = this.set("hideTracksWhenNotNeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideTracksWhenNotNeeded: Self = this.set("hideTracksWhenNotNeeded", js.undefined)
    
    @scala.inline
    def setOnScroll(value: UIEvent[_, NativeUIEvent] => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnScrollFrame(value: /* values */ positionValues => Unit): Self = this.set("onScrollFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScrollFrame: Self = this.set("onScrollFrame", js.undefined)
    
    @scala.inline
    def setOnScrollStart(value: () => Unit): Self = this.set("onScrollStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnScrollStart: Self = this.set("onScrollStart", js.undefined)
    
    @scala.inline
    def setOnScrollStop(value: () => Unit): Self = this.set("onScrollStop", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnScrollStop: Self = this.set("onScrollStop", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: /* values */ positionValues => Unit): Self = this.set("onUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    
    @scala.inline
    def setRenderThumbHorizontal(value: StatelessComponent[_]): Self = this.set("renderThumbHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderThumbHorizontal: Self = this.set("renderThumbHorizontal", js.undefined)
    
    @scala.inline
    def setRenderThumbVertical(value: StatelessComponent[_]): Self = this.set("renderThumbVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderThumbVertical: Self = this.set("renderThumbVertical", js.undefined)
    
    @scala.inline
    def setRenderTrackHorizontal(value: StatelessComponent[_]): Self = this.set("renderTrackHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderTrackHorizontal: Self = this.set("renderTrackHorizontal", js.undefined)
    
    @scala.inline
    def setRenderTrackVertical(value: StatelessComponent[_]): Self = this.set("renderTrackVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderTrackVertical: Self = this.set("renderTrackVertical", js.undefined)
    
    @scala.inline
    def setRenderView(value: StatelessComponent[_]): Self = this.set("renderView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderView: Self = this.set("renderView", js.undefined)
    
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
    
    @scala.inline
    def setThumbMinSize(value: Double): Self = this.set("thumbMinSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbMinSize: Self = this.set("thumbMinSize", js.undefined)
    
    @scala.inline
    def setThumbSize(value: Double): Self = this.set("thumbSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbSize: Self = this.set("thumbSize", js.undefined)
    
    @scala.inline
    def setUniversal(value: Boolean): Self = this.set("universal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniversal: Self = this.set("universal", js.undefined)
  }
}
