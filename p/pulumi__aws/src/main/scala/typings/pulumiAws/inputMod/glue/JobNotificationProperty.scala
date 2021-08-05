package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobNotificationProperty extends StObject {
  
  /**
    * After a job run starts, the number of minutes to wait before sending a job run delay notification.
    */
  var notifyDelayAfter: js.UndefOr[Input[Double]] = js.undefined
}
object JobNotificationProperty {
  
  inline def apply(): JobNotificationProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobNotificationProperty]
  }
  
  extension [Self <: JobNotificationProperty](x: Self) {
    
    inline def setNotifyDelayAfter(value: Input[Double]): Self = StObject.set(x, "notifyDelayAfter", value.asInstanceOf[js.Any])
    
    inline def setNotifyDelayAfterUndefined: Self = StObject.set(x, "notifyDelayAfter", js.undefined)
  }
}
