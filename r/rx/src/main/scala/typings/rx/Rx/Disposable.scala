package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disposable extends IDisposable {
  
  /** Is this value disposed. */
  var isDisposed: js.UndefOr[Boolean] = js.native
}
object Disposable {
  
  @scala.inline
  def apply(dispose: () => Unit): Disposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[Disposable]
  }
  
  @scala.inline
  implicit class DisposableMutableBuilder[Self <: Disposable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDisposedUndefined: Self = StObject.set(x, "isDisposed", js.undefined)
  }
}
