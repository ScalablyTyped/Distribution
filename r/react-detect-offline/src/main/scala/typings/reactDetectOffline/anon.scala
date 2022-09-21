package typings.reactDetectOffline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Online extends StObject {
    
    var online: Boolean
  }
  object Online {
    
    inline def apply(online: Boolean): Online = {
      val __obj = js.Dynamic.literal(online = online.asInstanceOf[js.Any])
      __obj.asInstanceOf[Online]
    }
    
    extension [Self <: Online](x: Self) {
      
      inline def setOnline(value: Boolean): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    }
  }
}
