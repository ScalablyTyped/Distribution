package typings.atPulumiAws.typesOutputMod.wafregional

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByteMatchSetByteMatchTuple extends js.Object {
  /**
    * Settings for the ByteMatchTuple. FieldToMatch documented below.
    */
  var fieldToMatch: ByteMatchSetByteMatchTupleFieldToMatch
  /**
    * Within the portion of a web request that you want to search.
    */
  var positionalConstraint: String
  /**
    * The value that you want AWS WAF to search for. The maximum length of the value is 50 bytes.
    */
  var targetString: js.UndefOr[String] = js.undefined
  /**
    * The formatting way for web request.
    */
  var textTransformation: String
}

object ByteMatchSetByteMatchTuple {
  @scala.inline
  def apply(
    fieldToMatch: ByteMatchSetByteMatchTupleFieldToMatch,
    positionalConstraint: String,
    textTransformation: String,
    targetString: String = null
  ): ByteMatchSetByteMatchTuple = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch, positionalConstraint = positionalConstraint, textTransformation = textTransformation)
    if (targetString != null) __obj.updateDynamic("targetString")(targetString)
    __obj.asInstanceOf[ByteMatchSetByteMatchTuple]
  }
}

