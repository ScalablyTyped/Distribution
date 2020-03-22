package typings.reactIntl

import typings.react.mod.Key
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.reactIntl.reactIntlStrings.`best fit`
import typings.reactIntl.reactIntlStrings.cardinal
import typings.reactIntl.reactIntlStrings.lookup
import typings.reactIntl.reactIntlStrings.ordinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-intl.react-intl/lib/components/plural.Props, 'children' | 'other' | 'zero' | 'one' | 'two' | 'few' | 'many' | 'format' | 'localeMatcher' | 'type' | 'value'> & {  forwardedRef ? :(instance : any): void | react.react.RefObject<any> | null | undefined} & react.react.RefAttributes<any> */
trait PickPropschildrenotherzer extends js.Object {
  var children: js.UndefOr[js.Function1[/* value */ ReactNode, ReactElement | Null]] = js.undefined
  var few: js.UndefOr[ReactNode] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var forwardedRef: js.UndefOr[(js.Function1[/* instance */ js.Any, Unit]) | RefObject[_] | Null] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.undefined
  var many: js.UndefOr[ReactNode] = js.undefined
  var one: js.UndefOr[ReactNode] = js.undefined
  var other: ReactNode
  var ref: js.UndefOr[Ref[_]] = js.undefined
  var two: js.UndefOr[ReactNode] = js.undefined
  var `type`: js.UndefOr[cardinal | ordinal] = js.undefined
  var value: Double
  var zero: js.UndefOr[ReactNode] = js.undefined
}

object PickPropschildrenotherzer {
  @scala.inline
  def apply(
    value: Double,
    children: /* value */ ReactNode => ReactElement | Null = null,
    few: ReactNode = null,
    format: String = null,
    forwardedRef: (js.Function1[/* instance */ js.Any, Unit]) | RefObject[_] = null,
    key: Key = null,
    localeMatcher: lookup | (`best fit`) = null,
    many: ReactNode = null,
    one: ReactNode = null,
    other: ReactNode = null,
    ref: Ref[_] = null,
    two: ReactNode = null,
    `type`: cardinal | ordinal = null,
    zero: ReactNode = null
  ): PickPropschildrenotherzer = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (few != null) __obj.updateDynamic("few")(few.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (many != null) __obj.updateDynamic("many")(many.asInstanceOf[js.Any])
    if (one != null) __obj.updateDynamic("one")(one.asInstanceOf[js.Any])
    if (other != null) __obj.updateDynamic("other")(other.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (two != null) __obj.updateDynamic("two")(two.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickPropschildrenotherzer]
  }
}

