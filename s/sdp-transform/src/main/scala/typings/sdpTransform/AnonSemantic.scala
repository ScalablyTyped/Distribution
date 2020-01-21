package typings.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSemantic extends js.Object {
  var semantic: String
  var token: String
}

object AnonSemantic {
  @scala.inline
  def apply(semantic: String, token: String): AnonSemantic = {
    val __obj = js.Dynamic.literal(semantic = semantic.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSemantic]
  }
}

