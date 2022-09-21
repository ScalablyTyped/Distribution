package typings.stencilCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bundles extends StObject {
  
  var bundles: Double
  
  var components: Double
  
  var entries: Double
  
  var fsNamespace: String
  
  var namespace: String
  
  var outputs: Any
}
object Bundles {
  
  inline def apply(
    bundles: Double,
    components: Double,
    entries: Double,
    fsNamespace: String,
    namespace: String,
    outputs: Any
  ): Bundles = {
    val __obj = js.Dynamic.literal(bundles = bundles.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], fsNamespace = fsNamespace.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundles]
  }
  
  extension [Self <: Bundles](x: Self) {
    
    inline def setBundles(value: Double): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    
    inline def setComponents(value: Double): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setEntries(value: Double): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setFsNamespace(value: String): Self = StObject.set(x, "fsNamespace", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: Any): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
  }
}
