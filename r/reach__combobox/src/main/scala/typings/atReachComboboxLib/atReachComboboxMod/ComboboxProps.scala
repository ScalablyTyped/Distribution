package typings
package atReachComboboxLib.atReachComboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLElement>, 'onSelect'> ]: react.react.HTMLProps<std.HTMLElement>[P]} */ trait ComboboxProps extends js.Object {
  var as: js.UndefOr[java.lang.String] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  var openOnFocus: js.UndefOr[scala.Boolean] = js.undefined
}

object ComboboxProps {
  @scala.inline
  def apply(
    as: java.lang.String = null,
    children: reactLib.reactMod.ReactNode = null,
    onSelect: /* value */ java.lang.String => scala.Unit = null,
    openOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  ): ComboboxProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (!js.isUndefined(openOnFocus)) __obj.updateDynamic("openOnFocus")(openOnFocus)
    __obj.asInstanceOf[ComboboxProps]
  }
}

