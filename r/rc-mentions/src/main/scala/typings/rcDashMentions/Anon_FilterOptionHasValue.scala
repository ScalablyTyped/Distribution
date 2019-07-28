package typings.rcDashMentions

import typings.rcDashMentions.libMentionsMod.MentionsProps
import typings.rcDashMentions.libOptionMod.OptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilterOptionHasValue extends js.Object {
  var filterOption: js.Function2[/* input */ String, /* hasValue */ OptionProps, Boolean]
  var notFoundContent: String
  var prefix: String
  var prefixCls: String
  var rows: Double
  var split: String
  var validateSearch: js.Function2[/* text */ String, /* props */ MentionsProps, Boolean]
}

object Anon_FilterOptionHasValue {
  @scala.inline
  def apply(
    filterOption: (/* input */ String, /* hasValue */ OptionProps) => Boolean,
    notFoundContent: String,
    prefix: String,
    prefixCls: String,
    rows: Double,
    split: String,
    validateSearch: (/* text */ String, /* props */ MentionsProps) => Boolean
  ): Anon_FilterOptionHasValue = {
    val __obj = js.Dynamic.literal(filterOption = js.Any.fromFunction2(filterOption), notFoundContent = notFoundContent, prefix = prefix, prefixCls = prefixCls, rows = rows, split = split, validateSearch = js.Any.fromFunction2(validateSearch))
  
    __obj.asInstanceOf[Anon_FilterOptionHasValue]
  }
}

