package typings.reactSvgMap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var id: String
  var name: js.UndefOr[String] = js.undefined
  var path: String
}

object Location {
  @scala.inline
  def apply(id: String, path: String, name: String = null): Location = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

