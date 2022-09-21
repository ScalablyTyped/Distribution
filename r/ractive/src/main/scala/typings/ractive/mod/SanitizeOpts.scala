package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SanitizeOpts extends StObject {
  
  /** A list of element names to remove from the template. */
  var elements: js.Array[String]
  
  /** Whether or not to remove DOM event listener attributes, like onclick, from the template. */
  var eventAttributes: js.UndefOr[Boolean] = js.undefined
}
object SanitizeOpts {
  
  inline def apply(elements: js.Array[String]): SanitizeOpts = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[SanitizeOpts]
  }
  
  extension [Self <: SanitizeOpts](x: Self) {
    
    inline def setElements(value: js.Array[String]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: String*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setEventAttributes(value: Boolean): Self = StObject.set(x, "eventAttributes", value.asInstanceOf[js.Any])
    
    inline def setEventAttributesUndefined: Self = StObject.set(x, "eventAttributes", js.undefined)
  }
}
