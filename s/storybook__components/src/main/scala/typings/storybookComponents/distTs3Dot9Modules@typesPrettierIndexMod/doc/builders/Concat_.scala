package typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`.doc.builders

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Concat_
  extends StObject
     with DocCommand {
  
  var parts: js.Array[Doc]
  
  var `type`: typings.storybookComponents.storybookComponentsStrings.concat
}
object Concat_ {
  
  inline def apply(parts: js.Array[Doc]): Concat_ = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("concat")
    __obj.asInstanceOf[Concat_]
  }
  
  extension [Self <: Concat_](x: Self) {
    
    inline def setParts(value: js.Array[Doc]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsVarargs(value: Doc*): Self = StObject.set(x, "parts", js.Array(value*))
    
    inline def setType(value: typings.storybookComponents.storybookComponentsStrings.concat): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
