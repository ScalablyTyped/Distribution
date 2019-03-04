package typings
package sinonDashChromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: java.lang.String
  var example: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Content {
  @scala.inline
  def apply(content: java.lang.String, example: java.lang.String = null): Anon_Content = {
    val __obj = js.Dynamic.literal(content = content)
    if (example != null) __obj.updateDynamic("example")(example)
    __obj.asInstanceOf[Anon_Content]
  }
}

