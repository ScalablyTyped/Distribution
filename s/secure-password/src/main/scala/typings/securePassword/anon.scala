package typings.securePassword

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Memlimit extends StObject {
    
    var memlimit: js.UndefOr[Double] = js.undefined
    
    var opslimit: js.UndefOr[Double] = js.undefined
  }
  object Memlimit {
    
    inline def apply(): Memlimit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Memlimit]
    }
    
    extension [Self <: Memlimit](x: Self) {
      
      inline def setMemlimit(value: Double): Self = StObject.set(x, "memlimit", value.asInstanceOf[js.Any])
      
      inline def setMemlimitUndefined: Self = StObject.set(x, "memlimit", js.undefined)
      
      inline def setOpslimit(value: Double): Self = StObject.set(x, "opslimit", value.asInstanceOf[js.Any])
      
      inline def setOpslimitUndefined: Self = StObject.set(x, "opslimit", js.undefined)
    }
  }
}
