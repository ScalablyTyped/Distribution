package typings.rcMentions

import typings.rcMentions.mentionsMod.MentionsProps
import typings.rcMentions.optionMod.OptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilterOption extends js.Object {
  var filterOption: js.Function2[/* input */ String, /* hasValue */ OptionProps, Boolean]
  var notFoundContent: String
  var prefix: String
  var prefixCls: String
  var rows: Double
  var split: String
  var validateSearch: js.Function2[/* text */ String, /* props */ MentionsProps, Boolean]
}

object AnonFilterOption {
  @scala.inline
  def apply(
    filterOption: (/* input */ String, /* hasValue */ OptionProps) => Boolean,
    notFoundContent: String,
    prefix: String,
    prefixCls: String,
    rows: Double,
    split: String,
    validateSearch: (/* text */ String, /* props */ MentionsProps) => Boolean
  ): AnonFilterOption = {
    val __obj = js.Dynamic.literal(filterOption = js.Any.fromFunction2(filterOption), notFoundContent = notFoundContent.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], split = split.asInstanceOf[js.Any], validateSearch = js.Any.fromFunction2(validateSearch))
  
    __obj.asInstanceOf[AnonFilterOption]
  }
}

