package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclHashes extends js.Object {
  
  var ripemd160: SjclHashStatic = js.native
  
  var sha1: SjclHashStatic = js.native
  
  var sha256: SjclHashStatic = js.native
  
  var sha512: SjclHashStatic = js.native
}
object SjclHashes {
  
  @scala.inline
  def apply(ripemd160: SjclHashStatic, sha1: SjclHashStatic, sha256: SjclHashStatic, sha512: SjclHashStatic): SjclHashes = {
    val __obj = js.Dynamic.literal(ripemd160 = ripemd160.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], sha512 = sha512.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclHashes]
  }
  
  @scala.inline
  implicit class SjclHashesOps[Self <: SjclHashes] (val x: Self) extends AnyVal {
    
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
    def setRipemd160(value: SjclHashStatic): Self = this.set("ripemd160", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1(value: SjclHashStatic): Self = this.set("sha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha256(value: SjclHashStatic): Self = this.set("sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha512(value: SjclHashStatic): Self = this.set("sha512", value.asInstanceOf[js.Any])
  }
}
