package typings
package reconnectDashCoreLib.reconnectDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance[ArgType, ConnectionType]
  extends nodeLib.eventsMod.EventEmitter {
  val connected: scala.Boolean = js.native
  var reconnect: scala.Boolean = js.native
  def connect(opts: ArgType): this.type = js.native
  def disconnect(): this.type = js.native
  def listen(opts: ArgType): this.type = js.native
  @JSName("on")
  def on_backoff(
    event: reconnectDashCoreLib.reconnectDashCoreLibStrings.backoff,
    cb: js.Function3[
      /* n */ scala.Double, 
      /* delay */ scala.Double, 
      /* err */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_connect(
    event: reconnectDashCoreLib.reconnectDashCoreLibStrings.connect,
    cb: js.Function1[/* con */ ConnectionType, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_connection(
    event: reconnectDashCoreLib.reconnectDashCoreLibStrings.connection,
    cb: js.Function1[/* con */ ConnectionType, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_disconnect(
    event: reconnectDashCoreLib.reconnectDashCoreLibStrings.disconnect,
    cb: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: reconnectDashCoreLib.reconnectDashCoreLibStrings.error,
    cb: js.Function1[/* err */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_fail(
    event: reconnectDashCoreLib.reconnectDashCoreLibStrings.fail,
    cb: js.Function1[/* err */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_reconnect(
    event: reconnectDashCoreLib.reconnectDashCoreLibStrings.reconnect,
    cb: js.Function2[/* n */ scala.Double, /* delay */ scala.Double, scala.Unit]
  ): this.type = js.native
  def reset(): scala.Unit = js.native
}

