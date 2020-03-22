package typings.reduxForm.fieldMod

import typings.react.mod.ChangeEvent
import typings.react.mod.ComponentType
import typings.react.mod.DragEvent
import typings.react.mod.FocusEvent
import typings.reduxForm.reduxFormStrings.input
import typings.reduxForm.reduxFormStrings.select
import typings.reduxForm.reduxFormStrings.textarea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<redux-form.redux-form/lib/Field.CommonFieldProps> */
trait BaseFieldProps[P] extends js.Object {
  var component: js.UndefOr[(ComponentType[WrappedFieldProps with P]) | input | select | textarea] = js.undefined
  var format: js.UndefOr[Formatter | Null] = js.undefined
  var forwardRef: js.UndefOr[Boolean] = js.undefined
  var immutableProps: js.UndefOr[js.Array[String]] = js.undefined
  var name: String
  var normalize: js.UndefOr[Normalizer] = js.undefined
  var onBlur: js.UndefOr[EventWithDataHandler[FocusEvent[_]]] = js.undefined
  var onChange: js.UndefOr[EventWithDataHandler[ChangeEvent[_]]] = js.undefined
  var onDragStart: js.UndefOr[EventHandler[DragEvent[_]]] = js.undefined
  var onDrop: js.UndefOr[EventHandler[DragEvent[_]]] = js.undefined
  var onFocus: js.UndefOr[EventHandler[FocusEvent[_]]] = js.undefined
  var parse: js.UndefOr[Parser] = js.undefined
  var props: js.UndefOr[P] = js.undefined
  var validate: js.UndefOr[Validator | js.Array[Validator]] = js.undefined
  var warn: js.UndefOr[Validator | js.Array[Validator]] = js.undefined
}

object BaseFieldProps {
  @scala.inline
  def apply[P](
    name: String,
    component: (ComponentType[WrappedFieldProps with P]) | input | select | textarea = null,
    format: (/* value */ js.Any, /* name */ String) => js.Any = null,
    forwardRef: js.UndefOr[Boolean] = js.undefined,
    immutableProps: js.Array[String] = null,
    normalize: (/* value */ js.Any, /* previousValue */ js.UndefOr[js.Any], /* allValues */ js.UndefOr[js.Any], /* previousAllValues */ js.UndefOr[js.Any]) => js.Any = null,
    onBlur: (/* event */ js.UndefOr[FocusEvent[_]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Unit = null,
    onChange: (/* event */ js.UndefOr[ChangeEvent[_]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Unit = null,
    onDragStart: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit = null,
    onDrop: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit = null,
    onFocus: (FocusEvent[_], /* name */ js.UndefOr[String]) => Unit = null,
    parse: (/* value */ js.Any, /* name */ String) => js.Any = null,
    props: P = null,
    validate: Validator | js.Array[Validator] = null,
    warn: Validator | js.Array[Validator] = null
  ): BaseFieldProps[P] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction2(format))
    if (!js.isUndefined(forwardRef)) __obj.updateDynamic("forwardRef")(forwardRef.asInstanceOf[js.Any])
    if (immutableProps != null) __obj.updateDynamic("immutableProps")(immutableProps.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction4(normalize))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction4(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4(onChange))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction2(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction2(onDrop))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction2(onFocus))
    if (parse != null) __obj.updateDynamic("parse")(js.Any.fromFunction2(parse))
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    if (warn != null) __obj.updateDynamic("warn")(warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFieldProps[P]]
  }
}

