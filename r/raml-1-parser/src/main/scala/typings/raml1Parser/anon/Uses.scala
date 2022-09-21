package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uses extends StObject {
  
  var annotations: NameString
  
  var uses: NameString
}
object Uses {
  
  inline def apply(annotations: NameString, uses: NameString): Uses = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], uses = uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uses]
  }
  
  extension [Self <: Uses](x: Self) {
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setUses(value: NameString): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
  }
}
