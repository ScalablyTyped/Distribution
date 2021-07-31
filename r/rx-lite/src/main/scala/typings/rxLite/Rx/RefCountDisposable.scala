package typings.rxLite.Rx

import typings.rxCore.Rx.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefCountDisposable
  extends StObject
     with IDisposable {
  
  def getDisposable(): IDisposable
  
  var isDisposed: Boolean
}
object RefCountDisposable {
  
  @scala.inline
  def apply(dispose: () => Unit, getDisposable: () => IDisposable, isDisposed: Boolean): RefCountDisposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), getDisposable = js.Any.fromFunction0(getDisposable), isDisposed = isDisposed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefCountDisposable]
  }
  
  @scala.inline
  implicit class RefCountDisposableMutableBuilder[Self <: RefCountDisposable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDisposable(value: () => IDisposable): Self = StObject.set(x, "getDisposable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
  }
}
