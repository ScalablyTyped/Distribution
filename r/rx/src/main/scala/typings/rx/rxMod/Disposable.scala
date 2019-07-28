package typings.rx.rxMod

import typings.rxDashCore.RxNs.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "Disposable")
@js.native
class Disposable protected ()
  extends typings.rxDashLite.RxNs.Disposable {
  def this(action: js.Function0[Unit]) = this()
}

/* static members */
@JSImport("rx", "Disposable")
@js.native
object Disposable extends js.Object {
  var empty: IDisposable = js.native
  def create(action: js.Function0[Unit]): IDisposable = js.native
}

