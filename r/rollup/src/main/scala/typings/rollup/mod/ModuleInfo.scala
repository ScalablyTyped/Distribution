package typings.rollup.mod

import typings.rollup.rollupStrings.`no-treeshake`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleInfo
  extends StObject
     with ModuleOptions {
  
  var ast: AcornNode | Null
  
  var code: String | Null
  
  var dynamicImporters: js.Array[String]
  
  var dynamicallyImportedIdResolutions: js.Array[ResolvedId]
  
  var dynamicallyImportedIds: js.Array[String]
  
  var hasDefaultExport: Boolean | Null
  
  /** @deprecated Use `moduleSideEffects` instead */
  var hasModuleSideEffects: Boolean | `no-treeshake`
  
  var id: String
  
  var implicitlyLoadedAfterOneOf: js.Array[String]
  
  var implicitlyLoadedBefore: js.Array[String]
  
  var importedIdResolutions: js.Array[ResolvedId]
  
  var importedIds: js.Array[String]
  
  var importers: js.Array[String]
  
  var isEntry: Boolean
  
  var isExternal: Boolean
  
  var isIncluded: Boolean | Null
}
object ModuleInfo {
  
  inline def apply(
    assertions: Record[String, String],
    dynamicImporters: js.Array[String],
    dynamicallyImportedIdResolutions: js.Array[ResolvedId],
    dynamicallyImportedIds: js.Array[String],
    hasModuleSideEffects: Boolean | `no-treeshake`,
    id: String,
    implicitlyLoadedAfterOneOf: js.Array[String],
    implicitlyLoadedBefore: js.Array[String],
    importedIdResolutions: js.Array[ResolvedId],
    importedIds: js.Array[String],
    importers: js.Array[String],
    isEntry: Boolean,
    isExternal: Boolean,
    meta: CustomPluginOptions,
    moduleSideEffects: Boolean | `no-treeshake`,
    syntheticNamedExports: Boolean | String
  ): ModuleInfo = {
    val __obj = js.Dynamic.literal(assertions = assertions.asInstanceOf[js.Any], dynamicImporters = dynamicImporters.asInstanceOf[js.Any], dynamicallyImportedIdResolutions = dynamicallyImportedIdResolutions.asInstanceOf[js.Any], dynamicallyImportedIds = dynamicallyImportedIds.asInstanceOf[js.Any], hasModuleSideEffects = hasModuleSideEffects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], implicitlyLoadedAfterOneOf = implicitlyLoadedAfterOneOf.asInstanceOf[js.Any], implicitlyLoadedBefore = implicitlyLoadedBefore.asInstanceOf[js.Any], importedIdResolutions = importedIdResolutions.asInstanceOf[js.Any], importedIds = importedIds.asInstanceOf[js.Any], importers = importers.asInstanceOf[js.Any], isEntry = isEntry.asInstanceOf[js.Any], isExternal = isExternal.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], moduleSideEffects = moduleSideEffects.asInstanceOf[js.Any], syntheticNamedExports = syntheticNamedExports.asInstanceOf[js.Any], ast = null, code = null, hasDefaultExport = null, isIncluded = null)
    __obj.asInstanceOf[ModuleInfo]
  }
  
  extension [Self <: ModuleInfo](x: Self) {
    
    inline def setAst(value: AcornNode): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    inline def setAstNull: Self = StObject.set(x, "ast", null)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setDynamicImporters(value: js.Array[String]): Self = StObject.set(x, "dynamicImporters", value.asInstanceOf[js.Any])
    
    inline def setDynamicImportersVarargs(value: String*): Self = StObject.set(x, "dynamicImporters", js.Array(value*))
    
    inline def setDynamicallyImportedIdResolutions(value: js.Array[ResolvedId]): Self = StObject.set(x, "dynamicallyImportedIdResolutions", value.asInstanceOf[js.Any])
    
    inline def setDynamicallyImportedIdResolutionsVarargs(value: ResolvedId*): Self = StObject.set(x, "dynamicallyImportedIdResolutions", js.Array(value*))
    
    inline def setDynamicallyImportedIds(value: js.Array[String]): Self = StObject.set(x, "dynamicallyImportedIds", value.asInstanceOf[js.Any])
    
    inline def setDynamicallyImportedIdsVarargs(value: String*): Self = StObject.set(x, "dynamicallyImportedIds", js.Array(value*))
    
    inline def setHasDefaultExport(value: Boolean): Self = StObject.set(x, "hasDefaultExport", value.asInstanceOf[js.Any])
    
    inline def setHasDefaultExportNull: Self = StObject.set(x, "hasDefaultExport", null)
    
    inline def setHasModuleSideEffects(value: Boolean | `no-treeshake`): Self = StObject.set(x, "hasModuleSideEffects", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImplicitlyLoadedAfterOneOf(value: js.Array[String]): Self = StObject.set(x, "implicitlyLoadedAfterOneOf", value.asInstanceOf[js.Any])
    
    inline def setImplicitlyLoadedAfterOneOfVarargs(value: String*): Self = StObject.set(x, "implicitlyLoadedAfterOneOf", js.Array(value*))
    
    inline def setImplicitlyLoadedBefore(value: js.Array[String]): Self = StObject.set(x, "implicitlyLoadedBefore", value.asInstanceOf[js.Any])
    
    inline def setImplicitlyLoadedBeforeVarargs(value: String*): Self = StObject.set(x, "implicitlyLoadedBefore", js.Array(value*))
    
    inline def setImportedIdResolutions(value: js.Array[ResolvedId]): Self = StObject.set(x, "importedIdResolutions", value.asInstanceOf[js.Any])
    
    inline def setImportedIdResolutionsVarargs(value: ResolvedId*): Self = StObject.set(x, "importedIdResolutions", js.Array(value*))
    
    inline def setImportedIds(value: js.Array[String]): Self = StObject.set(x, "importedIds", value.asInstanceOf[js.Any])
    
    inline def setImportedIdsVarargs(value: String*): Self = StObject.set(x, "importedIds", js.Array(value*))
    
    inline def setImporters(value: js.Array[String]): Self = StObject.set(x, "importers", value.asInstanceOf[js.Any])
    
    inline def setImportersVarargs(value: String*): Self = StObject.set(x, "importers", js.Array(value*))
    
    inline def setIsEntry(value: Boolean): Self = StObject.set(x, "isEntry", value.asInstanceOf[js.Any])
    
    inline def setIsExternal(value: Boolean): Self = StObject.set(x, "isExternal", value.asInstanceOf[js.Any])
    
    inline def setIsIncluded(value: Boolean): Self = StObject.set(x, "isIncluded", value.asInstanceOf[js.Any])
    
    inline def setIsIncludedNull: Self = StObject.set(x, "isIncluded", null)
  }
}
