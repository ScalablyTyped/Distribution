package typings.reactIntl

import typings.react.mod.Key
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.react.mod.Validator
import typings.reactIntl.reactIntlStrings.`best fit`
import typings.reactIntl.reactIntlStrings.cardinal
import typings.reactIntl.reactIntlStrings.lookup
import typings.reactIntl.reactIntlStrings.ordinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<std.Pick<react-intl.react-intl.Props_2, 'children' | 'other' | 'zero' | 'one' | 'two' | 'few' | 'many' | 'format' | 'localeMatcher' | 'type' | 'value'> & {  forwardedRef ? :(instance : any): void | react.react.RefObject<any> | null | undefined} & react.react.RefAttributes<any>> */
trait WeakValidationMapPickProp extends js.Object {
  var children: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* value */ ReactNode, Null | ReactElement]) | Null]]
  ] = js.undefined
  var few: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  var format: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var forwardedRef: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* instance */ _, Unit]) | Null | RefObject[_]]]
  ] = js.undefined
  var key: js.UndefOr[Validator[js.UndefOr[Key | Null]]] = js.undefined
  var localeMatcher: js.UndefOr[Validator[js.UndefOr[lookup | (`best fit`) | Null]]] = js.undefined
  var many: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  var one: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  var other: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  var ref: js.UndefOr[Validator[js.UndefOr[Null | Ref[_]]]] = js.undefined
  var two: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  var `type`: js.UndefOr[Validator[js.UndefOr[cardinal | ordinal | Null]]] = js.undefined
  var value: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var zero: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
}

object WeakValidationMapPickProp {
  @scala.inline
  def apply(
    children: Validator[js.UndefOr[(js.Function1[/* value */ ReactNode, Null | ReactElement]) | Null]] = null,
    few: Validator[js.UndefOr[Null | ReactNode]] = null,
    format: Validator[js.UndefOr[Null | String]] = null,
    forwardedRef: Validator[js.UndefOr[(js.Function1[/* instance */ _, Unit]) | Null | RefObject[_]]] = null,
    key: Validator[js.UndefOr[Key | Null]] = null,
    localeMatcher: Validator[js.UndefOr[lookup | (`best fit`) | Null]] = null,
    many: Validator[js.UndefOr[Null | ReactNode]] = null,
    one: Validator[js.UndefOr[Null | ReactNode]] = null,
    other: Validator[js.UndefOr[Null | ReactNode]] = null,
    ref: Validator[js.UndefOr[Null | Ref[_]]] = null,
    two: Validator[js.UndefOr[Null | ReactNode]] = null,
    `type`: Validator[js.UndefOr[cardinal | ordinal | Null]] = null,
    value: Validator[js.UndefOr[Double | Null]] = null,
    zero: Validator[js.UndefOr[Null | ReactNode]] = null
  ): WeakValidationMapPickProp = {
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
    __obj.asInstanceOf[WeakValidationMapPickProp]
  }
}

