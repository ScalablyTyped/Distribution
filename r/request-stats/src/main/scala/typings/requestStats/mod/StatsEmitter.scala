package typings.requestStats.mod

import typings.node.eventsMod.EventEmitter
import typings.requestStats.requestStatsStrings.complete
import typings.requestStats.requestStatsStrings.request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatsEmitter extends EventEmitter {
  
  @JSName("addListener")
  def addListener_complete(event: complete, listener: StatsCallback): this.type = js.native
  @JSName("addListener")
  def addListener_request(event: request, listener: js.Function1[/* req */ Request, Unit]): this.type = js.native
  
  @JSName("emit")
  def emit_complete(event: complete, stats: Stats): Boolean = js.native
  @JSName("emit")
  def emit_request(event: request, req: Request): Boolean = js.native
  
  @JSName("listenerCount")
  def listenerCount_complete(`type`: complete): Double = js.native
  @JSName("listenerCount")
  def listenerCount_request(`type`: request): Double = js.native
  
  @JSName("listeners")
  def listeners_complete(event: complete): js.Array[StatsCallback] = js.native
  @JSName("listeners")
  def listeners_request(event: request): js.Array[js.Function1[/* req */ Request, Unit]] = js.native
  
  @JSName("off")
  def off_complete(event: complete, listener: StatsCallback): this.type = js.native
  @JSName("off")
  def off_request(event: request, listener: js.Function1[/* req */ Request, Unit]): this.type = js.native
  
  @JSName("on")
  def on_complete(event: complete, listener: StatsCallback): this.type = js.native
  @JSName("on")
  def on_request(event: request, listener: js.Function1[/* req */ Request, Unit]): this.type = js.native
  
  @JSName("once")
  def once_complete(event: complete, listener: StatsCallback): this.type = js.native
  @JSName("once")
  def once_request(event: request, listener: js.Function1[/* req */ Request, Unit]): this.type = js.native
  
  @JSName("prependListener")
  def prependListener_complete(event: complete, listener: StatsCallback): this.type = js.native
  @JSName("prependListener")
  def prependListener_request(event: request, listener: js.Function1[/* req */ Request, Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_complete(event: complete, listener: StatsCallback): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_request(event: request, listener: js.Function1[/* req */ Request, Unit]): this.type = js.native
  
  @JSName("rawListeners")
  def rawListeners_complete(event: complete): js.Array[StatsCallback] = js.native
  @JSName("rawListeners")
  def rawListeners_request(event: request): js.Array[js.Function1[/* req */ Request, Unit]] = js.native
  
  @JSName("removeAllListeners")
  def removeAllListeners_complete(event: complete): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_request(event: request): this.type = js.native
  
  @JSName("removeListener")
  def removeListener_complete(event: complete, listener: StatsCallback): this.type = js.native
  @JSName("removeListener")
  def removeListener_request(event: request, listener: js.Function1[/* req */ Request, Unit]): this.type = js.native
}
