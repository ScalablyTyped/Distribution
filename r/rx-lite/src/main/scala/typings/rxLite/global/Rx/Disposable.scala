package typings.rxLite.global.Rx

import typings.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.Disposable")
@js.native
class Disposable protected ()
  extends typings.rxLite.Rx.Disposable {
  def this(action: js.Function0[Unit]) = this()
}

/* static members */
@JSGlobal("Rx.Disposable")
@js.native
object Disposable extends js.Object {
  var empty: IDisposable = js.native
  def create(action: js.Function0[Unit]): IDisposable = js.native
}

