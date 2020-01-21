package typings.resolveOptions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigItem extends js.Object {
  var default: js.UndefOr[js.Any] = js.undefined
  var `type`: String | js.Array[String]
}

object ConfigItem {
  @scala.inline
  def apply(`type`: String | js.Array[String], default: js.Any = null): ConfigItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigItem]
  }
}

