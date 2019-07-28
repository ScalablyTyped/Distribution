package typings.rmcDashTrigger.esMod

import typings.react.reactMod.Component
import typings.rmcDashTrigger.esPropsTypeMod.ITriggerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerWrap
  extends Component[ITriggerProps, js.Any, js.Any] {
  var triggerRef: js.Any = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTriggerWrap(nextProps: js.Any): Unit = js.native
  def onClose(): Unit = js.native
  def onTargetClick(): Unit = js.native
  def setPopupVisible(visible: js.Any): Unit = js.native
}

