package typings.primereact.pickListItemMod

import typings.primereact.anon.Value
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickListItemProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object PickListItemProps {
  @scala.inline
  def apply(
    className: String = null,
    onClick: /* e */ Value => Unit = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    template: /* item */ js.Any => js.UndefOr[Element] = null,
    value: js.Any = null
  ): PickListItemProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction1(template))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickListItemProps]
  }
}

