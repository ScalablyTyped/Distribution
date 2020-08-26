package typings.pulumiAws.repositoryPolicyMod

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryPolicyArgs extends js.Object {
  /**
    * The policy document. This is a JSON formatted string.
    */
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
  @scala.inline
  implicit class RepositoryPolicyArgsOps[Self <: RepositoryPolicyArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPolicy(value: Input[String | PolicyDocument]): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepository(value: Input[String]): Self = this.set("repository", value.asInstanceOf[js.Any])
  }
  
}

