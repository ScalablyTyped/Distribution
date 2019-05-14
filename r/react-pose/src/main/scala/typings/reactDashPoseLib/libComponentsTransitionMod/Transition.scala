package typings
package reactDashPoseLib.libComponentsTransitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transition
  extends reactLib.reactMod.Component[
      reactDashPoseLib.libComponentsTransitionTypesMod.Props, 
      reactDashPoseLib.libComponentsTransitionTypesMod.State, 
      js.Any
    ] {
  @JSName("state")
  var state_Transition: reactDashPoseLib.libComponentsTransitionTypesMod.State = js.native
  def removeChild(key: java.lang.String): scala.Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MTransition(
    nextProps: reactDashPoseLib.libComponentsTransitionTypesMod.Props,
    nextState: reactDashPoseLib.libComponentsTransitionTypesMod.State
  ): scala.Boolean = js.native
}

