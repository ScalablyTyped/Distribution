package typings.rx.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectableObservable[T] extends Observable[T] {
  
  def connect(): IDisposable = js.native
  
  def refCount(): Observable[T] = js.native
}
