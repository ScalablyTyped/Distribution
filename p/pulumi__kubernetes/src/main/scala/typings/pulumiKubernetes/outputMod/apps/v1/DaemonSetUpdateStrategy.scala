package typings.pulumiKubernetes.outputMod.apps.v1

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
  var rollingUpdate: RollingUpdateDaemonSet
  
  /**
    * Type of daemon set update. Can be "RollingUpdate" or "OnDelete". Default is RollingUpdate.
    */
  var `type`: String
}
object DaemonSetUpdateStrategy {
  
  @scala.inline
  def apply(rollingUpdate: RollingUpdateDaemonSet, `type`: String): DaemonSetUpdateStrategy = {
    val __obj = js.Dynamic.literal(rollingUpdate = rollingUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaemonSetUpdateStrategy]
  }
  
  @scala.inline
  implicit class DaemonSetUpdateStrategyMutableBuilder[Self <: DaemonSetUpdateStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRollingUpdate(value: RollingUpdateDaemonSet): Self = StObject.set(x, "rollingUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
