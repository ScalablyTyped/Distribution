package typings.pulumiAws.repositoryPolicyMod

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryPolicyArgs extends js.Object {
  val policy: Input[String | PolicyDocument] = js.native
  /**
    * Name of the repository to apply the policy.
    */
  val repository: Input[String] = js.native
}

object RepositoryPolicyArgs {
  @scala.inline
  def apply(policy: Input[String | PolicyDocument], repository: Input[String]): RepositoryPolicyArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RepositoryPolicyArgs]
  }
}

