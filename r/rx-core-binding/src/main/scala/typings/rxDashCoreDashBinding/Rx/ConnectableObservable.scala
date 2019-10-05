package typings.rxDashCoreDashBinding.Rx

import org.scalablytyped.runtime.TopLevel
import typings.rxDashCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectableObservable[T] extends Observable[T] {
  def connect(): IDisposable = js.native
  def refCount(): Observable[T] = js.native
}

@JSGlobal("Rx.ConnectableObservable")
@js.native
object ConnectableObservable extends TopLevel[ConnectableObservableStatic]

