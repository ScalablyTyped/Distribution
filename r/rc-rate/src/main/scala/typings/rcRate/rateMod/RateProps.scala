package typings.rcRate.rateMod

import typings.rcRate.starMod.StarProps
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateProps extends js.Object {
  var allowClear: js.UndefOr[Boolean] = js.native
  var allowHalf: js.UndefOr[Boolean] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var character: js.UndefOr[js.Function1[/* props */ StarProps, ReactNode]] = js.native
  var characterRender: js.UndefOr[js.Function2[/* origin */ ReactElement, /* props */ StarProps, ReactNode]] = js.native
  var className: js.UndefOr[String] = js.native
  var count: js.UndefOr[Double] = js.native
  var defaultValue: js.UndefOr[Double] = js.native
  var direction: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.native
  var onHoverChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLUListElement]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var value: js.UndefOr[Double] = js.native
}

object RateProps {
  @scala.inline
  def apply(): RateProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateProps]
  }
  @scala.inline
  implicit class RatePropsOps[Self <: RateProps] (val x: Self) extends AnyVal {
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
    def setAllowClear(value: Boolean): Self = this.set("allowClear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowClear: Self = this.set("allowClear", js.undefined)
    @scala.inline
    def setAllowHalf(value: Boolean): Self = this.set("allowHalf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHalf: Self = this.set("allowHalf", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setCharacter(value: /* props */ StarProps => ReactNode): Self = this.set("character", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCharacter: Self = this.set("character", js.undefined)
    @scala.inline
    def setCharacterRender(value: (/* origin */ ReactElement, /* props */ StarProps) => ReactNode): Self = this.set("characterRender", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCharacterRender: Self = this.set("characterRender", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setDefaultValue(value: Double): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setOnBlur(value: () => Unit): Self = this.set("onBlur", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ Double => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnFocus(value: () => Unit): Self = this.set("onFocus", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnHoverChange(value: /* value */ Double => Unit): Self = this.set("onHoverChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHoverChange: Self = this.set("onHoverChange", js.undefined)
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[HTMLUListElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

