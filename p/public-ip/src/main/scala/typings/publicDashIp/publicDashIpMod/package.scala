package typings.publicDashIp

import typings.publicDashIp.Anon_Cancel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object publicDashIpMod {
  type CancelablePromise[T] = js.Promise[T] with Anon_Cancel
}
