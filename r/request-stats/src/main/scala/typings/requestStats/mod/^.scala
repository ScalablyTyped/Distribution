package typings.requestStats.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("request-stats", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Attach request-stats to a single HTTP request.
    * If no callback is provided, you can later attach a listener on the "complete" event.
    *
    * @param req An instance of a HTTP request.
    * @param res An instance of a HTTP response.
    * @param statsCallback A callback which will be called with a stats object when the HTTP request completes.
    */
  def apply(req: IncomingMessage, res: ServerResponse): StatsEmitter = js.native
  def apply(req: IncomingMessage, res: ServerResponse, statsCallback: StatsCallback): StatsEmitter = js.native
  /**
    * Attach request-stats to a HTTP server.
    * If no callback is provided, you can later attach a listener on the "complete" event.
    *
    * @param server Initialize request-stats with an instance a HTTP server.
    * @param statsCallback A callback which will be called for each completed HTTP request with a stats object.
    */
  def apply(server: Server): StatsEmitter = js.native
  def apply(server: Server, statsCallback: StatsCallback): StatsEmitter = js.native
  def apply(server: typings.node.httpsMod.Server): StatsEmitter = js.native
  def apply(server: typings.node.httpsMod.Server, statsCallback: StatsCallback): StatsEmitter = js.native
}
