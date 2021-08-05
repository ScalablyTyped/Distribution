package typings.resolve

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Asynchronously resolve the module path string id into cb(err, res [, pkg]), where pkg (if defined) is the data from package.json
    *
    * @param id Identifier to resolve
    * @param callback
    */
  inline def apply(id: String, cb: resolveCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(id.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Asynchronously resolve the module path string id into cb(err, res [, pkg]), where pkg (if defined) is the data from package.json
    *
    * @param id Identifier to resolve
    * @param options Options to use for resolving, optional.
    * @param callback
    */
  inline def apply(id: String, opts: AsyncOpts, cb: resolveCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("resolve", "isCore")
  @js.native
  def isCore: js.Function1[/* id */ String, js.UndefOr[Boolean]] = js.native
  inline def isCore_=(x: js.Function1[/* id */ String, js.UndefOr[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isCore")(x.asInstanceOf[js.Any])
  
  @JSImport("resolve", "sync")
  @js.native
  def sync: js.Function2[/* id */ String, /* opts */ js.UndefOr[SyncOpts], String] = js.native
  inline def sync_=(x: js.Function2[/* id */ String, /* opts */ js.UndefOr[SyncOpts], String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sync")(x.asInstanceOf[js.Any])
  
  trait AsyncOpts
    extends StObject
       with Opts {
    
    /** function to asynchronously test whether a directory exists */
    var isDirectory: js.UndefOr[js.Function2[/* directory */ String, /* cb */ existsCallback, Unit]] = js.undefined
    
    /** function to asynchronously test whether a file exists */
    var isFile: js.UndefOr[js.Function2[/* file */ String, /* cb */ existsCallback, Unit]] = js.undefined
    
    /** how to read files asynchronously (defaults to fs.readFile) */
    var readFile: js.UndefOr[js.Function2[/* file */ String, /* cb */ readFileCallback, Unit]] = js.undefined
    
    /** function to asynchronously resolve a potential symlink to its real path */
    var realpath: js.UndefOr[js.Function2[/* file */ String, /* cb */ realpathCallback, Unit]] = js.undefined
  }
  object AsyncOpts {
    
    inline def apply(): AsyncOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncOpts]
    }
    
    extension [Self <: AsyncOpts](x: Self) {
      
      inline def setIsDirectory(value: (/* directory */ String, /* cb */ existsCallback) => Unit): Self = StObject.set(x, "isDirectory", js.Any.fromFunction2(value))
      
      inline def setIsDirectoryUndefined: Self = StObject.set(x, "isDirectory", js.undefined)
      
      inline def setIsFile(value: (/* file */ String, /* cb */ existsCallback) => Unit): Self = StObject.set(x, "isFile", js.Any.fromFunction2(value))
      
      inline def setIsFileUndefined: Self = StObject.set(x, "isFile", js.undefined)
      
      inline def setReadFile(value: (/* file */ String, /* cb */ readFileCallback) => Unit): Self = StObject.set(x, "readFile", js.Any.fromFunction2(value))
      
      inline def setReadFileUndefined: Self = StObject.set(x, "readFile", js.undefined)
      
      inline def setRealpath(value: (/* file */ String, /* cb */ realpathCallback) => Unit): Self = StObject.set(x, "realpath", js.Any.fromFunction2(value))
      
      inline def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
    }
  }
  
  trait Opts extends StObject {
    
    /** package.json data applicable to the module being loaded */
    @JSName("package")
    var _package: js.UndefOr[js.Any] = js.undefined
    
    /** directory to begin resolving from (defaults to __dirname) */
    var basedir: js.UndefOr[String] = js.undefined
    
    /** array of file extensions to search in order (defaults to ['.js']) */
    var extensions: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** directory (or directories) in which to recursively look for modules. (default to 'node_modules') */
    var moduleDirectory: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** transform the parsed package.json contents before looking at the "main" field */
    var packageFilter: js.UndefOr[js.Function2[/* pkg */ js.Any, /* pkgfile */ String, js.Any]] = js.undefined
    
    /** return the list of candidate paths where the packages sources may be found (probably don't use this) */
    var packageIterator: js.UndefOr[
        js.Function4[
          /* request */ String, 
          /* start */ String, 
          /* getPackageCandidates */ js.Function0[js.Array[String]], 
          /* opts */ this.type, 
          js.Array[String]
        ]
      ] = js.undefined
    
    /** transform a path within a package */
    var pathFilter: js.UndefOr[
        js.Function3[/* pkg */ js.Any, /* path */ String, /* relativePath */ String, String]
      ] = js.undefined
    
    /** require.paths array to use if nothing is found on the normal node_modules recursive walk (probably don't use this) */
    var paths: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * if true, doesn't resolve `basedir` to real path before resolving.
      * This is the way Node resolves dependencies when executed with the --preserve-symlinks flag.
      *
      * Note: this property is currently true by default but it will be changed to false in the next major version because Node's resolution
      * algorithm does not preserve symlinks by default.
      */
    var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
  }
  object Opts {
    
    inline def apply(): Opts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opts]
    }
    
    extension [Self <: Opts](x: Self) {
      
      inline def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      inline def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
      
      inline def setExtensions(value: String | js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      inline def setModuleDirectory(value: String | js.Array[String]): Self = StObject.set(x, "moduleDirectory", value.asInstanceOf[js.Any])
      
      inline def setModuleDirectoryUndefined: Self = StObject.set(x, "moduleDirectory", js.undefined)
      
      inline def setModuleDirectoryVarargs(value: String*): Self = StObject.set(x, "moduleDirectory", js.Array(value :_*))
      
      inline def setPackageFilter(value: (/* pkg */ js.Any, /* pkgfile */ String) => js.Any): Self = StObject.set(x, "packageFilter", js.Any.fromFunction2(value))
      
      inline def setPackageFilterUndefined: Self = StObject.set(x, "packageFilter", js.undefined)
      
      inline def setPackageIterator(
        value: (/* request */ String, /* start */ String, /* getPackageCandidates */ js.Function0[js.Array[String]], Opts) => js.Array[String]
      ): Self = StObject.set(x, "packageIterator", js.Any.fromFunction4(value))
      
      inline def setPackageIteratorUndefined: Self = StObject.set(x, "packageIterator", js.undefined)
      
      inline def setPathFilter(value: (/* pkg */ js.Any, /* path */ String, /* relativePath */ String) => String): Self = StObject.set(x, "pathFilter", js.Any.fromFunction3(value))
      
      inline def setPathFilterUndefined: Self = StObject.set(x, "pathFilter", js.undefined)
      
      inline def setPaths(value: String | js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
      
      inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
      
      inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
      
      inline def set_package(value: js.Any): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
      
      inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
    }
  }
  
  trait PackageMeta
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var name: String
    
    var version: String
  }
  object PackageMeta {
    
    inline def apply(name: String, version: String): PackageMeta = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageMeta]
    }
    
    extension [Self <: PackageMeta](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyncOpts
    extends StObject
       with Opts {
    
    /** function to synchronously test whether a directory exists */
    var isDirectory: js.UndefOr[js.Function1[/* directory */ String, Boolean]] = js.undefined
    
    /** function to synchronously test whether a file exists */
    var isFile: js.UndefOr[js.Function1[/* file */ String, Boolean]] = js.undefined
    
    /** how to read files synchronously (defaults to fs.readFileSync) */
    var readFileSync: js.UndefOr[js.Function2[/* file */ String, /* encoding */ BufferEncoding, String | Buffer]] = js.undefined
    
    /** function to synchronously resolve a potential symlink to its real path */
    var realpathSync: js.UndefOr[js.Function1[/* file */ String, String]] = js.undefined
  }
  object SyncOpts {
    
    inline def apply(): SyncOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncOpts]
    }
    
    extension [Self <: SyncOpts](x: Self) {
      
      inline def setIsDirectory(value: /* directory */ String => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction1(value))
      
      inline def setIsDirectoryUndefined: Self = StObject.set(x, "isDirectory", js.undefined)
      
      inline def setIsFile(value: /* file */ String => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction1(value))
      
      inline def setIsFileUndefined: Self = StObject.set(x, "isFile", js.undefined)
      
      inline def setReadFileSync(value: (/* file */ String, /* encoding */ BufferEncoding) => String | Buffer): Self = StObject.set(x, "readFileSync", js.Any.fromFunction2(value))
      
      inline def setReadFileSyncUndefined: Self = StObject.set(x, "readFileSync", js.undefined)
      
      inline def setRealpathSync(value: /* file */ String => String): Self = StObject.set(x, "realpathSync", js.Any.fromFunction1(value))
      
      inline def setRealpathSyncUndefined: Self = StObject.set(x, "realpathSync", js.undefined)
    }
  }
  
  /**
    * Callback invoked when checking if a file or directory exists
    *
    * @param error
    * @param exists If the given file or directory exists
    */
  type existsCallback = js.Function2[/* err */ Error | Null, /* isFile */ js.UndefOr[Boolean], Unit]
  
  /**
    * Callback invoked when reading a file
    *
    * @param error
    * @param isFile If the given file exists
    */
  type readFileCallback = js.Function2[/* err */ Error | Null, /* file */ js.UndefOr[Buffer], Unit]
  
  /**
    * Callback invoked when resolving a potential symlink
    *
    * @param error
    * @param resolved Absolute path to the resolved file
    */
  type realpathCallback = js.Function2[/* err */ Error | Null, /* resolved */ js.UndefOr[String], Unit]
  
  /**
    * Callback invoked when resolving asynchronously
    *
    * @param error
    * @param resolved Absolute path to resolved identifier
    */
  type resolveCallback = js.Function3[
    /* err */ Error | Null, 
    /* resolved */ js.UndefOr[String], 
    /* pkg */ js.UndefOr[PackageMeta], 
    Unit
  ]
}
