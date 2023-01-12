package typings.reactHelmetAsync

import typings.reactHelmetAsync.mod.HelmetServerState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Helmet extends StObject {
    
    var helmet: HelmetServerState
  }
  object Helmet {
    
    inline def apply(helmet: HelmetServerState): Helmet = {
      val __obj = js.Dynamic.literal(helmet = helmet.asInstanceOf[js.Any])
      __obj.asInstanceOf[Helmet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Helmet] (val x: Self) extends AnyVal {
      
      inline def setHelmet(value: HelmetServerState): Self = StObject.set(x, "helmet", value.asInstanceOf[js.Any])
    }
  }
}
