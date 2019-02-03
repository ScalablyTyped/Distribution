package typings
package rxLib.rxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "Disposable")
@js.native
class Disposable protected ()
  extends rxDashLiteLib.RxNs.Disposable {
  def this(action: js.Function0[scala.Unit]) = this()
}

/* static members */
@JSImport("rx", "Disposable")
@js.native
object Disposable extends js.Object {
  var empty: rxDashCoreLib.RxNs.IDisposable = js.native
  def create(action: js.Function0[scala.Unit]): rxDashCoreLib.RxNs.IDisposable = js.native
}

