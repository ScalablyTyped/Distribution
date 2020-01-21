package typings.promiseSftp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Options for SftpPromise#connect()
    */
  type Options = typings.ssh2.mod.ConnectConfig with typings.promiseSftp.AnonAutoReconnect
}
