package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcEndpointDnsEntry extends js.Object {
  
  /**
    * The DNS name.
    */
  var dnsName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the private hosted zone.
    */
  var hostedZoneId: js.UndefOr[Input[String]] = js.native
}
object VpcEndpointDnsEntry {
  
  @scala.inline
  def apply(): VpcEndpointDnsEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpointDnsEntry]
  }
  
  @scala.inline
  implicit class VpcEndpointDnsEntryOps[Self <: VpcEndpointDnsEntry] (val x: Self) extends AnyVal {
    
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
    def setDnsName(value: Input[String]): Self = this.set("dnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsName: Self = this.set("dnsName", js.undefined)
    
    @scala.inline
    def setHostedZoneId(value: Input[String]): Self = this.set("hostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostedZoneId: Self = this.set("hostedZoneId", js.undefined)
  }
}
