package typings.pulumiAws.outputMod.wafregional

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteMatchSetByteMatchTupleFieldToMatch extends js.Object {
  /**
    * When the value of Type is HEADER, enter the name of the header that you want AWS WAF to search, for example, User-Agent or Referer. If the value of Type is any other value, omit Data.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * The part of the web request that you want AWS WAF to search for a specified string.
    */
  var `type`: String = js.native
}

object ByteMatchSetByteMatchTupleFieldToMatch {
  @scala.inline
  def apply(`type`: String): ByteMatchSetByteMatchTupleFieldToMatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteMatchSetByteMatchTupleFieldToMatch]
  }
  @scala.inline
  implicit class ByteMatchSetByteMatchTupleFieldToMatchOps[Self <: ByteMatchSetByteMatchTupleFieldToMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

