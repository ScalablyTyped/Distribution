package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SjclHashes extends StObject {
  
  var ripemd160: SjclHashStatic
  
  var sha1: SjclHashStatic
  
  var sha256: SjclHashStatic
  
  var sha512: SjclHashStatic
}
object SjclHashes {
  
  inline def apply(ripemd160: SjclHashStatic, sha1: SjclHashStatic, sha256: SjclHashStatic, sha512: SjclHashStatic): SjclHashes = {
    val __obj = js.Dynamic.literal(ripemd160 = ripemd160.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], sha512 = sha512.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclHashes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SjclHashes] (val x: Self) extends AnyVal {
    
    inline def setRipemd160(value: SjclHashStatic): Self = StObject.set(x, "ripemd160", value.asInstanceOf[js.Any])
    
    inline def setSha1(value: SjclHashStatic): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    inline def setSha256(value: SjclHashStatic): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha512(value: SjclHashStatic): Self = StObject.set(x, "sha512", value.asInstanceOf[js.Any])
  }
}
