package typings.stellarBase.anon

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsValid extends StObject {
  
  def isValid(value: js.Any): Boolean = js.native
  
  def read(io: js.Any): js.Any = js.native
  
  def write(value: js.Any, io: Buffer): Unit = js.native
}
object IsValid {
  
  @scala.inline
  def apply(isValid: js.Any => Boolean, read: js.Any => js.Any, write: (js.Any, Buffer) => Unit): IsValid = {
    val __obj = js.Dynamic.literal(isValid = js.Any.fromFunction1(isValid), read = js.Any.fromFunction1(read), write = js.Any.fromFunction2(write))
    __obj.asInstanceOf[IsValid]
  }
  
  @scala.inline
  implicit class IsValidMutableBuilder[Self <: IsValid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsValid(value: js.Any => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRead(value: js.Any => js.Any): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrite(value: (js.Any, Buffer) => Unit): Self = StObject.set(x, "write", js.Any.fromFunction2(value))
  }
}
