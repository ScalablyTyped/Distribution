package typings.slateReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExactMatch[T /* <: Boolean */] extends StObject {
  
  var exactMatch: T
  
  var suppressThrow: T
}
object ExactMatch {
  
  inline def apply[T /* <: Boolean */](exactMatch: T, suppressThrow: T): ExactMatch[T] = {
    val __obj = js.Dynamic.literal(exactMatch = exactMatch.asInstanceOf[js.Any], suppressThrow = suppressThrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExactMatch[T]]
  }
  
  extension [Self <: ExactMatch[?], T /* <: Boolean */](x: Self & ExactMatch[T]) {
    
    inline def setExactMatch(value: T): Self = StObject.set(x, "exactMatch", value.asInstanceOf[js.Any])
    
    inline def setSuppressThrow(value: T): Self = StObject.set(x, "suppressThrow", value.asInstanceOf[js.Any])
  }
}
