package typings.raygun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdentifier extends js.Object {
  var identifier: String
}

object AnonIdentifier {
  @scala.inline
  def apply(identifier: String): AnonIdentifier = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIdentifier]
  }
}

