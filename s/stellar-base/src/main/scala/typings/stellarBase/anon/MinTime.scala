package typings.stellarBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinTime extends StObject {
  
  var maxTime: String = js.native
  
  var minTime: String = js.native
}
object MinTime {
  
  @scala.inline
  def apply(maxTime: String, minTime: String): MinTime = {
    val __obj = js.Dynamic.literal(maxTime = maxTime.asInstanceOf[js.Any], minTime = minTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinTime]
  }
  
  @scala.inline
  implicit class MinTimeMutableBuilder[Self <: MinTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxTime(value: String): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinTime(value: String): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
  }
}
