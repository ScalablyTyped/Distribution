package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disposable
  extends StObject
     with IDisposable {
  
  /** Is this value disposed. */
  var isDisposed: js.UndefOr[Boolean] = js.undefined
}
object Disposable {
  
  inline def apply(dispose: () => Unit): Disposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[Disposable]
  }
  
  extension [Self <: Disposable](x: Self) {
    
    inline def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
    
    inline def setIsDisposedUndefined: Self = StObject.set(x, "isDisposed", js.undefined)
  }
}
