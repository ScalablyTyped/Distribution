package typings.rdflib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Q extends StObject {
  
  var q: js.UndefOr[Double | String] = js.undefined
}
object Q {
  
  inline def apply(): Q = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Q]
  }
  
  extension [Self <: Q](x: Self) {
    
    inline def setQ(value: Double | String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
  }
}
