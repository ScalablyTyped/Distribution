package typings.restifyPlugins.mod

import typings.restify.mod.Request
import typings.restify.mod.Response
import typings.restify.mod.Route
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsCallback extends js.Object {
  /**
    *  An error if the request had an error
    */
  var err: Error
  var metrics: MetricsCallbackOptions
  var req: Request
  var res: Response
  /**
    * The route obj that serviced the request
    */
  var route: Route
}

object MetricsCallback {
  @scala.inline
  def apply(err: Error, metrics: MetricsCallbackOptions, req: Request, res: Response, route: Route): MetricsCallback = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MetricsCallback]
  }
}

