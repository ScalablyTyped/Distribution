package typings.rollupPluginNatives

import typings.rollup.mod.Plugin
import typings.rollupPluginNatives.anon.CopyTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: RollupPluginNativesOptions): Plugin = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("rollup-plugin-natives", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait RollupPluginNativesOptions extends StObject {
    
    var copyTo: js.UndefOr[String] = js.undefined
    
    var destDir: js.UndefOr[String] = js.undefined
    
    var dlopen: js.UndefOr[Boolean] = js.undefined
    
    var map: js.UndefOr[js.Function1[/* modulePath */ String, String | CopyTo]] = js.undefined
    
    var sourcemap: js.UndefOr[Boolean] = js.undefined
    
    var targetEsm: js.UndefOr[Boolean] = js.undefined
  }
  object RollupPluginNativesOptions {
    
    inline def apply(): RollupPluginNativesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RollupPluginNativesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RollupPluginNativesOptions] (val x: Self) extends AnyVal {
      
      inline def setCopyTo(value: String): Self = StObject.set(x, "copyTo", value.asInstanceOf[js.Any])
      
      inline def setCopyToUndefined: Self = StObject.set(x, "copyTo", js.undefined)
      
      inline def setDestDir(value: String): Self = StObject.set(x, "destDir", value.asInstanceOf[js.Any])
      
      inline def setDestDirUndefined: Self = StObject.set(x, "destDir", js.undefined)
      
      inline def setDlopen(value: Boolean): Self = StObject.set(x, "dlopen", value.asInstanceOf[js.Any])
      
      inline def setDlopenUndefined: Self = StObject.set(x, "dlopen", js.undefined)
      
      inline def setMap(value: /* modulePath */ String => String | CopyTo): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setSourcemap(value: Boolean): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
      
      inline def setSourcemapUndefined: Self = StObject.set(x, "sourcemap", js.undefined)
      
      inline def setTargetEsm(value: Boolean): Self = StObject.set(x, "targetEsm", value.asInstanceOf[js.Any])
      
      inline def setTargetEsmUndefined: Self = StObject.set(x, "targetEsm", js.undefined)
    }
  }
}
