package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreStrings.`lazy`
import typings.stencilCore.stencilCoreStrings.cjs
import typings.stencilCore.stencilCoreStrings.compilerstatic
import typings.stencilCore.stencilCoreStrings.customelement
import typings.stencilCore.stencilCoreStrings.defineproperty
import typings.stencilCore.stencilCoreStrings.esm
import typings.stencilCore.stencilCoreStrings.module
import typings.stencilCore.stencilCoreStrings.queryparams
import typings.stencilCore.stencilCoreStrings.runtimestatic
import typings.stencilCore.stencilCoreStrings.static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformOptions extends StObject {
  
  var componentExport: `lazy` | module | customelement | Null
  
  var componentMetadata: runtimestatic | compilerstatic | Null
  
  var coreImportPath: String
  
  var currentDirectory: String
  
  var file: js.UndefOr[String] = js.undefined
  
  var isolatedModules: js.UndefOr[Boolean] = js.undefined
  
  var module: js.UndefOr[cjs | esm] = js.undefined
  
  var proxy: defineproperty | Null
  
  var style: static | Null
  
  var styleImportData: queryparams | Null
  
  var target: js.UndefOr[String] = js.undefined
}
object TransformOptions {
  
  inline def apply(coreImportPath: String, currentDirectory: String): TransformOptions = {
    val __obj = js.Dynamic.literal(coreImportPath = coreImportPath.asInstanceOf[js.Any], currentDirectory = currentDirectory.asInstanceOf[js.Any], componentExport = null, componentMetadata = null, proxy = null, style = null, styleImportData = null)
    __obj.asInstanceOf[TransformOptions]
  }
  
  extension [Self <: TransformOptions](x: Self) {
    
    inline def setComponentExport(value: `lazy` | module | customelement): Self = StObject.set(x, "componentExport", value.asInstanceOf[js.Any])
    
    inline def setComponentExportNull: Self = StObject.set(x, "componentExport", null)
    
    inline def setComponentMetadata(value: runtimestatic | compilerstatic): Self = StObject.set(x, "componentMetadata", value.asInstanceOf[js.Any])
    
    inline def setComponentMetadataNull: Self = StObject.set(x, "componentMetadata", null)
    
    inline def setCoreImportPath(value: String): Self = StObject.set(x, "coreImportPath", value.asInstanceOf[js.Any])
    
    inline def setCurrentDirectory(value: String): Self = StObject.set(x, "currentDirectory", value.asInstanceOf[js.Any])
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setIsolatedModules(value: Boolean): Self = StObject.set(x, "isolatedModules", value.asInstanceOf[js.Any])
    
    inline def setIsolatedModulesUndefined: Self = StObject.set(x, "isolatedModules", js.undefined)
    
    inline def setModule(value: cjs | esm): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setProxy(value: defineproperty): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyNull: Self = StObject.set(x, "proxy", null)
    
    inline def setStyle(value: static): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleImportData(value: queryparams): Self = StObject.set(x, "styleImportData", value.asInstanceOf[js.Any])
    
    inline def setStyleImportDataNull: Self = StObject.set(x, "styleImportData", null)
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
