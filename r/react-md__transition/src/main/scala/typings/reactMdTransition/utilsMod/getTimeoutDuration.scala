package typings.reactMdTransition.utilsMod

import typings.reactMdTransition.constantsMod.TransitionStage
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/transition/types/utils", "getTimeoutDuration")
@js.native
object getTimeoutDuration extends js.Object {
  
  def apply(
    timeout: Required[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionStageTimeouts */ _
    ],
    appearing: Boolean,
    stage: TransitionStage
  ): Double = js.native
}
