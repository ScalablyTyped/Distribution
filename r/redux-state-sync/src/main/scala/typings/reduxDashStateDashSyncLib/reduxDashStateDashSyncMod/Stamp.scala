package typings
package reduxDashStateDashSyncLib.reduxDashStateDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stamp extends js.Object {
  @JSName("$uuid")
  var $uuid: java.lang.String
  @JSName("$wuid")
  var $wuid: java.lang.String
}

object Stamp {
  @scala.inline
  def apply($uuid: java.lang.String, $wuid: java.lang.String): Stamp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$uuid")($uuid)
    __obj.updateDynamic("$wuid")($wuid)
    __obj.asInstanceOf[Stamp]
  }
}

