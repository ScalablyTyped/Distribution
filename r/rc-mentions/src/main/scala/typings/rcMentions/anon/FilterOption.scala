package typings.rcMentions.anon

import typings.rcMentions.mentionsMod.MentionsProps
import typings.rcMentions.optionMod.OptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterOption extends js.Object {
  var filterOption: js.Function2[/* input */ String, /* hasValue */ OptionProps, Boolean] = js.native
  var notFoundContent: String = js.native
  var prefix: String = js.native
  var prefixCls: String = js.native
  var rows: Double = js.native
  var split: String = js.native
  var validateSearch: js.Function2[/* text */ String, /* props */ MentionsProps, Boolean] = js.native
}

object FilterOption {
  @scala.inline
  def apply(
    filterOption: (/* input */ String, /* hasValue */ OptionProps) => Boolean,
    notFoundContent: String,
    prefix: String,
    prefixCls: String,
    rows: Double,
    split: String,
    validateSearch: (/* text */ String, /* props */ MentionsProps) => Boolean
  ): FilterOption = {
    val __obj = js.Dynamic.literal(filterOption = js.Any.fromFunction2(filterOption), notFoundContent = notFoundContent.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], split = split.asInstanceOf[js.Any], validateSearch = js.Any.fromFunction2(validateSearch))
    __obj.asInstanceOf[FilterOption]
  }
  @scala.inline
  implicit class FilterOptionOps[Self <: FilterOption] (val x: Self) extends AnyVal {
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
    def setFilterOption(value: (/* input */ String, /* hasValue */ OptionProps) => Boolean): Self = this.set("filterOption", js.Any.fromFunction2(value))
    @scala.inline
    def setNotFoundContent(value: String): Self = this.set("notFoundContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplit(value: String): Self = this.set("split", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidateSearch(value: (/* text */ String, /* props */ MentionsProps) => Boolean): Self = this.set("validateSearch", js.Any.fromFunction2(value))
  }
  
}

