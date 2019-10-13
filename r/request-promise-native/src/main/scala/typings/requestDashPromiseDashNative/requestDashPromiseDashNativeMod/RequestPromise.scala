package typings.requestDashPromiseDashNative.requestDashPromiseDashNativeMod

import typings.request.requestMod.Request
import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestPromise[T]
  extends Request
     with Promise[T] {
  def promise(): js.Promise[T] = js.native
}

