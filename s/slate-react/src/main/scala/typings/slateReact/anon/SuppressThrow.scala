package typings.slateReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuppressThrow[T_1 /* <: Boolean */] extends StObject {
  
  var exactMatch: T_1
  
  var suppressThrow: T_1
}
object SuppressThrow {
  
  inline def apply[T_1 /* <: Boolean */](exactMatch: T_1, suppressThrow: T_1): SuppressThrow[T_1] = {
    val __obj = js.Dynamic.literal(exactMatch = exactMatch.asInstanceOf[js.Any], suppressThrow = suppressThrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuppressThrow[T_1]]
  }
  
  extension [Self <: SuppressThrow[?], T_1 /* <: Boolean */](x: Self & SuppressThrow[T_1]) {
    
    inline def setExactMatch(value: T_1): Self = StObject.set(x, "exactMatch", value.asInstanceOf[js.Any])
    
    inline def setSuppressThrow(value: T_1): Self = StObject.set(x, "suppressThrow", value.asInstanceOf[js.Any])
  }
}
