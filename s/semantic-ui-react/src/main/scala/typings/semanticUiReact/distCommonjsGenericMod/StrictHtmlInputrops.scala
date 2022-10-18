package typings.semanticUiReact.distCommonjsGenericMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrictHtmlInputrops extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object StrictHtmlInputrops {
  
  inline def apply(): StrictHtmlInputrops = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictHtmlInputrops]
  }
  
  extension [Self <: StrictHtmlInputrops](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
