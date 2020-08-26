package typings.pulumiAws.containerPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerPolicyState extends js.Object {
  /**
    * The name of the container.
    */
  val containerName: js.UndefOr[Input[String]] = js.native
  /**
    * The contents of the policy.
    */
  val policy: js.UndefOr[Input[String]] = js.native
}

object ContainerPolicyState {
  @scala.inline
  def apply(): ContainerPolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerPolicyState]
  }
  @scala.inline
  implicit class ContainerPolicyStateOps[Self <: ContainerPolicyState] (val x: Self) extends AnyVal {
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
    def setContainerName(value: Input[String]): Self = this.set("containerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerName: Self = this.set("containerName", js.undefined)
    @scala.inline
    def setPolicy(value: Input[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
  }
  
}

