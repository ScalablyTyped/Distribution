package typings
package pubnubLib.pubnubMod.PubnubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrantStatus extends js.Object {
  var error: scala.Boolean
  var operation: java.lang.String
  var statusCode: scala.Double
}

object GrantStatus {
  @scala.inline
  def apply(error: scala.Boolean, operation: java.lang.String, statusCode: scala.Double): GrantStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("operation")(operation)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[GrantStatus]
  }
}

