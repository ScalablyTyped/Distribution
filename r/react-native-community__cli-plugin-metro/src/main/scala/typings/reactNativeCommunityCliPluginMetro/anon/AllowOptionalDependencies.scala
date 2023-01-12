package typings.reactNativeCommunityCliPluginMetro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowOptionalDependencies extends StObject {
  
  var allowOptionalDependencies: js.UndefOr[Boolean] = js.undefined
  
  var assetPlugins: js.UndefOr[js.Array[String]] = js.undefined
  
  var assetRegistryPath: String
  
  var asyncRequireModulePath: js.UndefOr[String] = js.undefined
  
  var babelTransformerPath: String
}
object AllowOptionalDependencies {
  
  inline def apply(assetRegistryPath: String, babelTransformerPath: String): AllowOptionalDependencies = {
    val __obj = js.Dynamic.literal(assetRegistryPath = assetRegistryPath.asInstanceOf[js.Any], babelTransformerPath = babelTransformerPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowOptionalDependencies]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowOptionalDependencies] (val x: Self) extends AnyVal {
    
    inline def setAllowOptionalDependencies(value: Boolean): Self = StObject.set(x, "allowOptionalDependencies", value.asInstanceOf[js.Any])
    
    inline def setAllowOptionalDependenciesUndefined: Self = StObject.set(x, "allowOptionalDependencies", js.undefined)
    
    inline def setAssetPlugins(value: js.Array[String]): Self = StObject.set(x, "assetPlugins", value.asInstanceOf[js.Any])
    
    inline def setAssetPluginsUndefined: Self = StObject.set(x, "assetPlugins", js.undefined)
    
    inline def setAssetPluginsVarargs(value: String*): Self = StObject.set(x, "assetPlugins", js.Array(value*))
    
    inline def setAssetRegistryPath(value: String): Self = StObject.set(x, "assetRegistryPath", value.asInstanceOf[js.Any])
    
    inline def setAsyncRequireModulePath(value: String): Self = StObject.set(x, "asyncRequireModulePath", value.asInstanceOf[js.Any])
    
    inline def setAsyncRequireModulePathUndefined: Self = StObject.set(x, "asyncRequireModulePath", js.undefined)
    
    inline def setBabelTransformerPath(value: String): Self = StObject.set(x, "babelTransformerPath", value.asInstanceOf[js.Any])
  }
}
