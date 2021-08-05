package typings.pulumiKubernetes.inputMod.apps.v1beta2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DaemonSetUpdateStrategy is a struct used to control the update strategy for a DaemonSet.
  */
trait DaemonSetUpdateStrategy extends StObject {
  
  /**
    * Rolling update config params. Present only if type = "RollingUpdate".
    */
  var rollingUpdate: js.UndefOr[Input[RollingUpdateDaemonSet]] = js.undefined
  
  /**
    * Type of daemon set update. Can be "RollingUpdate" or "OnDelete". Default is RollingUpdate.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}
object DaemonSetUpdateStrategy {
  
  inline def apply(): DaemonSetUpdateStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DaemonSetUpdateStrategy]
  }
  
  extension [Self <: DaemonSetUpdateStrategy](x: Self) {
    
    inline def setRollingUpdate(value: Input[RollingUpdateDaemonSet]): Self = StObject.set(x, "rollingUpdate", value.asInstanceOf[js.Any])
    
    inline def setRollingUpdateUndefined: Self = StObject.set(x, "rollingUpdate", js.undefined)
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
