package typings.rcMotion

import typings.rcMotion.interfaceMod.MotionStatus
import typings.rcMotion.interfaceMod.StepStatus
import typings.rcMotion.rcMotionBooleans.`false`
import typings.rcMotion.rcMotionBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useStepQueueMod {
  
  @JSImport("rc-motion/es/hooks/useStepQueue", JSImport.Default)
  @js.native
  def default(
    status: MotionStatus,
    callback: js.Function1[/* step */ StepStatus, js.Promise[Unit] | Unit | `false` | `true`]
  ): js.Tuple2[js.Function0[Unit], StepStatus] = js.native
  
  @JSImport("rc-motion/es/hooks/useStepQueue", "DoStep")
  @js.native
  val DoStep: `true` = js.native
  
  @JSImport("rc-motion/es/hooks/useStepQueue", "SkipStep")
  @js.native
  val SkipStep: `false` = js.native
  
  @JSImport("rc-motion/es/hooks/useStepQueue", "isActive")
  @js.native
  def isActive(step: StepStatus): Boolean = js.native
}
