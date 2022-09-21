package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionBundle extends StObject {
  
  var components: js.Array[String]
}
object CollectionBundle {
  
  inline def apply(components: js.Array[String]): CollectionBundle = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionBundle]
  }
  
  extension [Self <: CollectionBundle](x: Self) {
    
    inline def setComponents(value: js.Array[String]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsVarargs(value: String*): Self = StObject.set(x, "components", js.Array(value*))
  }
}
