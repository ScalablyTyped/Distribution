package typings.protractor.protractorMod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A modal dialog was open, blocking this operation.
  */
@JSImport("protractor", "error.UnexpectedAlertOpenError")
@js.native
class UnexpectedAlertOpenError ()
  extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.error.UnexpectedAlertOpenError {
  def this(message: String) = this()
  def this(message: String, openAlertText: String) = this()
}

