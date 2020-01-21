package typings.reactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdText extends js.Object {
  var id: String
  var text: String
  var title: String
  var value: String
}

object AnonIdText {
  @scala.inline
  def apply(id: String, text: String, title: String, value: String): AnonIdText = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIdText]
  }
}

