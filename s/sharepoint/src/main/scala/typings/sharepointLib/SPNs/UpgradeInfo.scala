package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UpgradeInfo")
@js.native
class UpgradeInfo () extends ClientValueObject {
  def get_errorFile(): java.lang.String = js.native
  def get_errors(): scala.Double = js.native
  def get_lastUpdated(): stdLib.Date = js.native
  def get_logFile(): java.lang.String = js.native
  def get_requestDate(): stdLib.Date = js.native
  def get_retryCount(): scala.Double = js.native
  def get_startTime(): stdLib.Date = js.native
  def get_status(): UpgradeStatus = js.native
  def get_upgradeType(): UpgradeType = js.native
  def get_warnings(): scala.Double = js.native
}

