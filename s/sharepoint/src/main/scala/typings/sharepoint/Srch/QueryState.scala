package typings.sharepoint.Srch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryState extends StObject {
  
  var e: Double
  
  var k: String
  
  var r: js.Array[RefinementCategory]
}
object QueryState {
  
  inline def apply(e: Double, k: String, r: js.Array[RefinementCategory]): QueryState = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryState]
  }
  
  extension [Self <: QueryState](x: Self) {
    
    inline def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setK(value: String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    inline def setR(value: js.Array[RefinementCategory]): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRVarargs(value: RefinementCategory*): Self = StObject.set(x, "r", js.Array(value :_*))
  }
}
