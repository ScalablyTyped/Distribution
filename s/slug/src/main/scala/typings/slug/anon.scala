package typings.slug

import typings.slug.mod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Pretty extends StObject {
    
    var pretty: Mode
    
    var rfc3986: Mode
  }
  object Pretty {
    
    inline def apply(pretty: Mode, rfc3986: Mode): Pretty = {
      val __obj = js.Dynamic.literal(pretty = pretty.asInstanceOf[js.Any], rfc3986 = rfc3986.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pretty]
    }
    
    extension [Self <: Pretty](x: Self) {
      
      inline def setPretty(value: Mode): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setRfc3986(value: Mode): Self = StObject.set(x, "rfc3986", value.asInstanceOf[js.Any])
    }
  }
}
