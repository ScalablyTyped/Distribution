package typings
package rxDashLiteLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.RefCountDisposable")
@js.native
class RefCountDisposable protected ()
  extends rxDashCoreLib.RxNs.IDisposable {
  def this(disposable: rxDashCoreLib.RxNs.IDisposable) = this()
  var isDisposed: scala.Boolean = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def getDisposable(): rxDashCoreLib.RxNs.IDisposable = js.native
}

