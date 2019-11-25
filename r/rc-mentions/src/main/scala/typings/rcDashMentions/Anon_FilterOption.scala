package typings.rcDashMentions

import typings.rcDashMentions.esMentionsMod.MentionsProps
import typings.rcDashMentions.esOptionMod.OptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilterOption extends js.Object {
  var filterOption: js.Function2[/* input */ String, /* hasValue */ OptionProps, Boolean]
  var notFoundContent: String
  var prefix: String
  var prefixCls: String
  var rows: Double
  var split: String
  var validateSearch: js.Function2[/* text */ String, /* props */ MentionsProps, Boolean]
}

object Anon_FilterOption {
  @scala.inline
  def apply(
    filterOption: (/* input */ String, /* hasValue */ OptionProps) => Boolean,
    notFoundContent: String,
    prefix: String,
    prefixCls: String,
    rows: Double,
    split: String,
    validateSearch: (/* text */ String, /* props */ MentionsProps) => Boolean
  ): Anon_FilterOption = {
    val __obj = js.Dynamic.literal(filterOption = js.Any.fromFunction2(filterOption), notFoundContent = notFoundContent.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], split = split.asInstanceOf[js.Any], validateSearch = js.Any.fromFunction2(validateSearch))
  
    __obj.asInstanceOf[Anon_FilterOption]
  }
}

