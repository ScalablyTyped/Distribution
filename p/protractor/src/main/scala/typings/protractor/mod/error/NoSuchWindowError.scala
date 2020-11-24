package typings.protractor.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to switch to a window could not be satisfied because the window
  * could not be found.
  */
@JSImport("protractor", "error.NoSuchWindowError")
@js.native
class NoSuchWindowError ()
  extends typings.seleniumWebdriver.mod.error.NoSuchWindowError {
  def this(message: String) = this()
}
