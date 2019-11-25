package typings.ssh2.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientErrorExtensions extends js.Object {
  /** Additional detail for 'client-ssh' messages. */
  var description: js.UndefOr[String] = js.undefined
  /** Indicates 'client-socket' for socket-level errors and 'client-ssh' for SSH disconnection messages. */
  var level: js.UndefOr[String] = js.undefined
}

object ClientErrorExtensions {
  @scala.inline
  def apply(description: String = null, level: String = null): ClientErrorExtensions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientErrorExtensions]
  }
}

