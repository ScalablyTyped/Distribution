package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configure extends StObject {
  
  var configure: HitsPerPage
}
object Configure {
  
  inline def apply(configure: HitsPerPage): Configure = {
    val __obj = js.Dynamic.literal(configure = configure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configure]
  }
  
  extension [Self <: Configure](x: Self) {
    
    inline def setConfigure(value: HitsPerPage): Self = StObject.set(x, "configure", value.asInstanceOf[js.Any])
  }
}
