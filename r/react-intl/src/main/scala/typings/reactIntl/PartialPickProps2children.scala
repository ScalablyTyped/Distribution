package typings.reactIntl

import typings.react.mod.Key
import typings.react.mod.Ref
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<react-intl.react-intl.Props_2, 'children' | 'other' | 'zero' | 'one' | 'two' | 'few' | 'many' | 'localeMatcher' | 'format' | 'type' | 'value'> & {  forwardedRef ? :(instance : any): void | react.react.RefObject<any> | null | undefined} & react.react.RefAttributes<any>> */
trait PartialPickProps2children extends js.Object {
  var children: js.UndefOr[js.Any] = js.undefined
  var few: js.UndefOr[js.Any] = js.undefined
  var format: js.UndefOr[js.Any] = js.undefined
  var forwardedRef: js.UndefOr[(js.Function1[/* instance */ js.Any, Unit]) | RefObject[_]] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var localeMatcher: js.UndefOr[js.Any] = js.undefined
  var many: js.UndefOr[js.Any] = js.undefined
  var one: js.UndefOr[js.Any] = js.undefined
  var other: js.UndefOr[js.Any] = js.undefined
  var ref: js.UndefOr[Ref[_]] = js.undefined
  var two: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var zero: js.UndefOr[js.Any] = js.undefined
}

object PartialPickProps2children {
  @scala.inline
  def apply(
    children: js.Any = null,
    few: js.Any = null,
    format: js.Any = null,
    forwardedRef: (js.Function1[/* instance */ js.Any, Unit]) | RefObject[_] = null,
    key: Key = null,
    localeMatcher: js.Any = null,
    many: js.Any = null,
    one: js.Any = null,
    other: js.Any = null,
    ref: Ref[_] = null,
    two: js.Any = null,
    `type`: js.Any = null,
    value: js.Any = null,
    zero: js.Any = null
  ): PartialPickProps2children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
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
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickProps2children]
  }
}

