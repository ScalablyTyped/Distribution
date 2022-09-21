package typings.storybookComponents.typesPrettierIndexMod.doc.builders

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fill_
  extends StObject
     with DocCommand {
  
  var parts: js.Array[Doc]
  
  var `type`: typings.storybookComponents.storybookComponentsStrings.fill
}
object Fill_ {
  
  inline def apply(parts: js.Array[Doc]): Fill_ = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill")
    __obj.asInstanceOf[Fill_]
  }
  
  extension [Self <: Fill_](x: Self) {
    
    inline def setParts(value: js.Array[Doc]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsVarargs(value: Doc*): Self = StObject.set(x, "parts", js.Array(value*))
    
    inline def setType(value: typings.storybookComponents.storybookComponentsStrings.fill): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
