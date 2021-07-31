package typings.rollup.mod

import typings.rollup.rollupStrings.`no-treeshake`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleInfo extends StObject {
  
  var ast: AcornNode | Null
  
  var code: String | Null
  
  var dynamicImporters: js.Array[String]
  
  var dynamicallyImportedIds: js.Array[String]
  
  var hasModuleSideEffects: Boolean | `no-treeshake`
  
  var id: String
  
  var implicitlyLoadedAfterOneOf: js.Array[String]
  
  var implicitlyLoadedBefore: js.Array[String]
  
  var importedIds: js.Array[String]
  
  var importers: js.Array[String]
  
  var isEntry: Boolean
  
  var isExternal: Boolean
  
  var meta: CustomPluginOptions
  
  var syntheticNamedExports: Boolean | String
}
object ModuleInfo {
  
  @scala.inline
  def apply(
    dynamicImporters: js.Array[String],
    dynamicallyImportedIds: js.Array[String],
    hasModuleSideEffects: Boolean | `no-treeshake`,
    id: String,
    implicitlyLoadedAfterOneOf: js.Array[String],
    implicitlyLoadedBefore: js.Array[String],
    importedIds: js.Array[String],
    importers: js.Array[String],
    isEntry: Boolean,
    isExternal: Boolean,
    meta: CustomPluginOptions,
    syntheticNamedExports: Boolean | String
  ): ModuleInfo = {
    val __obj = js.Dynamic.literal(dynamicImporters = dynamicImporters.asInstanceOf[js.Any], dynamicallyImportedIds = dynamicallyImportedIds.asInstanceOf[js.Any], hasModuleSideEffects = hasModuleSideEffects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], implicitlyLoadedAfterOneOf = implicitlyLoadedAfterOneOf.asInstanceOf[js.Any], implicitlyLoadedBefore = implicitlyLoadedBefore.asInstanceOf[js.Any], importedIds = importedIds.asInstanceOf[js.Any], importers = importers.asInstanceOf[js.Any], isEntry = isEntry.asInstanceOf[js.Any], isExternal = isExternal.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], syntheticNamedExports = syntheticNamedExports.asInstanceOf[js.Any], ast = null, code = null)
    __obj.asInstanceOf[ModuleInfo]
  }
  
  @scala.inline
  implicit class ModuleInfoMutableBuilder[Self <: ModuleInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAst(value: AcornNode): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAstNull: Self = StObject.set(x, "ast", null)
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeNull: Self = StObject.set(x, "code", null)
    
    @scala.inline
    def setDynamicImporters(value: js.Array[String]): Self = StObject.set(x, "dynamicImporters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicImportersVarargs(value: String*): Self = StObject.set(x, "dynamicImporters", js.Array(value :_*))
    
    @scala.inline
    def setDynamicallyImportedIds(value: js.Array[String]): Self = StObject.set(x, "dynamicallyImportedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicallyImportedIdsVarargs(value: String*): Self = StObject.set(x, "dynamicallyImportedIds", js.Array(value :_*))
    
    @scala.inline
    def setHasModuleSideEffects(value: Boolean | `no-treeshake`): Self = StObject.set(x, "hasModuleSideEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplicitlyLoadedAfterOneOf(value: js.Array[String]): Self = StObject.set(x, "implicitlyLoadedAfterOneOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplicitlyLoadedAfterOneOfVarargs(value: String*): Self = StObject.set(x, "implicitlyLoadedAfterOneOf", js.Array(value :_*))
    
    @scala.inline
    def setImplicitlyLoadedBefore(value: js.Array[String]): Self = StObject.set(x, "implicitlyLoadedBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplicitlyLoadedBeforeVarargs(value: String*): Self = StObject.set(x, "implicitlyLoadedBefore", js.Array(value :_*))
    
    @scala.inline
    def setImportedIds(value: js.Array[String]): Self = StObject.set(x, "importedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportedIdsVarargs(value: String*): Self = StObject.set(x, "importedIds", js.Array(value :_*))
    
    @scala.inline
    def setImporters(value: js.Array[String]): Self = StObject.set(x, "importers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportersVarargs(value: String*): Self = StObject.set(x, "importers", js.Array(value :_*))
    
    @scala.inline
    def setIsEntry(value: Boolean): Self = StObject.set(x, "isEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExternal(value: Boolean): Self = StObject.set(x, "isExternal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: CustomPluginOptions): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntheticNamedExports(value: Boolean | String): Self = StObject.set(x, "syntheticNamedExports", value.asInstanceOf[js.Any])
  }
}
