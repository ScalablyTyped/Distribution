package typings.protractor.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An attempt was made to operate on a modal dialog when one was not open.
  */
@JSImport("protractor", "error.NoSuchAlertError")
@js.native
class NoSuchAlertError ()
  extends typings.seleniumWebdriver.mod.error.NoSuchAlertError {
  def this(message: String) = this()
}
