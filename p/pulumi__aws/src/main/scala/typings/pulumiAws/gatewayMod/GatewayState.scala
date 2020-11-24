package typings.pulumiAws.gatewayMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayState extends js.Object {
  
  /**
    * The ASN to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
    */
  val amazonSideAsn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the connection.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * AWS Account ID of the gateway.
    */
  val ownerAccountId: js.UndefOr[Input[String]] = js.native
}
object GatewayState {
  
  @scala.inline
  def apply(): GatewayState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayState]
  }
  
  @scala.inline
  implicit class GatewayStateOps[Self <: GatewayState] (val x: Self) extends AnyVal {
    
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
    def setAmazonSideAsn(value: Input[String]): Self = this.set("amazonSideAsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmazonSideAsn: Self = this.set("amazonSideAsn", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOwnerAccountId(value: Input[String]): Self = this.set("ownerAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerAccountId: Self = this.set("ownerAccountId", js.undefined)
  }
}
