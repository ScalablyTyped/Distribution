package typings.salesTax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Direct extends StObject {
    
    var direct: Boolean
    
    var reverse: Boolean
  }
  object Direct {
    
    inline def apply(direct: Boolean, reverse: Boolean): Direct = {
      val __obj = js.Dynamic.literal(direct = direct.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any])
      __obj.asInstanceOf[Direct]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Direct] (val x: Self) extends AnyVal {
      
      inline def setDirect(value: Boolean): Self = StObject.set(x, "direct", value.asInstanceOf[js.Any])
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rate extends StObject {
    
    var rate: Double
    
    var `type`: String
  }
  object Rate {
    
    inline def apply(rate: Double, `type`: String): Rate = {
      val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rate] (val x: Self) extends AnyVal {
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
