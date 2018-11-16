package typings
package sharepointLib.SPNs.SiteHealthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.SiteHealth.SiteHealthSummary")
@js.native
class SiteHealthSummary ()
  extends sharepointLib.SPNs.ClientObject {
  def get_failedErrorCount(): scala.Double = js.native
  def get_failedWarningCount(): scala.Double = js.native
  def get_passedCount(): scala.Double = js.native
  def get_results(): js.Array[SiteHealthResult] = js.native
}

