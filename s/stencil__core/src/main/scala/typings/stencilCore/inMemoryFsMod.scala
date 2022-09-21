package typings.stencilCore

import typings.std.Map
import typings.std.ReturnType
import typings.stencilCore.anon.Access
import typings.stencilCore.stencilPublicCompilerMod.CompilerSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inMemoryFsMod {
  
  @JSImport("@stencil/core/compiler/sys/in-memory-fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createInMemoryFs(sys: CompilerSystem): Access = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMemoryFs")(sys.asInstanceOf[js.Any]).asInstanceOf[Access]
  
  inline def getCommitInstructions(items: FsItems): FsCommitInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommitInstructions")(items.asInstanceOf[js.Any]).asInstanceOf[FsCommitInstructions]
  
  inline def shouldIgnore(filePath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldIgnore")(filePath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * The information needed to carry out a file copy operation.
    *
    * `[ source, destination ]`
    */
  type FileCopyTuple = js.Tuple2[String, String]
  
  /**
    * Collected instructions for all pending filesystem operations saved
    * to the in-memory filesystem.
    */
  trait FsCommitInstructions extends StObject {
    
    var dirsToDelete: js.Array[String]
    
    var dirsToEnsure: js.Array[String]
    
    /**
      * Files queued for copy operations are stored as an array of `[source, dest]`
      * tuples.
      */
    var filesToCopy: js.Array[FileCopyTuple]
    
    var filesToDelete: js.Array[String]
    
    var filesToWrite: js.Array[String]
  }
  object FsCommitInstructions {
    
    inline def apply(
      dirsToDelete: js.Array[String],
      dirsToEnsure: js.Array[String],
      filesToCopy: js.Array[FileCopyTuple],
      filesToDelete: js.Array[String],
      filesToWrite: js.Array[String]
    ): FsCommitInstructions = {
      val __obj = js.Dynamic.literal(dirsToDelete = dirsToDelete.asInstanceOf[js.Any], dirsToEnsure = dirsToEnsure.asInstanceOf[js.Any], filesToCopy = filesToCopy.asInstanceOf[js.Any], filesToDelete = filesToDelete.asInstanceOf[js.Any], filesToWrite = filesToWrite.asInstanceOf[js.Any])
      __obj.asInstanceOf[FsCommitInstructions]
    }
    
    extension [Self <: FsCommitInstructions](x: Self) {
      
      inline def setDirsToDelete(value: js.Array[String]): Self = StObject.set(x, "dirsToDelete", value.asInstanceOf[js.Any])
      
      inline def setDirsToDeleteVarargs(value: String*): Self = StObject.set(x, "dirsToDelete", js.Array(value*))
      
      inline def setDirsToEnsure(value: js.Array[String]): Self = StObject.set(x, "dirsToEnsure", value.asInstanceOf[js.Any])
      
      inline def setDirsToEnsureVarargs(value: String*): Self = StObject.set(x, "dirsToEnsure", js.Array(value*))
      
      inline def setFilesToCopy(value: js.Array[FileCopyTuple]): Self = StObject.set(x, "filesToCopy", value.asInstanceOf[js.Any])
      
      inline def setFilesToCopyVarargs(value: FileCopyTuple*): Self = StObject.set(x, "filesToCopy", js.Array(value*))
      
      inline def setFilesToDelete(value: js.Array[String]): Self = StObject.set(x, "filesToDelete", value.asInstanceOf[js.Any])
      
      inline def setFilesToDeleteVarargs(value: String*): Self = StObject.set(x, "filesToDelete", js.Array(value*))
      
      inline def setFilesToWrite(value: js.Array[String]): Self = StObject.set(x, "filesToWrite", value.asInstanceOf[js.Any])
      
      inline def setFilesToWriteVarargs(value: String*): Self = StObject.set(x, "filesToWrite", js.Array(value*))
    }
  }
  
  /**
    * Results from committing pending filesystem operations
    */
  trait FsCommitResults extends StObject {
    
    var dirsAdded: js.Array[String]
    
    var dirsDeleted: js.Array[String]
    
    var filesCopied: js.Array[FileCopyTuple]
    
    var filesDeleted: js.Array[String]
    
    var filesWritten: js.Array[String]
  }
  object FsCommitResults {
    
    inline def apply(
      dirsAdded: js.Array[String],
      dirsDeleted: js.Array[String],
      filesCopied: js.Array[FileCopyTuple],
      filesDeleted: js.Array[String],
      filesWritten: js.Array[String]
    ): FsCommitResults = {
      val __obj = js.Dynamic.literal(dirsAdded = dirsAdded.asInstanceOf[js.Any], dirsDeleted = dirsDeleted.asInstanceOf[js.Any], filesCopied = filesCopied.asInstanceOf[js.Any], filesDeleted = filesDeleted.asInstanceOf[js.Any], filesWritten = filesWritten.asInstanceOf[js.Any])
      __obj.asInstanceOf[FsCommitResults]
    }
    
    extension [Self <: FsCommitResults](x: Self) {
      
      inline def setDirsAdded(value: js.Array[String]): Self = StObject.set(x, "dirsAdded", value.asInstanceOf[js.Any])
      
      inline def setDirsAddedVarargs(value: String*): Self = StObject.set(x, "dirsAdded", js.Array(value*))
      
      inline def setDirsDeleted(value: js.Array[String]): Self = StObject.set(x, "dirsDeleted", value.asInstanceOf[js.Any])
      
      inline def setDirsDeletedVarargs(value: String*): Self = StObject.set(x, "dirsDeleted", js.Array(value*))
      
      inline def setFilesCopied(value: js.Array[FileCopyTuple]): Self = StObject.set(x, "filesCopied", value.asInstanceOf[js.Any])
      
      inline def setFilesCopiedVarargs(value: FileCopyTuple*): Self = StObject.set(x, "filesCopied", js.Array(value*))
      
      inline def setFilesDeleted(value: js.Array[String]): Self = StObject.set(x, "filesDeleted", value.asInstanceOf[js.Any])
      
      inline def setFilesDeletedVarargs(value: String*): Self = StObject.set(x, "filesDeleted", js.Array(value*))
      
      inline def setFilesWritten(value: js.Array[String]): Self = StObject.set(x, "filesWritten", value.asInstanceOf[js.Any])
      
      inline def setFilesWrittenVarargs(value: String*): Self = StObject.set(x, "filesWritten", js.Array(value*))
    }
  }
  
  trait FsItem extends StObject {
    
    var exists: Boolean
    
    var fileText: String
    
    var isDirectory: Boolean
    
    var isFile: Boolean
    
    var mtimeMs: Double
    
    var queueCopyFileToDest: String
    
    var queueDeleteFromDisk: js.UndefOr[Boolean] = js.undefined
    
    var queueWriteToDisk: Boolean
    
    var size: Double
    
    var useCache: Boolean
  }
  object FsItem {
    
    inline def apply(
      exists: Boolean,
      fileText: String,
      isDirectory: Boolean,
      isFile: Boolean,
      mtimeMs: Double,
      queueCopyFileToDest: String,
      queueWriteToDisk: Boolean,
      size: Double,
      useCache: Boolean
    ): FsItem = {
      val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], fileText = fileText.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], mtimeMs = mtimeMs.asInstanceOf[js.Any], queueCopyFileToDest = queueCopyFileToDest.asInstanceOf[js.Any], queueWriteToDisk = queueWriteToDisk.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], useCache = useCache.asInstanceOf[js.Any])
      __obj.asInstanceOf[FsItem]
    }
    
    extension [Self <: FsItem](x: Self) {
      
      inline def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      inline def setFileText(value: String): Self = StObject.set(x, "fileText", value.asInstanceOf[js.Any])
      
      inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
      
      inline def setIsFile(value: Boolean): Self = StObject.set(x, "isFile", value.asInstanceOf[js.Any])
      
      inline def setMtimeMs(value: Double): Self = StObject.set(x, "mtimeMs", value.asInstanceOf[js.Any])
      
      inline def setQueueCopyFileToDest(value: String): Self = StObject.set(x, "queueCopyFileToDest", value.asInstanceOf[js.Any])
      
      inline def setQueueDeleteFromDisk(value: Boolean): Self = StObject.set(x, "queueDeleteFromDisk", value.asInstanceOf[js.Any])
      
      inline def setQueueDeleteFromDiskUndefined: Self = StObject.set(x, "queueDeleteFromDisk", js.undefined)
      
      inline def setQueueWriteToDisk(value: Boolean): Self = StObject.set(x, "queueWriteToDisk", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUseCache(value: Boolean): Self = StObject.set(x, "useCache", value.asInstanceOf[js.Any])
    }
  }
  
  type FsItems = Map[String, FsItem]
  
  trait FsReadOptions extends StObject {
    
    var setHash: js.UndefOr[Boolean] = js.undefined
    
    var useCache: js.UndefOr[Boolean] = js.undefined
  }
  object FsReadOptions {
    
    inline def apply(): FsReadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FsReadOptions]
    }
    
    extension [Self <: FsReadOptions](x: Self) {
      
      inline def setSetHash(value: Boolean): Self = StObject.set(x, "setHash", value.asInstanceOf[js.Any])
      
      inline def setSetHashUndefined: Self = StObject.set(x, "setHash", js.undefined)
      
      inline def setUseCache(value: Boolean): Self = StObject.set(x, "useCache", value.asInstanceOf[js.Any])
      
      inline def setUseCacheUndefined: Self = StObject.set(x, "useCache", js.undefined)
    }
  }
  
  /**
    * A result from a directory read operation
    */
  trait FsReaddirItem extends StObject {
    
    var absPath: String
    
    var isDirectory: Boolean
    
    var isFile: Boolean
    
    var relPath: String
  }
  object FsReaddirItem {
    
    inline def apply(absPath: String, isDirectory: Boolean, isFile: Boolean, relPath: String): FsReaddirItem = {
      val __obj = js.Dynamic.literal(absPath = absPath.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], relPath = relPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[FsReaddirItem]
    }
    
    extension [Self <: FsReaddirItem](x: Self) {
      
      inline def setAbsPath(value: String): Self = StObject.set(x, "absPath", value.asInstanceOf[js.Any])
      
      inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
      
      inline def setIsFile(value: Boolean): Self = StObject.set(x, "isFile", value.asInstanceOf[js.Any])
      
      inline def setRelPath(value: String): Self = StObject.set(x, "relPath", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options supported by the readdir option on the in-memory filesystem.
    */
  trait FsReaddirOptions extends StObject {
    
    /**
      * Directory names to exclude. Just the basename,
      * not the entire path. Basically for "node_modules".
      */
    var excludeDirNames: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Extensions we know we can avoid. Each extension
      * should include the `.` so that we can test for both
      * `.d.ts.` and `.ts`. If `excludeExtensions` isn't provided it
      * doesn't try to exclude anything. This only checks against
      * the filename, not directory names when recursive.
      */
    var excludeExtensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var inMemoryOnly: js.UndefOr[Boolean] = js.undefined
    
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object FsReaddirOptions {
    
    inline def apply(): FsReaddirOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FsReaddirOptions]
    }
    
    extension [Self <: FsReaddirOptions](x: Self) {
      
      inline def setExcludeDirNames(value: js.Array[String]): Self = StObject.set(x, "excludeDirNames", value.asInstanceOf[js.Any])
      
      inline def setExcludeDirNamesUndefined: Self = StObject.set(x, "excludeDirNames", js.undefined)
      
      inline def setExcludeDirNamesVarargs(value: String*): Self = StObject.set(x, "excludeDirNames", js.Array(value*))
      
      inline def setExcludeExtensions(value: js.Array[String]): Self = StObject.set(x, "excludeExtensions", value.asInstanceOf[js.Any])
      
      inline def setExcludeExtensionsUndefined: Self = StObject.set(x, "excludeExtensions", js.undefined)
      
      inline def setExcludeExtensionsVarargs(value: String*): Self = StObject.set(x, "excludeExtensions", js.Array(value*))
      
      inline def setInMemoryOnly(value: Boolean): Self = StObject.set(x, "inMemoryOnly", value.asInstanceOf[js.Any])
      
      inline def setInMemoryOnlyUndefined: Self = StObject.set(x, "inMemoryOnly", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
  
  /**
    * Information about a file in the in-memory filesystem.
    */
  trait FsStat extends StObject {
    
    var exists: Boolean
    
    var isDirectory: Boolean
    
    var isFile: Boolean
    
    var size: Double
  }
  object FsStat {
    
    inline def apply(exists: Boolean, isDirectory: Boolean, isFile: Boolean, size: Double): FsStat = {
      val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[FsStat]
    }
    
    extension [Self <: FsStat](x: Self) {
      
      inline def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
      
      inline def setIsFile(value: Boolean): Self = StObject.set(x, "isFile", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait FsWriteOptions extends StObject {
    
    var clearFileCache: js.UndefOr[Boolean] = js.undefined
    
    var immediateWrite: js.UndefOr[Boolean] = js.undefined
    
    var inMemoryOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional tag for the current output target for which this file is being
      * written.
      */
    var outputTargetType: js.UndefOr[String] = js.undefined
    
    var useCache: js.UndefOr[Boolean] = js.undefined
  }
  object FsWriteOptions {
    
    inline def apply(): FsWriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FsWriteOptions]
    }
    
    extension [Self <: FsWriteOptions](x: Self) {
      
      inline def setClearFileCache(value: Boolean): Self = StObject.set(x, "clearFileCache", value.asInstanceOf[js.Any])
      
      inline def setClearFileCacheUndefined: Self = StObject.set(x, "clearFileCache", js.undefined)
      
      inline def setImmediateWrite(value: Boolean): Self = StObject.set(x, "immediateWrite", value.asInstanceOf[js.Any])
      
      inline def setImmediateWriteUndefined: Self = StObject.set(x, "immediateWrite", js.undefined)
      
      inline def setInMemoryOnly(value: Boolean): Self = StObject.set(x, "inMemoryOnly", value.asInstanceOf[js.Any])
      
      inline def setInMemoryOnlyUndefined: Self = StObject.set(x, "inMemoryOnly", js.undefined)
      
      inline def setOutputTargetType(value: String): Self = StObject.set(x, "outputTargetType", value.asInstanceOf[js.Any])
      
      inline def setOutputTargetTypeUndefined: Self = StObject.set(x, "outputTargetType", js.undefined)
      
      inline def setUseCache(value: Boolean): Self = StObject.set(x, "useCache", value.asInstanceOf[js.Any])
      
      inline def setUseCacheUndefined: Self = StObject.set(x, "useCache", js.undefined)
    }
  }
  
  trait FsWriteResults extends StObject {
    
    var changedContent: Boolean
    
    var ignored: Boolean
    
    var queuedWrite: Boolean
  }
  object FsWriteResults {
    
    inline def apply(changedContent: Boolean, ignored: Boolean, queuedWrite: Boolean): FsWriteResults = {
      val __obj = js.Dynamic.literal(changedContent = changedContent.asInstanceOf[js.Any], ignored = ignored.asInstanceOf[js.Any], queuedWrite = queuedWrite.asInstanceOf[js.Any])
      __obj.asInstanceOf[FsWriteResults]
    }
    
    extension [Self <: FsWriteResults](x: Self) {
      
      inline def setChangedContent(value: Boolean): Self = StObject.set(x, "changedContent", value.asInstanceOf[js.Any])
      
      inline def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
      
      inline def setQueuedWrite(value: Boolean): Self = StObject.set(x, "queuedWrite", value.asInstanceOf[js.Any])
    }
  }
  
  type InMemoryFileSystem = ReturnType[js.Function1[/* sys */ CompilerSystem, Access]]
}
