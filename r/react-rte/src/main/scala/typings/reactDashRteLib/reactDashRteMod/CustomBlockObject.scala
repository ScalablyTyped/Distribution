package typings
package reactDashRteLib.reactDashRteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomBlockObject extends js.Object {
  var data: js.UndefOr[js.Object] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object CustomBlockObject {
  @scala.inline
  def apply(data: js.Object = null, `type`: java.lang.String = null): CustomBlockObject = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CustomBlockObject]
  }
}

