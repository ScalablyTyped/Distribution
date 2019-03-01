package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetEnvInfo extends js.Object {
  /** The environment variable's name. */
  var key: java.lang.String
  /** The environment variable's value. */
  var value: java.lang.String
}

object SetEnvInfo {
  @scala.inline
  def apply(key: java.lang.String, value: java.lang.String): SetEnvInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SetEnvInfo]
  }
}

