package typings.sdpTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Semantic extends js.Object {
  var semantic: String
  var token: String
}

object Semantic {
  @scala.inline
  def apply(semantic: String, token: String): Semantic = {
    val __obj = js.Dynamic.literal(semantic = semantic.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Semantic]
  }
}

