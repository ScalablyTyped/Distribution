package typings
package reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeaheadContext[T /* <: TypeaheadModel */] extends js.Object {
  var activeIndex: js.UndefOr[scala.Double] = js.undefined
  var hintText: js.UndefOr[java.lang.String] = js.undefined
  var initialItem: js.UndefOr[T] = js.undefined
  var isOnlyResult: js.UndefOr[scala.Boolean] = js.undefined
  var onActiveItemChange: js.UndefOr[js.Function1[/* options */ T, scala.Unit]] = js.undefined
  var onAdd: js.UndefOr[js.Function1[/* option */ T, scala.Unit]] = js.undefined
  var onInitialItemChange: js.UndefOr[js.Function1[/* option */ T, scala.Unit]] = js.undefined
  var onMenuItemClick: js.UndefOr[js.Function2[/* option */ T, /* e */ stdLib.Event, scala.Unit]] = js.undefined
  var selectHintOnEnter: js.UndefOr[scala.Boolean] = js.undefined
}

object TypeaheadContext {
  @scala.inline
  def apply[T /* <: TypeaheadModel */](
    activeIndex: scala.Int | scala.Double = null,
    hintText: java.lang.String = null,
    initialItem: T = null,
    isOnlyResult: js.UndefOr[scala.Boolean] = js.undefined,
    onActiveItemChange: /* options */ T => scala.Unit = null,
    onAdd: /* option */ T => scala.Unit = null,
    onInitialItemChange: /* option */ T => scala.Unit = null,
    onMenuItemClick: (/* option */ T, /* e */ stdLib.Event) => scala.Unit = null,
    selectHintOnEnter: js.UndefOr[scala.Boolean] = js.undefined
  ): TypeaheadContext[T] = {
    val __obj = js.Dynamic.literal()
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (hintText != null) __obj.updateDynamic("hintText")(hintText)
    if (initialItem != null) __obj.updateDynamic("initialItem")(initialItem.asInstanceOf[js.Any])
    if (!js.isUndefined(isOnlyResult)) __obj.updateDynamic("isOnlyResult")(isOnlyResult)
    if (onActiveItemChange != null) __obj.updateDynamic("onActiveItemChange")(js.Any.fromFunction1(onActiveItemChange))
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction1(onAdd))
    if (onInitialItemChange != null) __obj.updateDynamic("onInitialItemChange")(js.Any.fromFunction1(onInitialItemChange))
    if (onMenuItemClick != null) __obj.updateDynamic("onMenuItemClick")(js.Any.fromFunction2(onMenuItemClick))
    if (!js.isUndefined(selectHintOnEnter)) __obj.updateDynamic("selectHintOnEnter")(selectHintOnEnter)
    __obj.asInstanceOf[TypeaheadContext[T]]
  }
}

