package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionOnFailureHadoopJarStep extends js.Object {
  var actionOnFailure: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var hadoopJarStep: atPulumiPulumiLib.outputMod.Input[Anon_ArgsJarKey]
  var name: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_ActionOnFailureHadoopJarStep {
  @scala.inline
  def apply(
    actionOnFailure: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    hadoopJarStep: atPulumiPulumiLib.outputMod.Input[Anon_ArgsJarKey],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_ActionOnFailureHadoopJarStep = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actionOnFailure")(actionOnFailure.asInstanceOf[js.Any])
    __obj.updateDynamic("hadoopJarStep")(hadoopJarStep.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActionOnFailureHadoopJarStep]
  }
}

