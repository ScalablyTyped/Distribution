package typings.projectOxford.mod.PersonResponses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Create extends js.Object {
  var personId: String
}

object Create {
  @scala.inline
  def apply(personId: String): Create = {
    val __obj = js.Dynamic.literal(personId = personId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Create]
  }
}

