package typings.atPulumiAws.typesOutputMod.wafregional

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByteMatchSetByteMatchTupleFieldToMatch extends js.Object {
  /**
    * When the value of Type is HEADER, enter the name of the header that you want AWS WAF to search, for example, User-Agent or Referer. If the value of Type is any other value, omit Data.
    */
  var data: js.UndefOr[String] = js.undefined
  /**
    * The part of the web request that you want AWS WAF to search for a specified string.
    */
  var `type`: String
}

object ByteMatchSetByteMatchTupleFieldToMatch {
  @scala.inline
  def apply(`type`: String, data: String = null): ByteMatchSetByteMatchTupleFieldToMatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[ByteMatchSetByteMatchTupleFieldToMatch]
  }
}

