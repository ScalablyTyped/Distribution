package typings.psNode.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ps-node", "kill")
@js.native
object kill extends js.Object {
  
  def apply(pID: String): Unit = js.native
  def apply(pID: String, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def apply(
    pID: String,
    signal: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def apply(pID: String, signal: String): Unit = js.native
  def apply(pID: String, signal: String, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def apply(pID: String, signal: Signal): Unit = js.native
  def apply(pID: String, signal: Signal, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def apply(pID: Double): Unit = js.native
  def apply(pID: Double, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def apply(
    pID: Double,
    signal: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def apply(pID: Double, signal: String): Unit = js.native
  def apply(pID: Double, signal: String, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def apply(pID: Double, signal: Signal): Unit = js.native
  def apply(pID: Double, signal: Signal, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
}
