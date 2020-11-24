package typings.rollupPluginTypescript2

import typings.rollupPluginTypescript2.ioptionsMod.TransformerFactoryCreator
import typings.typescript.mod.IScriptSnapshot
import typings.typescript.mod.LanguageService
import typings.typescript.mod.ParsedCommandLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rollup-plugin-typescript2/dist/host", JSImport.Namespace)
@js.native
object hostMod extends js.Object {
  
  @js.native
  class LanguageServiceHost protected ()
    extends typings.typescript.mod.LanguageServiceHost {
    def this(parsedConfig: ParsedCommandLine, transformers: js.Array[TransformerFactoryCreator], cwd: String) = this()
    
    var cwd: js.Any = js.native
    
    var fileNames: js.Any = js.native
    
    var parsedConfig: js.Any = js.native
    
    def reset(): Unit = js.native
    
    var service: js.Any = js.native
    
    def setLanguageService(service: LanguageService): Unit = js.native
    
    def setSnapshot(fileName: String, data: String): IScriptSnapshot = js.native
    
    var snapshots: js.Any = js.native
    
    var transformers: js.Any = js.native
    
    var versions: js.Any = js.native
  }
}
