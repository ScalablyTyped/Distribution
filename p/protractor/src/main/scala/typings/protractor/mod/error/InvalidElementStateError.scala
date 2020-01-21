package typings.protractor.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An element command could not be completed because the element is in an
  * invalid state, e.g. attempting to click an element that is no longer
  * attached to the document.
  */
@JSImport("protractor", "error.InvalidElementStateError")
@js.native
class InvalidElementStateError ()
  extends typings.seleniumWebdriver.mod.error.InvalidElementStateError {
  def this(message: String) = this()
}

