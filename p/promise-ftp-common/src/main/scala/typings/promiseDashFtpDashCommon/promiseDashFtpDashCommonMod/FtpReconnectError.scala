package typings.promiseDashFtpDashCommon.promiseDashFtpDashCommonMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-ftp-common", "FtpReconnectError")
@js.native
class FtpReconnectError () extends Error {
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
  var connectError: String | Error = js.native
  var disconnectError: String | Error = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

