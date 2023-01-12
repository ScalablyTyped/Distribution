package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfiniteHitsProvided[THit] extends StObject {
  
  /** indicates if there are more pages to load */
  var hasMore: Boolean
  
  var hasPrevious: Boolean
  
  /** the records that matched the search */
  var hits: js.Array[THit]
  
  def refineNext(args: Any*): Any
  
  def refinePrevious(args: Any*): Any
}
object InfiniteHitsProvided {
  
  inline def apply[THit](
    hasMore: Boolean,
    hasPrevious: Boolean,
    hits: js.Array[THit],
    refineNext: /* repeated */ Any => Any,
    refinePrevious: /* repeated */ Any => Any
  ): InfiniteHitsProvided[THit] = {
    val __obj = js.Dynamic.literal(hasMore = hasMore.asInstanceOf[js.Any], hasPrevious = hasPrevious.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], refineNext = js.Any.fromFunction1(refineNext), refinePrevious = js.Any.fromFunction1(refinePrevious))
    __obj.asInstanceOf[InfiniteHitsProvided[THit]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InfiniteHitsProvided[?], THit] (val x: Self & InfiniteHitsProvided[THit]) extends AnyVal {
    
    inline def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
    
    inline def setHasPrevious(value: Boolean): Self = StObject.set(x, "hasPrevious", value.asInstanceOf[js.Any])
    
    inline def setHits(value: js.Array[THit]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    inline def setHitsVarargs(value: THit*): Self = StObject.set(x, "hits", js.Array(value*))
    
    inline def setRefineNext(value: /* repeated */ Any => Any): Self = StObject.set(x, "refineNext", js.Any.fromFunction1(value))
    
    inline def setRefinePrevious(value: /* repeated */ Any => Any): Self = StObject.set(x, "refinePrevious", js.Any.fromFunction1(value))
  }
}
