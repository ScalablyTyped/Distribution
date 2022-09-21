package typings.sketchHqSketchFileFormatTs.typesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.overrideValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverrideValue
  extends StObject
     with AnyObject {
  
  var _class: overrideValue
  
  var do_objectID: js.UndefOr[Uuid] = js.undefined
  
  var overrideName: OverrideName
  
  var value: String | Uuid | FileRef | DataRef
}
object OverrideValue {
  
  inline def apply(overrideName: OverrideName, value: String | Uuid | FileRef | DataRef): OverrideValue = {
    val __obj = js.Dynamic.literal(_class = "overrideValue", overrideName = overrideName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverrideValue]
  }
  
  extension [Self <: OverrideValue](x: Self) {
    
    inline def setDo_objectID(value: Uuid): Self = StObject.set(x, "do_objectID", value.asInstanceOf[js.Any])
    
    inline def setDo_objectIDUndefined: Self = StObject.set(x, "do_objectID", js.undefined)
    
    inline def setOverrideName(value: OverrideName): Self = StObject.set(x, "overrideName", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | Uuid | FileRef | DataRef): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_class(value: overrideValue): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
