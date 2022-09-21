package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreStrings.`dist-lazy-loader`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputTargetDistLazyLoader
  extends StObject
     with OutputTargetBase
     with OutputTarget {
  
  var cjsDir: String
  
  var componentDts: String
  
  var dir: String
  
  var empty: Boolean
  
  var esmDir: String
  
  var esmEs5Dir: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_OutputTargetDistLazyLoader: `dist-lazy-loader`
}
object OutputTargetDistLazyLoader {
  
  inline def apply(cjsDir: String, componentDts: String, dir: String, empty: Boolean, esmDir: String): OutputTargetDistLazyLoader = {
    val __obj = js.Dynamic.literal(cjsDir = cjsDir.asInstanceOf[js.Any], componentDts = componentDts.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], esmDir = esmDir.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dist-lazy-loader")
    __obj.asInstanceOf[OutputTargetDistLazyLoader]
  }
  
  extension [Self <: OutputTargetDistLazyLoader](x: Self) {
    
    inline def setCjsDir(value: String): Self = StObject.set(x, "cjsDir", value.asInstanceOf[js.Any])
    
    inline def setComponentDts(value: String): Self = StObject.set(x, "componentDts", value.asInstanceOf[js.Any])
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEsmDir(value: String): Self = StObject.set(x, "esmDir", value.asInstanceOf[js.Any])
    
    inline def setEsmEs5Dir(value: String): Self = StObject.set(x, "esmEs5Dir", value.asInstanceOf[js.Any])
    
    inline def setEsmEs5DirUndefined: Self = StObject.set(x, "esmEs5Dir", js.undefined)
    
    inline def setType(value: `dist-lazy-loader`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
