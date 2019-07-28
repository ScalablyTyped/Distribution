package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComparisonOperatorFieldToMatchSize extends js.Object {
  var comparisonOperator: Input[String]
  var fieldToMatch: Input[Anon_DataTypeInput]
  var size: Input[Double]
  var textTransformation: Input[String]
}

object Anon_ComparisonOperatorFieldToMatchSize {
  @scala.inline
  def apply(
    comparisonOperator: Input[String],
    fieldToMatch: Input[Anon_DataTypeInput],
    size: Input[Double],
    textTransformation: Input[String]
  ): Anon_ComparisonOperatorFieldToMatchSize = {
    val __obj = js.Dynamic.literal(comparisonOperator = comparisonOperator.asInstanceOf[js.Any], fieldToMatch = fieldToMatch.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ComparisonOperatorFieldToMatchSize]
  }
}

