package typings.pug

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: String
  var dependencies: js.Array[String]
}

object AnonBody {
  @scala.inline
  def apply(body: String, dependencies: js.Array[String]): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

