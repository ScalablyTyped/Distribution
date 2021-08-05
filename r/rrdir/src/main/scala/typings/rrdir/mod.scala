package typings.rrdir

import org.scalablytyped.runtime.Shortcut
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rrdir", JSImport.Namespace)
  @js.native
  val ^ : typings.rrdir.mod.rrdir = js.native
  
  trait PicomatchOptions extends StObject {
    
    var basename: js.UndefOr[Boolean] = js.undefined
    
    var bash: js.UndefOr[Boolean] = js.undefined
    
    var capture: js.UndefOr[Boolean] = js.undefined
    
    var contains: js.UndefOr[Boolean] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var dot: js.UndefOr[Boolean] = js.undefined
    
    var expandRange: js.UndefOr[js.Function2[/* a */ String, /* b */ String, String]] = js.undefined
    
    var failglob: js.UndefOr[Boolean] = js.undefined
    
    var fastpaths: js.UndefOr[Boolean] = js.undefined
    
    var flags: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
    
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
    
    var keepQuotes: js.UndefOr[Boolean] = js.undefined
    
    var literalBrackets: js.UndefOr[Boolean] = js.undefined
    
    var lookbehinds: js.UndefOr[Boolean] = js.undefined
    
    var matchBase: js.UndefOr[Boolean] = js.undefined
    
    var maxLength: js.UndefOr[Boolean] = js.undefined
    
    var nobrace: js.UndefOr[Boolean] = js.undefined
    
    var nobracket: js.UndefOr[Boolean] = js.undefined
    
    var nocase: js.UndefOr[Boolean] = js.undefined
    
    var nodupes: js.UndefOr[Boolean] = js.undefined
    
    var noext: js.UndefOr[Boolean] = js.undefined
    
    var noextglob: js.UndefOr[Boolean] = js.undefined
    
    var noglobstar: js.UndefOr[Boolean] = js.undefined
    
    var nonegate: js.UndefOr[Boolean] = js.undefined
    
    var noquantifiers: js.UndefOr[Boolean] = js.undefined
    
    var onIgnore: js.UndefOr[
        js.Function4[/* glob */ js.Any, /* regex */ js.Any, /* input */ js.Any, /* output */ js.Any, Unit]
      ] = js.undefined
    
    var onMatch: js.UndefOr[
        js.Function4[/* glob */ js.Any, /* regex */ js.Any, /* input */ js.Any, /* output */ js.Any, Unit]
      ] = js.undefined
    
    var onResult: js.UndefOr[
        js.Function4[/* glob */ js.Any, /* regex */ js.Any, /* input */ js.Any, /* output */ js.Any, Unit]
      ] = js.undefined
    
    var posix: js.UndefOr[Boolean] = js.undefined
    
    var posixSlashes: js.UndefOr[Boolean] = js.undefined
    
    var prepend: js.UndefOr[Boolean] = js.undefined
    
    var regex: js.UndefOr[Boolean] = js.undefined
    
    var strictBrackets: js.UndefOr[Boolean] = js.undefined
    
    var strictSlashes: js.UndefOr[Boolean] = js.undefined
    
    var unescape: js.UndefOr[Boolean] = js.undefined
    
    var unixify: js.UndefOr[Boolean] = js.undefined
  }
  object PicomatchOptions {
    
    inline def apply(): PicomatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PicomatchOptions]
    }
    
    extension [Self <: PicomatchOptions](x: Self) {
      
      inline def setBasename(value: Boolean): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setBash(value: Boolean): Self = StObject.set(x, "bash", value.asInstanceOf[js.Any])
      
      inline def setBashUndefined: Self = StObject.set(x, "bash", js.undefined)
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setContains(value: Boolean): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setExpandRange(value: (/* a */ String, /* b */ String) => String): Self = StObject.set(x, "expandRange", js.Any.fromFunction2(value))
      
      inline def setExpandRangeUndefined: Self = StObject.set(x, "expandRange", js.undefined)
      
      inline def setFailglob(value: Boolean): Self = StObject.set(x, "failglob", value.asInstanceOf[js.Any])
      
      inline def setFailglobUndefined: Self = StObject.set(x, "failglob", js.undefined)
      
      inline def setFastpaths(value: Boolean): Self = StObject.set(x, "fastpaths", value.asInstanceOf[js.Any])
      
      inline def setFastpathsUndefined: Self = StObject.set(x, "fastpaths", js.undefined)
      
      inline def setFlags(value: Boolean): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setFormat(value: /* str */ String => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      inline def setKeepQuotes(value: Boolean): Self = StObject.set(x, "keepQuotes", value.asInstanceOf[js.Any])
      
      inline def setKeepQuotesUndefined: Self = StObject.set(x, "keepQuotes", js.undefined)
      
      inline def setLiteralBrackets(value: Boolean): Self = StObject.set(x, "literalBrackets", value.asInstanceOf[js.Any])
      
      inline def setLiteralBracketsUndefined: Self = StObject.set(x, "literalBrackets", js.undefined)
      
      inline def setLookbehinds(value: Boolean): Self = StObject.set(x, "lookbehinds", value.asInstanceOf[js.Any])
      
      inline def setLookbehindsUndefined: Self = StObject.set(x, "lookbehinds", js.undefined)
      
      inline def setMatchBase(value: Boolean): Self = StObject.set(x, "matchBase", value.asInstanceOf[js.Any])
      
      inline def setMatchBaseUndefined: Self = StObject.set(x, "matchBase", js.undefined)
      
      inline def setMaxLength(value: Boolean): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setNobrace(value: Boolean): Self = StObject.set(x, "nobrace", value.asInstanceOf[js.Any])
      
      inline def setNobraceUndefined: Self = StObject.set(x, "nobrace", js.undefined)
      
      inline def setNobracket(value: Boolean): Self = StObject.set(x, "nobracket", value.asInstanceOf[js.Any])
      
      inline def setNobracketUndefined: Self = StObject.set(x, "nobracket", js.undefined)
      
      inline def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      inline def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
      inline def setNodupes(value: Boolean): Self = StObject.set(x, "nodupes", value.asInstanceOf[js.Any])
      
      inline def setNodupesUndefined: Self = StObject.set(x, "nodupes", js.undefined)
      
      inline def setNoext(value: Boolean): Self = StObject.set(x, "noext", value.asInstanceOf[js.Any])
      
      inline def setNoextUndefined: Self = StObject.set(x, "noext", js.undefined)
      
      inline def setNoextglob(value: Boolean): Self = StObject.set(x, "noextglob", value.asInstanceOf[js.Any])
      
      inline def setNoextglobUndefined: Self = StObject.set(x, "noextglob", js.undefined)
      
      inline def setNoglobstar(value: Boolean): Self = StObject.set(x, "noglobstar", value.asInstanceOf[js.Any])
      
      inline def setNoglobstarUndefined: Self = StObject.set(x, "noglobstar", js.undefined)
      
      inline def setNonegate(value: Boolean): Self = StObject.set(x, "nonegate", value.asInstanceOf[js.Any])
      
      inline def setNonegateUndefined: Self = StObject.set(x, "nonegate", js.undefined)
      
      inline def setNoquantifiers(value: Boolean): Self = StObject.set(x, "noquantifiers", value.asInstanceOf[js.Any])
      
      inline def setNoquantifiersUndefined: Self = StObject.set(x, "noquantifiers", js.undefined)
      
      inline def setOnIgnore(value: (/* glob */ js.Any, /* regex */ js.Any, /* input */ js.Any, /* output */ js.Any) => Unit): Self = StObject.set(x, "onIgnore", js.Any.fromFunction4(value))
      
      inline def setOnIgnoreUndefined: Self = StObject.set(x, "onIgnore", js.undefined)
      
      inline def setOnMatch(value: (/* glob */ js.Any, /* regex */ js.Any, /* input */ js.Any, /* output */ js.Any) => Unit): Self = StObject.set(x, "onMatch", js.Any.fromFunction4(value))
      
      inline def setOnMatchUndefined: Self = StObject.set(x, "onMatch", js.undefined)
      
      inline def setOnResult(value: (/* glob */ js.Any, /* regex */ js.Any, /* input */ js.Any, /* output */ js.Any) => Unit): Self = StObject.set(x, "onResult", js.Any.fromFunction4(value))
      
      inline def setOnResultUndefined: Self = StObject.set(x, "onResult", js.undefined)
      
      inline def setPosix(value: Boolean): Self = StObject.set(x, "posix", value.asInstanceOf[js.Any])
      
      inline def setPosixSlashes(value: Boolean): Self = StObject.set(x, "posixSlashes", value.asInstanceOf[js.Any])
      
      inline def setPosixSlashesUndefined: Self = StObject.set(x, "posixSlashes", js.undefined)
      
      inline def setPosixUndefined: Self = StObject.set(x, "posix", js.undefined)
      
      inline def setPrepend(value: Boolean): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
      
      inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      inline def setStrictBrackets(value: Boolean): Self = StObject.set(x, "strictBrackets", value.asInstanceOf[js.Any])
      
      inline def setStrictBracketsUndefined: Self = StObject.set(x, "strictBrackets", js.undefined)
      
      inline def setStrictSlashes(value: Boolean): Self = StObject.set(x, "strictSlashes", value.asInstanceOf[js.Any])
      
      inline def setStrictSlashesUndefined: Self = StObject.set(x, "strictSlashes", js.undefined)
      
      inline def setUnescape(value: Boolean): Self = StObject.set(x, "unescape", value.asInstanceOf[js.Any])
      
      inline def setUnescapeUndefined: Self = StObject.set(x, "unescape", js.undefined)
      
      inline def setUnixify(value: Boolean): Self = StObject.set(x, "unixify", value.asInstanceOf[js.Any])
      
      inline def setUnixifyUndefined: Self = StObject.set(x, "unixify", js.undefined)
    }
  }
  
  type _To = typings.rrdir.mod.rrdir
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: typings.rrdir.mod.rrdir = ^
  
  trait entry extends StObject {
    
    var directory: js.UndefOr[Boolean] = js.undefined
    
    var err: js.UndefOr[Error] = js.undefined
    
    var path: String
    
    var stats: js.UndefOr[js.Object] = js.undefined
    
    var symlink: js.UndefOr[Boolean] = js.undefined
  }
  object entry {
    
    inline def apply(path: String): entry = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[entry]
    }
    
    extension [Self <: entry](x: Self) {
      
      inline def setDirectory(value: Boolean): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      inline def setErr(value: Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setStats(value: js.Object): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setSymlink(value: Boolean): Self = StObject.set(x, "symlink", value.asInstanceOf[js.Any])
      
      inline def setSymlinkUndefined: Self = StObject.set(x, "symlink", js.undefined)
    }
  }
  
  trait options extends StObject {
    
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var followSymlinks: js.UndefOr[Boolean] = js.undefined
    
    var include: js.UndefOr[js.Array[String]] = js.undefined
    
    var `match`: js.UndefOr[PicomatchOptions] = js.undefined
    
    var stats: js.UndefOr[Boolean] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object options {
    
    inline def apply(): options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[options]
    }
    
    extension [Self <: options](x: Self) {
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setFollowSymlinks(value: Boolean): Self = StObject.set(x, "followSymlinks", value.asInstanceOf[js.Any])
      
      inline def setFollowSymlinksUndefined: Self = StObject.set(x, "followSymlinks", js.undefined)
      
      inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      inline def setMatch(value: PicomatchOptions): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  @js.native
  trait rrdir extends StObject {
    
    def apply(dir: String): js.Promise[js.Array[entry]] = js.native
    def apply(dir: String, options: options): js.Promise[js.Array[entry]] = js.native
    
    def async(dir: String): js.Promise[js.Array[entry]] = js.native
    def async(dir: String, options: options): js.Promise[js.Array[entry]] = js.native
    
    def sync(dir: String): js.Array[entry] = js.native
    def sync(dir: String, options: options): js.Array[entry] = js.native
  }
}
