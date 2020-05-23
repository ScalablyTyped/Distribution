package typings.primereact.listBoxItemMod

import typings.primereact.anon.OptionOriginalEvent
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxItemProps extends js.Object {
  var onClick: js.UndefOr[js.Function1[/* e */ OptionOriginalEvent, Unit]] = js.undefined
  var onTouchEnd: js.UndefOr[js.Function1[/* e */ OptionOriginalEvent, Unit]] = js.undefined
  var option: js.UndefOr[js.Any] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.undefined
}

object ListBoxItemProps {
  @scala.inline
  def apply(
    onClick: /* e */ OptionOriginalEvent => Unit = null,
    onTouchEnd: /* e */ OptionOriginalEvent => Unit = null,
    option: js.Any = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    template: /* item */ js.Any => js.UndefOr[Element] = null
  ): ListBoxItemProps = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (option != null) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction1(template))
    __obj.asInstanceOf[ListBoxItemProps]
  }
}

