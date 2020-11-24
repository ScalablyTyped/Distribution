package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ________________________________________________________________________
@js.native
trait SjclCiphers extends js.Object {
  
  var aes: SjclCipherStatic = js.native
}
object SjclCiphers {
  
  @scala.inline
  def apply(aes: SjclCipherStatic): SjclCiphers = {
    val __obj = js.Dynamic.literal(aes = aes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCiphers]
  }
  
  @scala.inline
  implicit class SjclCiphersOps[Self <: SjclCiphers] (val x: Self) extends AnyVal {
    
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
    def setAes(value: SjclCipherStatic): Self = this.set("aes", value.asInstanceOf[js.Any])
  }
}
