package typings.seleniumWebdriver.mod.error

import typings.seleniumWebdriver.anon.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "error.encodeError")
@js.native
object encodeError extends js.Object {
  /**
    * Lookup the err in table of errors.
    */
  def apply(err: js.Any): Error = js.native
}

