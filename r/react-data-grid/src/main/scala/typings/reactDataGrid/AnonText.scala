package typings.reactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonText extends js.Object {
  var id: String
  var text: String
  var title: String
  var value: String
}

object AnonText {
  @scala.inline
  def apply(id: String, text: String, title: String, value: String): AnonText = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonText]
  }
}

