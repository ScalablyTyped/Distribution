package typings.rxDashDom.rxDashDomMod

import typings.rxDashCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "CompositeDisposable")
@js.native
class CompositeDisposable protected ()
  extends typings.rx.rxMod.CompositeDisposable {
  def this(disposables: IDisposable*) = this()
  def this(disposables: js.Array[IDisposable]) = this()
}

