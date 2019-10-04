package typings.atPulumiAws.typesOutputMod.emrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterStep extends js.Object {
  var actionOnFailure: String
  var hadoopJarStep: ClusterStepHadoopJarStep
  /**
    * The name of the job flow
    */
  var name: String
}

object ClusterStep {
  @scala.inline
  def apply(actionOnFailure: String, hadoopJarStep: ClusterStepHadoopJarStep, name: String): ClusterStep = {
    val __obj = js.Dynamic.literal(actionOnFailure = actionOnFailure, hadoopJarStep = hadoopJarStep, name = name)
  
    __obj.asInstanceOf[ClusterStep]
  }
}

