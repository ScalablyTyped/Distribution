package typings.pulumiAws.ecrLifecyclePolicyMod

import typings.pulumiAws.lifecyclePolicyDocumentMod.LifecyclePolicyDocument
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyArgs extends js.Object {
  /**
    * The policy document. This is a JSON formatted string. See more details about [Policy Parameters](http://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html#lifecycle_policy_parameters) in the official AWS docs.
    */
  val policy: Input[String | LifecyclePolicyDocument] = js.native
  /**
    * Name of the repository to apply the policy.
    */
  val repository: Input[String] = js.native
}

object LifecyclePolicyArgs {
  @scala.inline
  def apply(policy: Input[String | LifecyclePolicyDocument], repository: Input[String]): LifecyclePolicyArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LifecyclePolicyArgs]
  }
}

