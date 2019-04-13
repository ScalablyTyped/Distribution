package typings
package reactDashSelectLib.libAnimatedTransitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/lib/animated/transitions", "Collapse")
@js.native
class Collapse ()
  extends reactLib.reactMod.Component[CollapseProps, CollapseState, js.Any] {
  var duration: scala.Double = js.native
  var transition: reactDashSelectLib.Anon_Exited = js.native
  // get base styles
  def getStyle(width: Width): js.Any = js.native
  // get transition styles
  def getTransition(state: TransitionState): js.Any = js.native
  // width must be calculated; cannot transition from `undefined` to `number`
  def getWidth(ref: reactLib.reactMod.Ref[_]): scala.Unit = js.native
}

