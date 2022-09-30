package typings.reactDevtoolsInline.commonsMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectedElement extends StObject {
  
  var canEditFunctionProps: Boolean
  
  var canEditFunctionPropsDeletePaths: Boolean
  
  var canEditFunctionPropsRenamePaths: Boolean
  
  var canEditHooks: Boolean
  
  var canEditHooksAndDeletePaths: Boolean
  
  var canEditHooksAndRenamePaths: Boolean
  
  var canToggleError: Boolean
  
  var canToggleSuspense: Boolean
  
  var canViewSource: Boolean
  
  var context: (Record[String, Any]) | Null
  
  var errors: js.Array[js.Tuple2[String, Double]]
  
  var hasLegacyContext: Boolean
  
  var hooks: (Record[String, Any]) | Null
  
  var id: Double
  
  var isErrored: Boolean
  
  var key: Double | String | Null
  
  var owners: js.Array[SerializedElement] | Null
  
  var plugins: Plugins
  
  var props: (Record[String, Any]) | Null
  
  var rendererPackageName: String | Null
  
  var rendererVersion: String | Null
  
  var rootType: String | Null
  
  var source: Source | Null
  
  var state: (Record[String, Any]) | Null
  
  var targetErrorBoundaryID: js.UndefOr[Double | Null] = js.undefined
  
  var `type`: ElementType
  
  var warnings: js.Array[js.Tuple2[String, Double]]
}
object InspectedElement {
  
  inline def apply(
    canEditFunctionProps: Boolean,
    canEditFunctionPropsDeletePaths: Boolean,
    canEditFunctionPropsRenamePaths: Boolean,
    canEditHooks: Boolean,
    canEditHooksAndDeletePaths: Boolean,
    canEditHooksAndRenamePaths: Boolean,
    canToggleError: Boolean,
    canToggleSuspense: Boolean,
    canViewSource: Boolean,
    errors: js.Array[js.Tuple2[String, Double]],
    hasLegacyContext: Boolean,
    id: Double,
    isErrored: Boolean,
    plugins: Plugins,
    `type`: ElementType,
    warnings: js.Array[js.Tuple2[String, Double]]
  ): InspectedElement = {
    val __obj = js.Dynamic.literal(canEditFunctionProps = canEditFunctionProps.asInstanceOf[js.Any], canEditFunctionPropsDeletePaths = canEditFunctionPropsDeletePaths.asInstanceOf[js.Any], canEditFunctionPropsRenamePaths = canEditFunctionPropsRenamePaths.asInstanceOf[js.Any], canEditHooks = canEditHooks.asInstanceOf[js.Any], canEditHooksAndDeletePaths = canEditHooksAndDeletePaths.asInstanceOf[js.Any], canEditHooksAndRenamePaths = canEditHooksAndRenamePaths.asInstanceOf[js.Any], canToggleError = canToggleError.asInstanceOf[js.Any], canToggleSuspense = canToggleSuspense.asInstanceOf[js.Any], canViewSource = canViewSource.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], hasLegacyContext = hasLegacyContext.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isErrored = isErrored.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any], context = null, hooks = null, key = null, owners = null, props = null, rendererPackageName = null, rendererVersion = null, rootType = null, source = null, state = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectedElement]
  }
  
  extension [Self <: InspectedElement](x: Self) {
    
    inline def setCanEditFunctionProps(value: Boolean): Self = StObject.set(x, "canEditFunctionProps", value.asInstanceOf[js.Any])
    
    inline def setCanEditFunctionPropsDeletePaths(value: Boolean): Self = StObject.set(x, "canEditFunctionPropsDeletePaths", value.asInstanceOf[js.Any])
    
    inline def setCanEditFunctionPropsRenamePaths(value: Boolean): Self = StObject.set(x, "canEditFunctionPropsRenamePaths", value.asInstanceOf[js.Any])
    
    inline def setCanEditHooks(value: Boolean): Self = StObject.set(x, "canEditHooks", value.asInstanceOf[js.Any])
    
    inline def setCanEditHooksAndDeletePaths(value: Boolean): Self = StObject.set(x, "canEditHooksAndDeletePaths", value.asInstanceOf[js.Any])
    
    inline def setCanEditHooksAndRenamePaths(value: Boolean): Self = StObject.set(x, "canEditHooksAndRenamePaths", value.asInstanceOf[js.Any])
    
    inline def setCanToggleError(value: Boolean): Self = StObject.set(x, "canToggleError", value.asInstanceOf[js.Any])
    
    inline def setCanToggleSuspense(value: Boolean): Self = StObject.set(x, "canToggleSuspense", value.asInstanceOf[js.Any])
    
    inline def setCanViewSource(value: Boolean): Self = StObject.set(x, "canViewSource", value.asInstanceOf[js.Any])
    
    inline def setContext(value: Record[String, Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextNull: Self = StObject.set(x, "context", null)
    
    inline def setErrors(value: js.Array[js.Tuple2[String, Double]]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: (js.Tuple2[String, Double])*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setHasLegacyContext(value: Boolean): Self = StObject.set(x, "hasLegacyContext", value.asInstanceOf[js.Any])
    
    inline def setHooks(value: Record[String, Any]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksNull: Self = StObject.set(x, "hooks", null)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsErrored(value: Boolean): Self = StObject.set(x, "isErrored", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Double | String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setOwners(value: js.Array[SerializedElement]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
    
    inline def setOwnersNull: Self = StObject.set(x, "owners", null)
    
    inline def setOwnersVarargs(value: SerializedElement*): Self = StObject.set(x, "owners", js.Array(value*))
    
    inline def setPlugins(value: Plugins): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setProps(value: Record[String, Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsNull: Self = StObject.set(x, "props", null)
    
    inline def setRendererPackageName(value: String): Self = StObject.set(x, "rendererPackageName", value.asInstanceOf[js.Any])
    
    inline def setRendererPackageNameNull: Self = StObject.set(x, "rendererPackageName", null)
    
    inline def setRendererVersion(value: String): Self = StObject.set(x, "rendererVersion", value.asInstanceOf[js.Any])
    
    inline def setRendererVersionNull: Self = StObject.set(x, "rendererVersion", null)
    
    inline def setRootType(value: String): Self = StObject.set(x, "rootType", value.asInstanceOf[js.Any])
    
    inline def setRootTypeNull: Self = StObject.set(x, "rootType", null)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setState(value: Record[String, Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setTargetErrorBoundaryID(value: Double): Self = StObject.set(x, "targetErrorBoundaryID", value.asInstanceOf[js.Any])
    
    inline def setTargetErrorBoundaryIDNull: Self = StObject.set(x, "targetErrorBoundaryID", null)
    
    inline def setTargetErrorBoundaryIDUndefined: Self = StObject.set(x, "targetErrorBoundaryID", js.undefined)
    
    inline def setType(value: ElementType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: js.Array[js.Tuple2[String, Double]]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: (js.Tuple2[String, Double])*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
