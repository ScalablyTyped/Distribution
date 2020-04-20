package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Placeholder extends js.Object {
  var client: BoxModel
  var display: String
  var tagName: String
}

object Placeholder {
  @scala.inline
  def apply(client: BoxModel, display: String, tagName: String): Placeholder = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placeholder]
  }
}

