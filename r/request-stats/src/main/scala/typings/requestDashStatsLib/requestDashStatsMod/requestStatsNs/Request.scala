package typings
package requestDashStatsLib.requestDashStatsMod.requestStatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  /**
    * Returns a progress object if called while a HTTP request is in progress.
    * If called multiple times, the returned progress object will contain the delta of the previous
    * call to `.progress()`.
    */
  def progress(): Progress
}

