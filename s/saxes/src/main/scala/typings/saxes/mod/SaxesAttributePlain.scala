package typings.saxes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaxesAttributePlain
  extends StObject
     with AttributeEventForOptions[js.Any]
     with SaxesAttribute {
  
  /**
    * The attribute's name.
    */
  var name: String
  
  /** The attribute's value. */
  var value: String
}
object SaxesAttributePlain {
  
  inline def apply(name: String, value: String): SaxesAttributePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaxesAttributePlain]
  }
  
  extension [Self <: SaxesAttributePlain](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
