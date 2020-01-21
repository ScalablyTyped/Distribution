package typings.protractor.mod.error

import typings.seleniumWebdriver.mod.error.ErrorData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "error.throwDecodedError")
@js.native
object throwDecodedError extends js.Object {
  def apply(data: String): scala.Nothing = js.native
  /**
    * Throws an error coded from the W3C protocol. A generic error will be thrown
    * if the provided `data` is not a valid encoded error.
    */
  def apply(data: ErrorData): scala.Nothing = js.native
}

