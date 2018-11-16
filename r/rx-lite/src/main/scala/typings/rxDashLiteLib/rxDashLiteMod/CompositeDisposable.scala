package typings
package rxDashLiteLib.rxDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-lite", "CompositeDisposable")
@js.native
class CompositeDisposable protected ()
  extends rxDashLiteLib.RxNs.CompositeDisposable {
  def this(disposables: rxDashCoreLib.RxNs.IDisposable*) = this()
  def this(disposables: js.Array[rxDashCoreLib.RxNs.IDisposable]) = this()
}

