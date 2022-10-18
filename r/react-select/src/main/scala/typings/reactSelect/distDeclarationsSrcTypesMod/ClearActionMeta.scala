package typings.reactSelect.distDeclarationsSrcTypesMod

import typings.reactSelect.reactSelectStrings.clear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearActionMeta[Option]
  extends StObject
     with ActionMetaBase[Option]
     with ActionMeta[Option] {
  
  var action: clear
  
  @JSName("removedValues")
  var removedValues_ClearActionMeta: Options[Option]
}
object ClearActionMeta {
  
  inline def apply[Option](removedValues: Options[Option]): ClearActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "clear", removedValues = removedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearActionMeta[Option]]
  }
  
  extension [Self <: ClearActionMeta[?], Option](x: Self & ClearActionMeta[Option]) {
    
    inline def setAction(value: clear): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setRemovedValues(value: Options[Option]): Self = StObject.set(x, "removedValues", value.asInstanceOf[js.Any])
    
    inline def setRemovedValuesVarargs(value: Option*): Self = StObject.set(x, "removedValues", js.Array(value*))
  }
}
