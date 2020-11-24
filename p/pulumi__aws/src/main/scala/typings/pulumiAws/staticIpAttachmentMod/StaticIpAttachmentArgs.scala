package typings.pulumiAws.staticIpAttachmentMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticIpAttachmentArgs extends js.Object {
  
  /**
    * The name of the Lightsail instance to attach the IP to
    */
  val instanceName: Input[String] = js.native
  
  /**
    * The name of the allocated static IP
    */
  val staticIpName: Input[String] = js.native
}
object StaticIpAttachmentArgs {
  
  @scala.inline
  def apply(instanceName: Input[String], staticIpName: Input[String]): StaticIpAttachmentArgs = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any], staticIpName = staticIpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticIpAttachmentArgs]
  }
  
  @scala.inline
  implicit class StaticIpAttachmentArgsOps[Self <: StaticIpAttachmentArgs] (val x: Self) extends AnyVal {
    
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
    def setStaticIpName(value: Input[String]): Self = this.set("staticIpName", value.asInstanceOf[js.Any])
  }
}
