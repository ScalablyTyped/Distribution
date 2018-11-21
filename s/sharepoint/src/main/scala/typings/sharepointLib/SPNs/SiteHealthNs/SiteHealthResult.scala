package typings
package sharepointLib.SPNs.SiteHealthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.SiteHealth.SiteHealthResult")
@js.native
class SiteHealthResult ()
  extends sharepointLib.SPNs.ClientValueObject {
  def get_messageAsText(): java.lang.String = js.native
  def get_ruleHelpLink(): java.lang.String = js.native
  def get_ruleId(): sharepointLib.SPNs.Guid = js.native
  def get_ruleIsRepairable(): scala.Boolean = js.native
  def get_ruleName(): java.lang.String = js.native
  def get_status(): SiteHealthStatusType = js.native
  def get_timeStamp(): microsoftDashAjaxLib.Date = js.native
  def set_status(value: SiteHealthStatusType): scala.Unit = js.native
  def set_timeStamp(value: microsoftDashAjaxLib.Date): scala.Unit = js.native
}

