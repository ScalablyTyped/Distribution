package typings.qrcodeTerminal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Small extends StObject {
    
    var small: Boolean
  }
  object Small {
    
    inline def apply(small: Boolean): Small = {
      val __obj = js.Dynamic.literal(small = small.asInstanceOf[js.Any])
      __obj.asInstanceOf[Small]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Small] (val x: Self) extends AnyVal {
      
      inline def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    }
  }
}
