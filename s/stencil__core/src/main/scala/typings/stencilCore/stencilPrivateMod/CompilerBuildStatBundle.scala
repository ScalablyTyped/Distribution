package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerBuildStatBundle extends StObject {
  
  var bundleId: String
  
  var components: js.Array[String]
  
  var fileName: String
  
  var imports: js.Array[String]
  
  var key: String
  
  var originalByteSize: Double
}
object CompilerBuildStatBundle {
  
  inline def apply(
    bundleId: String,
    components: js.Array[String],
    fileName: String,
    imports: js.Array[String],
    key: String,
    originalByteSize: Double
  ): CompilerBuildStatBundle = {
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], originalByteSize = originalByteSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerBuildStatBundle]
  }
  
  extension [Self <: CompilerBuildStatBundle](x: Self) {
    
    inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setComponents(value: js.Array[String]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsVarargs(value: String*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setImports(value: js.Array[String]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsVarargs(value: String*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOriginalByteSize(value: Double): Self = StObject.set(x, "originalByteSize", value.asInstanceOf[js.Any])
  }
}
