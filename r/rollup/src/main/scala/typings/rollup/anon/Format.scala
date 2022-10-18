package typings.rollup.anon

import typings.rollup.mod.InternalModuleFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  var chunkId: String
  
  var format: InternalModuleFormat
  
  var moduleId: String
}
object Format {
  
  inline def apply(chunkId: String, format: InternalModuleFormat, moduleId: String): Format = {
    val __obj = js.Dynamic.literal(chunkId = chunkId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  
  extension [Self <: Format](x: Self) {
    
    inline def setChunkId(value: String): Self = StObject.set(x, "chunkId", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: InternalModuleFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
  }
}
