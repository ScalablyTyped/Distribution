package typings
package rmcDashTriggerLib.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerWrap
  extends reactLib.reactMod.Component[rmcDashTriggerLib.esPropsTypeMod.ITriggerProps, js.Any, js.Any] {
  var triggerRef: js.Any = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTriggerWrap(nextProps: js.Any): scala.Unit = js.native
  def onClose(): scala.Unit = js.native
  def onTargetClick(): scala.Unit = js.native
  def setPopupVisible(visible: js.Any): scala.Unit = js.native
}

