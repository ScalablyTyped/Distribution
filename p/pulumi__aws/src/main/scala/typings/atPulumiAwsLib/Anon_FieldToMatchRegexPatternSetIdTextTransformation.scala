package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldToMatchRegexPatternSetIdTextTransformation extends js.Object {
  var fieldToMatch: atPulumiPulumiLib.outputMod.Input[Anon_DataTypeInput]
  var regexPatternSetId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var textTransformation: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_FieldToMatchRegexPatternSetIdTextTransformation {
  @scala.inline
  def apply(
    fieldToMatch: atPulumiPulumiLib.outputMod.Input[Anon_DataTypeInput],
    regexPatternSetId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    textTransformation: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_FieldToMatchRegexPatternSetIdTextTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fieldToMatch")(fieldToMatch.asInstanceOf[js.Any])
    __obj.updateDynamic("regexPatternSetId")(regexPatternSetId.asInstanceOf[js.Any])
    __obj.updateDynamic("textTransformation")(textTransformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FieldToMatchRegexPatternSetIdTextTransformation]
  }
}

