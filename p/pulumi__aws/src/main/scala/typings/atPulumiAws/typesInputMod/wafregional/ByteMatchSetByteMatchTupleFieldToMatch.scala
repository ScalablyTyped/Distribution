package typings.atPulumiAws.typesInputMod.wafregional

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByteMatchSetByteMatchTupleFieldToMatch extends js.Object {
  /**
    * When the value of Type is HEADER, enter the name of the header that you want AWS WAF to search, for example, User-Agent or Referer. If the value of Type is any other value, omit Data.
    */
  var data: js.UndefOr[Input[String]] = js.undefined
  /**
    * The part of the web request that you want AWS WAF to search for a specified string.
    */
  var `type`: Input[String]
}

object ByteMatchSetByteMatchTupleFieldToMatch {
  @scala.inline
  def apply(`type`: Input[String], data: Input[String] = null): ByteMatchSetByteMatchTupleFieldToMatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteMatchSetByteMatchTupleFieldToMatch]
  }
}

