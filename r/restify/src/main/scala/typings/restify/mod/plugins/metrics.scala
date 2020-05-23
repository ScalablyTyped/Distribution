package typings.restify.mod.plugins

import typings.restify.anon.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify", "plugins.metrics")
@js.native
object metrics extends js.Object {
  /**
    * Listens to the server's after event and emits information about that request (5.x compatible only).
    *
    * ```
    * server.on('after', plugins.metrics({ server }, (err, metrics, req, res, route) =>
    * {
    *    // metrics is an object containing information about the request
    * }));
    * ```
    */
  def apply(opts: Server, callback: MetricsCallback): js.Function1[/* repeated */ js.Any, Unit] = js.native
}

