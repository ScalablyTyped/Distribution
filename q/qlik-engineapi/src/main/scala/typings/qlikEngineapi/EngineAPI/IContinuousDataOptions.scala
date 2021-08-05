package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container for the dynamic properties of an attribute expression.
  */
trait IContinuousDataOptions extends StObject {
  
  /**
    * End value.
    */
  var qEnd: Double
  
  /**
    * Maximum number of ticks.
    */
  var qMaxNbrTicks: Double
  
  /**
    * Number of bins for binning.
    */
  var qNbrPoints: Double
  
  /**
    * Start value.
    */
  var qStart: Double
}
object IContinuousDataOptions {
  
  inline def apply(qEnd: Double, qMaxNbrTicks: Double, qNbrPoints: Double, qStart: Double): IContinuousDataOptions = {
    val __obj = js.Dynamic.literal(qEnd = qEnd.asInstanceOf[js.Any], qMaxNbrTicks = qMaxNbrTicks.asInstanceOf[js.Any], qNbrPoints = qNbrPoints.asInstanceOf[js.Any], qStart = qStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContinuousDataOptions]
  }
  
  extension [Self <: IContinuousDataOptions](x: Self) {
    
    inline def setQEnd(value: Double): Self = StObject.set(x, "qEnd", value.asInstanceOf[js.Any])
    
    inline def setQMaxNbrTicks(value: Double): Self = StObject.set(x, "qMaxNbrTicks", value.asInstanceOf[js.Any])
    
    inline def setQNbrPoints(value: Double): Self = StObject.set(x, "qNbrPoints", value.asInstanceOf[js.Any])
    
    inline def setQStart(value: Double): Self = StObject.set(x, "qStart", value.asInstanceOf[js.Any])
  }
}
