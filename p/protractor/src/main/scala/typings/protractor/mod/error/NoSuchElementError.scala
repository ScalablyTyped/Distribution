package typings.protractor.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An element could not be located on the page using the given search
  * parameters.
  */
@JSImport("protractor", "error.NoSuchElementError")
@js.native
class NoSuchElementError ()
  extends typings.seleniumWebdriver.mod.error.NoSuchElementError {
  def this(message: String) = this()
}

