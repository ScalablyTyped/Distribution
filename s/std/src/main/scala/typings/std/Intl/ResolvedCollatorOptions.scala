package typings.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedCollatorOptions extends js.Object {
  var caseFirst: String
  var collation: String
  var ignorePunctuation: Boolean
  var locale: String
  var numeric: Boolean
  var sensitivity: String
  var usage: String
}

object ResolvedCollatorOptions {
  @scala.inline
  def apply(
    caseFirst: String,
    collation: String,
    ignorePunctuation: Boolean,
    locale: String,
    numeric: Boolean,
    sensitivity: String,
    usage: String
  ): ResolvedCollatorOptions = {
    val __obj = js.Dynamic.literal(caseFirst = caseFirst.asInstanceOf[js.Any], collation = collation.asInstanceOf[js.Any], ignorePunctuation = ignorePunctuation.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], sensitivity = sensitivity.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedCollatorOptions]
  }
}

