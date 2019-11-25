package typings.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedCollatorOptions extends js.Object {
  var caseFirst: java.lang.String
  var collation: java.lang.String
  var ignorePunctuation: scala.Boolean
  var locale: java.lang.String
  var numeric: scala.Boolean
  var sensitivity: java.lang.String
  var usage: java.lang.String
}

object ResolvedCollatorOptions {
  @scala.inline
  def apply(
    caseFirst: java.lang.String,
    collation: java.lang.String,
    ignorePunctuation: scala.Boolean,
    locale: java.lang.String,
    numeric: scala.Boolean,
    sensitivity: java.lang.String,
    usage: java.lang.String
  ): ResolvedCollatorOptions = {
    val __obj = js.Dynamic.literal(caseFirst = caseFirst.asInstanceOf[js.Any], collation = collation.asInstanceOf[js.Any], ignorePunctuation = ignorePunctuation.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], sensitivity = sensitivity.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResolvedCollatorOptions]
  }
}

