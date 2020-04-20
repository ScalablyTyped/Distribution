package typings.sntp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeOptions extends js.Object {
  var d: Double
  var isValid: Boolean
  var leapIndicator: String
  var mode: String
  var originateTimestamp: Double
  var pollInterval: Double
  var precision: Double
  var receiveTimestamp: Double
  var receivedLocally: Double
  var referenceId: String
  var referenceTimestamp: Double
  var rootDelay: Double
  var rootDispersion: Double
  var stratum: String
  var t: Double
  var transmitTimestamp: Double
  var version: Double
}

object TimeOptions {
  @scala.inline
  def apply(
    d: Double,
    isValid: Boolean,
    leapIndicator: String,
    mode: String,
    originateTimestamp: Double,
    pollInterval: Double,
    precision: Double,
    receiveTimestamp: Double,
    receivedLocally: Double,
    referenceId: String,
    referenceTimestamp: Double,
    rootDelay: Double,
    rootDispersion: Double,
    stratum: String,
    t: Double,
    transmitTimestamp: Double,
    version: Double
  ): TimeOptions = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], leapIndicator = leapIndicator.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], originateTimestamp = originateTimestamp.asInstanceOf[js.Any], pollInterval = pollInterval.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], receiveTimestamp = receiveTimestamp.asInstanceOf[js.Any], receivedLocally = receivedLocally.asInstanceOf[js.Any], referenceId = referenceId.asInstanceOf[js.Any], referenceTimestamp = referenceTimestamp.asInstanceOf[js.Any], rootDelay = rootDelay.asInstanceOf[js.Any], rootDispersion = rootDispersion.asInstanceOf[js.Any], stratum = stratum.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], transmitTimestamp = transmitTimestamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeOptions]
  }
}

