package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldToMatchRegexPatternSetId extends js.Object {
  var fieldToMatch: Anon_DataType
  var regexPatternSetId: java.lang.String
  var textTransformation: java.lang.String
}

object Anon_FieldToMatchRegexPatternSetId {
  @scala.inline
  def apply(
    fieldToMatch: Anon_DataType,
    regexPatternSetId: java.lang.String,
    textTransformation: java.lang.String
  ): Anon_FieldToMatchRegexPatternSetId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fieldToMatch")(fieldToMatch)
    __obj.updateDynamic("regexPatternSetId")(regexPatternSetId)
    __obj.updateDynamic("textTransformation")(textTransformation)
    __obj.asInstanceOf[Anon_FieldToMatchRegexPatternSetId]
  }
}

