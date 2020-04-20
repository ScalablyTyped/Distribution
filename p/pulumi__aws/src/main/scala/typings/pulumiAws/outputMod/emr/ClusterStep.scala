package typings.pulumiAws.outputMod.emr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterStep extends js.Object {
  var actionOnFailure: String = js.native
  var hadoopJarStep: ClusterStepHadoopJarStep = js.native
  /**
    * The name of the job flow
    */
  var name: String = js.native
}

object ClusterStep {
  @scala.inline
  def apply(actionOnFailure: String, hadoopJarStep: ClusterStepHadoopJarStep, name: String): ClusterStep = {
    val __obj = js.Dynamic.literal(actionOnFailure = actionOnFailure.asInstanceOf[js.Any], hadoopJarStep = hadoopJarStep.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStep]
  }
}

