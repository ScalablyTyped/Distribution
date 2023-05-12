package typings.rimraf

import typings.glob.distMjsGlobMod.GlobOptions
import typings.glob.distMjsIgnoreMod.IgnoreLike
import typings.node.fsMod.Dirent
import typings.node.fsMod.Mode
import typings.node.fsMod.Stats
import typings.node.processMod.global.NodeJS.Platform
import typings.rimraf.mod.RimrafAsyncOptions
import typings.rimraf.mod.RimrafSyncOptions
import typings.std.AbortSignal
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined glob.glob.GlobOptions & {  withFileTypes :false} */
  trait GlobOptionswithFileTypesf extends StObject {
    
    /**
      * Set to `true` to always receive absolute paths for
      * matched files. Set to `false` to always return relative paths.
      *
      * When this option is not set, absolute paths are returned for patterns
      * that are absolute, and otherwise paths are returned that are relative
      * to the `cwd` setting.
      *
      * This does _not_ make an extra system call to get
      * the realpath, it only does string path resolution.
      *
      * Conflicts with {@link withFileTypes}
      */
    var absolute: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to false to enable {@link windowsPathsNoEscape}
      *
      * @deprecated
      */
    var allowWindowsEscape: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The current working directory in which to search. Defaults to
      * `process.cwd()`.
      *
      * May be eiher a string path or a `file://` URL object or string.
      */
    var cwd: js.UndefOr[String | URL] = js.undefined
    
    /**
      * Just passed along to Minimatch.  Note that this makes all pattern
      * matching operations slower and *extremely* noisy.
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Include `.dot` files in normal matches and `globstar`
      * matches. Note that an explicit dot in a portion of the pattern
      * will always match dot files.
      */
    var dot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prepend all relative path strings with `./` (or `.\` on Windows).
      *
      * Without this option, returned relative paths are "bare", so instead of
      * returning `'./foo/bar'`, they are returned as `'foo/bar'`.
      *
      * Relative patterns starting with `'../'` are not prepended with `./`, even
      * if this option is set.
      */
    var dotRelative: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Follow symlinked directories when expanding `**`
      * patterns. This can result in a lot of duplicate references in
      * the presence of cyclic links, and make performance quite bad.
      *
      * By default, a `**` in a pattern will follow 1 symbolic link if
      * it is not the first item in the pattern, or none if it is the
      * first item in the pattern, following the same behavior as Bash.
      */
    var follow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An fs implementation to override some or all of the defaults.  See
      * http://npm.im/path-scurry for details about what can be overridden.
      */
    var fs: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FSOption */ Any
      ] = js.undefined
    
    /**
      * string or string[], or an object with `ignore` and `ignoreChildren`
      * methods.
      *
      * If a string or string[] is provided, then this is treated as a glob
      * pattern or array of glob patterns to exclude from matches. To ignore all
      * children within a directory, as well as the entry itself, append `'/ **'`
      * to the ignore pattern.
      *
      * **Note** `ignore` patterns are _always_ in `dot:true` mode, regardless of
      * any other settings.
      *
      * If an object is provided that has `ignored(path)` and/or
      * `childrenIgnored(path)` methods, then these methods will be called to
      * determine whether any Path is a match or if its children should be
      * traversed, respectively.
      */
    var ignore: js.UndefOr[String | js.Array[String] | IgnoreLike] = js.undefined
    
    /**
      * Treat brace expansion like `{a,b}` as a "magic" pattern. Has no
      * effect if {@link nobrace} is set.
      *
      * Only has effect on the {@link hasMagic} function.
      */
    var magicalBraces: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Add a `/` character to directory matches. Note that this requires
      * additional stat calls in some cases.
      */
    var mark: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Perform a basename-only match if the pattern does not contain any slash
      * characters. That is, `*.js` would be treated as equivalent to
      * `**\/ *.js`, matching all js files in all directories.
      */
    var matchBase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Limit the directory traversal to a given depth below the cwd.
      * Note that this does NOT prevent traversal to sibling folders,
      * root patterns, and so on. It only limits the maximum folder depth
      * that the walk will descend, relative to the cwd.
      */
    var maxDepth: js.UndefOr[Double] = js.undefined
    
    /**
      * Do not expand `{a,b}` and `{1..3}` brace sets.
      */
    var nobrace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Perform a case-insensitive match. This defaults to `true` on macOS and
      * Windows systems, and `false` on all others.
      *
      * **Note** `nocase` should only be explicitly set when it is
      * known that the filesystem's case sensitivity differs from the
      * platform default. If set `true` on case-sensitive file
      * systems, or `false` on case-insensitive file systems, then the
      * walk may return more or less results than expected.
      */
    var nocase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not match directories, only files. (Note: to match
      * _only_ directories, put a `/` at the end of the pattern.)
      */
    var nodir: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not match "extglob" patterns such as `+(a|b)`.
      */
    var noext: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not match `**` against multiple filenames. (Ie, treat it as a normal
      * `*` instead.)
      *
      * Conflicts with {@link matchBase}
      */
    var noglobstar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defaults to value of `process.platform` if available, or `'linux'` if
      * not. Setting `platform:'win32'` on non-Windows systems may cause strange
      * behavior.
      */
    var platform: js.UndefOr[Platform] = js.undefined
    
    /**
      * Return `/` delimited paths, even on Windows.
      *
      * On posix systems, this has no effect.  But, on Windows, it means that
      * paths will be `/` delimited, and absolute paths will be their full
      * resolved UNC forms, eg instead of `'C:\\foo\\bar'`, it would return
      * `'//?/C:/foo/bar'`
      */
    var posix: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to true to call `fs.realpath` on all of the
      * results. In the case of an entry that cannot be resolved, the
      * entry is omitted. This incurs a slight performance penalty, of
      * course, because of the added system calls.
      */
    var realpath: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * A string path resolved against the `cwd` option, which
      * is used as the starting point for absolute patterns that start
      * with `/`, (but not drive letters or UNC paths on Windows).
      *
      * Note that this _doesn't_ necessarily limit the walk to the
      * `root` directory, and doesn't affect the cwd starting point for
      * non-absolute patterns. A pattern containing `..` will still be
      * able to traverse out of the root directory, if it is not an
      * actual root directory on the filesystem, and any non-absolute
      * patterns will be matched in the `cwd`. For example, the
      * pattern `/../ *` with `{root:'/some/path'}` will return all
      * files in `/some`, not all files in `/some/path`. The pattern
      * `*` with `{root:'/some/path'}` will return all the entries in
      * the cwd, not the entries in `/some/path`.
      *
      * To start absolute and non-absolute patterns in the same
      * path, you can use `{root:''}`. However, be aware that on
      * Windows systems, a pattern like `x:/ *` or `//host/share/ *` will
      * _always_ start in the `x:/` or `//host/share` directory,
      * regardless of the `root` setting.
      */
    var root: js.UndefOr[String] = js.undefined
    
    /**
      * A [PathScurry](http://npm.im/path-scurry) object used
      * to traverse the file system. If the `nocase` option is set
      * explicitly, then any provided `scurry` object must match this
      * setting.
      */
    var scurry: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PathScurry */ Any
      ] = js.undefined
    
    /**
      * An AbortSignal which will cancel the Glob walk when
      * triggered.
      */
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Call `lstat()` on all entries, whether required or not to determine
      * if it's a valid match. When used with {@link withFileTypes}, this means
      * that matches will include data such as modified time, permissions, and
      * so on.  Note that this will incur a performance cost due to the added
      * system calls.
      */
    var stat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use `\\` as a path separator _only_, and
      *  _never_ as an escape character. If set, all `\\` characters are
      *  replaced with `/` in the pattern.
      *
      *  Note that this makes it **impossible** to match against paths
      *  containing literal glob pattern characters, but allows matching
      *  with patterns constructed using `path.join()` and
      *  `path.resolve()` on Windows platforms, mimicking the (buggy!)
      *  behavior of Glob v7 and before on Windows. Please use with
      *  caution, and be mindful of [the caveat below about Windows
      *  paths](#windows). (For legacy reasons, this is also set if
      *  `allowWindowsEscape` is set to the exact value `false`.)
      */
    var windowsPathsNoEscape: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Return [PathScurry](http://npm.im/path-scurry)
      * `Path` objects instead of strings. These are similar to a
      * NodeJS `Dirent` object, but with additional methods and
      * properties.
      *
      * Conflicts with {@link absolute}
      */
    var withFileTypes: js.UndefOr[Boolean] = js.undefined
  }
  object GlobOptionswithFileTypesf {
    
    inline def apply(): GlobOptionswithFileTypesf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobOptionswithFileTypesf]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobOptionswithFileTypesf] (val x: Self) extends AnyVal {
      
      inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      inline def setAllowWindowsEscape(value: Boolean): Self = StObject.set(x, "allowWindowsEscape", value.asInstanceOf[js.Any])
      
      inline def setAllowWindowsEscapeUndefined: Self = StObject.set(x, "allowWindowsEscape", js.undefined)
      
      inline def setCwd(value: String | URL): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotRelative(value: Boolean): Self = StObject.set(x, "dotRelative", value.asInstanceOf[js.Any])
      
      inline def setDotRelativeUndefined: Self = StObject.set(x, "dotRelative", js.undefined)
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setFs(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FSOption */ Any
      ): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setIgnore(value: String | js.Array[String] | IgnoreLike): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setMagicalBraces(value: Boolean): Self = StObject.set(x, "magicalBraces", value.asInstanceOf[js.Any])
      
      inline def setMagicalBracesUndefined: Self = StObject.set(x, "magicalBraces", js.undefined)
      
      inline def setMark(value: Boolean): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setMatchBase(value: Boolean): Self = StObject.set(x, "matchBase", value.asInstanceOf[js.Any])
      
      inline def setMatchBaseUndefined: Self = StObject.set(x, "matchBase", js.undefined)
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      inline def setNobrace(value: Boolean): Self = StObject.set(x, "nobrace", value.asInstanceOf[js.Any])
      
      inline def setNobraceUndefined: Self = StObject.set(x, "nobrace", js.undefined)
      
      inline def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      inline def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
      inline def setNodir(value: Boolean): Self = StObject.set(x, "nodir", value.asInstanceOf[js.Any])
      
      inline def setNodirUndefined: Self = StObject.set(x, "nodir", js.undefined)
      
      inline def setNoext(value: Boolean): Self = StObject.set(x, "noext", value.asInstanceOf[js.Any])
      
      inline def setNoextUndefined: Self = StObject.set(x, "noext", js.undefined)
      
      inline def setNoglobstar(value: Boolean): Self = StObject.set(x, "noglobstar", value.asInstanceOf[js.Any])
      
      inline def setNoglobstarUndefined: Self = StObject.set(x, "noglobstar", js.undefined)
      
      inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setPosix(value: Boolean): Self = StObject.set(x, "posix", value.asInstanceOf[js.Any])
      
      inline def setPosixUndefined: Self = StObject.set(x, "posix", js.undefined)
      
      inline def setRealpath(value: Boolean): Self = StObject.set(x, "realpath", value.asInstanceOf[js.Any])
      
      inline def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setScurry(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PathScurry */ Any
      ): Self = StObject.set(x, "scurry", value.asInstanceOf[js.Any])
      
      inline def setScurryUndefined: Self = StObject.set(x, "scurry", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setStat(value: Boolean): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      inline def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
      
      inline def setWindowsPathsNoEscape(value: Boolean): Self = StObject.set(x, "windowsPathsNoEscape", value.asInstanceOf[js.Any])
      
      inline def setWindowsPathsNoEscapeUndefined: Self = StObject.set(x, "windowsPathsNoEscape", js.undefined)
      
      inline def setWithFileTypes(value: Boolean): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
      
      inline def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
    }
  }
  
  /* Inlined node.fs.MakeDirectoryOptions & {  recursive :boolean | null | undefined} */
  trait MakeDirectoryOptionsrecur extends StObject {
    
    /**
      * A file mode. If a string is passed, it is parsed as an octal integer. If not specified
      * @default 0o777
      */
    var mode: js.UndefOr[Mode] = js.undefined
    
    /**
      * Indicates whether parent folders should be created.
      * If a folder was created, the path to the first created folder will be returned.
      * @default false
      */
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object MakeDirectoryOptionsrecur {
    
    inline def apply(): MakeDirectoryOptionsrecur = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MakeDirectoryOptionsrecur]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MakeDirectoryOptionsrecur] (val x: Self) extends AnyVal {
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
  
  @js.native
  trait Manual extends StObject {
    
    def manual(path: String): js.Promise[Boolean] = js.native
    def manual(path: String, opt: RimrafAsyncOptions): js.Promise[Boolean] = js.native
    def manual(path: js.Array[String]): js.Promise[Boolean] = js.native
    def manual(path: js.Array[String], opt: RimrafAsyncOptions): js.Promise[Boolean] = js.native
    
    def manualSync(path: String): Boolean = js.native
    def manualSync(path: String, opt: RimrafSyncOptions): Boolean = js.native
    def manualSync(path: js.Array[String]): Boolean = js.native
    def manualSync(path: js.Array[String], opt: RimrafSyncOptions): Boolean = js.native
    
    @JSName("manual")
    var manual_Original: (js.Function2[
        /* path */ String | js.Array[String], 
        /* opt */ js.UndefOr[RimrafAsyncOptions], 
        js.Promise[Boolean]
      ]) & Sync = js.native
    
    def moveRemove(path: String): js.Promise[Boolean] = js.native
    def moveRemove(path: String, opt: RimrafAsyncOptions): js.Promise[Boolean] = js.native
    def moveRemove(path: js.Array[String]): js.Promise[Boolean] = js.native
    def moveRemove(path: js.Array[String], opt: RimrafAsyncOptions): js.Promise[Boolean] = js.native
    
    def moveRemoveSync(path: String): Boolean = js.native
    def moveRemoveSync(path: String, opt: RimrafSyncOptions): Boolean = js.native
    def moveRemoveSync(path: js.Array[String]): Boolean = js.native
    def moveRemoveSync(path: js.Array[String], opt: RimrafSyncOptions): Boolean = js.native
    
    @JSName("moveRemove")
    var moveRemove_Original: (js.Function2[
        /* path */ String | js.Array[String], 
        /* opt */ js.UndefOr[RimrafAsyncOptions], 
        js.Promise[Boolean]
      ]) & Sync = js.native
    
    def native(path: String): js.Promise[Boolean] = js.native
    def native(path: String, opt: RimrafAsyncOptions): js.Promise[Boolean] = js.native
    def native(path: js.Array[String]): js.Promise[Boolean] = js.native
    def native(path: js.Array[String], opt: RimrafAsyncOptions): js.Promise[Boolean] = js.native
    
    def nativeSync(path: String): Boolean = js.native
    def nativeSync(path: String, opt: RimrafSyncOptions): Boolean = js.native
    def nativeSync(path: js.Array[String]): Boolean = js.native
    def nativeSync(path: js.Array[String], opt: RimrafSyncOptions): Boolean = js.native
    
    @JSName("native")
    var native_Original: (js.Function2[
        /* path */ String | js.Array[String], 
        /* opt */ js.UndefOr[RimrafAsyncOptions], 
        js.Promise[Boolean]
      ]) & Sync = js.native
    
    def posix(path: String): js.Promise[Boolean] = js.native
    def posix(path: String, opt: RimrafAsyncOptions): js.Promise[Boolean] = js.native
    def posix(path: js.Array[String]): js.Promise[Boolean] = js.native
    def posix(path: js.Array[String], opt: RimrafAsyncOptions): js.Promise[Boolean] = js.native
    
    def posixSync(path: String): Boolean = js.native
    def posixSync(path: String, opt: RimrafSyncOptions): Boolean = js.native
    def posixSync(path: js.Array[String]): Boolean = js.native
    def posixSync(path: js.Array[String], opt: RimrafSyncOptions): Boolean = js.native
    
    @JSName("posix")
    var posix_Original: (js.Function2[
        /* path */ String | js.Array[String], 
        /* opt */ js.UndefOr[RimrafAsyncOptions], 
        js.Promise[Boolean]
      ]) & Sync = js.native
    
    def rimraf(path: String): js.Promise[Boolean] = js.native
    def rimraf(path: String, opt: RimrafAsyncOptions): js.Promise[Boolean] = js.native
    def rimraf(path: js.Array[String]): js.Promise[Boolean] = js.native
    def rimraf(path: js.Array[String], opt: RimrafAsyncOptions): js.Promise[Boolean] = js.native
    
    def rimrafSync(path: String): Boolean = js.native
    def rimrafSync(path: String, opt: RimrafSyncOptions): Boolean = js.native
    def rimrafSync(path: js.Array[String]): Boolean = js.native
    def rimrafSync(path: js.Array[String], opt: RimrafSyncOptions): Boolean = js.native
    
    def sync(path: String): Boolean = js.native
    def sync(path: String, opt: RimrafSyncOptions): Boolean = js.native
    def sync(path: js.Array[String]): Boolean = js.native
    def sync(path: js.Array[String], opt: RimrafSyncOptions): Boolean = js.native
    
    def windows(path: String): js.Promise[Boolean] = js.native
    def windows(path: String, opt: RimrafAsyncOptions): js.Promise[Boolean] = js.native
    def windows(path: js.Array[String]): js.Promise[Boolean] = js.native
    def windows(path: js.Array[String], opt: RimrafAsyncOptions): js.Promise[Boolean] = js.native
    
    def windowsSync(path: String): Boolean = js.native
    def windowsSync(path: String, opt: RimrafSyncOptions): Boolean = js.native
    def windowsSync(path: js.Array[String]): Boolean = js.native
    def windowsSync(path: js.Array[String], opt: RimrafSyncOptions): Boolean = js.native
    
    @JSName("windows")
    var windows_Original: (js.Function2[
        /* path */ String | js.Array[String], 
        /* opt */ js.UndefOr[RimrafAsyncOptions], 
        js.Promise[Boolean]
      ]) & Sync = js.native
  }
  
  /* Inlined rimraf.rimraf.RimrafAsyncOptions & {  glob :glob.glob.GlobOptions & {  withFileTypes :false}} */
  trait RimrafAsyncOptionsglobGlo extends StObject {
    
    var backoff: js.UndefOr[Double] = js.undefined
    
    var filter: js.UndefOr[js.Function2[/* path */ String, Dirent | Stats, Boolean | js.Promise[Boolean]]] = js.undefined
    
    var glob: js.UndefOr[Boolean | GlobOptions] = js.undefined
    
    var maxBackoff: js.UndefOr[Double] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    var preserveRoot: js.UndefOr[Boolean] = js.undefined
    
    var retryDelay: js.UndefOr[Double] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    var tmp: js.UndefOr[String] = js.undefined
  }
  object RimrafAsyncOptionsglobGlo {
    
    inline def apply(): RimrafAsyncOptionsglobGlo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RimrafAsyncOptionsglobGlo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RimrafAsyncOptionsglobGlo] (val x: Self) extends AnyVal {
      
      inline def setBackoff(value: Double): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
      
      inline def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
      
      inline def setFilter(value: (/* path */ String, Dirent | Stats) => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setGlob(value: Boolean | GlobOptions): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      inline def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
      
      inline def setMaxBackoff(value: Double): Self = StObject.set(x, "maxBackoff", value.asInstanceOf[js.Any])
      
      inline def setMaxBackoffUndefined: Self = StObject.set(x, "maxBackoff", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setPreserveRoot(value: Boolean): Self = StObject.set(x, "preserveRoot", value.asInstanceOf[js.Any])
      
      inline def setPreserveRootUndefined: Self = StObject.set(x, "preserveRoot", js.undefined)
      
      inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setTmp(value: String): Self = StObject.set(x, "tmp", value.asInstanceOf[js.Any])
      
      inline def setTmpUndefined: Self = StObject.set(x, "tmp", js.undefined)
    }
  }
  
  /* Inlined rimraf.rimraf.RimrafAsyncOptions & {  glob :undefined} */
  trait RimrafAsyncOptionsglobund extends StObject {
    
    var backoff: js.UndefOr[Double] = js.undefined
    
    var filter: js.UndefOr[js.Function2[/* path */ String, Dirent | Stats, Boolean | js.Promise[Boolean]]] = js.undefined
    
    var glob: js.UndefOr[Boolean | GlobOptions] = js.undefined
    
    var maxBackoff: js.UndefOr[Double] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    var preserveRoot: js.UndefOr[Boolean] = js.undefined
    
    var retryDelay: js.UndefOr[Double] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    var tmp: js.UndefOr[String] = js.undefined
  }
  object RimrafAsyncOptionsglobund {
    
    inline def apply(): RimrafAsyncOptionsglobund = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RimrafAsyncOptionsglobund]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RimrafAsyncOptionsglobund] (val x: Self) extends AnyVal {
      
      inline def setBackoff(value: Double): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
      
      inline def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
      
      inline def setFilter(value: (/* path */ String, Dirent | Stats) => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setGlob(value: Boolean | GlobOptions): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      inline def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
      
      inline def setMaxBackoff(value: Double): Self = StObject.set(x, "maxBackoff", value.asInstanceOf[js.Any])
      
      inline def setMaxBackoffUndefined: Self = StObject.set(x, "maxBackoff", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setPreserveRoot(value: Boolean): Self = StObject.set(x, "preserveRoot", value.asInstanceOf[js.Any])
      
      inline def setPreserveRootUndefined: Self = StObject.set(x, "preserveRoot", js.undefined)
      
      inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setTmp(value: String): Self = StObject.set(x, "tmp", value.asInstanceOf[js.Any])
      
      inline def setTmpUndefined: Self = StObject.set(x, "tmp", js.undefined)
    }
  }
  
  /* Inlined rimraf.rimraf.RimrafSyncOptions & {  glob :glob.glob.GlobOptions & {  withFileTypes :false}} */
  trait RimrafSyncOptionsglobGlob extends StObject {
    
    var backoff: js.UndefOr[Double] = js.undefined
    
    var filter: js.UndefOr[js.Function2[/* path */ String, /* ent */ Dirent | Stats, Boolean]] = js.undefined
    
    var glob: js.UndefOr[Boolean | GlobOptions] = js.undefined
    
    var maxBackoff: js.UndefOr[Double] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    var preserveRoot: js.UndefOr[Boolean] = js.undefined
    
    var retryDelay: js.UndefOr[Double] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    var tmp: js.UndefOr[String] = js.undefined
  }
  object RimrafSyncOptionsglobGlob {
    
    inline def apply(): RimrafSyncOptionsglobGlob = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RimrafSyncOptionsglobGlob]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RimrafSyncOptionsglobGlob] (val x: Self) extends AnyVal {
      
      inline def setBackoff(value: Double): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
      
      inline def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
      
      inline def setFilter(value: (/* path */ String, /* ent */ Dirent | Stats) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setGlob(value: Boolean | GlobOptions): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      inline def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
      
      inline def setMaxBackoff(value: Double): Self = StObject.set(x, "maxBackoff", value.asInstanceOf[js.Any])
      
      inline def setMaxBackoffUndefined: Self = StObject.set(x, "maxBackoff", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setPreserveRoot(value: Boolean): Self = StObject.set(x, "preserveRoot", value.asInstanceOf[js.Any])
      
      inline def setPreserveRootUndefined: Self = StObject.set(x, "preserveRoot", js.undefined)
      
      inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setTmp(value: String): Self = StObject.set(x, "tmp", value.asInstanceOf[js.Any])
      
      inline def setTmpUndefined: Self = StObject.set(x, "tmp", js.undefined)
    }
  }
  
  /* Inlined rimraf.rimraf.RimrafSyncOptions & {  glob :undefined} */
  trait RimrafSyncOptionsglobunde extends StObject {
    
    var backoff: js.UndefOr[Double] = js.undefined
    
    var filter: js.UndefOr[js.Function2[/* path */ String, /* ent */ Dirent | Stats, Boolean]] = js.undefined
    
    var glob: js.UndefOr[Boolean | GlobOptions] = js.undefined
    
    var maxBackoff: js.UndefOr[Double] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    var preserveRoot: js.UndefOr[Boolean] = js.undefined
    
    var retryDelay: js.UndefOr[Double] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    var tmp: js.UndefOr[String] = js.undefined
  }
  object RimrafSyncOptionsglobunde {
    
    inline def apply(): RimrafSyncOptionsglobunde = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RimrafSyncOptionsglobunde]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RimrafSyncOptionsglobunde] (val x: Self) extends AnyVal {
      
      inline def setBackoff(value: Double): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
      
      inline def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
      
      inline def setFilter(value: (/* path */ String, /* ent */ Dirent | Stats) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setGlob(value: Boolean | GlobOptions): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      inline def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
      
      inline def setMaxBackoff(value: Double): Self = StObject.set(x, "maxBackoff", value.asInstanceOf[js.Any])
      
      inline def setMaxBackoffUndefined: Self = StObject.set(x, "maxBackoff", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setPreserveRoot(value: Boolean): Self = StObject.set(x, "preserveRoot", value.asInstanceOf[js.Any])
      
      inline def setPreserveRootUndefined: Self = StObject.set(x, "preserveRoot", js.undefined)
      
      inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setTmp(value: String): Self = StObject.set(x, "tmp", value.asInstanceOf[js.Any])
      
      inline def setTmpUndefined: Self = StObject.set(x, "tmp", js.undefined)
    }
  }
  
  @js.native
  trait Sync extends StObject {
    
    def sync(path: String): Boolean = js.native
    def sync(path: String, opt: RimrafSyncOptions): Boolean = js.native
    def sync(path: js.Array[String]): Boolean = js.native
    def sync(path: js.Array[String], opt: RimrafSyncOptions): Boolean = js.native
  }
}
