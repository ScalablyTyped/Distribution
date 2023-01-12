package typings.relaxedJson

import typings.relaxedJson.mod.Reviver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Duplicate extends StObject {
    
    var duplicate: js.UndefOr[Boolean] = js.undefined
    
    var relaxed: js.UndefOr[Boolean] = js.undefined
    
    var reviver: js.UndefOr[Reviver] = js.undefined
    
    var tolerant: js.UndefOr[Boolean] = js.undefined
    
    var warnings: js.UndefOr[Boolean] = js.undefined
  }
  object Duplicate {
    
    inline def apply(): Duplicate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Duplicate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Duplicate] (val x: Self) extends AnyVal {
      
      inline def setDuplicate(value: Boolean): Self = StObject.set(x, "duplicate", value.asInstanceOf[js.Any])
      
      inline def setDuplicateUndefined: Self = StObject.set(x, "duplicate", js.undefined)
      
      inline def setRelaxed(value: Boolean): Self = StObject.set(x, "relaxed", value.asInstanceOf[js.Any])
      
      inline def setRelaxedUndefined: Self = StObject.set(x, "relaxed", js.undefined)
      
      inline def setReviver(value: Reviver): Self = StObject.set(x, "reviver", value.asInstanceOf[js.Any])
      
      inline def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
      
      inline def setTolerant(value: Boolean): Self = StObject.set(x, "tolerant", value.asInstanceOf[js.Any])
      
      inline def setTolerantUndefined: Self = StObject.set(x, "tolerant", js.undefined)
      
      inline def setWarnings(value: Boolean): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    }
  }
}
