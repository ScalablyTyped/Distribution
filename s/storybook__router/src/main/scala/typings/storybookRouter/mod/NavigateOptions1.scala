package typings.storybookRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigateOptions1 extends StObject {
  
  var replace: js.UndefOr[Boolean] = js.undefined
  
  var state: js.UndefOr[Any] = js.undefined
}
object NavigateOptions1 {
  
  inline def apply(): NavigateOptions1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigateOptions1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigateOptions1] (val x: Self) extends AnyVal {
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
