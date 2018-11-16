package typings
package restifyDashPluginsLib.restifyDashPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MetricsCallback extends js.Object {
  /**
     *  An error if the request had an error
     */
  var err: nodeLib.Error
  var metrics: MetricsCallbackOptions
  var req: restifyLib.restifyMod.Request
  var res: restifyLib.restifyMod.Response
  /**
     * The route obj that serviced the request
     */
  var route: restifyLib.restifyMod.Route
}

