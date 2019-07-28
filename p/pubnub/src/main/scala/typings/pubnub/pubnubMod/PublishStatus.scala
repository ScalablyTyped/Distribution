package typings.pubnub.pubnubMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishStatus extends js.Object {
   // see Pubnub.Operations
  var category: String
   // see Pubnub.Categories;
  var error: Boolean
  var errorData: Error
  var operation: String
}

object PublishStatus {
  @scala.inline
  def apply(category: String, error: Boolean, errorData: Error, operation: String): PublishStatus = {
    val __obj = js.Dynamic.literal(category = category, error = error, errorData = errorData, operation = operation)
  
    __obj.asInstanceOf[PublishStatus]
  }
}

