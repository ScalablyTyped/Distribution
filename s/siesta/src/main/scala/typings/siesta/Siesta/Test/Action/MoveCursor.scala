package typings.siesta.Siesta.Test.Action

import typings.siesta.Siesta.Test.Action.Role.IHasTarget
import typings.siesta.Siesta.Test.IAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  */
trait MoveCursor
  extends StObject
     with IAction
     with IHasTarget {
  
  var by: js.UndefOr[Any] = js.undefined
  
  var to: js.UndefOr[Any] = js.undefined
}
object MoveCursor {
  
  inline def apply(): MoveCursor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveCursor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoveCursor] (val x: Self) extends AnyVal {
    
    inline def setBy(value: Any): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
    
    inline def setByUndefined: Self = StObject.set(x, "by", js.undefined)
    
    inline def setTo(value: Any): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
