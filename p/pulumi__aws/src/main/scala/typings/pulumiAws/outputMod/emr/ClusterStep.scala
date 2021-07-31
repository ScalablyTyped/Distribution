package typings.pulumiAws.outputMod.emr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStep extends StObject {
  
  /**
    * The action to take if the step fails. Valid values: `TERMINATE_JOB_FLOW`, `TERMINATE_CLUSTER`, `CANCEL_AND_WAIT`, and `CONTINUE`
    */
  var actionOnFailure: String
  
  /**
    * The JAR file used for the step. Defined below.
    */
  var hadoopJarStep: ClusterStepHadoopJarStep
  
  /**
    * Friendly name given to the instance fleet.
    */
  var name: String
}
object ClusterStep {
  
  @scala.inline
  def apply(actionOnFailure: String, hadoopJarStep: ClusterStepHadoopJarStep, name: String): ClusterStep = {
    val __obj = js.Dynamic.literal(actionOnFailure = actionOnFailure.asInstanceOf[js.Any], hadoopJarStep = hadoopJarStep.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStep]
  }
  
  @scala.inline
  implicit class ClusterStepMutableBuilder[Self <: ClusterStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionOnFailure(value: String): Self = StObject.set(x, "actionOnFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHadoopJarStep(value: ClusterStepHadoopJarStep): Self = StObject.set(x, "hadoopJarStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
