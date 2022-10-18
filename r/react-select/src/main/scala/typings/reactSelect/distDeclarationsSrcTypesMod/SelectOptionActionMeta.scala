package typings.reactSelect.distDeclarationsSrcTypesMod

import typings.reactSelect.reactSelectStrings.`select-option`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectOptionActionMeta[Option]
  extends StObject
     with ActionMetaBase[Option]
     with ActionMeta[Option] {
  
  var action: `select-option`
}
object SelectOptionActionMeta {
  
  inline def apply[Option](): SelectOptionActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "select-option")
    __obj.asInstanceOf[SelectOptionActionMeta[Option]]
  }
  
  extension [Self <: SelectOptionActionMeta[?], Option](x: Self & SelectOptionActionMeta[Option]) {
    
    inline def setAction(value: `select-option`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
