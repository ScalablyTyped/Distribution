package typings.rcMotion

import typings.rcMotion.interfaceMod.MotionStatus
import typings.rcMotion.interfaceMod.StepStatus
import typings.rcMotion.rcMotionBooleans.`false`
import typings.rcMotion.rcMotionBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useStepQueueMod {
  
  @JSImport("rc-motion/es/hooks/useStepQueue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    status: MotionStatus,
    callback: js.Function1[/* step */ StepStatus, js.Promise[Unit] | Unit | `false` | `true`]
  ): js.Tuple2[js.Function0[Unit], StepStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(status.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function0[Unit], StepStatus]]
  
  @JSImport("rc-motion/es/hooks/useStepQueue", "DoStep")
  @js.native
  val DoStep: `true` = js.native
  
  @JSImport("rc-motion/es/hooks/useStepQueue", "SkipStep")
  @js.native
  val SkipStep: `false` = js.native
  
  @scala.inline
  def isActive(step: StepStatus): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isActive")(step.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
