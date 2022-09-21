package typings.stencilCore.stencilPrivateMod

import typings.std.Document
import typings.std.Map
import typings.stencilCore.anon.Diagnostics
import typings.stencilCore.stencilPublicCompilerMod.CompilerBuildResults
import typings.stencilCore.stencilPublicCompilerMod.Config
import typings.stencilCore.stencilPublicCompilerMod.CopyResults
import typings.stencilCore.stencilPublicCompilerMod.Diagnostic
import typings.stencilCore.stencilPublicCompilerMod.LoggerTimeSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildCtx extends StObject {
  
  var buildId: Double = js.native
  
  var buildMessages: js.Array[String] = js.native
  
  var buildResults: CompilerBuildResults = js.native
  
  var buildStats: js.UndefOr[CompilerBuildStats | Diagnostics] = js.native
  
  var bundleBuildCount: Double = js.native
  
  var collections: js.Array[Collection] = js.native
  
  var commonJsComponentBundle: js.Array[BundleModule] = js.native
  
  var compilerCtx: CompilerCtx = js.native
  
  var componentGraph: Map[String, js.Array[String]] = js.native
  
  var components: js.Array[ComponentCompilerMeta] = js.native
  
  var config: Config = js.native
  
  def createTimeSpan(msg: String): LoggerTimeSpan = js.native
  def createTimeSpan(msg: String, debug: Boolean): LoggerTimeSpan = js.native
  
  var data: Any = js.native
  
  def debug(msg: String): Unit = js.native
  
  var diagnostics: js.Array[Diagnostic] = js.native
  
  var dirsAdded: js.Array[String] = js.native
  
  var dirsDeleted: js.Array[String] = js.native
  
  var entryModules: js.Array[EntryModule] = js.native
  
  var es5ComponentBundle: js.Array[BundleModule] = js.native
  
  var esmBrowserComponentBundle: js.Array[BundleModule] = js.native
  
  var esmComponentBundle: js.Array[BundleModule] = js.native
  
  var filesAdded: js.Array[String] = js.native
  
  var filesChanged: js.Array[String] = js.native
  
  var filesDeleted: js.Array[String] = js.native
  
  var filesUpdated: js.Array[String] = js.native
  
  var filesWritten: js.Array[String] = js.native
  
  var globalStyle: js.UndefOr[String] = js.native
  
  var hasConfigChanges: Boolean = js.native
  
  var hasError: Boolean = js.native
  
  var hasFinished: Boolean = js.native
  
  var hasHtmlChanges: Boolean = js.native
  
  var hasPrintedResults: Boolean = js.native
  
  var hasScriptChanges: Boolean = js.native
  
  var hasServiceWorkerChanges: Boolean = js.native
  
  var hasStyleChanges: Boolean = js.native
  
  var hasWarning: Boolean = js.native
  
  var hydrateAppFilePath: String = js.native
  
  var indexBuildCount: Double = js.native
  
  var indexDoc: Document = js.native
  
  var isRebuild: Boolean = js.native
  
  var moduleFiles: js.Array[Module] = js.native
  
  var packageJson: PackageJsonData = js.native
  
  var pendingCopyTasks: js.Array[js.Promise[CopyResults]] = js.native
  
  def progress(task: BuildTask): Unit = js.native
  
  var requiresFullBuild: Boolean = js.native
  
  var rollupResults: js.UndefOr[RollupResults] = js.native
  
  var scriptsAdded: js.Array[String] = js.native
  
  var scriptsDeleted: js.Array[String] = js.native
  
  var startTime: Double = js.native
  
  var styleBuildCount: Double = js.native
  
  var stylesPromise: js.Promise[Unit] = js.native
  
  var stylesUpdated: js.Array[BuildStyleUpdate] = js.native
  
  var systemComponentBundle: js.Array[BundleModule] = js.native
  
  var timeSpan: LoggerTimeSpan = js.native
  
  var timestamp: String = js.native
  
  var transpileBuildCount: Double = js.native
  
  var validateTypesBuild: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
  
  var validateTypesHandler: js.UndefOr[js.Function1[/* results */ Any, js.Promise[Unit]]] = js.native
  
  var validateTypesPromise: js.UndefOr[js.Promise[Any]] = js.native
}
