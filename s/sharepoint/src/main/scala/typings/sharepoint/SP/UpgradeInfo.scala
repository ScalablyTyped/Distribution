package typings.sharepoint.SP

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpgradeInfo extends ClientValueObject {
  def get_errorFile(): String
  def get_errors(): Double
  def get_lastUpdated(): Date
  def get_logFile(): String
  def get_requestDate(): Date
  def get_retryCount(): Double
  def get_startTime(): Date
  def get_status(): UpgradeStatus
  def get_upgradeType(): UpgradeType
  def get_warnings(): Double
}

object UpgradeInfo {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_errorFile: () => String,
    get_errors: () => Double,
    get_lastUpdated: () => Date,
    get_logFile: () => String,
    get_requestDate: () => Date,
    get_retryCount: () => Double,
    get_startTime: () => Date,
    get_status: () => UpgradeStatus,
    get_typeId: () => String,
    get_upgradeType: () => UpgradeType,
    get_warnings: () => Double,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): UpgradeInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_errorFile = js.Any.fromFunction0(get_errorFile), get_errors = js.Any.fromFunction0(get_errors), get_lastUpdated = js.Any.fromFunction0(get_lastUpdated), get_logFile = js.Any.fromFunction0(get_logFile), get_requestDate = js.Any.fromFunction0(get_requestDate), get_retryCount = js.Any.fromFunction0(get_retryCount), get_startTime = js.Any.fromFunction0(get_startTime), get_status = js.Any.fromFunction0(get_status), get_typeId = js.Any.fromFunction0(get_typeId), get_upgradeType = js.Any.fromFunction0(get_upgradeType), get_warnings = js.Any.fromFunction0(get_warnings), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[UpgradeInfo]
  }
}

