package typings.scErrors.mod

import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-errors", "AuthTokenNotBeforeError")
@js.native
class AuthTokenNotBeforeError protected () extends Error {
  def this(message: String, date: Date) = this()
  var date: Date = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

