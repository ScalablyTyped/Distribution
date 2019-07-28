package typings.sipDotJs.libCoreMessagesMod

import typings.sipDotJs.libCoreLogMod.LoggerFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages", "DigestAuthentication")
@js.native
class DigestAuthentication protected ()
  extends typings.sipDotJs.libCoreMessagesDigestDashAuthenticationMod.DigestAuthentication {
  def this(loggerFactory: LoggerFactory) = this()
  def this(loggerFactory: LoggerFactory, username: String) = this()
  def this(loggerFactory: LoggerFactory, username: js.UndefOr[scala.Nothing], password: String) = this()
  /**
    * Constructor.
    * @param loggerFactory - LoggerFactory.
    * @param username - Username.
    * @param password - Password.
    */
  def this(loggerFactory: LoggerFactory, username: String, password: String) = this()
}

