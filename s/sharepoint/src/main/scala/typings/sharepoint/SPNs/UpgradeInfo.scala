package typings.sharepoint.SPNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UpgradeInfo")
@js.native
class UpgradeInfo () extends ClientValueObject {
  def get_errorFile(): String = js.native
  def get_errors(): Double = js.native
  def get_lastUpdated(): Date = js.native
  def get_logFile(): String = js.native
  def get_requestDate(): Date = js.native
  def get_retryCount(): Double = js.native
  def get_startTime(): Date = js.native
  def get_status(): UpgradeStatus = js.native
  def get_upgradeType(): UpgradeType = js.native
  def get_warnings(): Double = js.native
}

