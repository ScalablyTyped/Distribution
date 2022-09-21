package typings.stencilCore.anon

import typings.stencilCore.stencilCoreStrings.prod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildEs5 extends StObject {
  
  var buildEs5: Boolean | prod
  
  var hashFileNames: Boolean
  
  var hashedFileNameLength: Double
  
  var minifyCss: Boolean
  
  var minifyJs: Boolean
}
object BuildEs5 {
  
  inline def apply(
    buildEs5: Boolean | prod,
    hashFileNames: Boolean,
    hashedFileNameLength: Double,
    minifyCss: Boolean,
    minifyJs: Boolean
  ): BuildEs5 = {
    val __obj = js.Dynamic.literal(buildEs5 = buildEs5.asInstanceOf[js.Any], hashFileNames = hashFileNames.asInstanceOf[js.Any], hashedFileNameLength = hashedFileNameLength.asInstanceOf[js.Any], minifyCss = minifyCss.asInstanceOf[js.Any], minifyJs = minifyJs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildEs5]
  }
  
  extension [Self <: BuildEs5](x: Self) {
    
    inline def setBuildEs5(value: Boolean | prod): Self = StObject.set(x, "buildEs5", value.asInstanceOf[js.Any])
    
    inline def setHashFileNames(value: Boolean): Self = StObject.set(x, "hashFileNames", value.asInstanceOf[js.Any])
    
    inline def setHashedFileNameLength(value: Double): Self = StObject.set(x, "hashedFileNameLength", value.asInstanceOf[js.Any])
    
    inline def setMinifyCss(value: Boolean): Self = StObject.set(x, "minifyCss", value.asInstanceOf[js.Any])
    
    inline def setMinifyJs(value: Boolean): Self = StObject.set(x, "minifyJs", value.asInstanceOf[js.Any])
  }
}
