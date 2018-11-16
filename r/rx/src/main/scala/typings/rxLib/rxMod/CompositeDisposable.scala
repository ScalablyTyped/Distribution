package typings
package rxLib.rxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "CompositeDisposable")
@js.native
class CompositeDisposable protected ()
  extends rxDashLiteLib.RxNs.CompositeDisposable {
  def this(disposables: rxDashCoreLib.RxNs.IDisposable*) = this()
  def this(disposables: js.Array[rxDashCoreLib.RxNs.IDisposable]) = this()
}

