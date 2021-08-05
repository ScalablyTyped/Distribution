package typings.rethinkdb.mod

import typings.rethinkdb.rethinkdbStrings.hard
import typings.rethinkdb.rethinkdbStrings.soft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOptions extends StObject {
  
  var durability: js.UndefOr[hard | soft] = js.undefined
  
  var nonAtomic: js.UndefOr[Boolean] = js.undefined
  
  var returnChanges: js.UndefOr[Boolean] = js.undefined
}
object UpdateOptions {
  
  inline def apply(): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOptions]
  }
  
  extension [Self <: UpdateOptions](x: Self) {
    
    inline def setDurability(value: hard | soft): Self = StObject.set(x, "durability", value.asInstanceOf[js.Any])
    
    inline def setDurabilityUndefined: Self = StObject.set(x, "durability", js.undefined)
    
    inline def setNonAtomic(value: Boolean): Self = StObject.set(x, "nonAtomic", value.asInstanceOf[js.Any])
    
    inline def setNonAtomicUndefined: Self = StObject.set(x, "nonAtomic", js.undefined)
    
    inline def setReturnChanges(value: Boolean): Self = StObject.set(x, "returnChanges", value.asInstanceOf[js.Any])
    
    inline def setReturnChangesUndefined: Self = StObject.set(x, "returnChanges", js.undefined)
  }
}
