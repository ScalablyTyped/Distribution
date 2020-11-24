package typings.rcMotion

import typings.rcMotion.interfaceMod.MotionStatus
import typings.rcMotion.interfaceMod.StepStatus
import typings.rcMotion.rcMotionBooleans.`false`
import typings.rcMotion.rcMotionBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-motion/es/hooks/useStepQueue", JSImport.Namespace)
@js.native
object useStepQueueMod extends js.Object {
  
  val DoStep: `true` = js.native
  
  val SkipStep: `false` = js.native
  
  def default(
    status: MotionStatus,
    callback: js.Function1[/* step */ StepStatus, js.Promise[Unit] | Unit | `false` | `true`]
  ): js.Tuple2[js.Function0[Unit], StepStatus] = js.native
  
  def isActive(step: StepStatus): Boolean = js.native
}
