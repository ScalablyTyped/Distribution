package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HitsProvided[THit] extends StObject {
  
  /** the records that matched the search state */
  var hits: js.Array[Hit[THit]]
}
object HitsProvided {
  
  inline def apply[THit](hits: js.Array[Hit[THit]]): HitsProvided[THit] = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitsProvided[THit]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HitsProvided[?], THit] (val x: Self & HitsProvided[THit]) extends AnyVal {
    
    inline def setHits(value: js.Array[Hit[THit]]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    inline def setHitsVarargs(value: Hit[THit]*): Self = StObject.set(x, "hits", js.Array(value*))
  }
}
