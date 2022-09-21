package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetsMeta extends StObject {
  
  var absolutePath: String
  
  var cmpRelativePath: String
  
  var originalComponentPath: String
}
object AssetsMeta {
  
  inline def apply(absolutePath: String, cmpRelativePath: String, originalComponentPath: String): AssetsMeta = {
    val __obj = js.Dynamic.literal(absolutePath = absolutePath.asInstanceOf[js.Any], cmpRelativePath = cmpRelativePath.asInstanceOf[js.Any], originalComponentPath = originalComponentPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetsMeta]
  }
  
  extension [Self <: AssetsMeta](x: Self) {
    
    inline def setAbsolutePath(value: String): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
    
    inline def setCmpRelativePath(value: String): Self = StObject.set(x, "cmpRelativePath", value.asInstanceOf[js.Any])
    
    inline def setOriginalComponentPath(value: String): Self = StObject.set(x, "originalComponentPath", value.asInstanceOf[js.Any])
  }
}
