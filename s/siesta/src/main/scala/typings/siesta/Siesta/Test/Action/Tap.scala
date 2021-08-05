package typings.siesta.Siesta.Test.Action

import typings.siesta.Siesta.Test.Action.Role.IHasTarget
import typings.siesta.Siesta.Test.IAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  */
trait Tap
  extends StObject
     with IAction
     with IHasTarget {
  
  var options: js.UndefOr[js.Any] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object Tap {
  
  inline def apply(): Tap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tap]
  }
  
  extension [Self <: Tap](x: Self) {
    
    inline def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
