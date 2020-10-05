package typings.rcMentions.mentionsMod

import typings.rcMentions.optionMod.OptionProps
import typings.rcMentions.rcMentionsBooleans.`false`
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MentionsProps extends BaseTextareaAttrs {
  @JSName("defaultValue")
  var defaultValue_MentionsProps: js.UndefOr[String] = js.native
  var direction: js.UndefOr[Direction] = js.native
  var filterOption: js.UndefOr[
    `false` | (js.Function2[/* input */ String, /* hasValue */ OptionProps, Boolean])
  ] = js.native
  var getPopupContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
  var notFoundContent: js.UndefOr[ReactNode] = js.native
  var onChange: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.native
  var onSearch: js.UndefOr[js.Function2[/* text */ String, /* prefix */ String, Unit]] = js.native
  var onSelect: js.UndefOr[js.Function2[/* option */ OptionProps, /* prefix */ String, Unit]] = js.native
  var placement: js.UndefOr[Placement] = js.native
  var prefix: js.UndefOr[String | js.Array[String]] = js.native
  var split: js.UndefOr[String] = js.native
  var transitionName: js.UndefOr[String] = js.native
  var validateSearch: js.UndefOr[js.Function2[/* text */ String, /* props */ this.type, Boolean]] = js.native
  @JSName("value")
  var value_MentionsProps: js.UndefOr[String] = js.native
}

object MentionsProps {
  @scala.inline
  def apply(): MentionsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MentionsProps]
  }
  @scala.inline
  implicit class MentionsPropsOps[Self <: MentionsProps] (val x: Self) extends AnyVal {
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
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDirection(value: Direction): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setFilterOptionFunction2(value: (/* input */ String, /* hasValue */ OptionProps) => Boolean): Self = this.set("filterOption", js.Any.fromFunction2(value))
    @scala.inline
    def setFilterOption(value: `false` | (js.Function2[/* input */ String, /* hasValue */ OptionProps, Boolean])): Self = this.set("filterOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterOption: Self = this.set("filterOption", js.undefined)
    @scala.inline
    def setGetPopupContainer(value: () => HTMLElement): Self = this.set("getPopupContainer", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
    @scala.inline
    def setNotFoundContent(value: ReactNode): Self = this.set("notFoundContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotFoundContent: Self = this.set("notFoundContent", js.undefined)
    @scala.inline
    def setOnChange(value: /* text */ String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnSearch(value: (/* text */ String, /* prefix */ String) => Unit): Self = this.set("onSearch", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSearch: Self = this.set("onSearch", js.undefined)
    @scala.inline
    def setOnSelect(value: (/* option */ OptionProps, /* prefix */ String) => Unit): Self = this.set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setPrefixVarargs(value: String*): Self = this.set("prefix", js.Array(value :_*))
    @scala.inline
    def setPrefix(value: String | js.Array[String]): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setSplit(value: String): Self = this.set("split", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplit: Self = this.set("split", js.undefined)
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
    @scala.inline
    def setValidateSearch(value: (/* text */ String, MentionsProps) => Boolean): Self = this.set("validateSearch", js.Any.fromFunction2(value))
    @scala.inline
    def deleteValidateSearch: Self = this.set("validateSearch", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

