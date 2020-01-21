package typings.protractor.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command could not be executed because the remote end is not aware of it.
  */
@JSImport("protractor", "error.UnknownCommandError")
@js.native
class UnknownCommandError ()
  extends typings.seleniumWebdriver.mod.error.UnknownCommandError {
  def this(message: String) = this()
}

