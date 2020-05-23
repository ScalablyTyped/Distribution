package typings.skyway

import typings.skyway.skywayStrings.close
import typings.skyway.skywayStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataConnection extends js.Object {
  var metadata: js.Any = js.native
  var open: Boolean = js.native
  var peer: String = js.native
  var remoteId: String = js.native
  def close(): js.UndefOr[Unit] = js.native
  def on(event: String, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_close(event: close, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  def send(data: js.Any): Unit = js.native
}

