package typings
package rmcDashAlignLib.libAlignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Align
  extends reactLib.reactMod.Component[IAlignProps, js.Any, js.Any] {
  var bufferMonitor: js.Any = js.native
  var resizeHandler: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MAlign(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAlign(prevProps: js.Any): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAlign(): scala.Unit = js.native
  def forceAlign(): scala.Unit = js.native
  def startMonitorWindowResize(): scala.Unit = js.native
  def stopMonitorWindowResize(): scala.Unit = js.native
}

