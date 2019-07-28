package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldToMatchRegexPatternSetIdTextTransformation extends js.Object {
  var fieldToMatch: Input[Anon_DataTypeInput]
  var regexPatternSetId: Input[String]
  var textTransformation: Input[String]
}

object Anon_FieldToMatchRegexPatternSetIdTextTransformation {
  @scala.inline
  def apply(
    fieldToMatch: Input[Anon_DataTypeInput],
    regexPatternSetId: Input[String],
    textTransformation: Input[String]
  ): Anon_FieldToMatchRegexPatternSetIdTextTransformation = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch.asInstanceOf[js.Any], regexPatternSetId = regexPatternSetId.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FieldToMatchRegexPatternSetIdTextTransformation]
  }
}

