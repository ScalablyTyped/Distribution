package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.inMemoryFsMod.InMemoryFileSystem
import typings.stencilCore.stencilPublicCompilerMod.CompilerSystem
import typings.stencilCore.stencilPublicCompilerMod.Config
import typings.stencilCore.stencilPublicCompilerMod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginCtx extends StObject {
  
  var cache: Cache
  
  var config: Config
  
  var diagnostics: js.Array[Diagnostic]
  
  var fs: InMemoryFileSystem
  
  var sys: CompilerSystem
}
object PluginCtx {
  
  inline def apply(
    cache: Cache,
    config: Config,
    diagnostics: js.Array[Diagnostic],
    fs: InMemoryFileSystem,
    sys: CompilerSystem
  ): PluginCtx = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginCtx]
  }
  
  extension [Self <: PluginCtx](x: Self) {
    
    inline def setCache(value: Cache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setFs(value: InMemoryFileSystem): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    inline def setSys(value: CompilerSystem): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
  }
}
