package typings.pulumiAws.networkInterfaceAttachmentMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInterfaceAttachmentArgs extends js.Object {
  
  /**
    * Network interface index (int).
    */
  val deviceIndex: Input[Double] = js.native
  
  /**
    * Instance ID to attach.
    */
  val instanceId: Input[String] = js.native
  
  /**
    * ENI ID to attach.
    */
  val networkInterfaceId: Input[String] = js.native
}
object NetworkInterfaceAttachmentArgs {
  
  @scala.inline
  def apply(deviceIndex: Input[Double], instanceId: Input[String], networkInterfaceId: Input[String]): NetworkInterfaceAttachmentArgs = {
    val __obj = js.Dynamic.literal(deviceIndex = deviceIndex.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceAttachmentArgs]
  }
  
  @scala.inline
  implicit class NetworkInterfaceAttachmentArgsOps[Self <: NetworkInterfaceAttachmentArgs] (val x: Self) extends AnyVal {
    
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
    def setDeviceIndex(value: Input[Double]): Self = this.set("deviceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: Input[String]): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceId(value: Input[String]): Self = this.set("networkInterfaceId", value.asInstanceOf[js.Any])
  }
}
