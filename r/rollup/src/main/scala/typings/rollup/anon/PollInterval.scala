package typings.rollup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PollInterval extends StObject {
  
  var pollInterval: js.UndefOr[Double] = js.undefined
  
  var stabilityThreshold: js.UndefOr[Double] = js.undefined
}
object PollInterval {
  
  @scala.inline
  def apply(): PollInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollInterval]
  }
  
  @scala.inline
  implicit class PollIntervalMutableBuilder[Self <: PollInterval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPollInterval(value: Double): Self = StObject.set(x, "pollInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollIntervalUndefined: Self = StObject.set(x, "pollInterval", js.undefined)
    
    @scala.inline
    def setStabilityThreshold(value: Double): Self = StObject.set(x, "stabilityThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStabilityThresholdUndefined: Self = StObject.set(x, "stabilityThreshold", js.undefined)
  }
}
