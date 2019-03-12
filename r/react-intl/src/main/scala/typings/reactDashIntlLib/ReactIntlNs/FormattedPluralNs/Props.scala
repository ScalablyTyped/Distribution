package typings
package reactDashIntlLib.ReactIntlNs.FormattedPluralNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends PropsBase {
  var children: js.UndefOr[
    js.Function1[
      /* formattedPlural */ reactLib.reactMod.ReactNs.ReactNode, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var value: scala.Double
}

object Props {
  @scala.inline
  def apply(
    value: scala.Double,
    children: /* formattedPlural */ reactLib.reactMod.ReactNs.ReactNode => reactLib.reactMod.ReactNs.ReactNode = null,
    few: js.Any = null,
    many: js.Any = null,
    one: js.Any = null,
    other: js.Any = null,
    style: reactDashIntlLib.reactDashIntlLibStrings.cardinal | reactDashIntlLib.reactDashIntlLibStrings.ordinal = null,
    two: js.Any = null,
    zero: js.Any = null
  ): Props = {
    val __obj = js.Dynamic.literal(value = value)
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (few != null) __obj.updateDynamic("few")(few)
    if (many != null) __obj.updateDynamic("many")(many)
    if (one != null) __obj.updateDynamic("one")(one)
    if (other != null) __obj.updateDynamic("other")(other)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (two != null) __obj.updateDynamic("two")(two)
    if (zero != null) __obj.updateDynamic("zero")(zero)
    __obj.asInstanceOf[Props]
  }
}

