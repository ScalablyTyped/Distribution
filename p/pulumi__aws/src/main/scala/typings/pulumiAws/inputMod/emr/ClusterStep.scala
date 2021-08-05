package typings.pulumiAws.inputMod.emr

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStep extends StObject {
  
  /**
    * The action to take if the step fails. Valid values: `TERMINATE_JOB_FLOW`, `TERMINATE_CLUSTER`, `CANCEL_AND_WAIT`, and `CONTINUE`
    */
  var actionOnFailure: Input[String]
  
  /**
    * The JAR file used for the step. Defined below.
    */
  var hadoopJarStep: Input[ClusterStepHadoopJarStep]
  
  /**
    * Friendly name given to the instance fleet.
    */
  var name: Input[String]
}
object ClusterStep {
  
  inline def apply(
    actionOnFailure: Input[String],
    hadoopJarStep: Input[ClusterStepHadoopJarStep],
    name: Input[String]
  ): ClusterStep = {
    val __obj = js.Dynamic.literal(actionOnFailure = actionOnFailure.asInstanceOf[js.Any], hadoopJarStep = hadoopJarStep.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStep]
  }
  
  extension [Self <: ClusterStep](x: Self) {
    
    inline def setActionOnFailure(value: Input[String]): Self = StObject.set(x, "actionOnFailure", value.asInstanceOf[js.Any])
    
    inline def setHadoopJarStep(value: Input[ClusterStepHadoopJarStep]): Self = StObject.set(x, "hadoopJarStep", value.asInstanceOf[js.Any])
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
