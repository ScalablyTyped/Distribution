package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldToMatch extends js.Object {
  var fieldToMatch: Anon_DataType
  var positionalConstraint: java.lang.String
  var targetString: js.UndefOr[java.lang.String] = js.undefined
  var textTransformation: java.lang.String
}

object Anon_FieldToMatch {
  @scala.inline
  def apply(
    fieldToMatch: Anon_DataType,
    positionalConstraint: java.lang.String,
    textTransformation: java.lang.String,
    targetString: java.lang.String = null
  ): Anon_FieldToMatch = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch, positionalConstraint = positionalConstraint, textTransformation = textTransformation)
    if (targetString != null) __obj.updateDynamic("targetString")(targetString)
    __obj.asInstanceOf[Anon_FieldToMatch]
  }
}

