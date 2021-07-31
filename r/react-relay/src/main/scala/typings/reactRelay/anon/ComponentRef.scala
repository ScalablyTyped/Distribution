package typings.reactRelay.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentRef extends StObject {
  
  var componentRef: js.UndefOr[js.Function1[/* ref */ js.Any, Unit]] = js.undefined
}
object ComponentRef {
  
  @scala.inline
  def apply(): ComponentRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentRef]
  }
  
  @scala.inline
  implicit class ComponentRefMutableBuilder[Self <: ComponentRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentRef(value: /* ref */ js.Any => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
  }
}
