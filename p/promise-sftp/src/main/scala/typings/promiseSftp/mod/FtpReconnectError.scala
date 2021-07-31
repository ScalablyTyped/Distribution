package typings.promiseSftp.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("promise-sftp", "FtpReconnectError")
@js.native
class FtpReconnectError ()
  extends typings.promiseFtpCommon.mod.FtpReconnectError {
  def this(disconnectError: String) = this()
  def this(disconnectError: Error) = this()
  def this(disconnectError: String, connectError: String) = this()
  def this(disconnectError: String, connectError: Error) = this()
  def this(disconnectError: Unit, connectError: String) = this()
  def this(disconnectError: Unit, connectError: Error) = this()
  def this(disconnectError: Error, connectError: String) = this()
  def this(disconnectError: Error, connectError: Error) = this()
  def this(disconnectError: String, connectError: String, onCwd: Boolean) = this()
  def this(disconnectError: String, connectError: Unit, onCwd: Boolean) = this()
  def this(disconnectError: String, connectError: Error, onCwd: Boolean) = this()
  def this(disconnectError: Unit, connectError: String, onCwd: Boolean) = this()
  def this(disconnectError: Unit, connectError: Unit, onCwd: Boolean) = this()
  def this(disconnectError: Unit, connectError: Error, onCwd: Boolean) = this()
  def this(disconnectError: Error, connectError: String, onCwd: Boolean) = this()
  def this(disconnectError: Error, connectError: Unit, onCwd: Boolean) = this()
  def this(disconnectError: Error, connectError: Error, onCwd: Boolean) = this()
}
