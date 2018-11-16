package typings
package promiseDashFtpDashCommonLib.promiseDashFtpDashCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-ftp-common", "FtpReconnectError")
@js.native
class FtpReconnectError ()
  extends stdLib.Error {
  def this(disconnectError: java.lang.String) = this()
  def this(disconnectError: stdLib.Error) = this()
  def this(disconnectError: java.lang.String, connectError: java.lang.String) = this()
  def this(disconnectError: java.lang.String, connectError: stdLib.Error) = this()
  def this(disconnectError: stdLib.Error, connectError: java.lang.String) = this()
  def this(disconnectError: stdLib.Error, connectError: stdLib.Error) = this()
  def this(disconnectError: java.lang.String, connectError: java.lang.String, onCwd: scala.Boolean) = this()
  def this(disconnectError: java.lang.String, connectError: stdLib.Error, onCwd: scala.Boolean) = this()
  def this(disconnectError: stdLib.Error, connectError: java.lang.String, onCwd: scala.Boolean) = this()
  def this(disconnectError: stdLib.Error, connectError: stdLib.Error, onCwd: scala.Boolean) = this()
  var connectError: java.lang.String | stdLib.Error = js.native
  var disconnectError: java.lang.String | stdLib.Error = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

