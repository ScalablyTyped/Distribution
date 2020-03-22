package typings.rcTrigger.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in rc-trigger.rc-trigger/lib/interface.MotionStatus | rc-trigger.rc-trigger/lib/interface.MotionActiveStatus ]:? string} */
trait MotionNameObject extends js.Object {
  var appear: js.UndefOr[String] = js.undefined
  var `appear-active`: js.UndefOr[String] = js.undefined
  var enter: js.UndefOr[String] = js.undefined
  var `enter-active`: js.UndefOr[String] = js.undefined
  var leave: js.UndefOr[String] = js.undefined
  var `leave-active`: js.UndefOr[String] = js.undefined
  var none: js.UndefOr[String] = js.undefined
}

object MotionNameObject {
  @scala.inline
  def apply(
    appear: String = null,
    `appear-active`: String = null,
    enter: String = null,
    `enter-active`: String = null,
    leave: String = null,
    `leave-active`: String = null,
    none: String = null
  ): MotionNameObject = {
    val __obj = js.Dynamic.literal()
    if (appear != null) __obj.updateDynamic("appear")(appear.asInstanceOf[js.Any])
    if (`appear-active` != null) __obj.updateDynamic("appear-active")(`appear-active`.asInstanceOf[js.Any])
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (`enter-active` != null) __obj.updateDynamic("enter-active")(`enter-active`.asInstanceOf[js.Any])
    if (leave != null) __obj.updateDynamic("leave")(leave.asInstanceOf[js.Any])
    if (`leave-active` != null) __obj.updateDynamic("leave-active")(`leave-active`.asInstanceOf[js.Any])
    if (none != null) __obj.updateDynamic("none")(none.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotionNameObject]
  }
}

