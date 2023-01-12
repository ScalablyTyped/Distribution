package typings.reactSelect.distDeclarationsSrcTypesMod

import typings.reactSelect.reactSelectStrings.`pop-value`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopValueActionMeta[Option]
  extends StObject
     with ActionMetaBase[Option]
     with ActionMeta[Option] {
  
  var action: `pop-value`
  
  @JSName("removedValue")
  var removedValue_PopValueActionMeta: Option
}
object PopValueActionMeta {
  
  inline def apply[Option](removedValue: Option): PopValueActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "pop-value", removedValue = removedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopValueActionMeta[Option]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopValueActionMeta[?], Option] (val x: Self & PopValueActionMeta[Option]) extends AnyVal {
    
    inline def setAction(value: `pop-value`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setRemovedValue(value: Option): Self = StObject.set(x, "removedValue", value.asInstanceOf[js.Any])
  }
}
