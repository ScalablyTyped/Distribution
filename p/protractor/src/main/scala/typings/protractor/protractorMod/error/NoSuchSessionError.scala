package typings.protractor.protractorMod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Occurs when a command is directed to a session that does not exist.
  */
@JSImport("protractor", "error.NoSuchSessionError")
@js.native
class NoSuchSessionError ()
  extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.error.NoSuchSessionError {
  def this(message: String) = this()
}

