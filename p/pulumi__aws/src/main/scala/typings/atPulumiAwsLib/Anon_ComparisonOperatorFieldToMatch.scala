package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComparisonOperatorFieldToMatch extends js.Object {
  var comparisonOperator: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var fieldToMatch: atPulumiPulumiLib.outputMod.Input[Anon_DataTypeInput]
  var size: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var textTransformation: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_ComparisonOperatorFieldToMatch {
  @scala.inline
  def apply(
    comparisonOperator: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    fieldToMatch: atPulumiPulumiLib.outputMod.Input[Anon_DataTypeInput],
    size: atPulumiPulumiLib.outputMod.Input[scala.Double],
    textTransformation: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_ComparisonOperatorFieldToMatch = {
    val __obj = js.Dynamic.literal(comparisonOperator = comparisonOperator.asInstanceOf[js.Any], fieldToMatch = fieldToMatch.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ComparisonOperatorFieldToMatch]
  }
}

