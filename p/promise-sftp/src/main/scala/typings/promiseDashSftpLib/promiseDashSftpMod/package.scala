package typings
package promiseDashSftpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object promiseDashSftpMod {
  /**
    * Options for SftpPromise#connect()
    */
  type Options = ssh2Lib.ssh2Mod.ConnectConfig with promiseDashSftpLib.Anon_AutoReconnect
}
