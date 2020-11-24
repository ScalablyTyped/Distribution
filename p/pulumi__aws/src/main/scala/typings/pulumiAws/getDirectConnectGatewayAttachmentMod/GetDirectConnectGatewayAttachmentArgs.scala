package typings.pulumiAws.getDirectConnectGatewayAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2transitgateway.GetDirectConnectGatewayAttachmentFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDirectConnectGatewayAttachmentArgs extends js.Object {
  
  /**
    * Identifier of the Direct Connect Gateway.
    */
  val dxGatewayId: js.UndefOr[String] = js.native
  
  /**
    * Configuration block(s) for filtering. Detailed below.
    */
  val filters: js.UndefOr[js.Array[GetDirectConnectGatewayAttachmentFilter]] = js.native
  
  /**
    * A map of tags, each pair of which must exactly match a pair on the desired Transit Gateway Direct Connect Gateway Attachment.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Identifier of the EC2 Transit Gateway.
    */
  val transitGatewayId: js.UndefOr[String] = js.native
}
object GetDirectConnectGatewayAttachmentArgs {
  
  @scala.inline
  def apply(): GetDirectConnectGatewayAttachmentArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDirectConnectGatewayAttachmentArgs]
  }
  
  @scala.inline
  implicit class GetDirectConnectGatewayAttachmentArgsOps[Self <: GetDirectConnectGatewayAttachmentArgs] (val x: Self) extends AnyVal {
    
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
    def setDxGatewayId(value: String): Self = this.set("dxGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDxGatewayId: Self = this.set("dxGatewayId", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: GetDirectConnectGatewayAttachmentFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetDirectConnectGatewayAttachmentFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTransitGatewayId(value: String): Self = this.set("transitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayId: Self = this.set("transitGatewayId", js.undefined)
  }
}
