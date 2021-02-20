package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.StatsProvided> */
@js.native
trait PartialStatsProvided extends StObject {
  
  var nbHits: js.UndefOr[Double] = js.native
  
  var processingTimeMS: js.UndefOr[Double] = js.native
}
object PartialStatsProvided {
  
  @scala.inline
  def apply(): PartialStatsProvided = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStatsProvided]
  }
  
  @scala.inline
  implicit class PartialStatsProvidedMutableBuilder[Self <: PartialStatsProvided] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNbHits(value: Double): Self = StObject.set(x, "nbHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbHitsUndefined: Self = StObject.set(x, "nbHits", js.undefined)
    
    @scala.inline
    def setProcessingTimeMS(value: Double): Self = StObject.set(x, "processingTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingTimeMSUndefined: Self = StObject.set(x, "processingTimeMS", js.undefined)
  }
}
