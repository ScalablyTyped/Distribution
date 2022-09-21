package typings.rollupPluginTypescript2

import typings.rollupPluginTypescript2.ioptionsMod.TransformerFactoryCreator
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.IScriptSnapshot
import typings.typescript.mod.LanguageService
import typings.typescript.mod.ParsedCommandLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hostMod {
  
  @JSImport("rollup-plugin-typescript2/dist/host", "LanguageServiceHost")
  @js.native
  open class LanguageServiceHost protected ()
    extends StObject
       with typings.typescript.mod.LanguageServiceHost {
    def this(parsedConfig: ParsedCommandLine, transformers: js.Array[TransformerFactoryCreator], cwd: String) = this()
    
    /* private */ var cwd: Any = js.native
    
    /* private */ var fileNames: Any = js.native
    
    @JSName("getDefaultLibFileName")
    var getDefaultLibFileName_Original: js.Function1[/* options */ CompilerOptions, String] = js.native
    
    /* private */ var parsedConfig: Any = js.native
    
    def reset(): Unit = js.native
    
    /* private */ var service: Any = js.native
    
    def setLanguageService(service: LanguageService): Unit = js.native
    
    def setSnapshot(fileName: String, source: String): IScriptSnapshot = js.native
    
    /* private */ var snapshots: Any = js.native
    
    /* private */ var transformers: Any = js.native
    
    /* private */ var versions: Any = js.native
  }
}
