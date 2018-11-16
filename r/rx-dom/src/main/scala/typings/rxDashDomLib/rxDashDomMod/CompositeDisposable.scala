package typings
package rxDashDomLib.rxDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "CompositeDisposable")
@js.native
class CompositeDisposable protected ()
  extends rxLib.rxMod.CompositeDisposable {
  def this(disposables: rxDashCoreLib.RxNs.IDisposable*) = this()
  def this(disposables: js.Array[rxDashCoreLib.RxNs.IDisposable]) = this()
}

