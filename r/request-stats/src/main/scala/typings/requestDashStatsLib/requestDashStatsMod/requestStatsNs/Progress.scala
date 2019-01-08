package typings
package requestDashStatsLib.requestDashStatsMod.requestStatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  /**
    * `false` if the request is still in progress
    */
  var completed: scala.Boolean
  var req: requestDashStatsLib.Anon_TimeLeft
  var res: requestDashStatsLib.Anon_Bytes
  /**
    * The total time the reuqest have been in progress
    */
  var time: scala.Double
  /**
    * The time since previous call to `.progress()`
    */
  var timeDelta: scala.Double
}

