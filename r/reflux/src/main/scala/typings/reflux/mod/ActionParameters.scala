package typings.reflux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionParameters extends js.Object {
  var asyncResult: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[js.Array[String]] = js.undefined
  var preEmit: js.UndefOr[js.Function1[/* repeated */ js.Any, js.UndefOr[js.Array[_]]]] = js.undefined
  var shouldEmit: js.UndefOr[js.Function1[/* repeated */ js.Any, Boolean]] = js.undefined
  var sync: js.UndefOr[Boolean] = js.undefined
}

object ActionParameters {
  @scala.inline
  def apply(
    asyncResult: js.UndefOr[Boolean] = js.undefined,
    children: js.Array[String] = null,
    preEmit: /* repeated */ js.Any => js.UndefOr[js.Array[_]] = null,
    shouldEmit: /* repeated */ js.Any => Boolean = null,
    sync: js.UndefOr[Boolean] = js.undefined
  ): ActionParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asyncResult)) __obj.updateDynamic("asyncResult")(asyncResult.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (preEmit != null) __obj.updateDynamic("preEmit")(js.Any.fromFunction1(preEmit))
    if (shouldEmit != null) __obj.updateDynamic("shouldEmit")(js.Any.fromFunction1(shouldEmit))
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionParameters]
  }
}

