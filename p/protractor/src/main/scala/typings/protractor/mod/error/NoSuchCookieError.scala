package typings.protractor.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indicates a named cookie could not be found in the cookie jar for the
  * currently selected document.
  */
@JSImport("protractor", "error.NoSuchCookieError")
@js.native
class NoSuchCookieError ()
  extends typings.seleniumWebdriver.mod.error.NoSuchCookieError {
  def this(message: String) = this()
}

