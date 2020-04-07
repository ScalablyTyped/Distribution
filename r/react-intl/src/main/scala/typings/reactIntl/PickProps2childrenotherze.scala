package typings.reactIntl

import typings.react.mod.Key
import typings.react.mod.Ref
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-intl.react-intl.Props_2, 'children' | 'other' | 'zero' | 'one' | 'two' | 'few' | 'many' | 'localeMatcher' | 'format' | 'type' | 'value'> & {  forwardedRef ? :(instance : any): void | react.react.RefObject<any> | null | undefined} & react.react.RefAttributes<any> */
trait PickProps2childrenotherze extends js.Object {
  var children: js.Any
  var few: js.Any
  var format: js.Any
  var forwardedRef: js.UndefOr[(js.Function1[/* instance */ js.Any, Unit]) | RefObject[_] | Null] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var localeMatcher: js.Any
  var many: js.Any
  var one: js.Any
  var other: js.Any
  var ref: js.UndefOr[Ref[_]] = js.undefined
  var two: js.Any
  var `type`: js.Any
  var value: js.Any
  var zero: js.Any
}

object PickProps2childrenotherze {
  @scala.inline
  def apply(
    children: js.Any,
    few: js.Any,
    format: js.Any,
    localeMatcher: js.Any,
    many: js.Any,
    one: js.Any,
    other: js.Any,
    two: js.Any,
    `type`: js.Any,
    value: js.Any,
    zero: js.Any,
    forwardedRef: (js.Function1[/* instance */ js.Any, Unit]) | RefObject[_] = null,
    key: Key = null,
    ref: Ref[_] = null
  ): PickProps2childrenotherze = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], few = few.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], localeMatcher = localeMatcher.asInstanceOf[js.Any], many = many.asInstanceOf[js.Any], one = one.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], two = two.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickProps2childrenotherze]
  }
}

