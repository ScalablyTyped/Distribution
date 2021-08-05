package typings.seatsio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Own extends StObject {
  
  var own: String
  
  var parent: js.UndefOr[String] = js.undefined
  
  var section: js.UndefOr[String] = js.undefined
}
object Own {
  
  inline def apply(own: String): Own = {
    val __obj = js.Dynamic.literal(own = own.asInstanceOf[js.Any])
    __obj.asInstanceOf[Own]
  }
  
  extension [Self <: Own](x: Self) {
    
    inline def setOwn(value: String): Self = StObject.set(x, "own", value.asInstanceOf[js.Any])
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
  }
}
