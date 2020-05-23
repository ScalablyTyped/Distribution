package typings.sinonChrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var content: String
  var example: js.UndefOr[String] = js.undefined
}

object Content {
  @scala.inline
  def apply(content: String, example: String = null): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (example != null) __obj.updateDynamic("example")(example.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

