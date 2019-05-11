package typings
package rmcDashFeedbackLib.esTouchFeedbackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchFeedback
  extends reactLib.reactMod.Component[
      rmcDashFeedbackLib.esPropTypesMod.ITouchProps, 
      rmcDashFeedbackLib.esPropTypesMod.ITouchState, 
      js.Any
    ] {
  @JSName("state")
  var state_TouchFeedback: rmcDashFeedbackLib.Anon_Active = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTouchFeedback(): scala.Unit = js.native
  def onMouseDown(e: js.Any): scala.Unit = js.native
  def onMouseLeave(e: js.Any): scala.Unit = js.native
  def onMouseUp(e: js.Any): scala.Unit = js.native
  def onTouchCancel(e: js.Any): scala.Unit = js.native
  def onTouchEnd(e: js.Any): scala.Unit = js.native
  def onTouchMove(e: js.Any): scala.Unit = js.native
  def onTouchStart(e: js.Any): scala.Unit = js.native
  def triggerEvent(`type`: js.Any, isActive: js.Any, ev: js.Any): scala.Unit = js.native
}

