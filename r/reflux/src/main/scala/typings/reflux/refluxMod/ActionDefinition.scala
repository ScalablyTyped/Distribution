package typings.reflux.refluxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionDefinition extends ActionParameters {
  var actionName: js.UndefOr[String] = js.undefined
}

object ActionDefinition {
  @scala.inline
  def apply(
    actionName: String = null,
    asyncResult: js.UndefOr[Boolean] = js.undefined,
    children: js.Array[String] = null,
    preEmit: /* repeated */ js.Any => js.UndefOr[js.Array[_]] = null,
    shouldEmit: /* repeated */ js.Any => Boolean = null,
    sync: js.UndefOr[Boolean] = js.undefined
  ): ActionDefinition = {
    val __obj = js.Dynamic.literal()
    if (actionName != null) __obj.updateDynamic("actionName")(actionName)
    if (!js.isUndefined(asyncResult)) __obj.updateDynamic("asyncResult")(asyncResult)
    if (children != null) __obj.updateDynamic("children")(children)
    if (preEmit != null) __obj.updateDynamic("preEmit")(js.Any.fromFunction1(preEmit))
    if (shouldEmit != null) __obj.updateDynamic("shouldEmit")(js.Any.fromFunction1(shouldEmit))
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[ActionDefinition]
  }
}

