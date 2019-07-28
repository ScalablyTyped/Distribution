package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldToMatch extends js.Object {
  var fieldToMatch: Anon_DataType
  var positionalConstraint: String
  var targetString: js.UndefOr[String] = js.undefined
  var textTransformation: String
}

object Anon_FieldToMatch {
  @scala.inline
  def apply(
    fieldToMatch: Anon_DataType,
    positionalConstraint: String,
    textTransformation: String,
    targetString: String = null
  ): Anon_FieldToMatch = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch, positionalConstraint = positionalConstraint, textTransformation = textTransformation)
    if (targetString != null) __obj.updateDynamic("targetString")(targetString)
    __obj.asInstanceOf[Anon_FieldToMatch]
  }
}

