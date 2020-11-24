package typings.pulumiAws.getLocalDiskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLocalDiskArgs extends js.Object {
  
  /**
    * The device node of the local disk to retrieve. For example, `/dev/sdb`.
    */
  val diskNode: js.UndefOr[String] = js.native
  
  /**
    * The device path of the local disk to retrieve. For example, `/dev/xvdb` or `/dev/nvme1n1`.
    */
  val diskPath: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  val gatewayArn: String = js.native
}
object GetLocalDiskArgs {
  
  @scala.inline
  def apply(gatewayArn: String): GetLocalDiskArgs = {
    val __obj = js.Dynamic.literal(gatewayArn = gatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocalDiskArgs]
  }
  
  @scala.inline
  implicit class GetLocalDiskArgsOps[Self <: GetLocalDiskArgs] (val x: Self) extends AnyVal {
    
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
    def setGatewayArn(value: String): Self = this.set("gatewayArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskNode(value: String): Self = this.set("diskNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskNode: Self = this.set("diskNode", js.undefined)
    
    @scala.inline
    def setDiskPath(value: String): Self = this.set("diskPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskPath: Self = this.set("diskPath", js.undefined)
  }
}
