package typings.rxLite.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectableObservable[T]
  extends StObject
     with Observable[T] {
  
  def connect(): Disposable = js.native
}
