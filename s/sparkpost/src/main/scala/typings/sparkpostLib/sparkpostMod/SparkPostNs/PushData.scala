package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushData extends js.Object {
  /** payload for APNs messages */
  var apns: js.UndefOr[js.Any] = js.undefined
  /** payload for GCM messages */
  var gcm: js.UndefOr[js.Any] = js.undefined
}

object PushData {
  @scala.inline
  def apply(apns: js.Any = null, gcm: js.Any = null): PushData = {
    val __obj = js.Dynamic.literal()
    if (apns != null) __obj.updateDynamic("apns")(apns)
    if (gcm != null) __obj.updateDynamic("gcm")(gcm)
    __obj.asInstanceOf[PushData]
  }
}

