package typings.sharepoint.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientLookupValue extends js.Object {
  var LookupId: Double
  var LookupValue: String
}

object ClientLookupValue {
  @scala.inline
  def apply(LookupId: Double, LookupValue: String): ClientLookupValue = {
    val __obj = js.Dynamic.literal(LookupId = LookupId, LookupValue = LookupValue)
  
    __obj.asInstanceOf[ClientLookupValue]
  }
}

