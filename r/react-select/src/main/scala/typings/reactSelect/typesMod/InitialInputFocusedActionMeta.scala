package typings.reactSelect.typesMod

import typings.reactSelect.reactSelectStrings.`initial-input-focus`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialInputFocusedActionMeta[Option, IsMulti /* <: Boolean */]
  extends StObject
     with ActionMetaBase[Option] {
  
  var action: `initial-input-focus`
  
  var options: js.UndefOr[Options[Option]] = js.undefined
  
  var value: OnChangeValue[Option, IsMulti]
}
object InitialInputFocusedActionMeta {
  
  inline def apply[Option, IsMulti /* <: Boolean */](): InitialInputFocusedActionMeta[Option, IsMulti] = {
    val __obj = js.Dynamic.literal(action = "initial-input-focus", value = null)
    __obj.asInstanceOf[InitialInputFocusedActionMeta[Option, IsMulti]]
  }
  
  extension [Self <: InitialInputFocusedActionMeta[?, ?], Option, IsMulti /* <: Boolean */](x: Self & (InitialInputFocusedActionMeta[Option, IsMulti])) {
    
    inline def setAction(value: `initial-input-focus`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Options[Option]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setValue(value: OnChangeValue[Option, IsMulti]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueVarargs(value: Option*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
