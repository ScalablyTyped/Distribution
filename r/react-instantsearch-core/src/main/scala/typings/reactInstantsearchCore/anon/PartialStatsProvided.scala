package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.StatsProvided> */
trait PartialStatsProvided extends StObject {
  
  var nbHits: js.UndefOr[Double] = js.undefined
  
  var processingTimeMS: js.UndefOr[Double] = js.undefined
}
object PartialStatsProvided {
  
  inline def apply(): PartialStatsProvided = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStatsProvided]
  }
  
  extension [Self <: PartialStatsProvided](x: Self) {
    
    inline def setNbHits(value: Double): Self = StObject.set(x, "nbHits", value.asInstanceOf[js.Any])
    
    inline def setNbHitsUndefined: Self = StObject.set(x, "nbHits", js.undefined)
    
    inline def setProcessingTimeMS(value: Double): Self = StObject.set(x, "processingTimeMS", value.asInstanceOf[js.Any])
    
    inline def setProcessingTimeMSUndefined: Self = StObject.set(x, "processingTimeMS", js.undefined)
  }
}
