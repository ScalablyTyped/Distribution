package typings.protractor.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments passed to a command are either invalid or malformed.
  */
@JSImport("protractor", "error.InvalidArgumentError")
@js.native
class InvalidArgumentError ()
  extends typings.seleniumWebdriver.mod.error.InvalidArgumentError {
  def this(message: String) = this()
}

