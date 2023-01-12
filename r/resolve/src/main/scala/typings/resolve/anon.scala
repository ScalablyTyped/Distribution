package typings.resolve

import typings.resolve.mod.AsyncOpts
import typings.resolve.mod.Opts
import typings.resolve.mod.PackageJSON
import typings.resolve.mod.StringOrToString
import typings.resolve.mod.SyncOpts
import typings.resolve.mod.existsCallback
import typings.resolve.mod.readFileCallback
import typings.resolve.mod.readPackageCallback
import typings.resolve.mod.realpathCallback
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {  readFileSync :(file : string): resolve.resolve.StringOrToString | undefined,   readPackageSync :never | undefined} & resolve.resolve.BaseSyncOpts */
  trait readFileSyncfilestringStr
    extends StObject
       with SyncOpts {
    
    /** package.json data applicable to the module being loaded */
    @JSName("package")
    var _package: js.UndefOr[Any] = js.undefined
    
    /** directory to begin resolving from (defaults to __dirname) */
    var basedir: js.UndefOr[String] = js.undefined
    
    /** array of file extensions to search in order (defaults to ['.js']) */
    var extensions: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** set to false to exclude node core modules (e.g. fs) from the search */
    var includeCoreModules: js.UndefOr[Boolean] = js.undefined
    
    /** function to synchronously test whether a directory exists */
    var isDirectory: js.UndefOr[js.Function1[/* directory */ String, Boolean]] = js.undefined
    
    /** function to synchronously test whether a file exists */
    var isFile: js.UndefOr[js.Function1[/* file */ String, Boolean]] = js.undefined
    
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
          /* opts */ Opts, 
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
    
    /** how to read files synchronously (defaults to fs.readFileSync) */
    var readFileSync: js.UndefOr[js.Function1[/* file */ String, StringOrToString]] = js.undefined
    
    /** function to synchronously read and parse a package.json file */
    var readPackageSync: js.UndefOr[scala.Nothing] = js.undefined
    
    /** function to synchronously resolve a potential symlink to its real path */
    var realpathSync: js.UndefOr[js.Function1[/* file */ String, String]] = js.undefined
  }
  object readFileSyncfilestringStr {
    
    inline def apply(): readFileSyncfilestringStr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[readFileSyncfilestringStr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: readFileSyncfilestringStr] (val x: Self) extends AnyVal {
      
      inline def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      inline def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
      
      inline def setExtensions(value: String | js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setIncludeCoreModules(value: Boolean): Self = StObject.set(x, "includeCoreModules", value.asInstanceOf[js.Any])
      
      inline def setIncludeCoreModulesUndefined: Self = StObject.set(x, "includeCoreModules", js.undefined)
      
      inline def setIsDirectory(value: /* directory */ String => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction1(value))
      
      inline def setIsDirectoryUndefined: Self = StObject.set(x, "isDirectory", js.undefined)
      
      inline def setIsFile(value: /* file */ String => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction1(value))
      
      inline def setIsFileUndefined: Self = StObject.set(x, "isFile", js.undefined)
      
      inline def setModuleDirectory(value: String | js.Array[String]): Self = StObject.set(x, "moduleDirectory", value.asInstanceOf[js.Any])
      
      inline def setModuleDirectoryUndefined: Self = StObject.set(x, "moduleDirectory", js.undefined)
      
      inline def setModuleDirectoryVarargs(value: String*): Self = StObject.set(x, "moduleDirectory", js.Array(value*))
      
      inline def setPackageFilter(value: (/* pkg */ PackageJSON, /* pkgFile */ String, /* dir */ String) => PackageJSON): Self = StObject.set(x, "packageFilter", js.Any.fromFunction3(value))
      
      inline def setPackageFilterUndefined: Self = StObject.set(x, "packageFilter", js.undefined)
      
      inline def setPackageIterator(
        value: (/* request */ String, /* start */ String, /* getPackageCandidates */ js.Function0[js.Array[String]], /* opts */ Opts) => js.Array[String]
      ): Self = StObject.set(x, "packageIterator", js.Any.fromFunction4(value))
      
      inline def setPackageIteratorUndefined: Self = StObject.set(x, "packageIterator", js.undefined)
      
      inline def setPathFilter(value: (/* pkg */ PackageJSON, /* path */ String, /* relativePath */ String) => String): Self = StObject.set(x, "pathFilter", js.Any.fromFunction3(value))
      
      inline def setPathFilterUndefined: Self = StObject.set(x, "pathFilter", js.undefined)
      
      inline def setPaths(value: String | js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
      
      inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
      
      inline def setReadFileSync(value: /* file */ String => StringOrToString): Self = StObject.set(x, "readFileSync", js.Any.fromFunction1(value))
      
      inline def setReadFileSyncUndefined: Self = StObject.set(x, "readFileSync", js.undefined)
      
      inline def setRealpathSync(value: /* file */ String => String): Self = StObject.set(x, "realpathSync", js.Any.fromFunction1(value))
      
      inline def setRealpathSyncUndefined: Self = StObject.set(x, "realpathSync", js.undefined)
      
      inline def set_package(value: Any): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
      
      inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
    }
  }
  
  /* Inlined {  readFileSync :never | undefined,   readPackageSync :(readFileSync : (file : string): resolve.resolve.StringOrToString, pkgfile : string): std.Record<string, unknown> | undefined | undefined} & resolve.resolve.BaseSyncOpts */
  trait readFileSyncneverundefine
    extends StObject
       with SyncOpts {
    
    /** package.json data applicable to the module being loaded */
    @JSName("package")
    var _package: js.UndefOr[Any] = js.undefined
    
    /** directory to begin resolving from (defaults to __dirname) */
    var basedir: js.UndefOr[String] = js.undefined
    
    /** array of file extensions to search in order (defaults to ['.js']) */
    var extensions: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** set to false to exclude node core modules (e.g. fs) from the search */
    var includeCoreModules: js.UndefOr[Boolean] = js.undefined
    
    /** function to synchronously test whether a directory exists */
    var isDirectory: js.UndefOr[js.Function1[/* directory */ String, Boolean]] = js.undefined
    
    /** function to synchronously test whether a file exists */
    var isFile: js.UndefOr[js.Function1[/* file */ String, Boolean]] = js.undefined
    
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
          /* opts */ Opts, 
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
    
    /** how to read files synchronously (defaults to fs.readFileSync) */
    var readFileSync: js.UndefOr[scala.Nothing] = js.undefined
    
    /** function to synchronously read and parse a package.json file */
    var readPackageSync: js.UndefOr[
        js.Function2[
          /* readFileSync */ js.Function1[/* file */ String, StringOrToString], 
          /* pkgfile */ String, 
          js.UndefOr[Record[String, Any]]
        ]
      ] = js.undefined
    
    /** function to synchronously resolve a potential symlink to its real path */
    var realpathSync: js.UndefOr[js.Function1[/* file */ String, String]] = js.undefined
  }
  object readFileSyncneverundefine {
    
    inline def apply(): readFileSyncneverundefine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[readFileSyncneverundefine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: readFileSyncneverundefine] (val x: Self) extends AnyVal {
      
      inline def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      inline def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
      
      inline def setExtensions(value: String | js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setIncludeCoreModules(value: Boolean): Self = StObject.set(x, "includeCoreModules", value.asInstanceOf[js.Any])
      
      inline def setIncludeCoreModulesUndefined: Self = StObject.set(x, "includeCoreModules", js.undefined)
      
      inline def setIsDirectory(value: /* directory */ String => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction1(value))
      
      inline def setIsDirectoryUndefined: Self = StObject.set(x, "isDirectory", js.undefined)
      
      inline def setIsFile(value: /* file */ String => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction1(value))
      
      inline def setIsFileUndefined: Self = StObject.set(x, "isFile", js.undefined)
      
      inline def setModuleDirectory(value: String | js.Array[String]): Self = StObject.set(x, "moduleDirectory", value.asInstanceOf[js.Any])
      
      inline def setModuleDirectoryUndefined: Self = StObject.set(x, "moduleDirectory", js.undefined)
      
      inline def setModuleDirectoryVarargs(value: String*): Self = StObject.set(x, "moduleDirectory", js.Array(value*))
      
      inline def setPackageFilter(value: (/* pkg */ PackageJSON, /* pkgFile */ String, /* dir */ String) => PackageJSON): Self = StObject.set(x, "packageFilter", js.Any.fromFunction3(value))
      
      inline def setPackageFilterUndefined: Self = StObject.set(x, "packageFilter", js.undefined)
      
      inline def setPackageIterator(
        value: (/* request */ String, /* start */ String, /* getPackageCandidates */ js.Function0[js.Array[String]], /* opts */ Opts) => js.Array[String]
      ): Self = StObject.set(x, "packageIterator", js.Any.fromFunction4(value))
      
      inline def setPackageIteratorUndefined: Self = StObject.set(x, "packageIterator", js.undefined)
      
      inline def setPathFilter(value: (/* pkg */ PackageJSON, /* path */ String, /* relativePath */ String) => String): Self = StObject.set(x, "pathFilter", js.Any.fromFunction3(value))
      
      inline def setPathFilterUndefined: Self = StObject.set(x, "pathFilter", js.undefined)
      
      inline def setPaths(value: String | js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
      
      inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
      
      inline def setReadPackageSync(
        value: (/* readFileSync */ js.Function1[/* file */ String, StringOrToString], /* pkgfile */ String) => js.UndefOr[Record[String, Any]]
      ): Self = StObject.set(x, "readPackageSync", js.Any.fromFunction2(value))
      
      inline def setReadPackageSyncUndefined: Self = StObject.set(x, "readPackageSync", js.undefined)
      
      inline def setRealpathSync(value: /* file */ String => String): Self = StObject.set(x, "realpathSync", js.Any.fromFunction1(value))
      
      inline def setRealpathSyncUndefined: Self = StObject.set(x, "realpathSync", js.undefined)
      
      inline def set_package(value: Any): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
      
      inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
    }
  }
  
  /* Inlined {  readFile :(file : string, cb : resolve.resolve.readFileCallback): void | undefined,   readPackage :never | undefined} & resolve.resolve.BaseAsyncOpts */
  trait readFilefilestringcbreadF
    extends StObject
       with AsyncOpts {
    
    /** package.json data applicable to the module being loaded */
    @JSName("package")
    var _package: js.UndefOr[Any] = js.undefined
    
    /** directory to begin resolving from (defaults to __dirname) */
    var basedir: js.UndefOr[String] = js.undefined
    
    /** array of file extensions to search in order (defaults to ['.js']) */
    var extensions: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** set to false to exclude node core modules (e.g. fs) from the search */
    var includeCoreModules: js.UndefOr[Boolean] = js.undefined
    
    /** function to asynchronously test whether a directory exists */
    var isDirectory: js.UndefOr[js.Function2[/* directory */ String, /* cb */ existsCallback, Unit]] = js.undefined
    
    /** function to asynchronously test whether a file exists */
    var isFile: js.UndefOr[js.Function2[/* file */ String, /* cb */ existsCallback, Unit]] = js.undefined
    
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
          /* opts */ Opts, 
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
    
    /** how to read files asynchronously (defaults to fs.readFile) */
    var readFile: js.UndefOr[js.Function2[/* file */ String, /* cb */ readFileCallback, Unit]] = js.undefined
    
    /** function to asynchronously read and parse a package.json file */
    var readPackage: js.UndefOr[scala.Nothing] = js.undefined
    
    /** function to asynchronously resolve a potential symlink to its real path */
    var realpath: js.UndefOr[js.Function2[/* file */ String, /* cb */ realpathCallback, Unit]] = js.undefined
  }
  object readFilefilestringcbreadF {
    
    inline def apply(): readFilefilestringcbreadF = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[readFilefilestringcbreadF]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: readFilefilestringcbreadF] (val x: Self) extends AnyVal {
      
      inline def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      inline def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
      
      inline def setExtensions(value: String | js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setIncludeCoreModules(value: Boolean): Self = StObject.set(x, "includeCoreModules", value.asInstanceOf[js.Any])
      
      inline def setIncludeCoreModulesUndefined: Self = StObject.set(x, "includeCoreModules", js.undefined)
      
      inline def setIsDirectory(value: (/* directory */ String, /* cb */ existsCallback) => Unit): Self = StObject.set(x, "isDirectory", js.Any.fromFunction2(value))
      
      inline def setIsDirectoryUndefined: Self = StObject.set(x, "isDirectory", js.undefined)
      
      inline def setIsFile(value: (/* file */ String, /* cb */ existsCallback) => Unit): Self = StObject.set(x, "isFile", js.Any.fromFunction2(value))
      
      inline def setIsFileUndefined: Self = StObject.set(x, "isFile", js.undefined)
      
      inline def setModuleDirectory(value: String | js.Array[String]): Self = StObject.set(x, "moduleDirectory", value.asInstanceOf[js.Any])
      
      inline def setModuleDirectoryUndefined: Self = StObject.set(x, "moduleDirectory", js.undefined)
      
      inline def setModuleDirectoryVarargs(value: String*): Self = StObject.set(x, "moduleDirectory", js.Array(value*))
      
      inline def setPackageFilter(value: (/* pkg */ PackageJSON, /* pkgFile */ String, /* dir */ String) => PackageJSON): Self = StObject.set(x, "packageFilter", js.Any.fromFunction3(value))
      
      inline def setPackageFilterUndefined: Self = StObject.set(x, "packageFilter", js.undefined)
      
      inline def setPackageIterator(
        value: (/* request */ String, /* start */ String, /* getPackageCandidates */ js.Function0[js.Array[String]], /* opts */ Opts) => js.Array[String]
      ): Self = StObject.set(x, "packageIterator", js.Any.fromFunction4(value))
      
      inline def setPackageIteratorUndefined: Self = StObject.set(x, "packageIterator", js.undefined)
      
      inline def setPathFilter(value: (/* pkg */ PackageJSON, /* path */ String, /* relativePath */ String) => String): Self = StObject.set(x, "pathFilter", js.Any.fromFunction3(value))
      
      inline def setPathFilterUndefined: Self = StObject.set(x, "pathFilter", js.undefined)
      
      inline def setPaths(value: String | js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
      
      inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
      
      inline def setReadFile(value: (/* file */ String, /* cb */ readFileCallback) => Unit): Self = StObject.set(x, "readFile", js.Any.fromFunction2(value))
      
      inline def setReadFileUndefined: Self = StObject.set(x, "readFile", js.undefined)
      
      inline def setRealpath(value: (/* file */ String, /* cb */ realpathCallback) => Unit): Self = StObject.set(x, "realpath", js.Any.fromFunction2(value))
      
      inline def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
      
      inline def set_package(value: Any): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
      
      inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
    }
  }
  
  /* Inlined {  readFile :never | undefined,   readPackage :(readFile : (file : string, cb : resolve.resolve.readFileCallback): void, pkgfile : string, cb : resolve.resolve.readPackageCallback): void | undefined} & resolve.resolve.BaseAsyncOpts */
  trait readFileneverundefinedrea
    extends StObject
       with AsyncOpts {
    
    /** package.json data applicable to the module being loaded */
    @JSName("package")
    var _package: js.UndefOr[Any] = js.undefined
    
    /** directory to begin resolving from (defaults to __dirname) */
    var basedir: js.UndefOr[String] = js.undefined
    
    /** array of file extensions to search in order (defaults to ['.js']) */
    var extensions: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** set to false to exclude node core modules (e.g. fs) from the search */
    var includeCoreModules: js.UndefOr[Boolean] = js.undefined
    
    /** function to asynchronously test whether a directory exists */
    var isDirectory: js.UndefOr[js.Function2[/* directory */ String, /* cb */ existsCallback, Unit]] = js.undefined
    
    /** function to asynchronously test whether a file exists */
    var isFile: js.UndefOr[js.Function2[/* file */ String, /* cb */ existsCallback, Unit]] = js.undefined
    
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
          /* opts */ Opts, 
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
    
    /** how to read files asynchronously (defaults to fs.readFile) */
    var readFile: js.UndefOr[scala.Nothing] = js.undefined
    
    /** function to asynchronously read and parse a package.json file */
    var readPackage: js.UndefOr[
        js.Function3[
          /* readFile */ js.Function2[/* file */ String, /* cb */ readFileCallback, Unit], 
          /* pkgfile */ String, 
          /* cb */ readPackageCallback, 
          Unit
        ]
      ] = js.undefined
    
    /** function to asynchronously resolve a potential symlink to its real path */
    var realpath: js.UndefOr[js.Function2[/* file */ String, /* cb */ realpathCallback, Unit]] = js.undefined
  }
  object readFileneverundefinedrea {
    
    inline def apply(): readFileneverundefinedrea = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[readFileneverundefinedrea]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: readFileneverundefinedrea] (val x: Self) extends AnyVal {
      
      inline def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      inline def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
      
      inline def setExtensions(value: String | js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setIncludeCoreModules(value: Boolean): Self = StObject.set(x, "includeCoreModules", value.asInstanceOf[js.Any])
      
      inline def setIncludeCoreModulesUndefined: Self = StObject.set(x, "includeCoreModules", js.undefined)
      
      inline def setIsDirectory(value: (/* directory */ String, /* cb */ existsCallback) => Unit): Self = StObject.set(x, "isDirectory", js.Any.fromFunction2(value))
      
      inline def setIsDirectoryUndefined: Self = StObject.set(x, "isDirectory", js.undefined)
      
      inline def setIsFile(value: (/* file */ String, /* cb */ existsCallback) => Unit): Self = StObject.set(x, "isFile", js.Any.fromFunction2(value))
      
      inline def setIsFileUndefined: Self = StObject.set(x, "isFile", js.undefined)
      
      inline def setModuleDirectory(value: String | js.Array[String]): Self = StObject.set(x, "moduleDirectory", value.asInstanceOf[js.Any])
      
      inline def setModuleDirectoryUndefined: Self = StObject.set(x, "moduleDirectory", js.undefined)
      
      inline def setModuleDirectoryVarargs(value: String*): Self = StObject.set(x, "moduleDirectory", js.Array(value*))
      
      inline def setPackageFilter(value: (/* pkg */ PackageJSON, /* pkgFile */ String, /* dir */ String) => PackageJSON): Self = StObject.set(x, "packageFilter", js.Any.fromFunction3(value))
      
      inline def setPackageFilterUndefined: Self = StObject.set(x, "packageFilter", js.undefined)
      
      inline def setPackageIterator(
        value: (/* request */ String, /* start */ String, /* getPackageCandidates */ js.Function0[js.Array[String]], /* opts */ Opts) => js.Array[String]
      ): Self = StObject.set(x, "packageIterator", js.Any.fromFunction4(value))
      
      inline def setPackageIteratorUndefined: Self = StObject.set(x, "packageIterator", js.undefined)
      
      inline def setPathFilter(value: (/* pkg */ PackageJSON, /* path */ String, /* relativePath */ String) => String): Self = StObject.set(x, "pathFilter", js.Any.fromFunction3(value))
      
      inline def setPathFilterUndefined: Self = StObject.set(x, "pathFilter", js.undefined)
      
      inline def setPaths(value: String | js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
      
      inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
      
      inline def setReadPackage(
        value: (/* readFile */ js.Function2[/* file */ String, /* cb */ readFileCallback, Unit], /* pkgfile */ String, /* cb */ readPackageCallback) => Unit
      ): Self = StObject.set(x, "readPackage", js.Any.fromFunction3(value))
      
      inline def setReadPackageUndefined: Self = StObject.set(x, "readPackage", js.undefined)
      
      inline def setRealpath(value: (/* file */ String, /* cb */ realpathCallback) => Unit): Self = StObject.set(x, "realpath", js.Any.fromFunction2(value))
      
      inline def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
      
      inline def set_package(value: Any): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
      
      inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
    }
  }
}
