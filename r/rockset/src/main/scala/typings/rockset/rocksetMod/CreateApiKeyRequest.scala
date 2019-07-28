package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApiKeyRequest extends js.Object {
  // descriptive label
  var name: String
}

object CreateApiKeyRequest {
  @scala.inline
  def apply(name: String): CreateApiKeyRequest = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[CreateApiKeyRequest]
  }
}

