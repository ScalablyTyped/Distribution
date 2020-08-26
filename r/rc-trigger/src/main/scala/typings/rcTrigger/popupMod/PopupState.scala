package typings.rcTrigger.popupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupState extends js.Object {
  var alignClassName: String = js.native
  /** Record for CSSMotion is working or not */
  var inMotion: Boolean = js.native
  var prevVisible: Boolean = js.native
  var status: PopupStatus = js.native
  var targetHeight: Double = js.native
  var targetWidth: Double = js.native
}

object PopupState {
  @scala.inline
  def apply(
    alignClassName: String,
    inMotion: Boolean,
    prevVisible: Boolean,
    targetHeight: Double,
    targetWidth: Double
  ): PopupState = {
    val __obj = js.Dynamic.literal(alignClassName = alignClassName.asInstanceOf[js.Any], inMotion = inMotion.asInstanceOf[js.Any], prevVisible = prevVisible.asInstanceOf[js.Any], targetHeight = targetHeight.asInstanceOf[js.Any], targetWidth = targetWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupState]
  }
  @scala.inline
  implicit class PopupStateOps[Self <: PopupState] (val x: Self) extends AnyVal {
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
    def setInMotion(value: Boolean): Self = this.set("inMotion", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevVisible(value: Boolean): Self = this.set("prevVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetHeight(value: Double): Self = this.set("targetHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetWidth(value: Double): Self = this.set("targetWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: PopupStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
  
}

