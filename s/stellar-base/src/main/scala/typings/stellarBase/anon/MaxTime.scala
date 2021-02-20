package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.TimePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxTime extends StObject {
  
  var maxTime: TimePoint = js.native
  
  var minTime: TimePoint = js.native
}
object MaxTime {
  
  @scala.inline
  def apply(maxTime: TimePoint, minTime: TimePoint): MaxTime = {
    val __obj = js.Dynamic.literal(maxTime = maxTime.asInstanceOf[js.Any], minTime = minTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxTime]
  }
  
  @scala.inline
  implicit class MaxTimeMutableBuilder[Self <: MaxTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxTime(value: TimePoint): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinTime(value: TimePoint): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
  }
}
