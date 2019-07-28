package typings.rxDashLite.rxDashLiteMod

import typings.rxDashCore.RxNs.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-lite", "CompositeDisposable")
@js.native
class CompositeDisposable protected ()
  extends typings.rxDashLite.RxNs.CompositeDisposable {
  def this(disposables: IDisposable*) = this()
  def this(disposables: js.Array[IDisposable]) = this()
}

