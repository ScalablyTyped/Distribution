package typings.reactJsonschemaForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var id: String
  var required: Boolean
  var title: String
}

object Id {
  @scala.inline
  def apply(id: String, required: Boolean, title: String): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

