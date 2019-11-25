package typings.ssh2.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetEnvInfo extends js.Object {
  /** The environment variable's name. */
  var key: String
  /** The environment variable's value. */
  var value: String
}

object SetEnvInfo {
  @scala.inline
  def apply(key: String, value: String): SetEnvInfo = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetEnvInfo]
  }
}

