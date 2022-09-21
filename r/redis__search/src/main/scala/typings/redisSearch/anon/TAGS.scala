package typings.redisSearch.anon

import typings.redisSearch.commandsMod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TAGS extends StObject {
  
  var FIELDS: js.UndefOr[PropertyName | js.Array[PropertyName]] = js.undefined
  
  var TAGS: js.UndefOr[Close] = js.undefined
}
object TAGS {
  
  inline def apply(): TAGS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TAGS]
  }
  
  extension [Self <: TAGS](x: Self) {
    
    inline def setFIELDS(value: PropertyName | js.Array[PropertyName]): Self = StObject.set(x, "FIELDS", value.asInstanceOf[js.Any])
    
    inline def setFIELDSUndefined: Self = StObject.set(x, "FIELDS", js.undefined)
    
    inline def setFIELDSVarargs(value: PropertyName*): Self = StObject.set(x, "FIELDS", js.Array(value*))
    
    inline def setTAGS(value: Close): Self = StObject.set(x, "TAGS", value.asInstanceOf[js.Any])
    
    inline def setTAGSUndefined: Self = StObject.set(x, "TAGS", js.undefined)
  }
}
