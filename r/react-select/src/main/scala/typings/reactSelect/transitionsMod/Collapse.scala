package typings.reactSelect.transitionsMod

import typings.react.mod.Component
import typings.react.mod.Ref
import typings.reactSelect.anon.Exited
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-select/src/animated/transitions", "Collapse")
@js.native
class Collapse ()
  extends Component[CollapseProps, CollapseState, js.Any] {
  
  var duration: Double = js.native
  
  // get base styles
  def getStyle(width: Width): js.Any = js.native
  
  // get transition styles
  def getTransition(state: TransitionState): js.Any = js.native
  
  // width must be calculated; cannot transition from `undefined` to `number`
  def getWidth(ref: Ref[_]): Unit = js.native
  
  var transition: Exited = js.native
}
