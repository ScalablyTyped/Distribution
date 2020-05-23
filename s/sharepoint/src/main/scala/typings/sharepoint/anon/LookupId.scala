package typings.sharepoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupId extends js.Object {
  var LookupId: Double
  var LookupValue: String
}

object LookupId {
  @scala.inline
  def apply(LookupId: Double, LookupValue: String): LookupId = {
    val __obj = js.Dynamic.literal(LookupId = LookupId.asInstanceOf[js.Any], LookupValue = LookupValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupId]
  }
}

