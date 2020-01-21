package typings.rmcDialog.modalMod

import typings.react.mod.Component
import typings.rmcDialog.rmcDialogNumbers.`0`
import typings.rmcDialog.rmcDialogNumbers.`1.05`
import typings.rmcDialog.rmcDialogNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RCModal
  extends Component[IModalPropTypes, js.Any, js.Any] {
  var animDialog: js.Any = js.native
  var animMask: js.Any = js.native
  def animateDialog(visible: js.Any): Unit = js.native
  def animateMask(visible: js.Any): Unit = js.native
  def close(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MRCModal(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MRCModal(prevProps: js.Any): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MRCModal(nextProps: js.Any): Unit = js.native
  def getOpacity(visible: js.Any): `0` | `1` = js.native
  def getPosition(visible: js.Any): Double = js.native
  def getScale(visible: js.Any): `1` | `1.05` = js.native
  def onMaskClose(): Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MRCModal(nextProps: js.Any, nextState: js.Any): Boolean = js.native
  def stopDialogAnim(): Unit = js.native
  def stopMaskAnim(): Unit = js.native
}

