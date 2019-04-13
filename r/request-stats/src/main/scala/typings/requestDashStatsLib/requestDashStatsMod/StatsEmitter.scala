package typings
package requestDashStatsLib.requestDashStatsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatsEmitter
  extends nodeLib.eventsMod.EventEmitter {
  @JSName("addListener")
  def addListener_complete(event: requestDashStatsLib.requestDashStatsLibStrings.complete, listener: StatsCallback): this.type = js.native
  @JSName("addListener")
  def addListener_request(
    event: requestDashStatsLib.requestDashStatsLibStrings.request,
    listener: js.Function1[/* req */ Request, scala.Unit]
  ): this.type = js.native
  @JSName("emit")
  def emit_complete(event: requestDashStatsLib.requestDashStatsLibStrings.complete, stats: Stats): scala.Boolean = js.native
  @JSName("emit")
  def emit_request(event: requestDashStatsLib.requestDashStatsLibStrings.request, req: Request): scala.Boolean = js.native
  @JSName("listenerCount")
  def listenerCount_complete(`type`: requestDashStatsLib.requestDashStatsLibStrings.complete): scala.Double = js.native
  @JSName("listenerCount")
  def listenerCount_request(`type`: requestDashStatsLib.requestDashStatsLibStrings.request): scala.Double = js.native
  @JSName("listeners")
  def listeners_complete(event: requestDashStatsLib.requestDashStatsLibStrings.complete): js.Array[StatsCallback] = js.native
  @JSName("listeners")
  def listeners_request(event: requestDashStatsLib.requestDashStatsLibStrings.request): js.Array[js.Function1[/* req */ Request, scala.Unit]] = js.native
  @JSName("off")
  def off_complete(event: requestDashStatsLib.requestDashStatsLibStrings.complete, listener: StatsCallback): this.type = js.native
  @JSName("off")
  def off_request(
    event: requestDashStatsLib.requestDashStatsLibStrings.request,
    listener: js.Function1[/* req */ Request, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_complete(event: requestDashStatsLib.requestDashStatsLibStrings.complete, listener: StatsCallback): this.type = js.native
  @JSName("on")
  def on_request(
    event: requestDashStatsLib.requestDashStatsLibStrings.request,
    listener: js.Function1[/* req */ Request, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_complete(event: requestDashStatsLib.requestDashStatsLibStrings.complete, listener: StatsCallback): this.type = js.native
  @JSName("once")
  def once_request(
    event: requestDashStatsLib.requestDashStatsLibStrings.request,
    listener: js.Function1[/* req */ Request, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_complete(event: requestDashStatsLib.requestDashStatsLibStrings.complete, listener: StatsCallback): this.type = js.native
  @JSName("prependListener")
  def prependListener_request(
    event: requestDashStatsLib.requestDashStatsLibStrings.request,
    listener: js.Function1[/* req */ Request, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_complete(event: requestDashStatsLib.requestDashStatsLibStrings.complete, listener: StatsCallback): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_request(
    event: requestDashStatsLib.requestDashStatsLibStrings.request,
    listener: js.Function1[/* req */ Request, scala.Unit]
  ): this.type = js.native
  @JSName("rawListeners")
  def rawListeners_complete(event: requestDashStatsLib.requestDashStatsLibStrings.complete): js.Array[StatsCallback] = js.native
  @JSName("rawListeners")
  def rawListeners_request(event: requestDashStatsLib.requestDashStatsLibStrings.request): js.Array[js.Function1[/* req */ Request, scala.Unit]] = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_complete(event: requestDashStatsLib.requestDashStatsLibStrings.complete): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_request(event: requestDashStatsLib.requestDashStatsLibStrings.request): this.type = js.native
  @JSName("removeListener")
  def removeListener_complete(event: requestDashStatsLib.requestDashStatsLibStrings.complete, listener: StatsCallback): this.type = js.native
  @JSName("removeListener")
  def removeListener_request(
    event: requestDashStatsLib.requestDashStatsLibStrings.request,
    listener: js.Function1[/* req */ Request, scala.Unit]
  ): this.type = js.native
}

