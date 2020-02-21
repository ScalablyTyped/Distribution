package typings.redisInfo.mod

import typings.redisInfo.redisInfoStrings.master
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationMasterInfo extends js.Object {
  var role: master
}

object ReplicationMasterInfo {
  @scala.inline
  def apply(role: master): ReplicationMasterInfo = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReplicationMasterInfo]
  }
}

