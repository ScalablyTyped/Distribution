package typings.sourceMap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeWithSourceMap extends StObject {
  
  var code: String
  
  var map: SourceMapGenerator
}
object CodeWithSourceMap {
  
  @scala.inline
  def apply(code: String, map: SourceMapGenerator): CodeWithSourceMap = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeWithSourceMap]
  }
  
  @scala.inline
  implicit class CodeWithSourceMapMutableBuilder[Self <: CodeWithSourceMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: SourceMapGenerator): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
  }
}
