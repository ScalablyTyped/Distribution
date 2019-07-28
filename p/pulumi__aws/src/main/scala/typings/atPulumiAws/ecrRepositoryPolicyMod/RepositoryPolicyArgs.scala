package typings.atPulumiAws.ecrRepositoryPolicyMod

import typings.atPulumiAws.iamDocumentsMod.PolicyDocument
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryPolicyArgs extends js.Object {
  val policy: Input[String | PolicyDocument]
  /**
    * Name of the repository to apply the policy.
    */
  val repository: Input[String]
}

object RepositoryPolicyArgs {
  @scala.inline
  def apply(policy: Input[String | PolicyDocument], repository: Input[String]): RepositoryPolicyArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RepositoryPolicyArgs]
  }
}

