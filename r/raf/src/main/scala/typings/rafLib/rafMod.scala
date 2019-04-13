package typings
package rafLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raf", JSImport.Namespace)
@js.native
object rafMod extends js.Object {
  def apply(callback: js.Function1[/* timestamp */ scala.Double, scala.Unit]): scala.Double = js.native
  def cancel(handle: scala.Double): scala.Unit = js.native
  def polyfill(): scala.Unit = js.native
  def polyfill(globalObject: js.Any): scala.Unit = js.native
}

