package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreHttpUrlLocationMod {
  
  trait URLLocation extends StObject {
    
    var base: String
    
    var queryString: String
  }
  object URLLocation {
    
    inline def apply(base: String, queryString: String): URLLocation = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLLocation]
    }
    
    extension [Self <: URLLocation](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    }
  }
}
