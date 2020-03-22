package typings.rcTreeSelect.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleModeConfig extends js.Object {
  var id: js.UndefOr[Key] = js.undefined
  var pId: js.UndefOr[Key] = js.undefined
  var rootPId: js.UndefOr[Key] = js.undefined
}

object SimpleModeConfig {
  @scala.inline
  def apply(id: Key = null, pId: Key = null, rootPId: Key = null): SimpleModeConfig = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (pId != null) __obj.updateDynamic("pId")(pId.asInstanceOf[js.Any])
    if (rootPId != null) __obj.updateDynamic("rootPId")(rootPId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleModeConfig]
  }
}

