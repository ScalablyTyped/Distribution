package typings.sigstore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RekorURL extends StObject {
  
  var rekorURL: js.UndefOr[String] = js.undefined
}
object RekorURL {
  
  inline def apply(): RekorURL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RekorURL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RekorURL] (val x: Self) extends AnyVal {
    
    inline def setRekorURL(value: String): Self = StObject.set(x, "rekorURL", value.asInstanceOf[js.Any])
    
    inline def setRekorURLUndefined: Self = StObject.set(x, "rekorURL", js.undefined)
  }
}
