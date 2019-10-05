package typings.reactDashPose

import typings.reactDashPose.libComponentsTransitionTypesMod.Props
import typings.reactDashPose.libComponentsTransitionTypesMod.State
import typings.reactDashPose.libPosedMod.Posed
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-pose", JSImport.Namespace)
@js.native
object reactDashPoseMod extends js.Object {
  @js.native
  class PoseGroup ()
    extends typings.reactDashPose.libComponentsTransitionPoseGroupMod.default
  
  @js.native
  class Transition ()
    extends typings.reactDashPose.libComponentsTransitionMod.default
  
  val default: Posed = js.native
  /* static members */
  @js.native
  object PoseGroup extends js.Object {
    var defaultProps: Anon_FlipMove = js.native
  }
  
  /* static members */
  @js.native
  object Transition extends js.Object {
    var defaultProps: Anon_EnterAfterExit = js.native
    def getDerivedStateFromProps(props: Props, state: State): Partial[State] = js.native
  }
  
}

