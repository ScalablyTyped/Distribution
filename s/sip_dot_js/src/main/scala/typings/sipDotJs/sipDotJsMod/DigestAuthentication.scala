package typings.sipDotJs.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "DigestAuthentication")
@js.native
class DigestAuthentication protected ()
  extends typings.sipDotJs.libCoreMod.DigestAuthentication {
  def this(loggerFactory: typings.sipDotJs.libCoreLogMod.LoggerFactory) = this()
  def this(loggerFactory: typings.sipDotJs.libCoreLogMod.LoggerFactory, username: String) = this()
  def this(
    loggerFactory: typings.sipDotJs.libCoreLogMod.LoggerFactory,
    username: js.UndefOr[scala.Nothing],
    password: String
  ) = this()
  /**
    * Constructor.
    * @param loggerFactory - LoggerFactory.
    * @param username - Username.
    * @param password - Password.
    */
  def this(loggerFactory: typings.sipDotJs.libCoreLogMod.LoggerFactory, username: String, password: String) = this()
}

