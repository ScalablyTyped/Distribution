package typings.pulumiAws.containerPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerPolicyArgs extends js.Object {
  /**
    * The name of the container.
    */
  val containerName: Input[String] = js.native
  /**
    * The contents of the policy.
    */
  val policy: Input[String] = js.native
}

object ContainerPolicyArgs {
  @scala.inline
  def apply(containerName: Input[String], policy: Input[String]): ContainerPolicyArgs = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerPolicyArgs]
  }
}

