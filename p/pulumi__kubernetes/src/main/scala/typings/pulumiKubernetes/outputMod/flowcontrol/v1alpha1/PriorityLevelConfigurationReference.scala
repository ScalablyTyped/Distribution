package typings.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PriorityLevelConfigurationReference contains information that points to the "request-priority" being used.
  */
trait PriorityLevelConfigurationReference extends StObject {
  
  /**
    * `name` is the name of the priority level configuration being referenced Required.
    */
  var name: String
}
object PriorityLevelConfigurationReference {
  
  inline def apply(name: String): PriorityLevelConfigurationReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLevelConfigurationReference]
  }
  
  extension [Self <: PriorityLevelConfigurationReference](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
