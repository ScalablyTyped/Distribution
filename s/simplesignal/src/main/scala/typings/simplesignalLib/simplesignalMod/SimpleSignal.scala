package typings
package simplesignalLib.simplesignalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleSignal[F /* <: js.Function */] extends js.Object {
  var functions: js.Any
  val numItems: scala.Double
  def add(func: F): scala.Boolean
  def dispatch(args: js.Any*): scala.Unit
  def remove(func: F): scala.Boolean
  def removeAll(): scala.Boolean
}

