package typings.rollup.mod

import typings.rollup.rollupStrings.`prebuilt-chunk`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmittedPrebuiltChunk
  extends StObject
     with EmittedFile {
  
  var code: String
  
  var exports: js.UndefOr[js.Array[String]] = js.undefined
  
  var fileName: String
  
  var map: js.UndefOr[SourceMap] = js.undefined
  
  var `type`: `prebuilt-chunk`
}
object EmittedPrebuiltChunk {
  
  inline def apply(code: String, fileName: String): EmittedPrebuiltChunk = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("prebuilt-chunk")
    __obj.asInstanceOf[EmittedPrebuiltChunk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmittedPrebuiltChunk] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setExports(value: js.Array[String]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    inline def setExportsVarargs(value: String*): Self = StObject.set(x, "exports", js.Array(value*))
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setMap(value: SourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setType(value: `prebuilt-chunk`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
