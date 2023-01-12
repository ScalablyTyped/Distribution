package typings.reachRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerLocationProps extends StObject {
  
  var url: String
}
object ServerLocationProps {
  
  inline def apply(url: String): ServerLocationProps = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerLocationProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerLocationProps] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
