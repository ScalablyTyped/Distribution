package typings.procLog

import org.scalablytyped.runtime.Shortcut
import typings.procLog.procLogStrings.error
import typings.procLog.procLogStrings.http
import typings.procLog.procLogStrings.info
import typings.procLog.procLogStrings.notice
import typings.procLog.procLogStrings.silly
import typings.procLog.procLogStrings.verbose
import typings.procLog.procLogStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("proc-log", JSImport.Namespace)
  @js.native
  val ^ : Logger = js.native
  
  trait Logger extends StObject {
    
    /**
      * An array of strings of all log method names.
      */
    var LEVELS: js.Tuple7[error, warn, notice, info, verbose, silly, http]
    
    /**
      * Calls process.emit('log', 'error', ...args). The highest log level. For printing extremely serious errors that indicate something went wrong.
      */
    def error(args: Any*): Unit
    
    /**
      * Calls process.emit('log', 'http', ...args). Information about HTTP requests made and/or completed.
      */
    def http(args: Any*): Unit
    
    /**
      * Calls process.emit('log', 'info', ...args). Informative messages that may benefit the user, but aren't particularly important.
      */
    def info(args: Any*): Unit
    
    /**
      * Calls process.emit('log', 'notice', ...args). Notices which are important, but not necessarily dangerous or a cause for excess concern.
      */
    def notice(args: Any*): Unit
    
    /**
      * Calls process.emit('log', 'pause'). Used to tell the consumer to stop printing messages.
      */
    def pause(): Unit
    
    /**
      * Calls process.emit('log', 'resume'). Used to tell the consumer that it is ok to print messages again.
      */
    def resume(): Unit
    
    /**
      * Calls process.emit('log', 'silly', ...args). Extremely noisy excessive logging messages that are typically only useful for debugging.
      */
    def silly(args: Any*): Unit
    
    /**
      * Calls process.emit('log', 'verbose', ...args). Noisy output that is more detail that most users will care about.
      */
    def verbose(args: Any*): Unit
    
    /**
      * Calls process.emit('log', 'warn', ...args). A fairly high log level. Things that the user needs to be aware of, but which won't necessarily cause improper functioning of the system.
      */
    def warn(args: Any*): Unit
  }
  object Logger {
    
    inline def apply(
      LEVELS: js.Tuple7[error, warn, notice, info, verbose, silly, http],
      error: /* repeated */ Any => Unit,
      http: /* repeated */ Any => Unit,
      info: /* repeated */ Any => Unit,
      notice: /* repeated */ Any => Unit,
      pause: () => Unit,
      resume: () => Unit,
      silly: /* repeated */ Any => Unit,
      verbose: /* repeated */ Any => Unit,
      warn: /* repeated */ Any => Unit
    ): Logger = {
      val __obj = js.Dynamic.literal(LEVELS = LEVELS.asInstanceOf[js.Any], error = js.Any.fromFunction1(error), http = js.Any.fromFunction1(http), info = js.Any.fromFunction1(info), notice = js.Any.fromFunction1(notice), pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume), silly = js.Any.fromFunction1(silly), verbose = js.Any.fromFunction1(verbose), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      inline def setError(value: /* repeated */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setHttp(value: /* repeated */ Any => Unit): Self = StObject.set(x, "http", js.Any.fromFunction1(value))
      
      inline def setInfo(value: /* repeated */ Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setLEVELS(value: js.Tuple7[error, warn, notice, info, verbose, silly, http]): Self = StObject.set(x, "LEVELS", value.asInstanceOf[js.Any])
      
      inline def setNotice(value: /* repeated */ Any => Unit): Self = StObject.set(x, "notice", js.Any.fromFunction1(value))
      
      inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      inline def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
      
      inline def setSilly(value: /* repeated */ Any => Unit): Self = StObject.set(x, "silly", js.Any.fromFunction1(value))
      
      inline def setVerbose(value: /* repeated */ Any => Unit): Self = StObject.set(x, "verbose", js.Any.fromFunction1(value))
      
      inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Logger
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Logger = ^
}
