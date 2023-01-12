package typings.semanticRelease

import typings.semanticRelease.mod.Commit
import typings.semanticRelease.mod.LastRelease
import typings.semanticRelease.mod.LoggerFunction
import typings.semanticRelease.mod.NextRelease
import typings.semanticRelease.mod.Release
import typings.semanticRelease.mod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Await extends StObject {
    
    def await(message: Any*): Unit
    @JSName("await")
    var await_Original: LoggerFunction
    
    def complete(message: Any*): Unit
    @JSName("complete")
    var complete_Original: LoggerFunction
    
    def debug(message: Any*): Unit
    @JSName("debug")
    var debug_Original: LoggerFunction
    
    def error(message: Any*): Unit
    @JSName("error")
    var error_Original: LoggerFunction
    
    def fatal(message: Any*): Unit
    @JSName("fatal")
    var fatal_Original: LoggerFunction
    
    def fav(message: Any*): Unit
    @JSName("fav")
    var fav_Original: LoggerFunction
    
    def info(message: Any*): Unit
    @JSName("info")
    var info_Original: LoggerFunction
    
    def log(message: Any*): Unit
    @JSName("log")
    var log_Original: LoggerFunction
    
    def note(message: Any*): Unit
    @JSName("note")
    var note_Original: LoggerFunction
    
    def pause(message: Any*): Unit
    @JSName("pause")
    var pause_Original: LoggerFunction
    
    def pending(message: Any*): Unit
    @JSName("pending")
    var pending_Original: LoggerFunction
    
    def star(message: Any*): Unit
    @JSName("star")
    var star_Original: LoggerFunction
    
    def start(message: Any*): Unit
    @JSName("start")
    var start_Original: LoggerFunction
    
    def success(message: Any*): Unit
    @JSName("success")
    var success_Original: LoggerFunction
    
    def wait(message: Any*): Unit
    @JSName("wait")
    var wait_Original: LoggerFunction
    
    def warn(message: Any*): Unit
    @JSName("warn")
    var warn_Original: LoggerFunction
    
    def watch(message: Any*): Unit
    @JSName("watch")
    var watch_Original: LoggerFunction
  }
  object Await {
    
    inline def apply(
      await: LoggerFunction,
      complete: LoggerFunction,
      debug: LoggerFunction,
      error: LoggerFunction,
      fatal: LoggerFunction,
      fav: LoggerFunction,
      info: LoggerFunction,
      log: LoggerFunction,
      note: LoggerFunction,
      pause: LoggerFunction,
      pending: LoggerFunction,
      star: LoggerFunction,
      start: LoggerFunction,
      success: LoggerFunction,
      wait_ : LoggerFunction,
      warn: LoggerFunction,
      watch: LoggerFunction
    ): Await = {
      val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], fav = fav.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], star = star.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any])
      __obj.updateDynamic("wait")(wait_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Await]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Await] (val x: Self) extends AnyVal {
      
      inline def setAwait(value: LoggerFunction): Self = StObject.set(x, "await", value.asInstanceOf[js.Any])
      
      inline def setComplete(value: LoggerFunction): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: LoggerFunction): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setError(value: LoggerFunction): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFatal(value: LoggerFunction): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      inline def setFav(value: LoggerFunction): Self = StObject.set(x, "fav", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: LoggerFunction): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setLog(value: LoggerFunction): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setNote(value: LoggerFunction): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
      
      inline def setPause(value: LoggerFunction): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      inline def setPending(value: LoggerFunction): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setStar(value: LoggerFunction): Self = StObject.set(x, "star", value.asInstanceOf[js.Any])
      
      inline def setStart(value: LoggerFunction): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: LoggerFunction): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setWait_(value: LoggerFunction): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: LoggerFunction): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      inline def setWatch(value: LoggerFunction): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    }
  }
  
  trait Commits
    extends StObject
       with Result {
    
    /**
      * The list of commits included in the new release.
      */
    var commits: js.Array[Commit]
    
    /**
      * Information related to the last release found.
      */
    var lastRelease: LastRelease
    
    /**
      * Information related to the newly published release.
      */
    var nextRelease: NextRelease
    
    /**
      * The list of releases published, one release per publish plugin.
      */
    var releases: js.Array[Release]
  }
  object Commits {
    
    inline def apply(
      commits: js.Array[Commit],
      lastRelease: LastRelease,
      nextRelease: NextRelease,
      releases: js.Array[Release]
    ): Commits = {
      val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], lastRelease = lastRelease.asInstanceOf[js.Any], nextRelease = nextRelease.asInstanceOf[js.Any], releases = releases.asInstanceOf[js.Any])
      __obj.asInstanceOf[Commits]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Commits] (val x: Self) extends AnyVal {
      
      inline def setCommits(value: js.Array[Commit]): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
      
      inline def setCommitsVarargs(value: Commit*): Self = StObject.set(x, "commits", js.Array(value*))
      
      inline def setLastRelease(value: LastRelease): Self = StObject.set(x, "lastRelease", value.asInstanceOf[js.Any])
      
      inline def setNextRelease(value: NextRelease): Self = StObject.set(x, "nextRelease", value.asInstanceOf[js.Any])
      
      inline def setReleases(value: js.Array[Release]): Self = StObject.set(x, "releases", value.asInstanceOf[js.Any])
      
      inline def setReleasesVarargs(value: Release*): Self = StObject.set(x, "releases", js.Array(value*))
    }
  }
  
  trait Email extends StObject {
    
    /**
      * The committer email.
      */
    var email: String
    
    /**
      * The committer name.
      */
    var name: String
    
    /**
      * The committer date.
      */
    var short: String
  }
  object Email {
    
    inline def apply(email: String, name: String, short: String): Email = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    }
  }
  
  trait Long extends StObject {
    
    /**
      * The commit tree hash.
      */
    var long: String
    
    /**
      * The commit abbreviated tree hash.
      */
    var short: String
  }
  object Long {
    
    inline def apply(long: String, short: String): Long = {
      val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
      __obj.asInstanceOf[Long]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Long] (val x: Self) extends AnyVal {
      
      inline def setLong(value: String): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    }
  }
}
