package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionOnFailureHadoopJarStep extends js.Object {
  var actionOnFailure: Input[String]
  var hadoopJarStep: Input[Anon_ArgsJarKey]
  var name: Input[String]
}

object Anon_ActionOnFailureHadoopJarStep {
  @scala.inline
  def apply(actionOnFailure: Input[String], hadoopJarStep: Input[Anon_ArgsJarKey], name: Input[String]): Anon_ActionOnFailureHadoopJarStep = {
    val __obj = js.Dynamic.literal(actionOnFailure = actionOnFailure.asInstanceOf[js.Any], hadoopJarStep = hadoopJarStep.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ActionOnFailureHadoopJarStep]
  }
}

