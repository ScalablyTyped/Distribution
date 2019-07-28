package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldToMatchPositionalConstraint extends js.Object {
  var fieldToMatch: Input[Anon_DataTypeInput]
  var positionalConstraint: Input[String]
  var targetString: js.UndefOr[Input[String]] = js.undefined
  var textTransformation: Input[String]
}

object Anon_FieldToMatchPositionalConstraint {
  @scala.inline
  def apply(
    fieldToMatch: Input[Anon_DataTypeInput],
    positionalConstraint: Input[String],
    textTransformation: Input[String],
    targetString: Input[String] = null
  ): Anon_FieldToMatchPositionalConstraint = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch.asInstanceOf[js.Any], positionalConstraint = positionalConstraint.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
    if (targetString != null) __obj.updateDynamic("targetString")(targetString.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FieldToMatchPositionalConstraint]
  }
}

