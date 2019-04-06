package typings
package atPulumiAwsLib.transferGetServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServerArgs extends js.Object {
  /**
    * ID for an SFTP server.
    */
  val serverId: java.lang.String
}

object GetServerArgs {
  @scala.inline
  def apply(serverId: java.lang.String): GetServerArgs = {
    val __obj = js.Dynamic.literal(serverId = serverId)
  
    __obj.asInstanceOf[GetServerArgs]
  }
}

