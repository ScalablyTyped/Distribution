package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioContextInfo extends js.Object {
  var currentTime: js.UndefOr[scala.Double] = js.undefined
  var sampleRate: js.UndefOr[scala.Double] = js.undefined
}

object AudioContextInfo {
  @scala.inline
  def apply(currentTime: scala.Int | scala.Double = null, sampleRate: scala.Int | scala.Double = null): AudioContextInfo = {
    val __obj = js.Dynamic.literal()
    if (currentTime != null) __obj.updateDynamic("currentTime")(currentTime.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioContextInfo]
  }
}

