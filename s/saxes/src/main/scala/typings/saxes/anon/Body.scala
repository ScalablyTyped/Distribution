package typings.saxes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: String
  var target: String
}

object Body {
  @scala.inline
  def apply(body: String, target: String): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

