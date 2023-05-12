package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlRedirect
  extends StObject
     with Node {
  
  var path: String
  
  var target: String
}
object UrlRedirect {
  
  inline def apply(id: ID, path: String, target: String): UrlRedirect = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlRedirect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UrlRedirect] (val x: Self) extends AnyVal {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
