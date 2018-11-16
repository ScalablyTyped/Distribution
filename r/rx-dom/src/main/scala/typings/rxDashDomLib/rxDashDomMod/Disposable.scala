package typings
package rxDashDomLib.rxDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "Disposable")
@js.native
class Disposable protected ()
  extends rxLib.rxMod.Disposable {
  def this(action: js.Function0[scala.Unit]) = this()
}

@JSImport("rx-dom", "Disposable")
@js.native
object Disposable extends js.Object {
  var empty: rxDashCoreLib.RxNs.IDisposable = js.native
  def create(action: js.Function0[scala.Unit]): rxDashCoreLib.RxNs.IDisposable = js.native
}

