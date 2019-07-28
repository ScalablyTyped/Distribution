package typings.rxDashLite.RxNs

import typings.rxDashCore.RxNs.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.RefCountDisposable")
@js.native
class RefCountDisposable protected () extends IDisposable {
  def this(disposable: IDisposable) = this()
  var isDisposed: Boolean = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  def getDisposable(): IDisposable = js.native
}

