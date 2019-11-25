package typings.reactDashIntl.reactDashIntlMod

import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped std.Intl.PluralRulesOptions extends 'localeMatcher' ? never : std.Intl.PluralRulesOptions */ trait Props_2 extends CustomFormatConfig {
  var children: js.UndefOr[js.Function1[/* value */ ReactNode, ReactElement | Null]] = js.undefined
  var few: js.UndefOr[ReactNode] = js.undefined
  var intl: IntlShape
  var many: js.UndefOr[ReactNode] = js.undefined
  var one: js.UndefOr[ReactNode] = js.undefined
  var other: ReactNode
  var two: js.UndefOr[ReactNode] = js.undefined
  var value: Double
  var zero: js.UndefOr[ReactNode] = js.undefined
}

object Props_2 {
  @scala.inline
  def apply(
    intl: IntlShape,
    value: Double,
    children: /* value */ ReactNode => ReactElement | Null = null,
    few: ReactNode = null,
    format: String = null,
    many: ReactNode = null,
    one: ReactNode = null,
    other: ReactNode = null,
    two: ReactNode = null,
    zero: ReactNode = null
  ): Props_2 = {
    val __obj = js.Dynamic.literal(intl = intl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (few != null) __obj.updateDynamic("few")(few.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (many != null) __obj.updateDynamic("many")(many.asInstanceOf[js.Any])
    if (one != null) __obj.updateDynamic("one")(one.asInstanceOf[js.Any])
    if (other != null) __obj.updateDynamic("other")(other.asInstanceOf[js.Any])
    if (two != null) __obj.updateDynamic("two")(two.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props_2]
  }
}

