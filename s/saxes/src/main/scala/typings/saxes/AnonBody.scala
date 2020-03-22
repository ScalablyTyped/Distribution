package typings.saxes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: String
  var target: String
}

object AnonBody {
  @scala.inline
  def apply(body: String, target: String): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBody]
  }
}

