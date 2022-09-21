package typings.reactSelect.typesMod

import typings.reactSelect.reactSelectStrings.`create-option`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOptionActionMeta[Option]
  extends StObject
     with ActionMetaBase[Option]
     with ActionMeta[Option] {
  
  var action: `create-option`
  
  @JSName("option")
  var option_CreateOptionActionMeta: Option
}
object CreateOptionActionMeta {
  
  inline def apply[Option](option: Option): CreateOptionActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "create-option", option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOptionActionMeta[Option]]
  }
  
  extension [Self <: CreateOptionActionMeta[?], Option](x: Self & CreateOptionActionMeta[Option]) {
    
    inline def setAction(value: `create-option`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setOption(value: Option): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
  }
}
