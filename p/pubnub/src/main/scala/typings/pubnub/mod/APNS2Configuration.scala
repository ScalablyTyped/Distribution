package typings.pubnub.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// APNS2
trait APNS2Configuration extends js.Object {
  var collapseId: js.UndefOr[String] = js.undefined
  var expirationDate: js.UndefOr[Date] = js.undefined
  var targets: js.Array[APNS2Target]
}

object APNS2Configuration {
  @scala.inline
  def apply(targets: js.Array[APNS2Target], collapseId: String = null, expirationDate: Date = null): APNS2Configuration = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    if (collapseId != null) __obj.updateDynamic("collapseId")(collapseId.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNS2Configuration]
  }
}

