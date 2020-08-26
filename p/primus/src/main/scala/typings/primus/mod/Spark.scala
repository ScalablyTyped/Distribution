package typings.primus.mod

import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.IncomingMessage
import typings.node.querystringMod.ParsedUrlQuery
import typings.node.streamMod.Stream
import typings.primus.anon.Ip
import typings.primus.anon.Reconnect
import typings.primus.mod.emits.fn
import typings.primus.mod.emits.parser
import typings.primus.primusStrings.data
import typings.primus.primusStrings.end
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spark extends Stream {
  var address: Ip = js.native
  @JSName("emits")
  var emits_Original: typings.primus.mod.emits.emits = js.native
  var headers: IncomingHttpHeaders = js.native
  var id: String = js.native
  var query: ParsedUrlQuery = js.native
  var request: IncomingMessage = js.native
  var socket: js.Any = js.native
  def emits(event: String, arg1: js.Any, parser: parser): fn = js.native
  def emits(event: String, args: js.Any*): fn = js.native
  def emits(event: String, parser: parser): fn = js.native
  def end(): Unit = js.native
  def end(data: js.UndefOr[scala.Nothing], options: Reconnect): Unit = js.native
  def end(data: js.Any): Unit = js.native
  def end(data: js.Any, options: Reconnect): Unit = js.native
  @JSName("on")
  def on_data(event: data, handler: js.Function1[/* message */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, handler: js.Function0[Unit]): this.type = js.native
  def write(data: js.Any): Unit = js.native
}

