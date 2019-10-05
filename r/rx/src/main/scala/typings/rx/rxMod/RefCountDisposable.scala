package typings.rx.rxMod

import typings.rxDashCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "RefCountDisposable")
@js.native
class RefCountDisposable protected ()
  extends typings.rxDashLite.Rx.RefCountDisposable {
  def this(disposable: IDisposable) = this()
}

