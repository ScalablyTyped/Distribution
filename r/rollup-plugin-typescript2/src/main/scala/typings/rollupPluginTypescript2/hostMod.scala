package typings.rollupPluginTypescript2

import typings.rollupPluginTypescript2.ioptionsMod.TransformerFactoryCreator
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.IScriptSnapshot
import typings.typescript.mod.LanguageService
import typings.typescript.mod.ParsedCommandLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rollup-plugin-typescript2/dist/host", JSImport.Namespace)
@js.native
object hostMod extends js.Object {
  @js.native
  class LanguageServiceHost protected ()
    extends typings.typescript.mod.LanguageServiceHost {
    def this(parsedConfig: ParsedCommandLine, transformers: js.Array[TransformerFactoryCreator]) = this()
    var cwd: js.Any = js.native
    var fileNames: js.Any = js.native
    var parsedConfig: js.Any = js.native
    var service: js.UndefOr[js.Any] = js.native
    var snapshots: js.Any = js.native
    var transformers: js.Any = js.native
    var versions: js.Any = js.native
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
    def reset(): Unit = js.native
    def setLanguageService(service: LanguageService): Unit = js.native
    def setSnapshot(fileName: String, data: String): IScriptSnapshot = js.native
  }
  
}

