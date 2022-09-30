package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMatch extends StObject {
  
  var id: Double
  
  var isFullMatch: Boolean
}
object PathMatch {
  
  inline def apply(id: Double, isFullMatch: Boolean): PathMatch = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isFullMatch = isFullMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMatch]
  }
  
  extension [Self <: PathMatch](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsFullMatch(value: Boolean): Self = StObject.set(x, "isFullMatch", value.asInstanceOf[js.Any])
  }
}
