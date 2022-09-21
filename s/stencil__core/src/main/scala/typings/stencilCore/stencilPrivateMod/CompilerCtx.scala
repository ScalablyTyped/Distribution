package typings.stencilCore.stencilPrivateMod

import typings.std.Map
import typings.std.Set
import typings.stencilCore.inMemoryFsMod.InMemoryFileSystem
import typings.stencilCore.stencilPublicCompilerMod.BuildEvents
import typings.stencilCore.stencilPublicCompilerMod.CompilerBuildResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerCtx extends StObject {
  
  var activeBuildId: Double
  
  var activeDirsAdded: js.Array[String]
  
  var activeDirsDeleted: js.Array[String]
  
  var activeFilesAdded: js.Array[String]
  
  var activeFilesDeleted: js.Array[String]
  
  var activeFilesUpdated: js.Array[String]
  
  def addWatchDir(path: String, recursive: Boolean): Unit
  
  def addWatchFile(path: String): Unit
  
  var cache: Cache
  
  var cachedGlobalStyle: String
  
  var changedFiles: Set[String]
  
  var changedModules: Set[String]
  
  var collections: js.Array[CollectionCompilerMeta]
  
  var compilerOptions: Any
  
  var cssModuleImports: Map[String, js.Array[String]]
  
  var events: BuildEvents
  
  var fs: InMemoryFileSystem
  
  var hasSuccessfulBuild: Boolean
  
  var isActivelyBuilding: Boolean
  
  var lastBuildResults: CompilerBuildResults
  
  var moduleMap: ModuleMap
  
  var nodeMap: NodeMap
  
  def reset(): Unit
  
  var resolvedCollections: Set[String]
  
  var rollupCache: Map[String, Any]
  
  var rollupCacheHydrate: Any
  
  var rollupCacheLazy: Any
  
  var rollupCacheNative: Any
  
  var styleModeNames: Set[String]
  
  var version: Double
  
  var worker: js.UndefOr[CompilerWorkerContext] = js.undefined
}
object CompilerCtx {
  
  inline def apply(
    activeBuildId: Double,
    activeDirsAdded: js.Array[String],
    activeDirsDeleted: js.Array[String],
    activeFilesAdded: js.Array[String],
    activeFilesDeleted: js.Array[String],
    activeFilesUpdated: js.Array[String],
    addWatchDir: (String, Boolean) => Unit,
    addWatchFile: String => Unit,
    cache: Cache,
    cachedGlobalStyle: String,
    changedFiles: Set[String],
    changedModules: Set[String],
    collections: js.Array[CollectionCompilerMeta],
    compilerOptions: Any,
    cssModuleImports: Map[String, js.Array[String]],
    events: BuildEvents,
    fs: InMemoryFileSystem,
    hasSuccessfulBuild: Boolean,
    isActivelyBuilding: Boolean,
    lastBuildResults: CompilerBuildResults,
    moduleMap: ModuleMap,
    nodeMap: NodeMap,
    reset: () => Unit,
    resolvedCollections: Set[String],
    rollupCache: Map[String, Any],
    rollupCacheHydrate: Any,
    rollupCacheLazy: Any,
    rollupCacheNative: Any,
    styleModeNames: Set[String],
    version: Double
  ): CompilerCtx = {
    val __obj = js.Dynamic.literal(activeBuildId = activeBuildId.asInstanceOf[js.Any], activeDirsAdded = activeDirsAdded.asInstanceOf[js.Any], activeDirsDeleted = activeDirsDeleted.asInstanceOf[js.Any], activeFilesAdded = activeFilesAdded.asInstanceOf[js.Any], activeFilesDeleted = activeFilesDeleted.asInstanceOf[js.Any], activeFilesUpdated = activeFilesUpdated.asInstanceOf[js.Any], addWatchDir = js.Any.fromFunction2(addWatchDir), addWatchFile = js.Any.fromFunction1(addWatchFile), cache = cache.asInstanceOf[js.Any], cachedGlobalStyle = cachedGlobalStyle.asInstanceOf[js.Any], changedFiles = changedFiles.asInstanceOf[js.Any], changedModules = changedModules.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], compilerOptions = compilerOptions.asInstanceOf[js.Any], cssModuleImports = cssModuleImports.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any], hasSuccessfulBuild = hasSuccessfulBuild.asInstanceOf[js.Any], isActivelyBuilding = isActivelyBuilding.asInstanceOf[js.Any], lastBuildResults = lastBuildResults.asInstanceOf[js.Any], moduleMap = moduleMap.asInstanceOf[js.Any], nodeMap = nodeMap.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), resolvedCollections = resolvedCollections.asInstanceOf[js.Any], rollupCache = rollupCache.asInstanceOf[js.Any], rollupCacheHydrate = rollupCacheHydrate.asInstanceOf[js.Any], rollupCacheLazy = rollupCacheLazy.asInstanceOf[js.Any], rollupCacheNative = rollupCacheNative.asInstanceOf[js.Any], styleModeNames = styleModeNames.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerCtx]
  }
  
  extension [Self <: CompilerCtx](x: Self) {
    
    inline def setActiveBuildId(value: Double): Self = StObject.set(x, "activeBuildId", value.asInstanceOf[js.Any])
    
    inline def setActiveDirsAdded(value: js.Array[String]): Self = StObject.set(x, "activeDirsAdded", value.asInstanceOf[js.Any])
    
    inline def setActiveDirsAddedVarargs(value: String*): Self = StObject.set(x, "activeDirsAdded", js.Array(value*))
    
    inline def setActiveDirsDeleted(value: js.Array[String]): Self = StObject.set(x, "activeDirsDeleted", value.asInstanceOf[js.Any])
    
    inline def setActiveDirsDeletedVarargs(value: String*): Self = StObject.set(x, "activeDirsDeleted", js.Array(value*))
    
    inline def setActiveFilesAdded(value: js.Array[String]): Self = StObject.set(x, "activeFilesAdded", value.asInstanceOf[js.Any])
    
    inline def setActiveFilesAddedVarargs(value: String*): Self = StObject.set(x, "activeFilesAdded", js.Array(value*))
    
    inline def setActiveFilesDeleted(value: js.Array[String]): Self = StObject.set(x, "activeFilesDeleted", value.asInstanceOf[js.Any])
    
    inline def setActiveFilesDeletedVarargs(value: String*): Self = StObject.set(x, "activeFilesDeleted", js.Array(value*))
    
    inline def setActiveFilesUpdated(value: js.Array[String]): Self = StObject.set(x, "activeFilesUpdated", value.asInstanceOf[js.Any])
    
    inline def setActiveFilesUpdatedVarargs(value: String*): Self = StObject.set(x, "activeFilesUpdated", js.Array(value*))
    
    inline def setAddWatchDir(value: (String, Boolean) => Unit): Self = StObject.set(x, "addWatchDir", js.Any.fromFunction2(value))
    
    inline def setAddWatchFile(value: String => Unit): Self = StObject.set(x, "addWatchFile", js.Any.fromFunction1(value))
    
    inline def setCache(value: Cache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCachedGlobalStyle(value: String): Self = StObject.set(x, "cachedGlobalStyle", value.asInstanceOf[js.Any])
    
    inline def setChangedFiles(value: Set[String]): Self = StObject.set(x, "changedFiles", value.asInstanceOf[js.Any])
    
    inline def setChangedModules(value: Set[String]): Self = StObject.set(x, "changedModules", value.asInstanceOf[js.Any])
    
    inline def setCollections(value: js.Array[CollectionCompilerMeta]): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    inline def setCollectionsVarargs(value: CollectionCompilerMeta*): Self = StObject.set(x, "collections", js.Array(value*))
    
    inline def setCompilerOptions(value: Any): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    inline def setCssModuleImports(value: Map[String, js.Array[String]]): Self = StObject.set(x, "cssModuleImports", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: BuildEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setFs(value: InMemoryFileSystem): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    inline def setHasSuccessfulBuild(value: Boolean): Self = StObject.set(x, "hasSuccessfulBuild", value.asInstanceOf[js.Any])
    
    inline def setIsActivelyBuilding(value: Boolean): Self = StObject.set(x, "isActivelyBuilding", value.asInstanceOf[js.Any])
    
    inline def setLastBuildResults(value: CompilerBuildResults): Self = StObject.set(x, "lastBuildResults", value.asInstanceOf[js.Any])
    
    inline def setModuleMap(value: ModuleMap): Self = StObject.set(x, "moduleMap", value.asInstanceOf[js.Any])
    
    inline def setNodeMap(value: NodeMap): Self = StObject.set(x, "nodeMap", value.asInstanceOf[js.Any])
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setResolvedCollections(value: Set[String]): Self = StObject.set(x, "resolvedCollections", value.asInstanceOf[js.Any])
    
    inline def setRollupCache(value: Map[String, Any]): Self = StObject.set(x, "rollupCache", value.asInstanceOf[js.Any])
    
    inline def setRollupCacheHydrate(value: Any): Self = StObject.set(x, "rollupCacheHydrate", value.asInstanceOf[js.Any])
    
    inline def setRollupCacheLazy(value: Any): Self = StObject.set(x, "rollupCacheLazy", value.asInstanceOf[js.Any])
    
    inline def setRollupCacheNative(value: Any): Self = StObject.set(x, "rollupCacheNative", value.asInstanceOf[js.Any])
    
    inline def setStyleModeNames(value: Set[String]): Self = StObject.set(x, "styleModeNames", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setWorker(value: CompilerWorkerContext): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    
    inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
  }
}
