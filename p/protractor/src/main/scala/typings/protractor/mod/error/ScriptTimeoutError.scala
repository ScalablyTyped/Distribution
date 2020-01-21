package typings.protractor.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A script did not complete before its timeout expired.
  */
@JSImport("protractor", "error.ScriptTimeoutError")
@js.native
class ScriptTimeoutError ()
  extends typings.seleniumWebdriver.mod.error.ScriptTimeoutError {
  def this(message: String) = this()
}

