package typings
package rcDashMentionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilterOptionHasValue extends js.Object {
  var filterOption: js.Function2[
    /* input */ java.lang.String, 
    /* hasValue */ rcDashMentionsLib.libOptionMod.OptionProps, 
    scala.Boolean
  ]
  var notFoundContent: java.lang.String
  var prefix: java.lang.String
  var prefixCls: java.lang.String
  var rows: scala.Double
  var split: java.lang.String
  var validateSearch: js.Function2[
    /* text */ java.lang.String, 
    /* props */ rcDashMentionsLib.libMentionsMod.MentionsProps, 
    scala.Boolean
  ]
}

object Anon_FilterOptionHasValue {
  @scala.inline
  def apply(
    filterOption: (/* input */ java.lang.String, /* hasValue */ rcDashMentionsLib.libOptionMod.OptionProps) => scala.Boolean,
    notFoundContent: java.lang.String,
    prefix: java.lang.String,
    prefixCls: java.lang.String,
    rows: scala.Double,
    split: java.lang.String,
    validateSearch: (/* text */ java.lang.String, /* props */ rcDashMentionsLib.libMentionsMod.MentionsProps) => scala.Boolean
  ): Anon_FilterOptionHasValue = {
    val __obj = js.Dynamic.literal(filterOption = js.Any.fromFunction2(filterOption), notFoundContent = notFoundContent, prefix = prefix, prefixCls = prefixCls, rows = rows, split = split, validateSearch = js.Any.fromFunction2(validateSearch))
  
    __obj.asInstanceOf[Anon_FilterOptionHasValue]
  }
}

