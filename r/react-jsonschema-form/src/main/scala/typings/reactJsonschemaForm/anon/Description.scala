package typings.reactJsonschemaForm.anon

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  var description: String | ReactElement
  var id: String
}

object Description {
  @scala.inline
  def apply(description: String | ReactElement, id: String): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
}

