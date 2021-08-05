package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
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
  var name: Input[String]
}
object PriorityLevelConfigurationReference {
  
  inline def apply(name: Input[String]): PriorityLevelConfigurationReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLevelConfigurationReference]
  }
  
  extension [Self <: PriorityLevelConfigurationReference](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
