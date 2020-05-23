package typings.primus.mod

import typings.node.streamMod.Stream
import typings.primus.mod.emits.fn
import typings.primus.mod.emits.parser
import typings.primus.primusStrings.`reconnect failed`
import typings.primus.primusStrings.`reconnect scheduled`
import typings.primus.primusStrings.`reconnect timeout`
import typings.primus.primusStrings.data
import typings.primus.primusStrings.end
import typings.primus.primusStrings.error
import typings.primus.primusStrings.open
import typings.primus.primusStrings.reconnect
import typings.primus.primusStrings.reconnected
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("primus", "Socket")
@js.native
class Socket () extends Stream {
  def this(options: SocketOptions) = this()
  def this(url: String) = this()
  def this(url: String, options: SocketOptions) = this()
  @JSName("emits")
  var emits_Original: typings.primus.mod.emits.emits = js.native
  def destroy(): Unit = js.native
  def emits(event: String, arg1: js.Any, parser: parser): fn = js.native
  def emits(event: String, args: js.Any*): fn = js.native
  def emits(event: String, parser: parser): fn = js.native
  def end(): this.type = js.native
  def end(data: js.Any): this.type = js.native
  def id(fn: js.Function1[/* id */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, handler: js.Function1[/* message */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, handler: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, handler: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_open(event: open, handler: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_reconnect(event: reconnect, handler: js.Function1[/* opts */ ReconnectEventOpts, Unit]): this.type = js.native
  @JSName("on")
  def on_reconnected(event: reconnected, handler: js.Function1[/* opts */ ReconnectEventOpts, Unit]): this.type = js.native
  @JSName("on")
  def on_reconnectfailed(
    event: `reconnect failed`,
    handler: js.Function2[/* err */ Error, /* opts */ ReconnectEventOpts, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_reconnectscheduled(event: `reconnect scheduled`, handler: js.Function1[/* opts */ ReconnectEventOpts, Unit]): this.type = js.native
  @JSName("on")
  def on_reconnecttimeout(
    event: `reconnect timeout`,
    handler: js.Function2[/* err */ Error, /* opts */ ReconnectEventOpts, Unit]
  ): this.type = js.native
  def open(): Unit = js.native
  def write(data: js.Any): this.type = js.native
}

