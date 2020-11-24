package typings.protractor.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A modal dialog was open, blocking this operation.
  */
@JSImport("protractor", "error.UnexpectedAlertOpenError")
@js.native
class UnexpectedAlertOpenError ()
  extends typings.seleniumWebdriver.mod.error.UnexpectedAlertOpenError {
  def this(message: String) = this()
  def this(message: js.UndefOr[scala.Nothing], openAlertText: String) = this()
  def this(message: String, openAlertText: String) = this()
}
