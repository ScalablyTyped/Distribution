package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreStrings.`dist-lazy`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputTargetDistLazy
  extends StObject
     with OutputTargetBase
     with OutputTarget
     with OutputTargetBuild {
  
  var cjsDir: js.UndefOr[String] = js.undefined
  
  var cjsIndexFile: js.UndefOr[String] = js.undefined
  
  var dir: js.UndefOr[String] = js.undefined
  
  var empty: js.UndefOr[Boolean] = js.undefined
  
  var esmDir: js.UndefOr[String] = js.undefined
  
  var esmEs5Dir: js.UndefOr[String] = js.undefined
  
  var esmIndexFile: js.UndefOr[String] = js.undefined
  
  var isBrowserBuild: js.UndefOr[Boolean] = js.undefined
  
  var legacyLoaderFile: js.UndefOr[String] = js.undefined
  
  var polyfills: js.UndefOr[Boolean] = js.undefined
  
  var systemDir: js.UndefOr[String] = js.undefined
  
  var systemLoaderFile: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_OutputTargetDistLazy: `dist-lazy`
}
object OutputTargetDistLazy {
  
  inline def apply(): OutputTargetDistLazy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dist-lazy")
    __obj.asInstanceOf[OutputTargetDistLazy]
  }
  
  extension [Self <: OutputTargetDistLazy](x: Self) {
    
    inline def setCjsDir(value: String): Self = StObject.set(x, "cjsDir", value.asInstanceOf[js.Any])
    
    inline def setCjsDirUndefined: Self = StObject.set(x, "cjsDir", js.undefined)
    
    inline def setCjsIndexFile(value: String): Self = StObject.set(x, "cjsIndexFile", value.asInstanceOf[js.Any])
    
    inline def setCjsIndexFileUndefined: Self = StObject.set(x, "cjsIndexFile", js.undefined)
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    inline def setEsmDir(value: String): Self = StObject.set(x, "esmDir", value.asInstanceOf[js.Any])
    
    inline def setEsmDirUndefined: Self = StObject.set(x, "esmDir", js.undefined)
    
    inline def setEsmEs5Dir(value: String): Self = StObject.set(x, "esmEs5Dir", value.asInstanceOf[js.Any])
    
    inline def setEsmEs5DirUndefined: Self = StObject.set(x, "esmEs5Dir", js.undefined)
    
    inline def setEsmIndexFile(value: String): Self = StObject.set(x, "esmIndexFile", value.asInstanceOf[js.Any])
    
    inline def setEsmIndexFileUndefined: Self = StObject.set(x, "esmIndexFile", js.undefined)
    
    inline def setIsBrowserBuild(value: Boolean): Self = StObject.set(x, "isBrowserBuild", value.asInstanceOf[js.Any])
    
    inline def setIsBrowserBuildUndefined: Self = StObject.set(x, "isBrowserBuild", js.undefined)
    
    inline def setLegacyLoaderFile(value: String): Self = StObject.set(x, "legacyLoaderFile", value.asInstanceOf[js.Any])
    
    inline def setLegacyLoaderFileUndefined: Self = StObject.set(x, "legacyLoaderFile", js.undefined)
    
    inline def setPolyfills(value: Boolean): Self = StObject.set(x, "polyfills", value.asInstanceOf[js.Any])
    
    inline def setPolyfillsUndefined: Self = StObject.set(x, "polyfills", js.undefined)
    
    inline def setSystemDir(value: String): Self = StObject.set(x, "systemDir", value.asInstanceOf[js.Any])
    
    inline def setSystemDirUndefined: Self = StObject.set(x, "systemDir", js.undefined)
    
    inline def setSystemLoaderFile(value: String): Self = StObject.set(x, "systemLoaderFile", value.asInstanceOf[js.Any])
    
    inline def setSystemLoaderFileUndefined: Self = StObject.set(x, "systemLoaderFile", js.undefined)
    
    inline def setType(value: `dist-lazy`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
