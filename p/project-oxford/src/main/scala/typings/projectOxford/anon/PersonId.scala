package typings.projectOxford.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonId extends js.Object {
  var personId: String
}

object PersonId {
  @scala.inline
  def apply(personId: String): PersonId = {
    val __obj = js.Dynamic.literal(personId = personId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonId]
  }
}

