package typings.protractor.protractorMod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An element command failed because the referenced element is no longer
  * attached to the DOM.
  */
@JSImport("protractor", "error.StaleElementReferenceError")
@js.native
class StaleElementReferenceError ()
  extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.error.StaleElementReferenceError {
  def this(message: String) = this()
}

