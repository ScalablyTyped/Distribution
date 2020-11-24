package typings.reactDom.testUtilsMod

import typings.react.mod.AbstractView
import typings.std.DataTransfer
import typings.std.EventTarget
import typings.std.TouchList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyntheticEventData extends OptionalEventProperties {
  
  var altKey: js.UndefOr[Boolean] = js.native
  
  var button: js.UndefOr[Double] = js.native
  
  var buttons: js.UndefOr[Double] = js.native
  
  var changedTouches: js.UndefOr[TouchList] = js.native
  
  var charCode: js.UndefOr[Double] = js.native
  
  var clientX: js.UndefOr[Double] = js.native
  
  var clientY: js.UndefOr[Double] = js.native
  
  var clipboardData: js.UndefOr[DataTransfer] = js.native
  
  var ctrlKey: js.UndefOr[Boolean] = js.native
  
  var deltaMode: js.UndefOr[Double] = js.native
  
  var deltaX: js.UndefOr[Double] = js.native
  
  var deltaY: js.UndefOr[Double] = js.native
  
  var deltaZ: js.UndefOr[Double] = js.native
  
  var detail: js.UndefOr[Double] = js.native
  
  var getModifierState: js.UndefOr[js.Function1[/* key */ String, Boolean]] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var keyCode: js.UndefOr[Double] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[Double] = js.native
  
  var metaKey: js.UndefOr[Boolean] = js.native
  
  var pageX: js.UndefOr[Double] = js.native
  
  var pageY: js.UndefOr[Double] = js.native
  
  var relatedTarget: js.UndefOr[EventTarget] = js.native
  
  var repeat: js.UndefOr[Boolean] = js.native
  
  var screenX: js.UndefOr[Double] = js.native
  
  var screenY: js.UndefOr[Double] = js.native
  
  var shiftKey: js.UndefOr[Boolean] = js.native
  
  var targetTouches: js.UndefOr[TouchList] = js.native
  
  var touches: js.UndefOr[TouchList] = js.native
  
  var view: js.UndefOr[AbstractView] = js.native
  
  var which: js.UndefOr[Double] = js.native
}
object SyntheticEventData {
  
  @scala.inline
  def apply(): SyntheticEventData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyntheticEventData]
  }
  
  @scala.inline
  implicit class SyntheticEventDataOps[Self <: SyntheticEventData] (val x: Self) extends AnyVal {
    
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
    def setAltKey(value: Boolean): Self = this.set("altKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltKey: Self = this.set("altKey", js.undefined)
    
    @scala.inline
    def setButton(value: Double): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    
    @scala.inline
    def setButtons(value: Double): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setChangedTouches(value: TouchList): Self = this.set("changedTouches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangedTouches: Self = this.set("changedTouches", js.undefined)
    
    @scala.inline
    def setCharCode(value: Double): Self = this.set("charCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharCode: Self = this.set("charCode", js.undefined)
    
    @scala.inline
    def setClientX(value: Double): Self = this.set("clientX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientX: Self = this.set("clientX", js.undefined)
    
    @scala.inline
    def setClientY(value: Double): Self = this.set("clientY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientY: Self = this.set("clientY", js.undefined)
    
    @scala.inline
    def setClipboardData(value: DataTransfer): Self = this.set("clipboardData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipboardData: Self = this.set("clipboardData", js.undefined)
    
    @scala.inline
    def setCtrlKey(value: Boolean): Self = this.set("ctrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCtrlKey: Self = this.set("ctrlKey", js.undefined)
    
    @scala.inline
    def setDeltaMode(value: Double): Self = this.set("deltaMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeltaMode: Self = this.set("deltaMode", js.undefined)
    
    @scala.inline
    def setDeltaX(value: Double): Self = this.set("deltaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeltaX: Self = this.set("deltaX", js.undefined)
    
    @scala.inline
    def setDeltaY(value: Double): Self = this.set("deltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeltaY: Self = this.set("deltaY", js.undefined)
    
    @scala.inline
    def setDeltaZ(value: Double): Self = this.set("deltaZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeltaZ: Self = this.set("deltaZ", js.undefined)
    
    @scala.inline
    def setDetail(value: Double): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    
    @scala.inline
    def setGetModifierState(value: /* key */ String => Boolean): Self = this.set("getModifierState", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetModifierState: Self = this.set("getModifierState", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setKeyCode(value: Double): Self = this.set("keyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyCode: Self = this.set("keyCode", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLocation(value: Double): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setMetaKey(value: Boolean): Self = this.set("metaKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetaKey: Self = this.set("metaKey", js.undefined)
    
    @scala.inline
    def setPageX(value: Double): Self = this.set("pageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageX: Self = this.set("pageX", js.undefined)
    
    @scala.inline
    def setPageY(value: Double): Self = this.set("pageY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageY: Self = this.set("pageY", js.undefined)
    
    @scala.inline
    def setRelatedTarget(value: EventTarget): Self = this.set("relatedTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedTarget: Self = this.set("relatedTarget", js.undefined)
    
    @scala.inline
    def setRepeat(value: Boolean): Self = this.set("repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
    
    @scala.inline
    def setScreenX(value: Double): Self = this.set("screenX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenX: Self = this.set("screenX", js.undefined)
    
    @scala.inline
    def setScreenY(value: Double): Self = this.set("screenY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenY: Self = this.set("screenY", js.undefined)
    
    @scala.inline
    def setShiftKey(value: Boolean): Self = this.set("shiftKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShiftKey: Self = this.set("shiftKey", js.undefined)
    
    @scala.inline
    def setTargetTouches(value: TouchList): Self = this.set("targetTouches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetTouches: Self = this.set("targetTouches", js.undefined)
    
    @scala.inline
    def setTouches(value: TouchList): Self = this.set("touches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouches: Self = this.set("touches", js.undefined)
    
    @scala.inline
    def setView(value: AbstractView): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setWhich(value: Double): Self = this.set("which", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhich: Self = this.set("which", js.undefined)
  }
}
