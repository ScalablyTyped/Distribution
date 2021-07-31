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
  class LanguageServiceHost protected ()
    extends StObject
       with typings.typescript.mod.LanguageServiceHost {
    def this(parsedConfig: ParsedCommandLine, transformers: js.Array[TransformerFactoryCreator], cwd: String) = this()
    
    var cwd: js.Any = js.native
    
    var fileNames: js.Any = js.native
    
    /* CompleteClass */
    override def getCompilationSettings(): CompilerOptions = js.native
    
    /* CompleteClass */
    @JSName("getCurrentDirectory")
    override def getCurrentDirectory_MLanguageServiceHost(): String = js.native
    
    /* CompleteClass */
    override def getDefaultLibFileName(options: CompilerOptions): String = js.native
    
    /* CompleteClass */
    override def getScriptFileNames(): js.Array[String] = js.native
    
    /* CompleteClass */
    override def getScriptSnapshot(fileName: String): js.UndefOr[IScriptSnapshot] = js.native
    
    /* CompleteClass */
    override def getScriptVersion(fileName: String): String = js.native
    
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
