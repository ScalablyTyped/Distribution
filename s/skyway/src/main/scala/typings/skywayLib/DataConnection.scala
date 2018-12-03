package typings
package skywayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DataConnection")
@js.native
class DataConnection () extends js.Object {
  var metadata: js.Any = js.native
  var open: scala.Boolean = js.native
  var peer: java.lang.String = js.native
  var remoteId: java.lang.String = js.native
  def close(): js.UndefOr[scala.Unit] = js.native
  def on(event: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_close(event: skywayLib.skywayLibStrings.close, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_data(event: skywayLib.skywayLibStrings.data, cb: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def send(data: js.Any): scala.Unit = js.native
}

