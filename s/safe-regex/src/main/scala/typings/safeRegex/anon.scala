package typings.safeRegex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Limit extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
  }
  object Limit {
    
    inline def apply(): Limit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Limit]
    }
    
    extension [Self <: Limit](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
}
