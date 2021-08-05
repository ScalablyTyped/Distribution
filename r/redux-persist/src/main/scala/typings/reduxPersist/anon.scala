package typings.reduxPersist

import typings.reduxPersist.typesMod.PersistState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Persist extends StObject {
    
    var _persist: PersistState
  }
  object Persist {
    
    inline def apply(_persist: PersistState): Persist = {
      val __obj = js.Dynamic.literal(_persist = _persist.asInstanceOf[js.Any])
      __obj.asInstanceOf[Persist]
    }
    
    extension [Self <: Persist](x: Self) {
      
      inline def set_persist(value: PersistState): Self = StObject.set(x, "_persist", value.asInstanceOf[js.Any])
    }
  }
}
