package typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait History extends js.Object {
  var action: HistoryAction = js.native
  var length: Double = js.native
  var location: Location = js.native
  def block(callback: BlockCallback): Unsubscribe = js.native
  def block(message: String): Unit = js.native
  def go(n: Double): Unit = js.native
  def goBack(): Unit = js.native
  def goForward(): Unit = js.native
  def listen(callback: ListenCallback): Unsubscribe = js.native
  def push(location: Location): Unit = js.native
  def push(path: String): Unit = js.native
  def push(path: String, state: ObjectLiteral[_]): Unit = js.native
  def replace(location: Location): Unit = js.native
  def replace(path: String): Unit = js.native
  def replace(path: String, state: ObjectLiteral[_]): Unit = js.native
}

