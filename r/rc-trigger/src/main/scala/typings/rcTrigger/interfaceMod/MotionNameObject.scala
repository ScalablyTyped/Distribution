package typings.rcTrigger.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in rc-trigger.rc-trigger/es/interface.MotionStatus | rc-trigger.rc-trigger/es/interface.MotionActiveStatus ]:? string} */
@js.native
trait MotionNameObject extends js.Object {
  var appear: js.UndefOr[String] = js.native
  var `appear-active`: js.UndefOr[String] = js.native
  var enter: js.UndefOr[String] = js.native
  var `enter-active`: js.UndefOr[String] = js.native
  var leave: js.UndefOr[String] = js.native
  var `leave-active`: js.UndefOr[String] = js.native
  var none: js.UndefOr[String] = js.native
}

object MotionNameObject {
  @scala.inline
  def apply(): MotionNameObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionNameObject]
  }
  @scala.inline
  implicit class MotionNameObjectOps[Self <: MotionNameObject] (val x: Self) extends AnyVal {
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
    def setAppear(value: String): Self = this.set("appear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppear: Self = this.set("appear", js.undefined)
    @scala.inline
    def `setAppear-active`(value: String): Self = this.set("appear-active", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAppear-active`: Self = this.set("appear-active", js.undefined)
    @scala.inline
    def setEnter(value: String): Self = this.set("enter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    @scala.inline
    def `setEnter-active`(value: String): Self = this.set("enter-active", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteEnter-active`: Self = this.set("enter-active", js.undefined)
    @scala.inline
    def setLeave(value: String): Self = this.set("leave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeave: Self = this.set("leave", js.undefined)
    @scala.inline
    def `setLeave-active`(value: String): Self = this.set("leave-active", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLeave-active`: Self = this.set("leave-active", js.undefined)
    @scala.inline
    def setNone(value: String): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNone: Self = this.set("none", js.undefined)
  }
  
}

