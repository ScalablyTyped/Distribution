package typings.reactJsonPretty.mod

import typings.react.mod.HTMLAttributes
import typings.std.Error
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProps extends HTMLAttributes[HTMLElement] {
  var booleanStyle: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var errorStyle: js.UndefOr[String] = js.native
  var json: js.UndefOr[js.Any] = js.native
  var keyStyle: js.UndefOr[String] = js.native
  var mainStyle: js.UndefOr[String] = js.native
  var onJSONPrettyError: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.native
  var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _ | Null]] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var space: js.UndefOr[Double | String] = js.native
  var stringStyle: js.UndefOr[String] = js.native
  var theme: js.UndefOr[ITheme] = js.native
  var themeClassName: js.UndefOr[String] = js.native
  var valueStyle: js.UndefOr[String] = js.native
}

object IProps {
  @scala.inline
  def apply(): IProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProps]
  }
  @scala.inline
  implicit class IPropsOps[Self <: IProps] (val x: Self) extends AnyVal {
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
    def setBooleanStyle(value: String): Self = this.set("booleanStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBooleanStyle: Self = this.set("booleanStyle", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setErrorStyle(value: String): Self = this.set("errorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorStyle: Self = this.set("errorStyle", js.undefined)
    @scala.inline
    def setJson(value: js.Any): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setKeyStyle(value: String): Self = this.set("keyStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyStyle: Self = this.set("keyStyle", js.undefined)
    @scala.inline
    def setMainStyle(value: String): Self = this.set("mainStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMainStyle: Self = this.set("mainStyle", js.undefined)
    @scala.inline
    def setOnJSONPrettyError(value: /* e */ Error => Unit): Self = this.set("onJSONPrettyError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnJSONPrettyError: Self = this.set("onJSONPrettyError", js.undefined)
    @scala.inline
    def setReplacer(value: (/* key */ String, /* value */ js.Any) => _ | Null): Self = this.set("replacer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReplacer: Self = this.set("replacer", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setSpace(value: Double | String): Self = this.set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    @scala.inline
    def setStringStyle(value: String): Self = this.set("stringStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringStyle: Self = this.set("stringStyle", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setThemeClassName(value: String): Self = this.set("themeClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThemeClassName: Self = this.set("themeClassName", js.undefined)
    @scala.inline
    def setValueStyle(value: String): Self = this.set("valueStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueStyle: Self = this.set("valueStyle", js.undefined)
  }
  
}

