package typings
package pubnubLib.pubnubMod.PubnubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhereNowStatus extends js.Object {
  var error: scala.Boolean
  var operation: java.lang.String
  var statusCode: scala.Double
}

object WhereNowStatus {
  @scala.inline
  def apply(error: scala.Boolean, operation: java.lang.String, statusCode: scala.Double): WhereNowStatus = {
    val __obj = js.Dynamic.literal(error = error, operation = operation, statusCode = statusCode)
  
    __obj.asInstanceOf[WhereNowStatus]
  }
}

