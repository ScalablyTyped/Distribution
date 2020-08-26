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
@js.native
trait BaseFieldProps[P] extends js.Object {
  var component: js.UndefOr[(ComponentType[WrappedFieldProps with P]) | input | select | textarea] = js.native
  var format: js.UndefOr[Formatter | Null] = js.native
  var forwardRef: js.UndefOr[Boolean] = js.native
  var immutableProps: js.UndefOr[js.Array[String]] = js.native
  var name: String = js.native
  var normalize: js.UndefOr[Normalizer] = js.native
  var onBlur: js.UndefOr[EventWithDataHandler[FocusEvent[_]]] = js.native
  var onChange: js.UndefOr[EventWithDataHandler[ChangeEvent[_]]] = js.native
  var onDragStart: js.UndefOr[EventHandler[DragEvent[_]]] = js.native
  var onDrop: js.UndefOr[EventHandler[DragEvent[_]]] = js.native
  var onFocus: js.UndefOr[EventHandler[FocusEvent[_]]] = js.native
  var parse: js.UndefOr[Parser] = js.native
  var props: js.UndefOr[P] = js.native
  var validate: js.UndefOr[Validator | js.Array[Validator]] = js.native
  var warn: js.UndefOr[Validator | js.Array[Validator]] = js.native
}

object BaseFieldProps {
  @scala.inline
  def apply[P](name: String): BaseFieldProps[P] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFieldProps[P]]
  }
  @scala.inline
  implicit class BaseFieldPropsOps[Self <: BaseFieldProps[_], P] (val x: Self with BaseFieldProps[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponent(value: (ComponentType[WrappedFieldProps with P]) | input | select | textarea): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setFormat(value: (/* value */ js.Any, /* name */ String) => js.Any): Self = this.set("format", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setFormatNull: Self = this.set("format", null)
    @scala.inline
    def setForwardRef(value: Boolean): Self = this.set("forwardRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardRef: Self = this.set("forwardRef", js.undefined)
    @scala.inline
    def setImmutablePropsVarargs(value: String*): Self = this.set("immutableProps", js.Array(value :_*))
    @scala.inline
    def setImmutableProps(value: js.Array[String]): Self = this.set("immutableProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmutableProps: Self = this.set("immutableProps", js.undefined)
    @scala.inline
    def setNormalize(
      value: (/* value */ js.Any, /* previousValue */ js.UndefOr[js.Any], /* allValues */ js.UndefOr[js.Any], /* previousAllValues */ js.UndefOr[js.Any]) => js.Any
    ): Self = this.set("normalize", js.Any.fromFunction4(value))
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
    @scala.inline
    def setOnBlur(
      value: (/* event */ js.UndefOr[FocusEvent[_]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Unit
    ): Self = this.set("onBlur", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(
      value: (/* event */ js.UndefOr[ChangeEvent[_]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnDragStart(value: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit): Self = this.set("onDragStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setOnDrop(value: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit): Self = this.set("onDrop", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    @scala.inline
    def setOnFocus(value: (FocusEvent[_], /* name */ js.UndefOr[String]) => Unit): Self = this.set("onFocus", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setParse(value: (/* value */ js.Any, /* name */ String) => js.Any): Self = this.set("parse", js.Any.fromFunction2(value))
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    @scala.inline
    def setProps(value: P): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
    @scala.inline
    def setValidateVarargs(value: Validator*): Self = this.set("validate", js.Array(value :_*))
    @scala.inline
    def setValidateFunction4(
      value: (/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], /* props */ js.UndefOr[js.Any], /* name */ js.UndefOr[js.Any]) => js.Any
    ): Self = this.set("validate", js.Any.fromFunction4(value))
    @scala.inline
    def setValidate(value: Validator | js.Array[Validator]): Self = this.set("validate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    @scala.inline
    def setWarnVarargs(value: Validator*): Self = this.set("warn", js.Array(value :_*))
    @scala.inline
    def setWarnFunction4(
      value: (/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], /* props */ js.UndefOr[js.Any], /* name */ js.UndefOr[js.Any]) => js.Any
    ): Self = this.set("warn", js.Any.fromFunction4(value))
    @scala.inline
    def setWarn(value: Validator | js.Array[Validator]): Self = this.set("warn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarn: Self = this.set("warn", js.undefined)
  }
  
}

