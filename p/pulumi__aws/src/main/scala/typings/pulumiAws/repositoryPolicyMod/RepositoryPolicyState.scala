package typings.pulumiAws.repositoryPolicyMod

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryPolicyState extends js.Object {
  /**
    * The policy document. This is a JSON formatted string.
    */
  val policy: js.UndefOr[Input[String | PolicyDocument]] = js.native
  /**
    * The registry ID where the repository was created.
    */
  val registryId: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the repository to apply the policy.
    */
  val repository: js.UndefOr[Input[String]] = js.native
}

object RepositoryPolicyState {
  @scala.inline
  def apply(): RepositoryPolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryPolicyState]
  }
  @scala.inline
  implicit class RepositoryPolicyStateOps[Self <: RepositoryPolicyState] (val x: Self) extends AnyVal {
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
    def deletePolicy: Self = this.set("policy", js.undefined)
    @scala.inline
    def setRegistryId(value: Input[String]): Self = this.set("registryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
    @scala.inline
    def setRepository(value: Input[String]): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
  }
  
}

