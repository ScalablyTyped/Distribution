package typings.rxDashLite.RxNs

import typings.rxDashCore.RxNs.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.Disposable")
@js.native
class Disposable protected () extends IDisposable {
  def this(action: js.Function0[Unit]) = this()
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

/* static members */
@JSGlobal("Rx.Disposable")
@js.native
object Disposable extends js.Object {
  var empty: IDisposable = js.native
  def create(action: js.Function0[Unit]): IDisposable = js.native
}

