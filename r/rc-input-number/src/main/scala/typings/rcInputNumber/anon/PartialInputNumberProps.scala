package typings.rcInputNumber.anon

import typings.rcInputNumber.interfaceMod.ISize
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.ReactElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rc-input-number.rc-input-number/es/interface.InputNumberProps> */
@js.native
trait PartialInputNumberProps extends js.Object {
  var autoComplete: js.UndefOr[String] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var decimalSeparator: js.UndefOr[String] = js.native
  var defaultValue: js.UndefOr[Double] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var downHandler: js.UndefOr[ReactElement] = js.native
  var focusOnUpDown: js.UndefOr[Boolean] = js.native
  var formatter: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | String], String]] = js.native
  var id: js.UndefOr[String] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var onBlur: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | String], Unit]] = js.native
  var onFocus: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var onKeyDown: js.UndefOr[js.Function2[/* e */ js.Any, /* repeated */ js.Any, Unit]] = js.native
  var onKeyUp: js.UndefOr[js.Function2[/* e */ js.Any, /* repeated */ js.Any, Unit]] = js.native
  var onMouseUp: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var onPressEnter: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  var parser: js.UndefOr[js.Function1[/* displayValue */ js.UndefOr[String], Double | String]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var precision: js.UndefOr[Double] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[ISize] = js.native
  var step: js.UndefOr[Double | String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  var upHandler: js.UndefOr[ReactElement] = js.native
  var useTouch: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[Double] = js.native
}

object PartialInputNumberProps {
  @scala.inline
  def apply(): PartialInputNumberProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInputNumberProps]
  }
  @scala.inline
  implicit class PartialInputNumberPropsOps[Self <: PartialInputNumberProps] (val x: Self) extends AnyVal {
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
    def setAutoComplete(value: String): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDecimalSeparator(value: String): Self = this.set("decimalSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalSeparator: Self = this.set("decimalSeparator", js.undefined)
    @scala.inline
    def setDefaultValue(value: Double): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDownHandler(value: ReactElement): Self = this.set("downHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownHandler: Self = this.set("downHandler", js.undefined)
    @scala.inline
    def setFocusOnUpDown(value: Boolean): Self = this.set("focusOnUpDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusOnUpDown: Self = this.set("focusOnUpDown", js.undefined)
    @scala.inline
    def setFormatter(value: /* value */ js.UndefOr[Double | String] => String): Self = this.set("formatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnBlur(value: /* repeated */ js.Any => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ js.UndefOr[Double | String] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnFocus(value: /* repeated */ js.Any => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnKeyDown(value: (/* e */ js.Any, /* repeated */ js.Any) => Unit): Self = this.set("onKeyDown", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnKeyUp(value: (/* e */ js.Any, /* repeated */ js.Any) => Unit): Self = this.set("onKeyUp", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    @scala.inline
    def setOnMouseUp(value: /* repeated */ js.Any => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setOnPressEnter(value: KeyboardEvent[HTMLInputElement] => Unit): Self = this.set("onPressEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPressEnter: Self = this.set("onPressEnter", js.undefined)
    @scala.inline
    def setParser(value: /* displayValue */ js.UndefOr[String] => Double | String): Self = this.set("parser", js.Any.fromFunction1(value))
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setSize(value: ISize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStep(value: Double | String): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUpHandler(value: ReactElement): Self = this.set("upHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpHandler: Self = this.set("upHandler", js.undefined)
    @scala.inline
    def setUseTouch(value: Boolean): Self = this.set("useTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseTouch: Self = this.set("useTouch", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

