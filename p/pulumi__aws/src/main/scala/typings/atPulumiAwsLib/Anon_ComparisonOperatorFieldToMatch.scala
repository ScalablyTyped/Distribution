package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComparisonOperatorFieldToMatch extends js.Object {
  var comparisonOperator: java.lang.String
  var fieldToMatch: Anon_DataType
  var size: scala.Double
  var textTransformation: java.lang.String
}

object Anon_ComparisonOperatorFieldToMatch {
  @scala.inline
  def apply(
    comparisonOperator: java.lang.String,
    fieldToMatch: Anon_DataType,
    size: scala.Double,
    textTransformation: java.lang.String
  ): Anon_ComparisonOperatorFieldToMatch = {
    val __obj = js.Dynamic.literal(comparisonOperator = comparisonOperator, fieldToMatch = fieldToMatch, size = size, textTransformation = textTransformation)
  
    __obj.asInstanceOf[Anon_ComparisonOperatorFieldToMatch]
  }
}

