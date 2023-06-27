package typings.siesta.Siesta.Test.Action

import typings.siesta.Siesta.Test.Action.Role.IHasTarget
import typings.siesta.Siesta.Test.IAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  */
trait Click
  extends StObject
     with IAction
     with IHasTarget {
  
  var options: js.UndefOr[Any] = js.undefined
}
object Click {
  
  inline def apply(): Click = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Click]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Click] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
