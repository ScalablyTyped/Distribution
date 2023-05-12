package typings.sigstore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FulcioURL extends StObject {
  
  var fulcioURL: js.UndefOr[String] = js.undefined
}
object FulcioURL {
  
  inline def apply(): FulcioURL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FulcioURL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FulcioURL] (val x: Self) extends AnyVal {
    
    inline def setFulcioURL(value: String): Self = StObject.set(x, "fulcioURL", value.asInstanceOf[js.Any])
    
    inline def setFulcioURLUndefined: Self = StObject.set(x, "fulcioURL", js.undefined)
  }
}
