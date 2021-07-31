package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuspenseConfig extends StObject {
  
  var busyDelayMs: js.UndefOr[Double] = js.undefined
  
  var busyMinDurationMs: js.UndefOr[Double] = js.undefined
}
object SuspenseConfig {
  
  @scala.inline
  def apply(): SuspenseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuspenseConfig]
  }
  
  @scala.inline
  implicit class SuspenseConfigMutableBuilder[Self <: SuspenseConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusyDelayMs(value: Double): Self = StObject.set(x, "busyDelayMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusyDelayMsUndefined: Self = StObject.set(x, "busyDelayMs", js.undefined)
    
    @scala.inline
    def setBusyMinDurationMs(value: Double): Self = StObject.set(x, "busyMinDurationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusyMinDurationMsUndefined: Self = StObject.set(x, "busyMinDurationMs", js.undefined)
  }
}
