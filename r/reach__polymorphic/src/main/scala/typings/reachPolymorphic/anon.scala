package typings.reachPolymorphic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait As[E] extends StObject {
    
    var as: js.UndefOr[E] = js.undefined
  }
  object As {
    
    inline def apply[E](): As[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[As[E]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: As[?], E] (val x: Self & As[E]) extends AnyVal {
      
      inline def setAs(value: E): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    }
  }
}
