package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerAssetDir extends StObject {
  
  var absolutePath: js.UndefOr[String] = js.undefined
  
  var cmpRelativePath: js.UndefOr[String] = js.undefined
  
  var originalComponentPath: js.UndefOr[String] = js.undefined
}
object CompilerAssetDir {
  
  inline def apply(): CompilerAssetDir = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompilerAssetDir]
  }
  
  extension [Self <: CompilerAssetDir](x: Self) {
    
    inline def setAbsolutePath(value: String): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
    
    inline def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
    
    inline def setCmpRelativePath(value: String): Self = StObject.set(x, "cmpRelativePath", value.asInstanceOf[js.Any])
    
    inline def setCmpRelativePathUndefined: Self = StObject.set(x, "cmpRelativePath", js.undefined)
    
    inline def setOriginalComponentPath(value: String): Self = StObject.set(x, "originalComponentPath", value.asInstanceOf[js.Any])
    
    inline def setOriginalComponentPathUndefined: Self = StObject.set(x, "originalComponentPath", js.undefined)
  }
}
