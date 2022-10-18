package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Host that has watch functionality used in --watch mode */
@js.native
trait WatchHost extends StObject {
  
  /** If provided, will be used to reset existing delayed compilation */
  var clearTimeout: js.UndefOr[js.Function1[/* timeoutId */ Any, Unit]] = js.native
  
  /** If provided, called with Diagnostic message that informs about change in watch status */
  var onWatchStatusChange: js.UndefOr[
    js.Function4[
      /* diagnostic */ Diagnostic, 
      /* newLine */ java.lang.String, 
      /* options */ CompilerOptions, 
      /* errorCount */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  
  /** If provided, will be used to set delayed compilation, so that multiple changes in short span are compiled together */
  var setTimeout: js.UndefOr[
    js.Function3[
      /* callback */ js.Function1[/* repeated */ Any, Unit], 
      /* ms */ Double, 
      /* repeated */ Any, 
      Any
    ]
  ] = js.native
  
  /** Used to watch resolved module's failed lookup locations, config file specs, type roots where auto type reference directives are added */
  def watchDirectory(path: java.lang.String, callback: DirectoryWatcherCallback): FileWatcher = js.native
  def watchDirectory(path: java.lang.String, callback: DirectoryWatcherCallback, recursive: Boolean): FileWatcher = js.native
  def watchDirectory(
    path: java.lang.String,
    callback: DirectoryWatcherCallback,
    recursive: Boolean,
    options: CompilerOptions
  ): FileWatcher = js.native
  def watchDirectory(
    path: java.lang.String,
    callback: DirectoryWatcherCallback,
    recursive: Unit,
    options: CompilerOptions
  ): FileWatcher = js.native
  
  /** Used to watch changes in source files, missing files needed to update the program or config file */
  def watchFile(path: java.lang.String, callback: FileWatcherCallback): FileWatcher = js.native
  def watchFile(path: java.lang.String, callback: FileWatcherCallback, pollingInterval: Double): FileWatcher = js.native
  def watchFile(
    path: java.lang.String,
    callback: FileWatcherCallback,
    pollingInterval: Double,
    options: CompilerOptions
  ): FileWatcher = js.native
  def watchFile(
    path: java.lang.String,
    callback: FileWatcherCallback,
    pollingInterval: Unit,
    options: CompilerOptions
  ): FileWatcher = js.native
}
