package typings.stellarBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxTimeMinTime extends StObject {
  
  var maxTime: js.UndefOr[Double | String] = js.native
  
  var minTime: js.UndefOr[Double | String] = js.native
}
object MaxTimeMinTime {
  
  @scala.inline
  def apply(): MaxTimeMinTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxTimeMinTime]
  }
  
  @scala.inline
  implicit class MaxTimeMinTimeMutableBuilder[Self <: MaxTimeMinTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxTime(value: Double | String): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
    
    @scala.inline
    def setMinTime(value: Double | String): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
  }
}
