package typings.pulumiAws.transitGatewayPeeringAttachmentAccepterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitGatewayPeeringAttachmentAccepterArgs extends js.Object {
  
  /**
    * Key-value tags for the EC2 Transit Gateway Peering Attachment.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The ID of the EC2 Transit Gateway Peering Attachment to manage.
    */
  val transitGatewayAttachmentId: Input[String] = js.native
}
object TransitGatewayPeeringAttachmentAccepterArgs {
  
  @scala.inline
  def apply(transitGatewayAttachmentId: Input[String]): TransitGatewayPeeringAttachmentAccepterArgs = {
    val __obj = js.Dynamic.literal(transitGatewayAttachmentId = transitGatewayAttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitGatewayPeeringAttachmentAccepterArgs]
  }
  
  @scala.inline
  implicit class TransitGatewayPeeringAttachmentAccepterArgsOps[Self <: TransitGatewayPeeringAttachmentAccepterArgs] (val x: Self) extends AnyVal {
    
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
    def setTransitGatewayAttachmentId(value: Input[String]): Self = this.set("transitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
