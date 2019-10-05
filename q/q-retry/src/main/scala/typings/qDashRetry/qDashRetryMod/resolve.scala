package typings.qDashRetry.qDashRetryMod

import typings.q.qMod.IWhenable
import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "resolve")
@js.native
object resolve extends js.Object {
  def apply[T](): Promise[T] = js.native
  def apply[T](`object`: IWhenable[T]): Promise[T] = js.native
}

