package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Fetch API
//
@js.native
trait GlobalFetch extends js.Object {
  def fetch(input: RequestInfo): stdLib.Promise[Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): stdLib.Promise[Response] = js.native
}

