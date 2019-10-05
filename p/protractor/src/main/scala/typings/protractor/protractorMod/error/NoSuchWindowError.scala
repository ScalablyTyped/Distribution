package typings.protractor.protractorMod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to switch to a window could not be satisfied because the window
  * could not be found.
  */
@JSImport("protractor", "error.NoSuchWindowError")
@js.native
class NoSuchWindowError ()
  extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.error.NoSuchWindowError {
  def this(message: String) = this()
}

