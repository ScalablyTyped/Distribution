package typings
package pubnubLib.pubnubMod.PubnubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishStatus extends js.Object {
   // see Pubnub.Operations
  var category: java.lang.String
   // see Pubnub.Categories;
  var error: scala.Boolean
  var errorData: stdLib.Error
  var operation: java.lang.String
}

object PublishStatus {
  @scala.inline
  def apply(
    category: java.lang.String,
    error: scala.Boolean,
    errorData: stdLib.Error,
    operation: java.lang.String
  ): PublishStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("category")(category)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("errorData")(errorData)
    __obj.updateDynamic("operation")(operation)
    __obj.asInstanceOf[PublishStatus]
  }
}

