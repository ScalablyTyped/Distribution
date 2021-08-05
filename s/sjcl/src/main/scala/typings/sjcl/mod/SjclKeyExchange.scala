package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ________________________________________________________________________
trait SjclKeyExchange extends StObject {
  
  var srp: SjclSecureRemotePassword
}
object SjclKeyExchange {
  
  inline def apply(srp: SjclSecureRemotePassword): SjclKeyExchange = {
    val __obj = js.Dynamic.literal(srp = srp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclKeyExchange]
  }
  
  extension [Self <: SjclKeyExchange](x: Self) {
    
    inline def setSrp(value: SjclSecureRemotePassword): Self = StObject.set(x, "srp", value.asInstanceOf[js.Any])
  }
}
