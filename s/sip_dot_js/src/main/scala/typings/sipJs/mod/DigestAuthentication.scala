package typings.sipJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "DigestAuthentication")
@js.native
class DigestAuthentication protected ()
  extends typings.sipJs.coreMod.DigestAuthentication {
  /**
    * Constructor.
    * @param loggerFactory - LoggerFactory.
    * @param username - Username.
    * @param password - Password.
    */
  def this(loggerFactory: typings.sipJs.logMod.LoggerFactory) = this()
  def this(loggerFactory: typings.sipJs.logMod.LoggerFactory, username: String) = this()
  def this(loggerFactory: typings.sipJs.logMod.LoggerFactory, username: String, password: String) = this()
}

