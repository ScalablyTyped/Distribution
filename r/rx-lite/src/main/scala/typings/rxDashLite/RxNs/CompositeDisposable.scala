package typings.rxDashLite.RxNs

import typings.rxDashCore.RxNs.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.CompositeDisposable")
@js.native
class CompositeDisposable protected () extends IDisposable {
  def this(disposables: IDisposable*) = this()
  def this(disposables: js.Array[IDisposable]) = this()
  var isDisposed: Boolean = js.native
  var length: Double = js.native
  def add(item: IDisposable): Unit = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  def remove(item: IDisposable): Boolean = js.native
  def toArray(): js.Array[IDisposable] = js.native
}

