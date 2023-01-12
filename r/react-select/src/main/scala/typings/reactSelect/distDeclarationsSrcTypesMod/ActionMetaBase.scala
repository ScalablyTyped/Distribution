package typings.reactSelect.distDeclarationsSrcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionMetaBase[Option] extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var option: js.UndefOr[Option] = js.undefined
  
  var removedValue: js.UndefOr[Option] = js.undefined
  
  var removedValues: js.UndefOr[Options[Option]] = js.undefined
}
object ActionMetaBase {
  
  inline def apply[Option](): ActionMetaBase[Option] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionMetaBase[Option]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionMetaBase[?], Option] (val x: Self & ActionMetaBase[Option]) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOption(value: Option): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    
    inline def setRemovedValue(value: Option): Self = StObject.set(x, "removedValue", value.asInstanceOf[js.Any])
    
    inline def setRemovedValueUndefined: Self = StObject.set(x, "removedValue", js.undefined)
    
    inline def setRemovedValues(value: Options[Option]): Self = StObject.set(x, "removedValues", value.asInstanceOf[js.Any])
    
    inline def setRemovedValuesUndefined: Self = StObject.set(x, "removedValues", js.undefined)
    
    inline def setRemovedValuesVarargs(value: Option*): Self = StObject.set(x, "removedValues", js.Array(value*))
  }
}
