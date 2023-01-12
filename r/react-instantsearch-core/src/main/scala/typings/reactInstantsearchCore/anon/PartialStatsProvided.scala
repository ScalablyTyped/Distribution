package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.StatsProvided> */
trait PartialStatsProvided extends StObject {
  
  var areHitsSorted: js.UndefOr[Boolean] = js.undefined
  
  var nbHits: js.UndefOr[Double] = js.undefined
  
  var nbSortedHits: js.UndefOr[Double] = js.undefined
  
  var processingTimeMS: js.UndefOr[Double] = js.undefined
}
object PartialStatsProvided {
  
  inline def apply(): PartialStatsProvided = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStatsProvided]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialStatsProvided] (val x: Self) extends AnyVal {
    
    inline def setAreHitsSorted(value: Boolean): Self = StObject.set(x, "areHitsSorted", value.asInstanceOf[js.Any])
    
    inline def setAreHitsSortedUndefined: Self = StObject.set(x, "areHitsSorted", js.undefined)
    
    inline def setNbHits(value: Double): Self = StObject.set(x, "nbHits", value.asInstanceOf[js.Any])
    
    inline def setNbHitsUndefined: Self = StObject.set(x, "nbHits", js.undefined)
    
    inline def setNbSortedHits(value: Double): Self = StObject.set(x, "nbSortedHits", value.asInstanceOf[js.Any])
    
    inline def setNbSortedHitsUndefined: Self = StObject.set(x, "nbSortedHits", js.undefined)
    
    inline def setProcessingTimeMS(value: Double): Self = StObject.set(x, "processingTimeMS", value.asInstanceOf[js.Any])
    
    inline def setProcessingTimeMSUndefined: Self = StObject.set(x, "processingTimeMS", js.undefined)
  }
}
