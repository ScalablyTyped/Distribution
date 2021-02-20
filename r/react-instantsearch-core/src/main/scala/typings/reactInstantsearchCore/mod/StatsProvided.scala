package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatsProvided extends StObject {
  
  var nbHits: Double = js.native
  
  var processingTimeMS: Double = js.native
}
object StatsProvided {
  
  @scala.inline
  def apply(nbHits: Double, processingTimeMS: Double): StatsProvided = {
    val __obj = js.Dynamic.literal(nbHits = nbHits.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsProvided]
  }
  
  @scala.inline
  implicit class StatsProvidedMutableBuilder[Self <: StatsProvided] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNbHits(value: Double): Self = StObject.set(x, "nbHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingTimeMS(value: Double): Self = StObject.set(x, "processingTimeMS", value.asInstanceOf[js.Any])
  }
}
