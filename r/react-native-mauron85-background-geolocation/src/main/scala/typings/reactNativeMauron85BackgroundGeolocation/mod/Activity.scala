package typings.reactNativeMauron85BackgroundGeolocation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Activity extends StObject {
  
  /** Percentage indicating the likelihood user is performing this activity. */
  var confidence: Double = js.native
  
  /**
    * Type of the activity.
    *
    * Possible values:
    * IN_VEHICLE, ON_BICYCLE, ON_FOOT, RUNNING, STILL, TILTING, UNKNOWN, WALKING
    */
  var `type`: ActivityType = js.native
}
object Activity {
  
  @scala.inline
  def apply(confidence: Double, `type`: ActivityType): Activity = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
  
  @scala.inline
  implicit class ActivityMutableBuilder[Self <: Activity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ActivityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
