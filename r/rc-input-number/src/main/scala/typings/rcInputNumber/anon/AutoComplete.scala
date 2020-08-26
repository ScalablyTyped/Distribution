package typings.rcInputNumber.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoComplete extends js.Object {
  var autoComplete: String = js.native
  var focusOnUpDown: Boolean = js.native
  var max: Double = js.native
  var min: Double = js.native
  var onBlur: js.Function0[Unit] = js.native
  var onChange: js.Function0[Unit] = js.native
  var onFocus: js.Function0[Unit] = js.native
  var onKeyDown: js.Function0[Unit] = js.native
  var onPressEnter: js.Function0[Unit] = js.native
  var prefixCls: String = js.native
  var required: Boolean = js.native
  var step: Double = js.native
  var useTouch: Boolean = js.native
  def parser(input: String): String = js.native
}

object AutoComplete {
  @scala.inline
  def apply(
    autoComplete: String,
    focusOnUpDown: Boolean,
    max: Double,
    min: Double,
    onBlur: () => Unit,
    onChange: () => Unit,
    onFocus: () => Unit,
    onKeyDown: () => Unit,
    onPressEnter: () => Unit,
    parser: String => String,
    prefixCls: String,
    required: Boolean,
    step: Double,
    useTouch: Boolean
  ): AutoComplete = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete.asInstanceOf[js.Any], focusOnUpDown = focusOnUpDown.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onFocus = js.Any.fromFunction0(onFocus), onKeyDown = js.Any.fromFunction0(onKeyDown), onPressEnter = js.Any.fromFunction0(onPressEnter), parser = js.Any.fromFunction1(parser), prefixCls = prefixCls.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], useTouch = useTouch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoComplete]
  }
  @scala.inline
  implicit class AutoCompleteOps[Self <: AutoComplete] (val x: Self) extends AnyVal {
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
    def setFocusOnUpDown(value: Boolean): Self = this.set("focusOnUpDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnBlur(value: () => Unit): Self = this.set("onBlur", js.Any.fromFunction0(value))
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    @scala.inline
    def setOnFocus(value: () => Unit): Self = this.set("onFocus", js.Any.fromFunction0(value))
    @scala.inline
    def setOnKeyDown(value: () => Unit): Self = this.set("onKeyDown", js.Any.fromFunction0(value))
    @scala.inline
    def setOnPressEnter(value: () => Unit): Self = this.set("onPressEnter", js.Any.fromFunction0(value))
    @scala.inline
    def setParser(value: String => String): Self = this.set("parser", js.Any.fromFunction1(value))
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseTouch(value: Boolean): Self = this.set("useTouch", value.asInstanceOf[js.Any])
  }
  
}

