package typings.pulumiAws.inputMod.emr

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterStep extends StObject {
  
  /**
    * The action to take if the step fails. Valid values: `TERMINATE_JOB_FLOW`, `TERMINATE_CLUSTER`, `CANCEL_AND_WAIT`, and `CONTINUE`
    */
  var actionOnFailure: Input[String] = js.native
  
  /**
    * The JAR file used for the step. Defined below.
    */
  var hadoopJarStep: Input[ClusterStepHadoopJarStep] = js.native
  
  /**
    * Friendly name given to the instance fleet.
    */
  var name: Input[String] = js.native
}
object ClusterStep {
  
  @scala.inline
  def apply(
    actionOnFailure: Input[String],
    hadoopJarStep: Input[ClusterStepHadoopJarStep],
    name: Input[String]
  ): ClusterStep = {
    val __obj = js.Dynamic.literal(actionOnFailure = actionOnFailure.asInstanceOf[js.Any], hadoopJarStep = hadoopJarStep.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStep]
  }
  
  @scala.inline
  implicit class ClusterStepMutableBuilder[Self <: ClusterStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionOnFailure(value: Input[String]): Self = StObject.set(x, "actionOnFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHadoopJarStep(value: Input[ClusterStepHadoopJarStep]): Self = StObject.set(x, "hadoopJarStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
