package typings.reactRte.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomBlockObject extends js.Object {
  var data: js.UndefOr[js.Object] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object CustomBlockObject {
  @scala.inline
  def apply(data: js.Object = null, `type`: String = null): CustomBlockObject = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomBlockObject]
  }
}

