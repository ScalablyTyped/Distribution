package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComparisonOperator extends js.Object {
  var comparisonOperator: java.lang.String
  var fieldToMatch: Anon_DataType
  var size: scala.Double
  var textTransformation: java.lang.String
}

object Anon_ComparisonOperator {
  @scala.inline
  def apply(
    comparisonOperator: java.lang.String,
    fieldToMatch: Anon_DataType,
    size: scala.Double,
    textTransformation: java.lang.String
  ): Anon_ComparisonOperator = {
    val __obj = js.Dynamic.literal(comparisonOperator = comparisonOperator, fieldToMatch = fieldToMatch, size = size, textTransformation = textTransformation)
  
    __obj.asInstanceOf[Anon_ComparisonOperator]
  }
}

