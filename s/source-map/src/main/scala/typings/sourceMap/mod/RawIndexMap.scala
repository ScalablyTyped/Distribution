package typings.sourceMap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawIndexMap
  extends StObject
     with StartOfSourceMap {
  
  var sections: js.Array[RawSection]
  
  var version: Double
}
object RawIndexMap {
  
  inline def apply(sections: js.Array[RawSection], version: Double): RawIndexMap = {
    val __obj = js.Dynamic.literal(sections = sections.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawIndexMap]
  }
  
  extension [Self <: RawIndexMap](x: Self) {
    
    inline def setSections(value: js.Array[RawSection]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsVarargs(value: RawSection*): Self = StObject.set(x, "sections", js.Array(value :_*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
