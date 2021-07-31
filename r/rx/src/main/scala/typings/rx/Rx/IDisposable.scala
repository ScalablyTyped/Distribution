package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDisposable extends StObject {
  
  def dispose(): Unit
}
object IDisposable {
  
  @scala.inline
  def apply(dispose: () => Unit): IDisposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[IDisposable]
  }
  
  @scala.inline
  implicit class IDisposableMutableBuilder[Self <: IDisposable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
  }
}
