package typings.reactSelect.typesMod

import typings.reactSelect.reactSelectStrings.`remove-value`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveValueActionMeta[Option]
  extends StObject
     with ActionMetaBase[Option]
     with ActionMeta[Option] {
  
  var action: `remove-value`
  
  @JSName("removedValue")
  var removedValue_RemoveValueActionMeta: Option
}
object RemoveValueActionMeta {
  
  inline def apply[Option](removedValue: Option): RemoveValueActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "remove-value", removedValue = removedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveValueActionMeta[Option]]
  }
  
  extension [Self <: RemoveValueActionMeta[?], Option](x: Self & RemoveValueActionMeta[Option]) {
    
    inline def setAction(value: `remove-value`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setRemovedValue(value: Option): Self = StObject.set(x, "removedValue", value.asInstanceOf[js.Any])
  }
}
