package typings.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedTransitVirtualInterfaceAcceptorState extends js.Object {
  /**
    * The ARN of the virtual interface.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the Direct Connect gateway to which to connect the virtual interface.
    */
  val dxGatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The ID of the Direct Connect virtual interface to accept.
    */
  val virtualInterfaceId: js.UndefOr[Input[String]] = js.native
}

object HostedTransitVirtualInterfaceAcceptorState {
  @scala.inline
  def apply(): HostedTransitVirtualInterfaceAcceptorState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostedTransitVirtualInterfaceAcceptorState]
  }
  @scala.inline
  implicit class HostedTransitVirtualInterfaceAcceptorStateOps[Self <: HostedTransitVirtualInterfaceAcceptorState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setDxGatewayId(value: Input[String]): Self = this.set("dxGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDxGatewayId: Self = this.set("dxGatewayId", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVirtualInterfaceId(value: Input[String]): Self = this.set("virtualInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualInterfaceId: Self = this.set("virtualInterfaceId", js.undefined)
  }
  
}

