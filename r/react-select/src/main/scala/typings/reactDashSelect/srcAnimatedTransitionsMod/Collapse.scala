package typings.reactDashSelect.srcAnimatedTransitionsMod

import typings.react.reactMod.Component
import typings.react.reactMod.Ref
import typings.reactDashSelect.Anon_Exited
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/animated/transitions", "Collapse")
@js.native
class Collapse ()
  extends Component[CollapseProps, CollapseState, js.Any] {
  var duration: Double = js.native
  var transition: Anon_Exited = js.native
  // get base styles
  def getStyle(width: Width): js.Any = js.native
  // get transition styles
  def getTransition(state: TransitionState): js.Any = js.native
  // width must be calculated; cannot transition from `undefined` to `number`
  def getWidth(ref: Ref[_]): Unit = js.native
}

