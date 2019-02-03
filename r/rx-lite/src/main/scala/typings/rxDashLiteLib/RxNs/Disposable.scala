package typings
package rxDashLiteLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.Disposable")
@js.native
class Disposable protected ()
  extends rxDashCoreLib.RxNs.IDisposable {
  def this(action: js.Function0[scala.Unit]) = this()
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
}

/* static members */
@JSGlobal("Rx.Disposable")
@js.native
object Disposable extends js.Object {
  var empty: rxDashCoreLib.RxNs.IDisposable = js.native
  def create(action: js.Function0[scala.Unit]): rxDashCoreLib.RxNs.IDisposable = js.native
}

