package typings.stencilCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Internal extends StObject {
  
  var internal: Boolean
  
  var jsdoc: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var optional: Boolean
  
  var required: Boolean
  
  var `type`: String
}
object Internal {
  
  inline def apply(internal: Boolean, name: String, optional: Boolean, required: Boolean, `type`: String): Internal = {
    val __obj = js.Dynamic.literal(internal = internal.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Internal]
  }
  
  extension [Self <: Internal](x: Self) {
    
    inline def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    inline def setJsdoc(value: String): Self = StObject.set(x, "jsdoc", value.asInstanceOf[js.Any])
    
    inline def setJsdocUndefined: Self = StObject.set(x, "jsdoc", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
