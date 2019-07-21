package typings
package atPulumiAwsLib.ecrLifecyclePolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecyclePolicyArgs extends js.Object {
  val policy: atPulumiPulumiLib.outputMod.Input[
    java.lang.String | atPulumiAwsLib.ecrLifecyclePolicyDocumentMod.LifecyclePolicyDocument
  ]
  /**
    * Name of the repository to apply the policy.
    */
  val repository: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object LifecyclePolicyArgs {
  @scala.inline
  def apply(
    policy: atPulumiPulumiLib.outputMod.Input[
      java.lang.String | atPulumiAwsLib.ecrLifecyclePolicyDocumentMod.LifecyclePolicyDocument
    ],
    repository: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): LifecyclePolicyArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LifecyclePolicyArgs]
  }
}

