package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatsProvided extends StObject {
  
  var nbHits: Double
  
  var processingTimeMS: Double
}
object StatsProvided {
  
  inline def apply(nbHits: Double, processingTimeMS: Double): StatsProvided = {
    val __obj = js.Dynamic.literal(nbHits = nbHits.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsProvided]
  }
  
  extension [Self <: StatsProvided](x: Self) {
    
    inline def setNbHits(value: Double): Self = StObject.set(x, "nbHits", value.asInstanceOf[js.Any])
    
    inline def setProcessingTimeMS(value: Double): Self = StObject.set(x, "processingTimeMS", value.asInstanceOf[js.Any])
  }
}
