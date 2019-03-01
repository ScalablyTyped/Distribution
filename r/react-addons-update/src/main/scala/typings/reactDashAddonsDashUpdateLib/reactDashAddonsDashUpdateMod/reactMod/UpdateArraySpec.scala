package typings
package reactDashAddonsDashUpdateLib.reactDashAddonsDashUpdateMod.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateArraySpec extends UpdateSpecCommand {
  @JSName("$push")
  var $push: js.UndefOr[js.Array[_]] = js.undefined
  @JSName("$splice")
  var $splice: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  @JSName("$unshift")
  var $unshift: js.UndefOr[js.Array[_]] = js.undefined
}

object UpdateArraySpec {
  @scala.inline
  def apply(
    $apply: js.Function1[/* value */ js.Any, _] = null,
    $merge: js.Object = null,
    $push: js.Array[_] = null,
    $set: js.Any = null,
    $splice: js.Array[js.Array[_]] = null,
    $unshift: js.Array[_] = null
  ): UpdateArraySpec = {
    val __obj = js.Dynamic.literal()
    if ($apply != null) __obj.updateDynamic("$apply")($apply)
    if ($merge != null) __obj.updateDynamic("$merge")($merge)
    if ($push != null) __obj.updateDynamic("$push")($push)
    if ($set != null) __obj.updateDynamic("$set")($set)
    if ($splice != null) __obj.updateDynamic("$splice")($splice)
    if ($unshift != null) __obj.updateDynamic("$unshift")($unshift)
    __obj.asInstanceOf[UpdateArraySpec]
  }
}

