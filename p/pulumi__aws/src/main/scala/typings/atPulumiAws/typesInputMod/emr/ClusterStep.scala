package typings.atPulumiAws.typesInputMod.emr

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterStep extends js.Object {
  var actionOnFailure: Input[String]
  var hadoopJarStep: Input[ClusterStepHadoopJarStep]
  /**
    * The name of the job flow
    */
  var name: Input[String]
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
}

