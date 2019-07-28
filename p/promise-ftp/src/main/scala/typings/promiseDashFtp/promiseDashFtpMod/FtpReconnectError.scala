package typings.promiseDashFtp.promiseDashFtpMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-ftp", "FtpReconnectError")
@js.native
class FtpReconnectError ()
  extends typings.promiseDashFtpDashCommon.promiseDashFtpDashCommonMod.FtpReconnectError {
  def this(disconnectError: String) = this()
  def this(disconnectError: Error) = this()
  def this(disconnectError: String, connectError: String) = this()
  def this(disconnectError: String, connectError: Error) = this()
  def this(disconnectError: Error, connectError: String) = this()
  def this(disconnectError: Error, connectError: Error) = this()
  def this(disconnectError: String, connectError: String, onCwd: Boolean) = this()
  def this(disconnectError: String, connectError: Error, onCwd: Boolean) = this()
  def this(disconnectError: Error, connectError: String, onCwd: Boolean) = this()
  def this(disconnectError: Error, connectError: Error, onCwd: Boolean) = this()
}

