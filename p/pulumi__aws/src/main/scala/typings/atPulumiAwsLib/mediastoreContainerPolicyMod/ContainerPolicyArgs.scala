package typings
package atPulumiAwsLib.mediastoreContainerPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerPolicyArgs extends js.Object {
  /**
    * The name of the container.
    */
  val containerName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  val policy: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object ContainerPolicyArgs {
  @scala.inline
  def apply(
    containerName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    policy: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): ContainerPolicyArgs = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContainerPolicyArgs]
  }
}

