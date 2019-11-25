package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// whereNow
trait WhereNowParameters extends js.Object {
  var uuid: js.UndefOr[String] = js.undefined
}

object WhereNowParameters {
  @scala.inline
  def apply(uuid: String = null): WhereNowParameters = {
    val __obj = js.Dynamic.literal()
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhereNowParameters]
  }
}

