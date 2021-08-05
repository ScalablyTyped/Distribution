package typings.speedtestNet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PingData extends StObject {
  
  /** Milliseconds */
  var jitter: Double
  
  /** Milliseconds */
  var latency: Double
  
  var progress: js.UndefOr[Double] = js.undefined
}
object PingData {
  
  inline def apply(jitter: Double, latency: Double): PingData = {
    val __obj = js.Dynamic.literal(jitter = jitter.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any])
    __obj.asInstanceOf[PingData]
  }
  
  extension [Self <: PingData](x: Self) {
    
    inline def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
    
    inline def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
