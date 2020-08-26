package typings.pulumiAws.agentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentState extends js.Object {
  /**
    * DataSync Agent activation key during resource creation. Conflicts with `ipAddress`. If an `ipAddress` is provided instead, the provider will retrieve the `activationKey` as part of the resource creation.
    */
  val activationKey: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the DataSync Agent.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * DataSync Agent IP address to retrieve activation key during resource creation. Conflicts with `activationKey`. DataSync Agent must be accessible on port 80 from where the provider is running.
    */
  val ipAddress: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the DataSync Agent.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Agent.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object AgentState {
  @scala.inline
  def apply(): AgentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentState]
  }
  @scala.inline
  implicit class AgentStateOps[Self <: AgentState] (val x: Self) extends AnyVal {
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
    def setActivationKey(value: Input[String]): Self = this.set("activationKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivationKey: Self = this.set("activationKey", js.undefined)
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setIpAddress(value: Input[String]): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

