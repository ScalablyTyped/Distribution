package typings.reactDashAddonsDashUpdate.reactDashAddonsDashUpdateMod.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSpecCommand extends _UpdateSpec {
  @JSName("$apply")
  var $apply: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  @JSName("$merge")
  var $merge: js.UndefOr[js.Object] = js.undefined
  @JSName("$set")
  var $set: js.UndefOr[js.Any] = js.undefined
}

object UpdateSpecCommand {
  @scala.inline
  def apply($apply: /* value */ js.Any => _ = null, $merge: js.Object = null, $set: js.Any = null): UpdateSpecCommand = {
    val __obj = js.Dynamic.literal()
    if ($apply != null) __obj.updateDynamic("$apply")(js.Any.fromFunction1($apply))
    if ($merge != null) __obj.updateDynamic("$merge")($merge)
    if ($set != null) __obj.updateDynamic("$set")($set)
    __obj.asInstanceOf[UpdateSpecCommand]
  }
}

