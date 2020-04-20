package typings.reduxStateSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stamp extends js.Object {
  @JSName("$isSync")
  var $isSync: Boolean
  @JSName("$uuid")
  var $uuid: String
  @JSName("$wuid")
  var $wuid: String
}

object Stamp {
  @scala.inline
  def apply($isSync: Boolean, $uuid: String, $wuid: String): Stamp = {
    val __obj = js.Dynamic.literal($isSync = $isSync.asInstanceOf[js.Any], $uuid = $uuid.asInstanceOf[js.Any], $wuid = $wuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stamp]
  }
}

