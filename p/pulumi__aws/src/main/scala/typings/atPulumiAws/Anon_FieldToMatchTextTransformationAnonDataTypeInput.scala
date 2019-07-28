package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldToMatchTextTransformationAnonDataTypeInput extends js.Object {
  var fieldToMatch: Input[Anon_DataTypeInput]
  var textTransformation: Input[String]
}

object Anon_FieldToMatchTextTransformationAnonDataTypeInput {
  @scala.inline
  def apply(fieldToMatch: Input[Anon_DataTypeInput], textTransformation: Input[String]): Anon_FieldToMatchTextTransformationAnonDataTypeInput = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FieldToMatchTextTransformationAnonDataTypeInput]
  }
}

