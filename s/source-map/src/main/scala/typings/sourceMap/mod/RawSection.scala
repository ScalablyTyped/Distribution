package typings.sourceMap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawSection extends StObject {
  
  var map: RawSourceMap
  
  var offset: Position
}
object RawSection {
  
  inline def apply(map: RawSourceMap, offset: Position): RawSection = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawSection]
  }
  
  extension [Self <: RawSection](x: Self) {
    
    inline def setMap(value: RawSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Position): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
