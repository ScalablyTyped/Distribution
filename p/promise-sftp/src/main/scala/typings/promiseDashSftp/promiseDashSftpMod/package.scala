package typings.promiseDashSftp

import typings.promiseDashSftp.Anon_AutoReconnect
import typings.ssh2.ssh2Mod.ConnectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object promiseDashSftpMod {
  /**
    * Options for SftpPromise#connect()
    */
  type Options = ConnectConfig with Anon_AutoReconnect
}
