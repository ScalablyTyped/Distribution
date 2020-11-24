package typings.pulumiAws.outputMod.wafregional

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ByteMatchSetByteMatchTuple extends js.Object {
  
  /**
    * Settings for the ByteMatchTuple. FieldToMatch documented below.
    */
  var fieldToMatch: ByteMatchSetByteMatchTupleFieldToMatch = js.native
  
  /**
    * Within the portion of a web request that you want to search.
    */
  var positionalConstraint: String = js.native
  
  /**
    * The value that you want AWS WAF to search for. The maximum length of the value is 50 bytes.
    */
  var targetString: js.UndefOr[String] = js.native
  
  /**
    * The formatting way for web request.
    */
  var textTransformation: String = js.native
}
object ByteMatchSetByteMatchTuple {
  
  @scala.inline
  def apply(
    fieldToMatch: ByteMatchSetByteMatchTupleFieldToMatch,
    positionalConstraint: String,
    textTransformation: String
  ): ByteMatchSetByteMatchTuple = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch.asInstanceOf[js.Any], positionalConstraint = positionalConstraint.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteMatchSetByteMatchTuple]
  }
  
  @scala.inline
  implicit class ByteMatchSetByteMatchTupleOps[Self <: ByteMatchSetByteMatchTuple] (val x: Self) extends AnyVal {
    
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
    def setFieldToMatch(value: ByteMatchSetByteMatchTupleFieldToMatch): Self = this.set("fieldToMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionalConstraint(value: String): Self = this.set("positionalConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformation(value: String): Self = this.set("textTransformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetString(value: String): Self = this.set("targetString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetString: Self = this.set("targetString", js.undefined)
  }
}
