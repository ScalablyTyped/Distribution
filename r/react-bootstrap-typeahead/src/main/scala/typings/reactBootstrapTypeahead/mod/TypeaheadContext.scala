package typings.reactBootstrapTypeahead.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeaheadContext[T /* <: TypeaheadModel */] extends js.Object {
  var activeIndex: js.UndefOr[Double] = js.undefined
  var hintText: js.UndefOr[String] = js.undefined
  var initialItem: js.UndefOr[T] = js.undefined
  var isOnlyResult: js.UndefOr[Boolean] = js.undefined
  var onActiveItemChange: js.UndefOr[js.Function1[/* options */ T, Unit]] = js.undefined
  var onAdd: js.UndefOr[js.Function1[/* option */ T, Unit]] = js.undefined
  var onInitialItemChange: js.UndefOr[js.Function1[/* option */ T, Unit]] = js.undefined
  var onMenuItemClick: js.UndefOr[js.Function2[/* option */ T, /* e */ Event, Unit]] = js.undefined
  var selectHintOnEnter: js.UndefOr[Boolean] = js.undefined
}

object TypeaheadContext {
  @scala.inline
  def apply[T](
    activeIndex: js.UndefOr[Double] = js.undefined,
    hintText: String = null,
    initialItem: T = null,
    isOnlyResult: js.UndefOr[Boolean] = js.undefined,
    onActiveItemChange: /* options */ T => Unit = null,
    onAdd: /* option */ T => Unit = null,
    onInitialItemChange: /* option */ T => Unit = null,
    onMenuItemClick: (/* option */ T, /* e */ Event) => Unit = null,
    selectHintOnEnter: js.UndefOr[Boolean] = js.undefined
  ): TypeaheadContext[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeIndex)) __obj.updateDynamic("activeIndex")(activeIndex.get.asInstanceOf[js.Any])
    if (hintText != null) __obj.updateDynamic("hintText")(hintText.asInstanceOf[js.Any])
    if (initialItem != null) __obj.updateDynamic("initialItem")(initialItem.asInstanceOf[js.Any])
    if (!js.isUndefined(isOnlyResult)) __obj.updateDynamic("isOnlyResult")(isOnlyResult.get.asInstanceOf[js.Any])
    if (onActiveItemChange != null) __obj.updateDynamic("onActiveItemChange")(js.Any.fromFunction1(onActiveItemChange))
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction1(onAdd))
    if (onInitialItemChange != null) __obj.updateDynamic("onInitialItemChange")(js.Any.fromFunction1(onInitialItemChange))
    if (onMenuItemClick != null) __obj.updateDynamic("onMenuItemClick")(js.Any.fromFunction2(onMenuItemClick))
    if (!js.isUndefined(selectHintOnEnter)) __obj.updateDynamic("selectHintOnEnter")(selectHintOnEnter.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeaheadContext[T]]
  }
}

