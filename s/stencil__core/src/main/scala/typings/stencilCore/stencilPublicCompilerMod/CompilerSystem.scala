package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.anon.Dependencies
import typings.stencilCore.anon.DevServerHostUrl
import typings.stencilCore.anon.Dictkey
import typings.stencilCore.anon.ModuleId
import typings.stencilCore.anon.Object
import typings.stencilCore.anon.Path
import typings.stencilCore.anon.RequiredCopyTask
import typings.stencilCore.anon.StencilPath
import typings.stencilCore.anon.Ts
import typings.stencilCore.stencilCoreStrings.`in-memory`
import typings.stencilCore.stencilCoreStrings.binary
import typings.stencilCore.stencilCoreStrings.node
import typings.stencilCore.stencilCoreStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompilerSystem extends StObject {
  
  /**
    * Always returns a boolean, does not throw.
    */
  def access(p: String): js.Promise[Boolean] = js.native
  
  /**
    * SYNC! Always returns a boolean, does not throw.
    */
  def accessSync(p: String): Boolean = js.native
  
  /**
    * Add a callback which will be ran when destroy() is called.
    */
  def addDestory(cb: js.Function0[Unit]): Unit = js.native
  
  var applyGlobalPatch: js.UndefOr[js.Function1[/* fromDir */ String, js.Promise[Unit]]] = js.native
  
  var applyPrerenderGlobalPatch: js.UndefOr[js.Function1[/* opts */ DevServerHostUrl, Unit]] = js.native
  
  var cacheStorage: js.UndefOr[CacheStorage] = js.native
  
  var checkVersion: js.UndefOr[
    js.Function2[/* logger */ Logger, /* currentVersion */ String, js.Promise[js.Function0[Unit]]]
  ] = js.native
  
  var copy: js.UndefOr[
    js.Function2[
      /* copyTasks */ js.Array[RequiredCopyTask], 
      /* srcDir */ String, 
      js.Promise[CopyResults]
    ]
  ] = js.native
  
  /**
    * Always returns a boolean if the files were copied or not. Does not throw.
    */
  def copyFile(src: String, dst: String): js.Promise[Boolean] = js.native
  
  /**
    * Does not throw.
    */
  def createDir(p: String): js.Promise[CompilerSystemCreateDirectoryResults] = js.native
  def createDir(p: String, opts: CompilerSystemCreateDirectoryOptions): js.Promise[CompilerSystemCreateDirectoryResults] = js.native
  
  /**
    * SYNC! Does not throw.
    */
  def createDirSync(p: String): CompilerSystemCreateDirectoryResults = js.native
  def createDirSync(p: String, opts: CompilerSystemCreateDirectoryOptions): CompilerSystemCreateDirectoryResults = js.native
  
  /**
    * Creates the worker controller for the current system.
    */
  var createWorkerController: js.UndefOr[js.Function1[/* maxConcurrentWorkers */ Double, WorkerMainController]] = js.native
  
  /**
    * Used to destroy any listeners, file watchers or child processes.
    */
  def destroy(): js.Promise[Unit] = js.native
  
  var details: js.UndefOr[SystemDetails] = js.native
  
  /**
    * Each platform as a different way to dynamically import modules.
    */
  var dynamicImport: js.UndefOr[js.Function1[/* p */ String, js.Promise[Any]]] = js.native
  
  def encodeToBase64(str: String): String = js.native
  
  var ensureDependencies: js.UndefOr[js.Function1[/* opts */ Dependencies, js.Promise[StencilPath]]] = js.native
  
  var ensureResources: js.UndefOr[js.Function1[/* opts */ Dependencies, js.Promise[Unit]]] = js.native
  
  var events: js.UndefOr[BuildEvents] = js.native
  
  /**
    * process.exit()
    */
  def exit(exitCode: Double): js.Promise[Unit] = js.native
  
  /**
    * Optionally provide a fetch() function rather than using the built-in fetch().
    * First arg is a url string or Request object (RequestInfo).
    * Second arg is the RequestInit. Returns the Response object
    */
  var fetch: js.UndefOr[
    js.Function2[/* input */ String | Any, /* init */ js.UndefOr[Any], js.Promise[Any]]
  ] = js.native
  
  /**
    * Generates a sha1 digest encoded as HEX
    */
  var generateContentHash: js.UndefOr[
    js.Function2[/* content */ String | Any, /* length */ js.UndefOr[Double], js.Promise[String]]
  ] = js.native
  
  /**
    * Generates a sha1 digest encoded as HEX from a file path
    */
  var generateFileHash: js.UndefOr[
    js.Function2[/* filePath */ String | Any, /* length */ js.UndefOr[Double], js.Promise[String]]
  ] = js.native
  
  /**
    * The compiler's executing path.
    */
  def getCompilerExecutingPath(): String = js.native
  
  /**
    * Get the current directory.
    */
  def getCurrentDirectory(): String = js.native
  
  /**
    * The dev server's executing path.
    */
  var getDevServerExecutingPath: js.UndefOr[js.Function0[String]] = js.native
  
  var getEnvironmentVar: js.UndefOr[js.Function1[/* key */ String, String]] = js.native
  
  /**
    * Gets the absolute file path when for a dependency module.
    */
  def getLocalModulePath(opts: ModuleId): String = js.native
  
  /**
    * Gets the full url when requesting a dependency module to fetch from a CDN.
    */
  def getRemoteModuleUrl(opts: Path): String = js.native
  
  /**
    * Aync glob task. Only available in NodeJS compiler system.
    */
  var glob: js.UndefOr[
    js.Function2[/* pattern */ String, /* options */ Dictkey, js.Promise[js.Array[String]]]
  ] = js.native
  
  /**
    * The number of logical processors available to run threads on the user's computer (cpus).
    */
  var hardwareConcurrency: Double = js.native
  
  def homeDir(): String = js.native
  
  /**
    * Tests if the path is a symbolic link or not. Always resolves a boolean. Does not throw.
    */
  def isSymbolicLink(p: String): js.Promise[Boolean] = js.native
  
  /**
    * Used to determine if the current context of the terminal is TTY.
    */
  def isTTY(): Boolean = js.native
  
  var lazyRequire: js.UndefOr[LazyRequire] = js.native
  
  var name: node | `in-memory` = js.native
  
  def nextTick(cb: js.Function0[Unit]): Unit = js.native
  
  /**
    * Normalize file system path.
    */
  def normalizePath(p: String): String = js.native
  
  var onProcessInterrupt: js.UndefOr[js.Function1[/* cb */ js.Function0[Unit], Unit]] = js.native
  
  var parseYarnLockFile: js.UndefOr[js.Function1[/* content */ String, Object]] = js.native
  
  var platformPath: PlatformPath = js.native
  
  /**
    * All return paths are full normalized paths, not just the basenames. Always returns an array, does not throw.
    */
  def readDir(p: String): js.Promise[js.Array[String]] = js.native
  
  /**
    * SYNC! All return paths are full normalized paths, not just the basenames. Always returns an array, does not throw.
    */
  def readDirSync(p: String): js.Array[String] = js.native
  
  /**
    * Returns undefined if file is not found. Does not throw.
    */
  def readFile(p: String): js.Promise[String] = js.native
  
  /**
    * SYNC! Returns undefined if file is not found. Does not throw.
    */
  def readFileSync(p: String): String = js.native
  def readFileSync(p: String, encoding: String): String = js.native
  
  @JSName("readFile")
  def readFile_binary(p: String, encoding: binary): js.Promise[Any] = js.native
  @JSName("readFile")
  def readFile_utf8(p: String, encoding: utf8): js.Promise[String] = js.native
  
  /**
    * Does not throw.
    */
  def realpath(p: String): js.Promise[CompilerSystemRealpathResults] = js.native
  
  /**
    * SYNC! Does not throw.
    */
  def realpathSync(p: String): CompilerSystemRealpathResults = js.native
  
  /**
    * Remove a callback which will be ran when destroy() is called.
    */
  def removeDestory(cb: js.Function0[Unit]): Unit = js.native
  
  /**
    * Does not throw.
    */
  def removeDir(p: String): js.Promise[CompilerSystemRemoveDirectoryResults] = js.native
  def removeDir(p: String, opts: CompilerSystemRemoveDirectoryOptions): js.Promise[CompilerSystemRemoveDirectoryResults] = js.native
  
  /**
    * SYNC! Does not throw.
    */
  def removeDirSync(p: String): CompilerSystemRemoveDirectoryResults = js.native
  def removeDirSync(p: String, opts: CompilerSystemRemoveDirectoryOptions): CompilerSystemRemoveDirectoryResults = js.native
  
  /**
    * Does not throw.
    */
  def removeFile(p: String): js.Promise[CompilerSystemRemoveFileResults] = js.native
  
  /**
    * SYNC! Does not throw.
    */
  def removeFileSync(p: String): CompilerSystemRemoveFileResults = js.native
  
  /**
    * Rename old path to new path. Does not throw.
    */
  def rename(oldPath: String, newPath: String): js.Promise[CompilerSystemRenameResults] = js.native
  
  var resolveModuleId: js.UndefOr[
    js.Function1[/* opts */ ResolveModuleIdOptions, js.Promise[ResolveModuleIdResults]]
  ] = js.native
  
  def resolvePath(p: String): String = js.native
  
  var setupCompiler: js.UndefOr[js.Function1[/* c */ Ts, Unit]] = js.native
  
  /**
    * Always returns an object. Does not throw. Check for "error" property if there's an error.
    */
  def stat(p: String): js.Promise[CompilerFsStats] = js.native
  
  /**
    * SYNC! Always returns an object. Does not throw. Check for "error" property if there's an error.
    */
  def statSync(p: String): CompilerFsStats = js.native
  
  def tmpDirSync(): String = js.native
  
  var version: String = js.native
  
  var watchDirectory: js.UndefOr[
    js.Function3[
      /* p */ String, 
      /* callback */ CompilerFileWatcherCallback, 
      /* recursive */ js.UndefOr[Boolean], 
      CompilerFileWatcher
    ]
  ] = js.native
  
  var watchFile: js.UndefOr[
    js.Function2[/* p */ String, /* callback */ CompilerFileWatcherCallback, CompilerFileWatcher]
  ] = js.native
  
  /**
    * How many milliseconds to wait after a change before calling watch callbacks.
    */
  var watchTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Does not throw.
    */
  def writeFile(p: String, content: String): js.Promise[CompilerSystemWriteFileResults] = js.native
  
  /**
    * SYNC! Does not throw.
    */
  def writeFileSync(p: String, content: String): CompilerSystemWriteFileResults = js.native
}
