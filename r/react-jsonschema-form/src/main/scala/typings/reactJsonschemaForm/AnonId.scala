package typings.reactJsonschemaForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: String
  var required: Boolean
  var title: String
}

object AnonId {
  @scala.inline
  def apply(id: String, required: Boolean, title: String): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonId]
  }
}

