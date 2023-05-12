package typings.sigstore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chain extends StObject {
  
  var chain: Certificates
}
object Chain {
  
  inline def apply(chain: Certificates): Chain = {
    val __obj = js.Dynamic.literal(chain = chain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Chain] (val x: Self) extends AnyVal {
    
    inline def setChain(value: Certificates): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
  }
}
