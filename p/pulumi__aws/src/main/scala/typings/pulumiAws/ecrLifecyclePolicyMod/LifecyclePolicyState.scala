package typings.pulumiAws.ecrLifecyclePolicyMod

import typings.pulumiAws.lifecyclePolicyDocumentMod.LifecyclePolicyDocument
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyState extends js.Object {
  val policy: js.UndefOr[Input[String | LifecyclePolicyDocument]] = js.native
  /**
    * The registry ID where the repository was created.
    */
  val registryId: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the repository to apply the policy.
    */
  val repository: js.UndefOr[Input[String]] = js.native
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

