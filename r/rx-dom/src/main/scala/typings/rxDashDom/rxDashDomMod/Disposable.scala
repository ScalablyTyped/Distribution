package typings.rxDashDom.rxDashDomMod

import typings.rxDashCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "Disposable")
@js.native
class Disposable protected ()
  extends typings.rx.rxMod.Disposable {
  def this(action: js.Function0[Unit]) = this()
}

/* static members */
@JSImport("rx-dom", "Disposable")
@js.native
object Disposable extends js.Object {
  var empty: IDisposable = js.native
  def create(action: js.Function0[Unit]): IDisposable = js.native
}

