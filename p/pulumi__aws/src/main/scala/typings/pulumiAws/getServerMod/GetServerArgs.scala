package typings.pulumiAws.getServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServerArgs extends js.Object {
  
  /**
    * ID for an SFTP server.
    */
  val serverId: String = js.native
}
object GetServerArgs {
  
  @scala.inline
  def apply(serverId: String): GetServerArgs = {
    val __obj = js.Dynamic.literal(serverId = serverId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServerArgs]
  }
  
  @scala.inline
  implicit class GetServerArgsOps[Self <: GetServerArgs] (val x: Self) extends AnyVal {
    
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
    def setServerId(value: String): Self = this.set("serverId", value.asInstanceOf[js.Any])
  }
}
