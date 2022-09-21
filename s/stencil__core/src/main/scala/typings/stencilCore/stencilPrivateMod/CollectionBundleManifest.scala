package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionBundleManifest extends StObject {
  
  var components: js.Array[String]
}
object CollectionBundleManifest {
  
  inline def apply(components: js.Array[String]): CollectionBundleManifest = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionBundleManifest]
  }
  
  extension [Self <: CollectionBundleManifest](x: Self) {
    
    inline def setComponents(value: js.Array[String]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsVarargs(value: String*): Self = StObject.set(x, "components", js.Array(value*))
  }
}
