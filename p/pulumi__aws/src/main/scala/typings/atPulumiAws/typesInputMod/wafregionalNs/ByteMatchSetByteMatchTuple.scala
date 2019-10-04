package typings.atPulumiAws.typesInputMod.wafregionalNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByteMatchSetByteMatchTuple extends js.Object {
  /**
    * Settings for the ByteMatchTuple. FieldToMatch documented below.
    */
  var fieldToMatch: Input[ByteMatchSetByteMatchTupleFieldToMatch]
  /**
    * Within the portion of a web request that you want to search.
    */
  var positionalConstraint: Input[String]
  /**
    * The value that you want AWS WAF to search for. The maximum length of the value is 50 bytes.
    */
  var targetString: js.UndefOr[Input[String]] = js.undefined
  /**
    * The formatting way for web request.
    */
  var textTransformation: Input[String]
}

object ByteMatchSetByteMatchTuple {
  @scala.inline
  def apply(
    fieldToMatch: Input[ByteMatchSetByteMatchTupleFieldToMatch],
    positionalConstraint: Input[String],
    textTransformation: Input[String],
    targetString: Input[String] = null
  ): ByteMatchSetByteMatchTuple = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch.asInstanceOf[js.Any], positionalConstraint = positionalConstraint.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
    if (targetString != null) __obj.updateDynamic("targetString")(targetString.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteMatchSetByteMatchTuple]
  }
}

