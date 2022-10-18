package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribute extends StObject {
  
  var attribute: String
}
object Attribute {
  
  inline def apply(attribute: String): Attribute = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
  
  extension [Self <: Attribute](x: Self) {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
  }
}
