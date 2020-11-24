package typings.rcMotion

import typings.rcMotion.cssmotionMod.CSSMotionProps
import typings.rcMotion.interfaceMod.MotionStatus
import typings.rcMotion.interfaceMod.StepStatus
import typings.react.mod.CSSProperties
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-motion/es/hooks/useStatus", JSImport.Namespace)
@js.native
object useStatusMod extends js.Object {
  
  def default(
    supportMotion: Boolean,
    visible: Boolean,
    getElement: js.Function0[HTMLElement],
    hasMotionEnterMotionAppearMotionLeaveMotionDeadlineMotionLeaveImmediatelyOnAppearPrepareOnEnterPrepareOnLeavePrepareOnAppearStartOnEnterStartOnLeaveStartOnAppearActiveOnEnterActiveOnLeaveActiveOnAppearEndOnEnterEndOnLeaveEndOnVisibleChanged: CSSMotionProps
  ): js.Tuple4[MotionStatus, StepStatus, CSSProperties, Boolean] = js.native
}
