package typings
package atReduxDashSagaCoreLib.atReduxDashSagaCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PuttableChannel[T] extends js.Object {
  def put(message: T): scala.Unit = js.native
  def put(message: END): scala.Unit = js.native
}

