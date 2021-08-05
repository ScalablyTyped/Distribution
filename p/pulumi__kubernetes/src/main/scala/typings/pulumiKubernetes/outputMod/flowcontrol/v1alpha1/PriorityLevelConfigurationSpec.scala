package typings.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PriorityLevelConfigurationSpec specifies the configuration of a priority level.
  */
trait PriorityLevelConfigurationSpec extends StObject {
  
  /**
    * `limited` specifies how requests are handled for a Limited priority level. This field must be non-empty if and only if `type` is `"Limited"`.
    */
  var limited: LimitedPriorityLevelConfiguration
  
  /**
    * `type` indicates whether this priority level is subject to limitation on request execution.  A value of `"Exempt"` means that requests of this priority level are not subject to a limit (and thus are never queued) and do not detract from the capacity made available to other priority levels.  A value of `"Limited"` means that (a) requests of this priority level _are_ subject to limits and (b) some of the server's limited capacity is made available exclusively to this priority level. Required.
    */
  var `type`: String
}
object PriorityLevelConfigurationSpec {
  
  inline def apply(limited: LimitedPriorityLevelConfiguration, `type`: String): PriorityLevelConfigurationSpec = {
    val __obj = js.Dynamic.literal(limited = limited.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLevelConfigurationSpec]
  }
  
  extension [Self <: PriorityLevelConfigurationSpec](x: Self) {
    
    inline def setLimited(value: LimitedPriorityLevelConfiguration): Self = StObject.set(x, "limited", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
