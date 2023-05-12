package typings.sigstore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hash extends StObject {
  
  /**
    * Specifies the hash algorithm and value for the content
    */
  var hash: js.UndefOr[Value] = js.undefined
}
object Hash {
  
  inline def apply(): Hash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hash]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hash] (val x: Self) extends AnyVal {
    
    inline def setHash(value: Value): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
  }
}
