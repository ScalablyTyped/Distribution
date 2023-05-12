package typings.readdirGlob

import typings.node.eventsMod.EventEmitter
import typings.node.fsMod.Stats
import typings.readdirGlob.readdirGlobStrings.`match`
import typings.readdirGlob.readdirGlobStrings.end
import typings.readdirGlob.readdirGlobStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(root: String, options: Options): ReaddirGlob = (^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReaddirGlob]
  
  @JSImport("readdir-glob", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("readdir-glob", "ReaddirGlob")
  @js.native
  open class ReaddirGlob protected () extends EventEmitter {
    def this(
      cwd: String,
      cb: js.Function2[/* error */ js.Error | Null, /* matches */ js.UndefOr[js.Array[Match]], Unit]
    ) = this()
    def this(
      cwd: String,
      options: Options,
      cb: js.Function2[/* error */ js.Error | Null, /* matches */ js.UndefOr[js.Array[Match]], Unit]
    ) = this()
    
    /**
      * Stop the search forever
      */
    def abort(): Unit = js.native
    
    /**
      * Boolean which is set to true when calling `abort()`. There is no way at this time to continue a glob search after aborting.
      */
    var aborted: Boolean = js.native
    
    /**
      * Emitted when an unexpected error is encountered.
      */
    @JSName("on")
    def on_end(event: end, callback: js.Function1[/* matches */ js.Array[Match], Unit]): this.type = js.native
    /**
      * When the matching is finished, this is emitted with all the matches found.
      */
    @JSName("on")
    def on_error(event: error, callback: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    /**
      * Every time a match is found, this is emitted with the specific thing that matched.
      */
    @JSName("on")
    def on_match(event: `match`, callback: js.Function1[/* match */ Match, Unit]): this.type = js.native
    
    /**
      * The options object passed in.
      */
    var options: Options = js.native
    
    /**
      * Temporarily stop the search
      */
    def pause(): Unit = js.native
    
    /**
      * Boolean which is set to true when calling `pause()`.
      */
    var paused: Boolean = js.native
    
    /**
      * Resume the search
      */
    def resume(): Unit = js.native
  }
  
  trait Match extends StObject {
    
    /**
      * absolute path of the matched file
      */
    var absolute: String
    
    /**
      * relative path of the matched file
      */
    var relative: String
    
    /**
      * stat of the matched file (only if stat:true option is used)
      */
    var stat: js.UndefOr[Stats] = js.undefined
  }
  object Match {
    
    inline def apply(absolute: String, relative: String): Match = {
      val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any])
      __obj.asInstanceOf[Match]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Match] (val x: Self) extends AnyVal {
      
      inline def setAbsolute(value: String): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setRelative(value: String): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setStat(value: Stats): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      inline def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Absolute paths will be returned instead of relative paths.
      */
    var absolute: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow pattern to match filenames starting with a period, even if the pattern does not explicitly have a period in that spot.
      */
    var dot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Follow symlinked directories. Note that requires to stat _all_ results, and so reduces performance.
      */
    var follow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Glob pattern or Array of Glob patterns to exclude matches. If a file or a folder matches at least one of the provided patterns, it's not returned.
      * It doesn't prevent files from folder content to be returned. Note: ignore patterns are always in dot:true mode.
      */
    var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Add a `/` character to directory matches.
      */
    var mark: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Perform a basename-only match if the pattern does not contain any slash characters. That is, `*.js` would be treated as equivalent to `**\/ *.js`, matching all js files in all directories.
      */
    var matchBase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Perform a case-insensitive match. Note: on case-insensitive file systems, non-magic patterns will match by default, since `stat` and `readdir` will not raise errors.
      */
    var nocase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not match directories, only files.
      */
    var nodir: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable `**` matching against multiple folder names.
      */
    var noglobstar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Glob pattern or Array of Glob patterns to match the found files with. A file has to match at least one of the provided patterns to be returned.
      */
    var pattern: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * When an unusual error is encountered when attempting to read a directory, a warning will be printed to stderr. Set the `silent` option to true to suppress these warnings.
      */
    var silent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Glob pattern or Array of Glob patterns to exclude folders.
      * If a folder matches one of the provided patterns, it's not returned, and it's not explored: this prevents any of its children to be returned.
      * Note: skip patterns are always in dot:true mode.
      */
    var skip: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Set to true to stat _all_ results. This reduces performance.
      */
    var stat: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setMark(value: Boolean): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setMatchBase(value: Boolean): Self = StObject.set(x, "matchBase", value.asInstanceOf[js.Any])
      
      inline def setMatchBaseUndefined: Self = StObject.set(x, "matchBase", js.undefined)
      
      inline def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      inline def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
      inline def setNodir(value: Boolean): Self = StObject.set(x, "nodir", value.asInstanceOf[js.Any])
      
      inline def setNodirUndefined: Self = StObject.set(x, "nodir", js.undefined)
      
      inline def setNoglobstar(value: Boolean): Self = StObject.set(x, "noglobstar", value.asInstanceOf[js.Any])
      
      inline def setNoglobstarUndefined: Self = StObject.set(x, "noglobstar", js.undefined)
      
      inline def setPattern(value: String | js.Array[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPatternVarargs(value: String*): Self = StObject.set(x, "pattern", js.Array(value*))
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setSkip(value: String | js.Array[String]): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setSkipVarargs(value: String*): Self = StObject.set(x, "skip", js.Array(value*))
      
      inline def setStat(value: Boolean): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      inline def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
    }
  }
}
