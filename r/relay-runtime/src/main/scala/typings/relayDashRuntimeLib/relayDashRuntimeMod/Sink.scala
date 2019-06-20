package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sink[T] extends js.Object {
  val closed: scala.Boolean = js.native
  def complete(): scala.Unit = js.native
  def error(error: stdLib.Error): scala.Unit = js.native
  def error(error: stdLib.Error, isUncaughtThrownError: scala.Boolean): scala.Unit = js.native
  def next(value: T): scala.Unit = js.native
}

