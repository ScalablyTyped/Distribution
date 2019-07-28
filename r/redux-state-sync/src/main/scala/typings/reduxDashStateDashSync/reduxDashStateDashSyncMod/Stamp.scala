package typings.reduxDashStateDashSync.reduxDashStateDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stamp extends js.Object {
  @JSName("$uuid")
  var $uuid: String
  @JSName("$wuid")
  var $wuid: String
}

object Stamp {
  @scala.inline
  def apply($uuid: String, $wuid: String): Stamp = {
    val __obj = js.Dynamic.literal($uuid = $uuid, $wuid = $wuid)
  
    __obj.asInstanceOf[Stamp]
  }
}

