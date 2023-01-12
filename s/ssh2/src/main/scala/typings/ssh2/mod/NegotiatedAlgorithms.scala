package typings.ssh2.mod

import typings.ssh2.anon.Cipher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NegotiatedAlgorithms extends StObject {
  
  var cs: Cipher
  
  var kex: KexAlgorithm
  
  var sc: Cipher
  
  var serverHostKey: ServerHostKeyAlgorithm
}
object NegotiatedAlgorithms {
  
  inline def apply(cs: Cipher, kex: KexAlgorithm, sc: Cipher, serverHostKey: ServerHostKeyAlgorithm): NegotiatedAlgorithms = {
    val __obj = js.Dynamic.literal(cs = cs.asInstanceOf[js.Any], kex = kex.asInstanceOf[js.Any], sc = sc.asInstanceOf[js.Any], serverHostKey = serverHostKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NegotiatedAlgorithms]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NegotiatedAlgorithms] (val x: Self) extends AnyVal {
    
    inline def setCs(value: Cipher): Self = StObject.set(x, "cs", value.asInstanceOf[js.Any])
    
    inline def setKex(value: KexAlgorithm): Self = StObject.set(x, "kex", value.asInstanceOf[js.Any])
    
    inline def setSc(value: Cipher): Self = StObject.set(x, "sc", value.asInstanceOf[js.Any])
    
    inline def setServerHostKey(value: ServerHostKeyAlgorithm): Self = StObject.set(x, "serverHostKey", value.asInstanceOf[js.Any])
  }
}
