package typings.protractor.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The requested command matched a known URL but did not match an method for
  * that URL.
  */
@JSImport("protractor", "error.UnknownMethodError")
@js.native
class UnknownMethodError ()
  extends typings.seleniumWebdriver.mod.error.UnknownMethodError {
  def this(message: String) = this()
}

