package typings.rmcDashFeedback.esTouchFeedbackMod

import typings.react.reactMod.Component
import typings.rmcDashFeedback.Anon_Active
import typings.rmcDashFeedback.esPropTypesMod.ITouchProps
import typings.rmcDashFeedback.esPropTypesMod.ITouchState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchFeedback
  extends Component[ITouchProps, ITouchState, js.Any] {
  @JSName("state")
  var state_TouchFeedback: Anon_Active = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTouchFeedback(): Unit = js.native
  def onMouseDown(e: js.Any): Unit = js.native
  def onMouseLeave(e: js.Any): Unit = js.native
  def onMouseUp(e: js.Any): Unit = js.native
  def onTouchCancel(e: js.Any): Unit = js.native
  def onTouchEnd(e: js.Any): Unit = js.native
  def onTouchMove(e: js.Any): Unit = js.native
  def onTouchStart(e: js.Any): Unit = js.native
  def triggerEvent(`type`: js.Any, isActive: js.Any, ev: js.Any): Unit = js.native
}

