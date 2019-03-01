package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldToMatchTextTransformationAnonDataTypeInput extends js.Object {
  var fieldToMatch: atPulumiPulumiLib.outputMod.Input[Anon_DataTypeInput]
  var textTransformation: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_FieldToMatchTextTransformationAnonDataTypeInput {
  @scala.inline
  def apply(
    fieldToMatch: atPulumiPulumiLib.outputMod.Input[Anon_DataTypeInput],
    textTransformation: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_FieldToMatchTextTransformationAnonDataTypeInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fieldToMatch")(fieldToMatch.asInstanceOf[js.Any])
    __obj.updateDynamic("textTransformation")(textTransformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FieldToMatchTextTransformationAnonDataTypeInput]
  }
}

