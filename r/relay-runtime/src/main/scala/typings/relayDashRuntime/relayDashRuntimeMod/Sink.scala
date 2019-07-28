package typings.relayDashRuntime.relayDashRuntimeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sink[T] extends js.Object {
  val closed: Boolean = js.native
  def complete(): Unit = js.native
  def error(error: Error): Unit = js.native
  def error(error: Error, isUncaughtThrownError: Boolean): Unit = js.native
  def next(value: T): Unit = js.native
}

