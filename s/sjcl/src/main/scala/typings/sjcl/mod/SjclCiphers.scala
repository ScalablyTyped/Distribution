package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ________________________________________________________________________
trait SjclCiphers extends StObject {
  
  var aes: SjclCipherStatic
}
object SjclCiphers {
  
  @scala.inline
  def apply(aes: SjclCipherStatic): SjclCiphers = {
    val __obj = js.Dynamic.literal(aes = aes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCiphers]
  }
  
  @scala.inline
  implicit class SjclCiphersMutableBuilder[Self <: SjclCiphers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAes(value: SjclCipherStatic): Self = StObject.set(x, "aes", value.asInstanceOf[js.Any])
  }
}
