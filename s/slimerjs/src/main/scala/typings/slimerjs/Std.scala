package typings.slimerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Std extends StObject {
  
  def read(): js.Any = js.native
  
  def write(arg: js.Any): Unit = js.native
}
object Std {
  
  @scala.inline
  def apply(read: () => js.Any, write: js.Any => Unit): Std = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[Std]
  }
  
  @scala.inline
  implicit class StdMutableBuilder[Self <: Std] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRead(value: () => js.Any): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWrite(value: js.Any => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
