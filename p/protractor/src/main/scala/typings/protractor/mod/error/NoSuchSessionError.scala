package typings.protractor.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Occurs when a command is directed to a session that does not exist.
  */
@JSImport("protractor", "error.NoSuchSessionError")
@js.native
class NoSuchSessionError ()
  extends typings.seleniumWebdriver.mod.error.NoSuchSessionError {
  def this(message: String) = this()
}
