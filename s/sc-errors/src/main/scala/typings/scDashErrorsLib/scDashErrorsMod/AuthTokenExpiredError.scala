package typings
package scDashErrorsLib.scDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-errors", "AuthTokenExpiredError")
@js.native
class AuthTokenExpiredError protected ()
  extends stdLib.Error {
  def this(message: java.lang.String, expiry: stdLib.Date) = this()
  var expiry: stdLib.Date = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

