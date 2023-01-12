package typings.ssh2.mod

import typings.ssh2.ssh2Strings.sha256
import typings.ssh2.ssh2Strings.sha512
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SigningRequestOptions extends StObject {
  
  var hash: sha256 | sha512
}
object SigningRequestOptions {
  
  inline def apply(hash: sha256 | sha512): SigningRequestOptions = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningRequestOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SigningRequestOptions] (val x: Self) extends AnyVal {
    
    inline def setHash(value: sha256 | sha512): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
  }
}
