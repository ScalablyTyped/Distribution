package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldToMatchPositionalConstraint extends js.Object {
  var fieldToMatch: atPulumiPulumiLib.outputMod.Input[Anon_DataTypeInput]
  var positionalConstraint: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var targetString: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var textTransformation: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_FieldToMatchPositionalConstraint {
  @scala.inline
  def apply(
    fieldToMatch: atPulumiPulumiLib.outputMod.Input[Anon_DataTypeInput],
    positionalConstraint: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    textTransformation: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    targetString: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_FieldToMatchPositionalConstraint = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch.asInstanceOf[js.Any], positionalConstraint = positionalConstraint.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
    if (targetString != null) __obj.updateDynamic("targetString")(targetString.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FieldToMatchPositionalConstraint]
  }
}

