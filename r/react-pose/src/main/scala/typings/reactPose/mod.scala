package typings.reactPose

import typings.reactPose.anon.EnterAfterExit
import typings.reactPose.anon.FlipMove
import typings.reactPose.anon.PartialState
import typings.reactPose.posedMod.Posed
import typings.reactPose.transitionTypesMod.Props
import typings.reactPose.transitionTypesMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-pose", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class PoseGroup ()
    extends typings.reactPose.poseGroupMod.default
  
  @js.native
  class Transition ()
    extends typings.reactPose.transitionMod.default
  
  val default: Posed = js.native
  /* static members */
  @js.native
  object PoseGroup extends js.Object {
    var defaultProps: FlipMove = js.native
  }
  
  /* static members */
  @js.native
  object Transition extends js.Object {
    var defaultProps: EnterAfterExit = js.native
    def getDerivedStateFromProps(props: Props, state: State): PartialState = js.native
  }
  
}

