package typings.serverless.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodString extends js.Object {
  var method: String
}

object MethodString {
  @scala.inline
  def apply(method: String): MethodString = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodString]
  }
}

