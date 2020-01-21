package typings.protractor.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An illegal attempt was made to set a cookie under a different domain than
  * the current page.
  */
@JSImport("protractor", "error.InvalidCookieDomainError")
@js.native
class InvalidCookieDomainError ()
  extends typings.seleniumWebdriver.mod.error.InvalidCookieDomainError {
  def this(message: String) = this()
}

