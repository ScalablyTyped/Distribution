package typings.rx.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subject[T]
  extends Observable[T]
     with Observer[T]
     with IDisposable {
  
  def hasObservers(): Boolean = js.native
  
  /** Is this value disposed. */
  var isDisposed: Boolean = js.native
}
