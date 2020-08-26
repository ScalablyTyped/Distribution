package typings.pulumiAws.ecrLifecyclePolicyMod

import typings.pulumiAws.lifecyclePolicyDocumentMod.LifecyclePolicyDocument
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyState extends js.Object {
  /**
    * The policy document. This is a JSON formatted string. See more details about [Policy Parameters](http://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html#lifecycle_policy_parameters) in the official AWS docs.
    */
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
  def apply(): LifecyclePolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecyclePolicyState]
  }
  @scala.inline
  implicit class LifecyclePolicyStateOps[Self <: LifecyclePolicyState] (val x: Self) extends AnyVal {
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
    def setPolicy(value: Input[String | LifecyclePolicyDocument]): Self = this.set("policy", value.asInstanceOf[js.Any])
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

