package typings.rollupDashPluginDashTypescript2.distTscacheMod

import typings.rollupDashPluginDashTypescript2.distContextMod.IContext
import typings.rollupDashPluginDashTypescript2.rollupDashPluginDashTypescript2Numbers.`false`
import typings.typescript.typescriptMod.CompilerOptions
import typings.typescript.typescriptMod.Diagnostic
import typings.typescript.typescriptMod.IScriptSnapshot
import typings.typescript.typescriptMod.LanguageServiceHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rollup-plugin-typescript2/dist/tscache", "TsCache")
@js.native
class TsCache protected () extends js.Object {
  def this(
    noCache: Boolean,
    hashIgnoreUnknown: Boolean,
    host: LanguageServiceHost,
    cacheRoot: String,
    options: CompilerOptions,
    rollupConfig: js.Any,
    rootFilenames: js.Array[String],
    context: IContext
  ) = this()
  var ambientTypes: js.Any = js.native
  var ambientTypesDirty: js.Any = js.native
  var cacheDir: js.Any = js.native
  var cachePrefix: js.Any = js.native
  var cacheRoot: js.Any = js.native
  var cacheVersion: js.Any = js.native
  var checkAmbientTypes: js.Any = js.native
  var codeCache: js.Any = js.native
  var context: js.Any = js.native
  var dependencyTree: js.Any = js.native
  var getDiagnostics: js.Any = js.native
  var hashOptions: js.Any = js.native
  var host: js.Any = js.native
  var init: js.Any = js.native
  var isDirty: js.Any = js.native
  var makeName: js.Any = js.native
  var markAsDirty: js.Any = js.native
  var noCache: js.Any = js.native
  var options: js.Any = js.native
  var rollupConfig: js.Any = js.native
  var semanticDiagnosticsCache: js.Any = js.native
  var syntacticDiagnosticsCache: js.Any = js.native
  var typesCache: js.Any = js.native
  def clean(): Unit = js.native
  def done(): Unit = js.native
  def getCompiled(id: String, snapshot: IScriptSnapshot, transform: js.Function0[js.UndefOr[ICode]]): js.UndefOr[ICode] = js.native
  def getSemanticDiagnostics(id: String, snapshot: IScriptSnapshot, check: js.Function0[js.Array[Diagnostic]]): js.Array[IDiagnostics] = js.native
  def getSyntacticDiagnostics(id: String, snapshot: IScriptSnapshot, check: js.Function0[js.Array[Diagnostic]]): js.Array[IDiagnostics] = js.native
  def setDependency(importee: String, importer: String): Unit = js.native
  @JSName("walkTree")
  def walkTree_false(cb: js.Function1[/* id */ String, Unit | `false`]): Unit = js.native
}

