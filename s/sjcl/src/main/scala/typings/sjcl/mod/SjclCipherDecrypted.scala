package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SjclCipherDecrypted
  extends StObject
     with SjclCipherEncrypted {
  
  var key: BitArray_
}
object SjclCipherDecrypted {
  
  @scala.inline
  def apply(ct: BitArray_, iv: BitArray_, key: BitArray_, salt: BitArray_): SjclCipherDecrypted = {
    val __obj = js.Dynamic.literal(ct = ct.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCipherDecrypted]
  }
  
  @scala.inline
  implicit class SjclCipherDecryptedMutableBuilder[Self <: SjclCipherDecrypted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: BitArray_): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyVarargs(value: Double*): Self = StObject.set(x, "key", js.Array(value :_*))
  }
}
