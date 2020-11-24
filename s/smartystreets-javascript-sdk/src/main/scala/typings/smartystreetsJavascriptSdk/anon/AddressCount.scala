package typings.smartystreetsJavascriptSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressCount extends js.Object {
  
  var addressCount: Double = js.native
  
  var bytes: Double = js.native
  
  var characterCount: Double = js.native
  
  var lines: js.Any = js.native
  
  var unicode: js.Any = js.native
  
  var verifiedCount: Double = js.native
}
object AddressCount {
  
  @scala.inline
  def apply(
    addressCount: Double,
    bytes: Double,
    characterCount: Double,
    lines: js.Any,
    unicode: js.Any,
    verifiedCount: Double
  ): AddressCount = {
    val __obj = js.Dynamic.literal(addressCount = addressCount.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], characterCount = characterCount.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any], verifiedCount = verifiedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressCount]
  }
  
  @scala.inline
  implicit class AddressCountOps[Self <: AddressCount] (val x: Self) extends AnyVal {
    
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
    def setAddressCount(value: Double): Self = this.set("addressCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytes(value: Double): Self = this.set("bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterCount(value: Double): Self = this.set("characterCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLines(value: js.Any): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicode(value: js.Any): Self = this.set("unicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifiedCount(value: Double): Self = this.set("verifiedCount", value.asInstanceOf[js.Any])
  }
}
