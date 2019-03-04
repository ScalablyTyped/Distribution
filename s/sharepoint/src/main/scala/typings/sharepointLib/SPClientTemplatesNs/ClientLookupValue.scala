package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientLookupValue extends js.Object {
  var LookupId: scala.Double
  var LookupValue: java.lang.String
}

object ClientLookupValue {
  @scala.inline
  def apply(LookupId: scala.Double, LookupValue: java.lang.String): ClientLookupValue = {
    val __obj = js.Dynamic.literal(LookupId = LookupId, LookupValue = LookupValue)
  
    __obj.asInstanceOf[ClientLookupValue]
  }
}

