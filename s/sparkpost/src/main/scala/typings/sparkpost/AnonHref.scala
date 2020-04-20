package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHref extends js.Object {
  var href: String
  var method: js.Array[String]
  var rel: String
}

object AnonHref {
  @scala.inline
  def apply(href: String, method: js.Array[String], rel: String): AnonHref = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHref]
  }
}

