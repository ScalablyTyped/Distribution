package typings.atPulumiAws.typesInputMod.emr

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterStep extends js.Object {
  var actionOnFailure: Input[String] = js.native
  var hadoopJarStep: Input[ClusterStepHadoopJarStep] = js.native
  /**
    * The name of the job flow
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
}

