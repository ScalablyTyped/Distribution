package typings.pulumiAws.getServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

