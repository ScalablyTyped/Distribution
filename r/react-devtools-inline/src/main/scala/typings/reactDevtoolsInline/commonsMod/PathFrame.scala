package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathFrame extends StObject {
  
  var displayName: String | Null
  
  var index: Double
  
  var key: String | Null
}
object PathFrame {
  
  inline def apply(index: Double): PathFrame = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], displayName = null, key = null)
    __obj.asInstanceOf[PathFrame]
  }
  
  extension [Self <: PathFrame](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
  }
}
