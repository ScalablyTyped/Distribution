package typings.pulumiAws.outputMod.wafregional

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ByteMatchSetByteMatchTupleFieldToMatch extends StObject {
  
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
  implicit class ByteMatchSetByteMatchTupleFieldToMatchMutableBuilder[Self <: ByteMatchSetByteMatchTupleFieldToMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
