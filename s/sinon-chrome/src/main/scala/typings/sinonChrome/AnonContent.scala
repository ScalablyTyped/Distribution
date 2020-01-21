package typings.sinonChrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var content: String
  var example: js.UndefOr[String] = js.undefined
}

object AnonContent {
  @scala.inline
  def apply(content: String, example: String = null): AnonContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (example != null) __obj.updateDynamic("example")(example.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
}

