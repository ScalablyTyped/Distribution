package typings
package restifyDashPluginsLib.restifyDashPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsCallback extends js.Object {
  /**
    *  An error if the request had an error
    */
  var err: stdLib.Error
  var metrics: MetricsCallbackOptions
  var req: restifyLib.restifyMod.Request
  var res: restifyLib.restifyMod.Response
  /**
    * The route obj that serviced the request
    */
  var route: restifyLib.restifyMod.Route
}

object MetricsCallback {
  @scala.inline
  def apply(
    err: stdLib.Error,
    metrics: MetricsCallbackOptions,
    req: restifyLib.restifyMod.Request,
    res: restifyLib.restifyMod.Response,
    route: restifyLib.restifyMod.Route
  ): MetricsCallback = {
    val __obj = js.Dynamic.literal(err = err, metrics = metrics, req = req, res = res, route = route)
  
    __obj.asInstanceOf[MetricsCallback]
  }
}

