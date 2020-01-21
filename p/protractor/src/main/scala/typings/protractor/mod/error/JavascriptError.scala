package typings.protractor.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error occurred while executing JavaScript supplied by the user.
  */
@JSImport("protractor", "error.JavascriptError")
@js.native
class JavascriptError ()
  extends typings.seleniumWebdriver.mod.error.JavascriptError {
  def this(message: String) = this()
}

