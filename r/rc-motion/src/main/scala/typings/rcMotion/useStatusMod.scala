package typings.rcMotion

import typings.rcMotion.cssmotionMod.CSSMotionProps
import typings.rcMotion.interfaceMod.MotionStatus
import typings.rcMotion.interfaceMod.StepStatus
import typings.react.mod.CSSProperties
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useStatusMod {
  
  @JSImport("rc-motion/es/hooks/useStatus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    supportMotion: Boolean,
    visible: Boolean,
    getElement: js.Function0[HTMLElement],
    hasMotionEnterMotionAppearMotionLeaveMotionDeadlineMotionLeaveImmediatelyOnAppearPrepareOnEnterPrepareOnLeavePrepareOnAppearStartOnEnterStartOnLeaveStartOnAppearActiveOnEnterActiveOnLeaveActiveOnAppearEndOnEnterEndOnLeaveEndOnVisibleChanged: CSSMotionProps
  ): js.Tuple4[MotionStatus, StepStatus, CSSProperties, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(supportMotion.asInstanceOf[js.Any], visible.asInstanceOf[js.Any], getElement.asInstanceOf[js.Any], hasMotionEnterMotionAppearMotionLeaveMotionDeadlineMotionLeaveImmediatelyOnAppearPrepareOnEnterPrepareOnLeavePrepareOnAppearStartOnEnterStartOnLeaveStartOnAppearActiveOnEnterActiveOnLeaveActiveOnAppearEndOnEnterEndOnLeaveEndOnVisibleChanged.asInstanceOf[js.Any])).asInstanceOf[js.Tuple4[MotionStatus, StepStatus, CSSProperties, Boolean]]
}
