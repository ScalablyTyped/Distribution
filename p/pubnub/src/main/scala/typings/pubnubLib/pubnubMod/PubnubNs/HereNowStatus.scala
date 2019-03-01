package typings
package pubnubLib.pubnubMod.PubnubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HereNowStatus extends js.Object {
  var error: scala.Boolean
  var operation: java.lang.String
   // see Pubnub.Operations;
  var statusCode: scala.Double
}

object HereNowStatus {
  @scala.inline
  def apply(error: scala.Boolean, operation: java.lang.String, statusCode: scala.Double): HereNowStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("operation")(operation)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[HereNowStatus]
  }
}

