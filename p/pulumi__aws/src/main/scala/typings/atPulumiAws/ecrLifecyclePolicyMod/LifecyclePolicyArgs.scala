package typings.atPulumiAws.ecrLifecyclePolicyMod

import typings.atPulumiAws.ecrLifecyclePolicyDocumentMod.LifecyclePolicyDocument
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecyclePolicyArgs extends js.Object {
  val policy: Input[String | LifecyclePolicyDocument]
  /**
    * Name of the repository to apply the policy.
    */
  val repository: Input[String]
}

object LifecyclePolicyArgs {
  @scala.inline
  def apply(policy: Input[String | LifecyclePolicyDocument], repository: Input[String]): LifecyclePolicyArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LifecyclePolicyArgs]
  }
}

