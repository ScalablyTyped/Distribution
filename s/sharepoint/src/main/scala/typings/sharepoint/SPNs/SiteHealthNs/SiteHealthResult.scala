package typings.sharepoint.SPNs.SiteHealthNs

import typings.sharepoint.SPNs.ClientValueObject
import typings.sharepoint.SPNs.Guid
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.SiteHealth.SiteHealthResult")
@js.native
class SiteHealthResult () extends ClientValueObject {
  def get_messageAsText(): String = js.native
  def get_ruleHelpLink(): String = js.native
  def get_ruleId(): Guid = js.native
  def get_ruleIsRepairable(): Boolean = js.native
  def get_ruleName(): String = js.native
  def get_status(): SiteHealthStatusType = js.native
  def get_timeStamp(): Date = js.native
  def set_status(value: SiteHealthStatusType): Unit = js.native
  def set_timeStamp(value: Date): Unit = js.native
}

