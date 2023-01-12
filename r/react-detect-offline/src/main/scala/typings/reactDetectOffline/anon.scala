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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Online] (val x: Self) extends AnyVal {
      
      inline def setOnline(value: Boolean): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    }
  }
}
