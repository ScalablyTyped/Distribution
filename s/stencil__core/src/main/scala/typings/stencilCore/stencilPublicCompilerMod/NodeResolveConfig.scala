package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.anon.Basedir
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeResolveConfig extends StObject {
  
  var browser: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @see https://github.com/browserify/resolve#resolveid-opts-cb
    */
  var customResolveOptions: js.UndefOr[Basedir] = js.undefined
  
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  
  var jail: js.UndefOr[String] = js.undefined
  
  var jsnext: js.UndefOr[Boolean] = js.undefined
  
  var main: js.UndefOr[Boolean] = js.undefined
  
  var module: js.UndefOr[Boolean] = js.undefined
  
  var modulesOnly: js.UndefOr[Boolean] = js.undefined
  
  var only: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  
  var preferBuiltins: js.UndefOr[Boolean] = js.undefined
}
object NodeResolveConfig {
  
  inline def apply(): NodeResolveConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeResolveConfig]
  }
  
  extension [Self <: NodeResolveConfig](x: Self) {
    
    inline def setBrowser(value: Boolean): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    inline def setCustomResolveOptions(value: Basedir): Self = StObject.set(x, "customResolveOptions", value.asInstanceOf[js.Any])
    
    inline def setCustomResolveOptionsUndefined: Self = StObject.set(x, "customResolveOptions", js.undefined)
    
    inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setJail(value: String): Self = StObject.set(x, "jail", value.asInstanceOf[js.Any])
    
    inline def setJailUndefined: Self = StObject.set(x, "jail", js.undefined)
    
    inline def setJsnext(value: Boolean): Self = StObject.set(x, "jsnext", value.asInstanceOf[js.Any])
    
    inline def setJsnextUndefined: Self = StObject.set(x, "jsnext", js.undefined)
    
    inline def setMain(value: Boolean): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    
    inline def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setModulesOnly(value: Boolean): Self = StObject.set(x, "modulesOnly", value.asInstanceOf[js.Any])
    
    inline def setModulesOnlyUndefined: Self = StObject.set(x, "modulesOnly", js.undefined)
    
    inline def setOnly(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
    
    inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
    
    inline def setOnlyVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "only", js.Array(value*))
    
    inline def setPreferBuiltins(value: Boolean): Self = StObject.set(x, "preferBuiltins", value.asInstanceOf[js.Any])
    
    inline def setPreferBuiltinsUndefined: Self = StObject.set(x, "preferBuiltins", js.undefined)
  }
}
