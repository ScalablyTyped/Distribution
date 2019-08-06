package typings.atPulumiAws.mediastoreContainerPolicyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerPolicyState extends js.Object {
  /**
    * The name of the container.
    */
  val containerName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The contents of the policy.
    */
  val policy: js.UndefOr[Input[String]] = js.undefined
}

object ContainerPolicyState {
  @scala.inline
  def apply(containerName: Input[String] = null, policy: Input[String] = null): ContainerPolicyState = {
    val __obj = js.Dynamic.literal()
    if (containerName != null) __obj.updateDynamic("containerName")(containerName.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerPolicyState]
  }
}

