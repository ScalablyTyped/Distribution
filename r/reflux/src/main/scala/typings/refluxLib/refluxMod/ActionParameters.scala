package typings
package refluxLib.refluxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionParameters extends js.Object {
  var asyncResult: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var preEmit: js.UndefOr[js.Function1[/* repeated */ js.Any, js.UndefOr[js.Array[_]]]] = js.undefined
  var shouldEmit: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Boolean]] = js.undefined
  var sync: js.UndefOr[scala.Boolean] = js.undefined
}

object ActionParameters {
  @scala.inline
  def apply(
    asyncResult: js.UndefOr[scala.Boolean] = js.undefined,
    children: js.Array[java.lang.String] = null,
    preEmit: js.Function1[/* repeated */ js.Any, js.UndefOr[js.Array[_]]] = null,
    shouldEmit: js.Function1[/* repeated */ js.Any, scala.Boolean] = null,
    sync: js.UndefOr[scala.Boolean] = js.undefined
  ): ActionParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asyncResult)) __obj.updateDynamic("asyncResult")(asyncResult)
    if (children != null) __obj.updateDynamic("children")(children)
    if (preEmit != null) __obj.updateDynamic("preEmit")(preEmit)
    if (shouldEmit != null) __obj.updateDynamic("shouldEmit")(shouldEmit)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[ActionParameters]
  }
}

