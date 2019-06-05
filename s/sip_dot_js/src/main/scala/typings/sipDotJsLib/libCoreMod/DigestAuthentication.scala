package typings
package sipDotJsLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "DigestAuthentication")
@js.native
class DigestAuthentication protected ()
  extends sipDotJsLib.libCoreMessagesMod.DigestAuthentication {
  def this(loggerFactory: sipDotJsLib.libCoreLogMod.LoggerFactory) = this()
  def this(loggerFactory: sipDotJsLib.libCoreLogMod.LoggerFactory, username: java.lang.String) = this()
  def this(loggerFactory: sipDotJsLib.libCoreLogMod.LoggerFactory, username: js.UndefOr[scala.Nothing], password: java.lang.String) = this()
  /**
    * Constructor.
    * @param loggerFactory - LoggerFactory.
    * @param username - Username.
    * @param password - Password.
    */
  def this(loggerFactory: sipDotJsLib.libCoreLogMod.LoggerFactory, username: java.lang.String, password: java.lang.String) = this()
}

