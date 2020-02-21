package typings.redisInfo.mod

import typings.redisInfo.mod.Flag.OFF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistenceAOFOffInfo extends js.Object {
  var aof_enabled: OFF
}

object PersistenceAOFOffInfo {
  @scala.inline
  def apply(aof_enabled: OFF): PersistenceAOFOffInfo = {
    val __obj = js.Dynamic.literal(aof_enabled = aof_enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PersistenceAOFOffInfo]
  }
}

