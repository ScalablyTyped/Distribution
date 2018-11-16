package typings
package rxDashLiteLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.CompositeDisposable")
@js.native
class CompositeDisposable protected ()
  extends rxDashCoreLib.RxNs.IDisposable {
  def this(disposables: rxDashCoreLib.RxNs.IDisposable*) = this()
  def this(disposables: js.Array[rxDashCoreLib.RxNs.IDisposable]) = this()
  var isDisposed: scala.Boolean = js.native
  var length: scala.Double = js.native
  def add(item: rxDashCoreLib.RxNs.IDisposable): scala.Unit = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def remove(item: rxDashCoreLib.RxNs.IDisposable): scala.Boolean = js.native
  def toArray(): js.Array[rxDashCoreLib.RxNs.IDisposable] = js.native
}

