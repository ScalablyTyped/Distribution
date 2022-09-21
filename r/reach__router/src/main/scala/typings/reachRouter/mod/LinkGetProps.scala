package typings.reachRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkGetProps extends StObject {
  
  var href: String
  
  var isCurrent: Boolean
  
  var isPartiallyCurrent: Boolean
  
  var location: WindowLocation[Any]
}
object LinkGetProps {
  
  inline def apply(href: String, isCurrent: Boolean, isPartiallyCurrent: Boolean, location: WindowLocation[Any]): LinkGetProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], isCurrent = isCurrent.asInstanceOf[js.Any], isPartiallyCurrent = isPartiallyCurrent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkGetProps]
  }
  
  extension [Self <: LinkGetProps](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setIsCurrent(value: Boolean): Self = StObject.set(x, "isCurrent", value.asInstanceOf[js.Any])
    
    inline def setIsPartiallyCurrent(value: Boolean): Self = StObject.set(x, "isPartiallyCurrent", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: WindowLocation[Any]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
