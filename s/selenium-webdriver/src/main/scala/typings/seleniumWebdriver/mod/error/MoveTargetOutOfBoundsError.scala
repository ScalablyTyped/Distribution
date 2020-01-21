package typings.seleniumWebdriver.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The target for mouse interaction is not in the browser’s viewport and
  * cannot be brought into that viewport.
  */
@JSImport("selenium-webdriver", "error.MoveTargetOutOfBoundsError")
@js.native
class MoveTargetOutOfBoundsError () extends WebDriverError {
  def this(message: String) = this()
}

