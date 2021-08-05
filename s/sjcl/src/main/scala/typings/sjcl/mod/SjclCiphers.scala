package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ________________________________________________________________________
trait SjclCiphers extends StObject {
  
  var aes: SjclCipherStatic
}
object SjclCiphers {
  
  inline def apply(aes: SjclCipherStatic): SjclCiphers = {
    val __obj = js.Dynamic.literal(aes = aes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCiphers]
  }
  
  extension [Self <: SjclCiphers](x: Self) {
    
    inline def setAes(value: SjclCipherStatic): Self = StObject.set(x, "aes", value.asInstanceOf[js.Any])
  }
}
