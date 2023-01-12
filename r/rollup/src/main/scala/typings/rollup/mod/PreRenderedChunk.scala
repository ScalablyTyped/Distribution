package typings.rollup.mod

import typings.rollup.rollupStrings.chunk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreRenderedChunk extends StObject {
  
  var exports: js.Array[String]
  
  var facadeModuleId: String | Null
  
  var isDynamicEntry: Boolean
  
  var isEntry: Boolean
  
  var isImplicitEntry: Boolean
  
  var moduleIds: js.Array[String]
  
  var name: String
  
  var `type`: chunk
}
object PreRenderedChunk {
  
  inline def apply(
    exports: js.Array[String],
    isDynamicEntry: Boolean,
    isEntry: Boolean,
    isImplicitEntry: Boolean,
    moduleIds: js.Array[String],
    name: String
  ): PreRenderedChunk = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], isDynamicEntry = isDynamicEntry.asInstanceOf[js.Any], isEntry = isEntry.asInstanceOf[js.Any], isImplicitEntry = isImplicitEntry.asInstanceOf[js.Any], moduleIds = moduleIds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], facadeModuleId = null)
    __obj.updateDynamic("type")("chunk")
    __obj.asInstanceOf[PreRenderedChunk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreRenderedChunk] (val x: Self) extends AnyVal {
    
    inline def setExports(value: js.Array[String]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsVarargs(value: String*): Self = StObject.set(x, "exports", js.Array(value*))
    
    inline def setFacadeModuleId(value: String): Self = StObject.set(x, "facadeModuleId", value.asInstanceOf[js.Any])
    
    inline def setFacadeModuleIdNull: Self = StObject.set(x, "facadeModuleId", null)
    
    inline def setIsDynamicEntry(value: Boolean): Self = StObject.set(x, "isDynamicEntry", value.asInstanceOf[js.Any])
    
    inline def setIsEntry(value: Boolean): Self = StObject.set(x, "isEntry", value.asInstanceOf[js.Any])
    
    inline def setIsImplicitEntry(value: Boolean): Self = StObject.set(x, "isImplicitEntry", value.asInstanceOf[js.Any])
    
    inline def setModuleIds(value: js.Array[String]): Self = StObject.set(x, "moduleIds", value.asInstanceOf[js.Any])
    
    inline def setModuleIdsVarargs(value: String*): Self = StObject.set(x, "moduleIds", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: chunk): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
