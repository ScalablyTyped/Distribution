package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StringDictionary
import typings.stencilCore.stencilCoreStrings.`inline`
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

trait TranspileOptions extends StObject {
  
  /**
    * Base directory to resolve non-relative module names. Same as the `baseUrl`
    * TypeScript compiler option: https://www.typescriptlang.org/docs/handbook/module-resolution.html#path-mapping
    */
  var baseUrl: js.UndefOr[String] = js.undefined
  
  /**
    * A component can be defined as a custom element by using `customelement`, or the
    * component class can be exported by using `module`. Default is `customelement`.
    */
  var componentExport: js.UndefOr[customelement | module | String] = js.undefined
  
  /**
    * Sets how and if component metadata should be assigned on the compiled
    * component output. The `compilerstatic` value will set the metadata to
    * a static `COMPILER_META` getter on the component class. This option
    * is useful for unit testing preprocessors. Default is `null`.
    */
  var componentMetadata: js.UndefOr[runtimestatic | compilerstatic | String] = js.undefined
  
  /**
    * The actual internal import path for any `@stencil/core` imports.
    * Default is `@stencil/core/internal/client`.
    */
  var coreImportPath: js.UndefOr[String] = js.undefined
  
  /**
    * The current working directory. Default is `/`.
    */
  var currentDirectory: js.UndefOr[String] = js.undefined
  
  /**
    * The filename of the code being compiled. Default is `module.tsx`.
    */
  var file: js.UndefOr[String] = js.undefined
  
  /**
    * Module format to use for the compiled code output, which can be either `esm` or `cjs`.
    * Default is `esm`.
    */
  var module: js.UndefOr[cjs | esm | String] = js.undefined
  
  /**
    * List of path mapping entries for module names to locations relative to the `baseUrl`.
    * Same as the `paths` TypeScript compiler option:
    * https://www.typescriptlang.org/docs/handbook/module-resolution.html#path-mapping
    */
  var paths: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  
  /**
    * Sets how and if any properties, methods and events are proxied on the
    * component class. The `defineproperty` value sets the getters and setters
    * using Object.defineProperty. Default is `defineproperty`.
    */
  var proxy: js.UndefOr[defineproperty | String] = js.undefined
  
  /**
    * Create a source map. Using `inline` will inline the source map into the
    * code, otherwise the source map will be in the returned `map` property.
    * Default is `true`.
    */
  var sourceMap: js.UndefOr[Boolean | `inline`] = js.undefined
  
  /**
    * How component styles should be associated to the component. The `static`
    * setting will assign the styles as a static getter on the component class.
    */
  var style: js.UndefOr[static | String] = js.undefined
  
  /**
    * How style data should be added for imports. For example, the `queryparams` value
    * adds the component's tagname and encapsulation info as querystring parameter
    * to the style's import, such as `style.css?tag=my-tag&encapsulation=shadow`. This
    * style data can be used by bundlers to further optimize each component's css.
    * Set to `null` to not include the querystring parameters. Default is `queryparams`.
    */
  var styleImportData: js.UndefOr[queryparams | String] = js.undefined
  
  /**
    * Passed in Stencil Compiler System, otherwise falls back to the internal in-memory only system.
    */
  var sys: js.UndefOr[CompilerSystem] = js.undefined
  
  /**
    * The JavaScript source target TypeScript should to transpile to. Values can be
    * `latest`, `esnext`, `es2017`, `es2015`, or `es5`. Defaults to `latest`.
    */
  var target: js.UndefOr[CompileTarget] = js.undefined
}
object TranspileOptions {
  
  inline def apply(): TranspileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranspileOptions]
  }
  
  extension [Self <: TranspileOptions](x: Self) {
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setComponentExport(value: customelement | module | String): Self = StObject.set(x, "componentExport", value.asInstanceOf[js.Any])
    
    inline def setComponentExportUndefined: Self = StObject.set(x, "componentExport", js.undefined)
    
    inline def setComponentMetadata(value: runtimestatic | compilerstatic | String): Self = StObject.set(x, "componentMetadata", value.asInstanceOf[js.Any])
    
    inline def setComponentMetadataUndefined: Self = StObject.set(x, "componentMetadata", js.undefined)
    
    inline def setCoreImportPath(value: String): Self = StObject.set(x, "coreImportPath", value.asInstanceOf[js.Any])
    
    inline def setCoreImportPathUndefined: Self = StObject.set(x, "coreImportPath", js.undefined)
    
    inline def setCurrentDirectory(value: String): Self = StObject.set(x, "currentDirectory", value.asInstanceOf[js.Any])
    
    inline def setCurrentDirectoryUndefined: Self = StObject.set(x, "currentDirectory", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setModule(value: cjs | esm | String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setPaths(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setProxy(value: defineproperty | String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setSourceMap(value: Boolean | `inline`): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    inline def setStyle(value: static | String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleImportData(value: queryparams | String): Self = StObject.set(x, "styleImportData", value.asInstanceOf[js.Any])
    
    inline def setStyleImportDataUndefined: Self = StObject.set(x, "styleImportData", js.undefined)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSys(value: CompilerSystem): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    
    inline def setSysUndefined: Self = StObject.set(x, "sys", js.undefined)
    
    inline def setTarget(value: CompileTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
