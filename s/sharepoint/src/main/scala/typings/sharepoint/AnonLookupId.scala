package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLookupId extends js.Object {
  var LookupId: Double
  var LookupValue: String
}

object AnonLookupId {
  @scala.inline
  def apply(LookupId: Double, LookupValue: String): AnonLookupId = {
    val __obj = js.Dynamic.literal(LookupId = LookupId.asInstanceOf[js.Any], LookupValue = LookupValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLookupId]
  }
}

