package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LookupId extends js.Object {
  var LookupId: scala.Double
  var LookupValue: java.lang.String
}

object Anon_LookupId {
  @scala.inline
  def apply(LookupId: scala.Double, LookupValue: java.lang.String): Anon_LookupId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LookupId")(LookupId)
    __obj.updateDynamic("LookupValue")(LookupValue)
    __obj.asInstanceOf[Anon_LookupId]
  }
}

