package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClientErrorExtensions extends js.Object {
  /** Additional detail for 'client-ssh' messages. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates 'client-socket' for socket-level errors and 'client-ssh' for SSH disconnection messages. */
  var level: js.UndefOr[java.lang.String] = js.undefined
}

