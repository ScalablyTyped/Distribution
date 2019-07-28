package typings.atReachCombobox.atReachComboboxMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLElement>, 'onSelect'> ]: react.react.HTMLProps<std.HTMLElement>[P]} */ trait ComboboxProps extends js.Object {
  var as: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var openOnFocus: js.UndefOr[Boolean] = js.undefined
}

object ComboboxProps {
  @scala.inline
  def apply(
    as: String = null,
    children: ReactNode = null,
    onSelect: /* value */ String => Unit = null,
    openOnFocus: js.UndefOr[Boolean] = js.undefined
  ): ComboboxProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (!js.isUndefined(openOnFocus)) __obj.updateDynamic("openOnFocus")(openOnFocus)
    __obj.asInstanceOf[ComboboxProps]
  }
}

