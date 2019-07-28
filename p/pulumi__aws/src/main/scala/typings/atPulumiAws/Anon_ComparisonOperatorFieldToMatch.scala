package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComparisonOperatorFieldToMatch extends js.Object {
  var comparisonOperator: String
  var fieldToMatch: Anon_DataType
  var size: Double
  var textTransformation: String
}

object Anon_ComparisonOperatorFieldToMatch {
  @scala.inline
  def apply(comparisonOperator: String, fieldToMatch: Anon_DataType, size: Double, textTransformation: String): Anon_ComparisonOperatorFieldToMatch = {
    val __obj = js.Dynamic.literal(comparisonOperator = comparisonOperator, fieldToMatch = fieldToMatch, size = size, textTransformation = textTransformation)
  
    __obj.asInstanceOf[Anon_ComparisonOperatorFieldToMatch]
  }
}

