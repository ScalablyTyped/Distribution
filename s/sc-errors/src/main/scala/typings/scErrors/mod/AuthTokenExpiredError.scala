package typings.scErrors.mod

import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-errors", "AuthTokenExpiredError")
@js.native
class AuthTokenExpiredError protected () extends Error {
  def this(message: String, expiry: Date) = this()
  var expiry: Date = js.native
}

