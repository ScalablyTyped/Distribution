package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteObjectResponse extends js.Object {
  var data: Null
  var status: Double
}

object DeleteObjectResponse {
  @scala.inline
  def apply(data: Null, status: Double): DeleteObjectResponse = {
    val __obj = js.Dynamic.literal(data = data, status = status)
  
    __obj.asInstanceOf[DeleteObjectResponse]
  }
}

