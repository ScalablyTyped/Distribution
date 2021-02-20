package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclCipherEncrypted extends SjclCipherEncryptParams {
  
  var ct: BitArray_ = js.native
  
  var kemtag: js.UndefOr[BitArray_] = js.native
}
object SjclCipherEncrypted {
  
  @scala.inline
  def apply(ct: BitArray_, iv: BitArray_, salt: BitArray_): SjclCipherEncrypted = {
    val __obj = js.Dynamic.literal(ct = ct.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCipherEncrypted]
  }
  
  @scala.inline
  implicit class SjclCipherEncryptedMutableBuilder[Self <: SjclCipherEncrypted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCt(value: BitArray_): Self = StObject.set(x, "ct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtVarargs(value: Double*): Self = StObject.set(x, "ct", js.Array(value :_*))
    
    @scala.inline
    def setKemtag(value: BitArray_): Self = StObject.set(x, "kemtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKemtagUndefined: Self = StObject.set(x, "kemtag", js.undefined)
    
    @scala.inline
    def setKemtagVarargs(value: Double*): Self = StObject.set(x, "kemtag", js.Array(value :_*))
  }
}
