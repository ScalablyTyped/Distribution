package typings.sourceMap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeWithSourceMap extends StObject {
  
  var code: String
  
  var map: SourceMapGenerator
}
object CodeWithSourceMap {
  
  inline def apply(code: String, map: SourceMapGenerator): CodeWithSourceMap = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeWithSourceMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeWithSourceMap] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMap(value: SourceMapGenerator): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
  }
}
