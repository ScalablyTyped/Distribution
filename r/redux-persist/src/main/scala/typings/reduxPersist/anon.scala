package typings.reduxPersist

import typings.reduxPersist.typesMod.PersistState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Persist extends StObject {
    
    var _persist: PersistState = js.native
  }
  object Persist {
    
    @scala.inline
    def apply(_persist: PersistState): Persist = {
      val __obj = js.Dynamic.literal(_persist = _persist.asInstanceOf[js.Any])
      __obj.asInstanceOf[Persist]
    }
    
    @scala.inline
    implicit class PersistMutableBuilder[Self <: Persist] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_persist(value: PersistState): Self = StObject.set(x, "_persist", value.asInstanceOf[js.Any])
    }
  }
}
