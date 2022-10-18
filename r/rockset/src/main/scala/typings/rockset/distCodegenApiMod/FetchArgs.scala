package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchArgs extends StObject {
  
  var options: Any
  
  var url: String
}
object FetchArgs {
  
  inline def apply(options: Any, url: String): FetchArgs = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchArgs]
  }
  
  extension [Self <: FetchArgs](x: Self) {
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
