package typings.atPulumiAws.ecrLifecyclePolicyMod

import typings.atPulumiAws.ecrLifecyclePolicyDocumentMod.LifecyclePolicyDocument
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecyclePolicyState extends js.Object {
  val policy: js.UndefOr[Input[String | LifecyclePolicyDocument]] = js.undefined
  /**
    * The registry ID where the repository was created.
    */
  val registryId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of the repository to apply the policy.
    */
  val repository: js.UndefOr[Input[String]] = js.undefined
}

object LifecyclePolicyState {
  @scala.inline
  def apply(
    policy: Input[String | LifecyclePolicyDocument] = null,
    registryId: Input[String] = null,
    repository: Input[String] = null
  ): LifecyclePolicyState = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyState]
  }
}

