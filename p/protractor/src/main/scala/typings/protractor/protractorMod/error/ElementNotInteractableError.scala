package typings.protractor.protractorMod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indicates a command could not be completed because the target element is
  * not pointer or keyboard interactable. This will often occur if an element
  * is present in the DOM, but not rendered (i.e. its CSS style has
  * "display: none").
  */
@JSImport("protractor", "error.ElementNotInteractableError")
@js.native
class ElementNotInteractableError ()
  extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.error.ElementNotInteractableError {
  def this(message: String) = this()
}

