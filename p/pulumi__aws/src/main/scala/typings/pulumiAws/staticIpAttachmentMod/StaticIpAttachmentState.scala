package typings.pulumiAws.staticIpAttachmentMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticIpAttachmentState extends js.Object {
  
  /**
    * The name of the Lightsail instance to attach the IP to
    */
  val instanceName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The allocated static IP address
    */
  val ipAddress: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the allocated static IP
    */
  val staticIpName: js.UndefOr[Input[String]] = js.native
}
object StaticIpAttachmentState {
  
  @scala.inline
  def apply(): StaticIpAttachmentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticIpAttachmentState]
  }
  
  @scala.inline
  implicit class StaticIpAttachmentStateOps[Self <: StaticIpAttachmentState] (val x: Self) extends AnyVal {
    
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
    def setInstanceName(value: Input[String]): Self = this.set("instanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceName: Self = this.set("instanceName", js.undefined)
    
    @scala.inline
    def setIpAddress(value: Input[String]): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    
    @scala.inline
    def setStaticIpName(value: Input[String]): Self = this.set("staticIpName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticIpName: Self = this.set("staticIpName", js.undefined)
  }
}
