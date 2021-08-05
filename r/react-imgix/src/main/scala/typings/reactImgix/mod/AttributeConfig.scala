package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeConfig extends StObject {
  
  var sizes: js.UndefOr[String] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var srcSet: js.UndefOr[String] = js.undefined
}
object AttributeConfig {
  
  inline def apply(): AttributeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeConfig]
  }
  
  extension [Self <: AttributeConfig](x: Self) {
    
    inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
    
    inline def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
