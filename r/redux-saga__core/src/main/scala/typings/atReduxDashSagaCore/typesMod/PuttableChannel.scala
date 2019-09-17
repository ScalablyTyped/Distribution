package typings.atReduxDashSagaCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PuttableChannel[T] extends js.Object {
  def put(message: T): Unit = js.native
  def put(message: END): Unit = js.native
}

