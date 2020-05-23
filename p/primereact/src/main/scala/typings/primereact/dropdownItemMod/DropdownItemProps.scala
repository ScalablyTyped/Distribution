package typings.primereact.dropdownItemMod

import typings.primereact.anon.Option
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownItemProps extends js.Object {
  var onClick: js.UndefOr[js.Function1[/* e */ Option, Unit]] = js.undefined
  var option: js.UndefOr[js.Object] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[js.Function1[/* option */ js.Any, js.UndefOr[Element]]] = js.undefined
}

object DropdownItemProps {
  @scala.inline
  def apply(
    onClick: /* e */ Option => Unit = null,
    option: js.Object = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    template: /* option */ js.Any => js.UndefOr[Element] = null
  ): DropdownItemProps = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (option != null) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction1(template))
    __obj.asInstanceOf[DropdownItemProps]
  }
}

