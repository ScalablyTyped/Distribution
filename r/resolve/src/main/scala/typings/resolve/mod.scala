package typings.resolve

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.resolve.anon.readFilefilestringcbreadF
    - typings.resolve.anon.readFileneverundefinedrea
  */
  trait AsyncOpts extends StObject
  object AsyncOpts {
    
    inline def readFilefilestringcbreadF(): typings.resolve.anon.readFilefilestringcbreadF = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.resolve.anon.readFilefilestringcbreadF]
    }
    
    inline def readFileneverundefinedrea(): typings.resolve.anon.readFileneverundefinedrea = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.resolve.anon.readFileneverundefinedrea]
    }
  }
  
  trait BaseAsyncOpts
    extends StObject
       with Opts {
    
    /** function to asynchronously test whether a directory exists */
    var isDirectory: js.UndefOr[js.Function2[/* directory */ String, /* cb */ existsCallback, Unit]] = js.undefined
    
    /** function to asynchronously test whether a file exists */
    var isFile: js.UndefOr[js.Function2[/* file */ String, /* cb */ existsCallback, Unit]] = js.undefined
    
    /** function to asynchronously resolve a potential symlink to its real path */
    var realpath: js.UndefOr[js.Function2[/* file */ String, /* cb */ realpathCallback, Unit]] = js.undefined
  }
  object BaseAsyncOpts {
    
    inline def apply(): BaseAsyncOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseAsyncOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseAsyncOpts] (val x: Self) extends AnyVal {
      
      inline def setIsDirectory(value: (/* directory */ String, /* cb */ existsCallback) => Unit): Self = StObject.set(x, "isDirectory", js.Any.fromFunction2(value))
      
      inline def setIsDirectoryUndefined: Self = StObject.set(x, "isDirectory", js.undefined)
      
      inline def setIsFile(value: (/* file */ String, /* cb */ existsCallback) => Unit): Self = StObject.set(x, "isFile", js.Any.fromFunction2(value))
      
      inline def setIsFileUndefined: Self = StObject.set(x, "isFile", js.undefined)
      
      inline def setRealpath(value: (/* file */ String, /* cb */ realpathCallback) => Unit): Self = StObject.set(x, "realpath", js.Any.fromFunction2(value))
      
      inline def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
    }
  }
  
  trait BaseSyncOpts
    extends StObject
       with Opts {
    
    /** function to synchronously test whether a directory exists */
    var isDirectory: js.UndefOr[js.Function1[/* directory */ String, Boolean]] = js.undefined
    
    /** function to synchronously test whether a file exists */
    var isFile: js.UndefOr[js.Function1[/* file */ String, Boolean]] = js.undefined
    
    /** function to synchronously resolve a potential symlink to its real path */
    var realpathSync: js.UndefOr[js.Function1[/* file */ String, String]] = js.undefined
  }
  object BaseSyncOpts {
    
    inline def apply(): BaseSyncOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseSyncOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseSyncOpts] (val x: Self) extends AnyVal {
      
      inline def setIsDirectory(value: /* directory */ String => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction1(value))
      
      inline def setIsDirectoryUndefined: Self = StObject.set(x, "isDirectory", js.undefined)
      
      inline def setIsFile(value: /* file */ String => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction1(value))
      
      inline def setIsFileUndefined: Self = StObject.set(x, "isFile", js.undefined)
      
      inline def setRealpathSync(value: /* file */ String => String): Self = StObject.set(x, "realpathSync", js.Any.fromFunction1(value))
      
      inline def setRealpathSyncUndefined: Self = StObject.set(x, "realpathSync", js.undefined)
    }
  }
  
  type JSONArray = js.Array[JSONValue]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JSONObject = {[x: string] : resolve.resolve.JSONValue}
  }}}
  to avoid circular code involving: 
  - resolve.resolve.JSONArray
  - resolve.resolve.JSONObject
  - resolve.resolve.JSONValue
  - resolve.resolve.PackageJSON
  */
  trait JSONObject
    extends StObject
       with /* x */ StringDictionary[JSONValue]
  object JSONObject {
    
    inline def apply(): JSONObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONObject]
    }
  }
  
  // https://github.com/Microsoft/TypeScript/issues/3496#issuecomment-128553540
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JSONValue = string | number | boolean | resolve.resolve.JSONObject | resolve.resolve.JSONArray
  }}}
  to avoid circular code involving: 
  - resolve.resolve.JSONArray
  - resolve.resolve.JSONValue
  */
  type JSONValue = String | Double | Boolean | JSONObject | Any
  
  trait Opts extends StObject {
    
    /** package.json data applicable to the module being loaded */
    @JSName("package")
    var _package: js.UndefOr[Any] = js.undefined
    
    /** directory to begin resolving from (defaults to __dirname) */
    var basedir: js.UndefOr[String] = js.undefined
    
    /** array of file extensions to search in order (defaults to ['.js']) */
    var extensions: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** set to false to exclude node core modules (e.g. fs) from the search */
    var includeCoreModules: js.UndefOr[Boolean] = js.undefined
    
    /** directory (or directories) in which to recursively look for modules. (default to 'node_modules') */
    var moduleDirectory: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** transform the parsed package.json contents before looking at the "main" field */
    var packageFilter: js.UndefOr[
        js.Function3[/* pkg */ PackageJSON, /* pkgFile */ String, /* dir */ String, PackageJSON]
      ] = js.undefined
    
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
        js.Function3[/* pkg */ PackageJSON, /* path */ String, /* relativePath */ String, String]
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Opts] (val x: Self) extends AnyVal {
      
      inline def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      inline def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
      
      inline def setExtensions(value: String | js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setIncludeCoreModules(value: Boolean): Self = StObject.set(x, "includeCoreModules", value.asInstanceOf[js.Any])
      
      inline def setIncludeCoreModulesUndefined: Self = StObject.set(x, "includeCoreModules", js.undefined)
      
      inline def setModuleDirectory(value: String | js.Array[String]): Self = StObject.set(x, "moduleDirectory", value.asInstanceOf[js.Any])
      
      inline def setModuleDirectoryUndefined: Self = StObject.set(x, "moduleDirectory", js.undefined)
      
      inline def setModuleDirectoryVarargs(value: String*): Self = StObject.set(x, "moduleDirectory", js.Array(value*))
      
      inline def setPackageFilter(value: (/* pkg */ PackageJSON, /* pkgFile */ String, /* dir */ String) => PackageJSON): Self = StObject.set(x, "packageFilter", js.Any.fromFunction3(value))
      
      inline def setPackageFilterUndefined: Self = StObject.set(x, "packageFilter", js.undefined)
      
      inline def setPackageIterator(
        value: (/* request */ String, /* start */ String, /* getPackageCandidates */ js.Function0[js.Array[String]], Opts) => js.Array[String]
      ): Self = StObject.set(x, "packageIterator", js.Any.fromFunction4(value))
      
      inline def setPackageIteratorUndefined: Self = StObject.set(x, "packageIterator", js.undefined)
      
      inline def setPathFilter(value: (/* pkg */ PackageJSON, /* path */ String, /* relativePath */ String) => String): Self = StObject.set(x, "pathFilter", js.Any.fromFunction3(value))
      
      inline def setPathFilterUndefined: Self = StObject.set(x, "pathFilter", js.undefined)
      
      inline def setPaths(value: String | js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
      
      inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
      
      inline def set_package(value: Any): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
      
      inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
    }
  }
  
  type PackageJSON = JSONObject
  
  trait PackageMeta
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var name: String
    
    var version: String
  }
  object PackageMeta {
    
    inline def apply(name: String, version: String): PackageMeta = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageMeta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PackageMeta] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type StringOrToString = String | ToString
  
  /* Rewritten from type alias, can be one of: 
    - typings.resolve.anon.readFileSyncfilestringStr
    - typings.resolve.anon.readFileSyncneverundefine
  */
  trait SyncOpts extends StObject
  object SyncOpts {
    
    inline def readFileSyncfilestringStr(): typings.resolve.anon.readFileSyncfilestringStr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.resolve.anon.readFileSyncfilestringStr]
    }
    
    inline def readFileSyncneverundefine(): typings.resolve.anon.readFileSyncneverundefine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.resolve.anon.readFileSyncneverundefine]
    }
  }
  
  trait ToString extends StObject
  
  /**
    * Callback invoked when checking if a file or directory exists
    *
    * @param error
    * @param exists If the given file or directory exists
    */
  type existsCallback = js.Function2[/* err */ js.Error | Null, /* isFile */ js.UndefOr[Boolean], Unit]
  
  /**
    * Callback invoked when reading a file
    *
    * @param error
    * @param isFile If the given file exists
    */
  type readFileCallback = js.Function2[/* err */ js.Error | Null, /* file */ js.UndefOr[StringOrToString], Unit]
  
  /**
    * Callback invoked when reading and parsing a package.json file
    *
    * @param error
    * @param resolved Absolute path to the resolved file
    */
  type readPackageCallback = js.Function2[/* err */ js.Error | Null, /* package */ js.UndefOr[Record[String, Any]], Unit]
  
  /**
    * Callback invoked when resolving a potential symlink
    *
    * @param error
    * @param resolved Absolute path to the resolved file
    */
  type realpathCallback = js.Function2[/* err */ js.Error | Null, /* resolved */ js.UndefOr[String], Unit]
  
  /**
    * Callback invoked when resolving asynchronously
    *
    * @param error
    * @param resolved Absolute path to resolved identifier
    */
  type resolveCallback = js.Function3[
    /* err */ js.Error | Null, 
    /* resolved */ js.UndefOr[String], 
    /* pkg */ js.UndefOr[PackageMeta], 
    Unit
  ]
}
