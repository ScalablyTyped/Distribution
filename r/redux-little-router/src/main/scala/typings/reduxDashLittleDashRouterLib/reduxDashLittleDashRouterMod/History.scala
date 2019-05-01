package typings
package reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait History extends js.Object {
  var action: HistoryAction = js.native
  var length: scala.Double = js.native
  var location: Location = js.native
  def block(callback: BlockCallback): Unsubscribe = js.native
  def block(message: java.lang.String): scala.Unit = js.native
  def go(n: scala.Double): scala.Unit = js.native
  def goBack(): scala.Unit = js.native
  def goForward(): scala.Unit = js.native
  def listen(callback: ListenCallback): Unsubscribe = js.native
  def push(location: Location): scala.Unit = js.native
  def push(path: java.lang.String): scala.Unit = js.native
  def push(path: java.lang.String, state: ObjectLiteral[_]): scala.Unit = js.native
  def replace(location: Location): scala.Unit = js.native
  def replace(path: java.lang.String): scala.Unit = js.native
  def replace(path: java.lang.String, state: ObjectLiteral[_]): scala.Unit = js.native
}

