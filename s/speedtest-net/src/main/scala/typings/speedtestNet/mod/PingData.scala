package typings.speedtestNet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PingData extends StObject {
  
  /** Milliseconds */
  var jitter: Double = js.native
  
  /** Milliseconds */
  var latency: Double = js.native
  
  var progress: js.UndefOr[Double] = js.native
}
object PingData {
  
  @scala.inline
  def apply(jitter: Double, latency: Double): PingData = {
    val __obj = js.Dynamic.literal(jitter = jitter.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any])
    __obj.asInstanceOf[PingData]
  }
  
  @scala.inline
  implicit class PingDataMutableBuilder[Self <: PingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
