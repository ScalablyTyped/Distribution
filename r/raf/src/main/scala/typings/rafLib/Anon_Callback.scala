package typings
package rafLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  def apply(callback: js.Function1[/* timestamp */ scala.Double, scala.Unit]): scala.Double = js.native
  def cancel(handle: scala.Double): scala.Unit = js.native
  def polyfill(): scala.Unit = js.native
  def polyfill(globalObject: js.Any): scala.Unit = js.native
}

