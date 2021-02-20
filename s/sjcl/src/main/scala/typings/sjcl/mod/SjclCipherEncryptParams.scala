package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclCipherEncryptParams extends SjclCipherParams {
  
  var iv: BitArray_ = js.native
  
  var salt: BitArray_ = js.native
}
object SjclCipherEncryptParams {
  
  @scala.inline
  def apply(iv: BitArray_, salt: BitArray_): SjclCipherEncryptParams = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCipherEncryptParams]
  }
  
  @scala.inline
  implicit class SjclCipherEncryptParamsMutableBuilder[Self <: SjclCipherEncryptParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIv(value: BitArray_): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvVarargs(value: Double*): Self = StObject.set(x, "iv", js.Array(value :_*))
    
    @scala.inline
    def setSalt(value: BitArray_): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltVarargs(value: Double*): Self = StObject.set(x, "salt", js.Array(value :_*))
  }
}
