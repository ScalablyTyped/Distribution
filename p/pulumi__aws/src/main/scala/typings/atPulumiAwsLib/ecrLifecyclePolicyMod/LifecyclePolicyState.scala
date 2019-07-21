package typings
package atPulumiAwsLib.ecrLifecyclePolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecyclePolicyState extends js.Object {
  val policy: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      java.lang.String | atPulumiAwsLib.ecrLifecyclePolicyDocumentMod.LifecyclePolicyDocument
    ]
  ] = js.undefined
  /**
    * The registry ID where the repository was created.
    */
  val registryId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the repository to apply the policy.
    */
  val repository: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object LifecyclePolicyState {
  @scala.inline
  def apply(
    policy: atPulumiPulumiLib.outputMod.Input[
      java.lang.String | atPulumiAwsLib.ecrLifecyclePolicyDocumentMod.LifecyclePolicyDocument
    ] = null,
    registryId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    repository: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): LifecyclePolicyState = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyState]
  }
}

