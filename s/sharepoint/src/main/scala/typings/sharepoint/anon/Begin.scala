package typings.sharepoint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Begin extends StObject {
  
  var begin: js.Any
  
  var end: js.Any
  
  var keys: js.Any
}
object Begin {
  
  inline def apply(begin: js.Any, end: js.Any, keys: js.Any): Begin = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Begin]
  }
  
  extension [Self <: Begin](x: Self) {
    
    inline def setBegin(value: js.Any): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: js.Any): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setKeys(value: js.Any): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
  }
}
