package typings.rcTrigger.anon

import typings.rcTrigger.popupMod.PopupStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<rc-trigger.rc-trigger/es/Popup.PopupState> */
@js.native
trait PartialPopupState extends js.Object {
  var alignClassName: js.UndefOr[String] = js.native
  var inMotion: js.UndefOr[Boolean] = js.native
  var prevVisible: js.UndefOr[Boolean] = js.native
  var status: js.UndefOr[PopupStatus] = js.native
  var targetHeight: js.UndefOr[Double] = js.native
  var targetWidth: js.UndefOr[Double] = js.native
}

object PartialPopupState {
  @scala.inline
  def apply(): PartialPopupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPopupState]
  }
  @scala.inline
  implicit class PartialPopupStateOps[Self <: PartialPopupState] (val x: Self) extends AnyVal {
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
    def setAlignClassName(value: String): Self = this.set("alignClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignClassName: Self = this.set("alignClassName", js.undefined)
    @scala.inline
    def setInMotion(value: Boolean): Self = this.set("inMotion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInMotion: Self = this.set("inMotion", js.undefined)
    @scala.inline
    def setPrevVisible(value: Boolean): Self = this.set("prevVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevVisible: Self = this.set("prevVisible", js.undefined)
    @scala.inline
    def setStatus(value: PopupStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
    @scala.inline
    def setTargetHeight(value: Double): Self = this.set("targetHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetHeight: Self = this.set("targetHeight", js.undefined)
    @scala.inline
    def setTargetWidth(value: Double): Self = this.set("targetWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetWidth: Self = this.set("targetWidth", js.undefined)
  }
  
}

