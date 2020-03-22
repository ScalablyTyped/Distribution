package typings.routeNode.routeNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteNodeOptions extends js.Object {
  var finalSort: js.UndefOr[Boolean] = js.undefined
  var onAdd: js.UndefOr[Callback] = js.undefined
  var parent: js.UndefOr[RouteNode] = js.undefined
  var sort: js.UndefOr[Boolean] = js.undefined
}

object RouteNodeOptions {
  @scala.inline
  def apply(
    finalSort: js.UndefOr[Boolean] = js.undefined,
    onAdd: /* repeated */ js.Any => Unit = null,
    parent: RouteNode = null,
    sort: js.UndefOr[Boolean] = js.undefined
  ): RouteNodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(finalSort)) __obj.updateDynamic("finalSort")(finalSort.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction1(onAdd))
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteNodeOptions]
  }
}

