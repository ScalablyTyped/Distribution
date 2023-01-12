package typings.signale

import typings.signale.mod.DefaultMethods
import typings.signale.mod.LoggerFunc
import typings.signale.mod.Signale
import typings.signale.mod.SignaleConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Label extends StObject {
    
    var label: String
    
    var span: js.UndefOr[Double] = js.undefined
  }
  object Label {
    
    inline def apply(label: String): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    }
  }
  
  /* Inlined std.Record<signale.signale.DefaultMethods, signale.signale.LoggerFunc> */
  trait RecordDefaultMethodsLogge extends StObject {
    
    def await(message: Any, optionalArgs: Any*): Unit
    def await(message: Unit, optionalArgs: Any*): Unit
    @JSName("await")
    var await_Original: LoggerFunc
    
    def complete(message: Any, optionalArgs: Any*): Unit
    def complete(message: Unit, optionalArgs: Any*): Unit
    @JSName("complete")
    var complete_Original: LoggerFunc
    
    def debug(message: Any, optionalArgs: Any*): Unit
    def debug(message: Unit, optionalArgs: Any*): Unit
    @JSName("debug")
    var debug_Original: LoggerFunc
    
    def error(message: Any, optionalArgs: Any*): Unit
    def error(message: Unit, optionalArgs: Any*): Unit
    @JSName("error")
    var error_Original: LoggerFunc
    
    def fatal(message: Any, optionalArgs: Any*): Unit
    def fatal(message: Unit, optionalArgs: Any*): Unit
    @JSName("fatal")
    var fatal_Original: LoggerFunc
    
    def fav(message: Any, optionalArgs: Any*): Unit
    def fav(message: Unit, optionalArgs: Any*): Unit
    @JSName("fav")
    var fav_Original: LoggerFunc
    
    def info(message: Any, optionalArgs: Any*): Unit
    def info(message: Unit, optionalArgs: Any*): Unit
    @JSName("info")
    var info_Original: LoggerFunc
    
    def log(message: Any, optionalArgs: Any*): Unit
    def log(message: Unit, optionalArgs: Any*): Unit
    @JSName("log")
    var log_Original: LoggerFunc
    
    def note(message: Any, optionalArgs: Any*): Unit
    def note(message: Unit, optionalArgs: Any*): Unit
    @JSName("note")
    var note_Original: LoggerFunc
    
    def pause(message: Any, optionalArgs: Any*): Unit
    def pause(message: Unit, optionalArgs: Any*): Unit
    @JSName("pause")
    var pause_Original: LoggerFunc
    
    def pending(message: Any, optionalArgs: Any*): Unit
    def pending(message: Unit, optionalArgs: Any*): Unit
    @JSName("pending")
    var pending_Original: LoggerFunc
    
    def star(message: Any, optionalArgs: Any*): Unit
    def star(message: Unit, optionalArgs: Any*): Unit
    @JSName("star")
    var star_Original: LoggerFunc
    
    def start(message: Any, optionalArgs: Any*): Unit
    def start(message: Unit, optionalArgs: Any*): Unit
    @JSName("start")
    var start_Original: LoggerFunc
    
    def success(message: Any, optionalArgs: Any*): Unit
    def success(message: Unit, optionalArgs: Any*): Unit
    @JSName("success")
    var success_Original: LoggerFunc
    
    def warn(message: Any, optionalArgs: Any*): Unit
    def warn(message: Unit, optionalArgs: Any*): Unit
    @JSName("warn")
    var warn_Original: LoggerFunc
    
    def watch(message: Any, optionalArgs: Any*): Unit
    def watch(message: Unit, optionalArgs: Any*): Unit
    @JSName("watch")
    var watch_Original: LoggerFunc
  }
  object RecordDefaultMethodsLogge {
    
    inline def apply(
      await: LoggerFunc,
      complete: LoggerFunc,
      debug: LoggerFunc,
      error: LoggerFunc,
      fatal: LoggerFunc,
      fav: LoggerFunc,
      info: LoggerFunc,
      log: LoggerFunc,
      note: LoggerFunc,
      pause: LoggerFunc,
      pending: LoggerFunc,
      star: LoggerFunc,
      start: LoggerFunc,
      success: LoggerFunc,
      warn: LoggerFunc,
      watch: LoggerFunc
    ): RecordDefaultMethodsLogge = {
      val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], fav = fav.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], star = star.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordDefaultMethodsLogge]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecordDefaultMethodsLogge] (val x: Self) extends AnyVal {
      
      inline def setAwait(value: LoggerFunc): Self = StObject.set(x, "await", value.asInstanceOf[js.Any])
      
      inline def setComplete(value: LoggerFunc): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: LoggerFunc): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setError(value: LoggerFunc): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFatal(value: LoggerFunc): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      inline def setFav(value: LoggerFunc): Self = StObject.set(x, "fav", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: LoggerFunc): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setLog(value: LoggerFunc): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setNote(value: LoggerFunc): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
      
      inline def setPause(value: LoggerFunc): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      inline def setPending(value: LoggerFunc): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setStar(value: LoggerFunc): Self = StObject.set(x, "star", value.asInstanceOf[js.Any])
      
      inline def setStart(value: LoggerFunc): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: LoggerFunc): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: LoggerFunc): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      inline def setWatch(value: LoggerFunc): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined signale.signale.Signale<signale.signale.DefaultMethods> */
  @js.native
  trait SignaleDefaultMethods extends StObject {
    
    /**
      * Adds new secrets/sensitive-information to the targeted Signale instance.
      *
      * @param secrets Array holding the secrets/sensitive-information to be filtered out.
      */
    def addSecrets(secrets: js.Array[Double | String]): Unit = js.native
    
    def await(message: Any, optionalArgs: Any*): Unit = js.native
    def await(message: Unit, optionalArgs: Any*): Unit = js.native
    @JSName("await")
    var await_Original: LoggerFunc = js.native
    
    /**
      * Removes all secrets/sensitive-information from the targeted Signale instance.
      */
    def clearSecrets(): Unit = js.native
    
    def complete(message: Any, optionalArgs: Any*): Unit = js.native
    def complete(message: Unit, optionalArgs: Any*): Unit = js.native
    @JSName("complete")
    var complete_Original: LoggerFunc = js.native
    
    /**
      * Sets the configuration of an instance overriding any existing global or local configuration.
      *
      * @param configObj Can hold any of the documented options.
      */
    def config(configObj: SignaleConfig): Signale[DefaultMethods] = js.native
    
    def debug(message: Any, optionalArgs: Any*): Unit = js.native
    def debug(message: Unit, optionalArgs: Any*): Unit = js.native
    @JSName("debug")
    var debug_Original: LoggerFunc = js.native
    
    /**
      * Disables the logging functionality of all loggers belonging to a specific instance.
      */
    def disable(): Unit = js.native
    
    /**
      * Enables the logging functionality of all loggers belonging to a specific instance.
      */
    def enable(): Unit = js.native
    
    def error(message: Any, optionalArgs: Any*): Unit = js.native
    def error(message: Unit, optionalArgs: Any*): Unit = js.native
    @JSName("error")
    var error_Original: LoggerFunc = js.native
    
    def fatal(message: Any, optionalArgs: Any*): Unit = js.native
    def fatal(message: Unit, optionalArgs: Any*): Unit = js.native
    @JSName("fatal")
    var fatal_Original: LoggerFunc = js.native
    
    def fav(message: Any, optionalArgs: Any*): Unit = js.native
    def fav(message: Unit, optionalArgs: Any*): Unit = js.native
    @JSName("fav")
    var fav_Original: LoggerFunc = js.native
    
    def info(message: Any, optionalArgs: Any*): Unit = js.native
    def info(message: Unit, optionalArgs: Any*): Unit = js.native
    @JSName("info")
    var info_Original: LoggerFunc = js.native
    
    /**
      * Checks whether the logging functionality of a specific instance is enabled.
      *
      * @returns a boolean that describes whether or not the logger is enabled.
      */
    def isEnabled(): Boolean = js.native
    
    def log(message: Any, optionalArgs: Any*): Unit = js.native
    def log(message: Unit, optionalArgs: Any*): Unit = js.native
    @JSName("log")
    var log_Original: LoggerFunc = js.native
    
    def note(message: Any, optionalArgs: Any*): Unit = js.native
    def note(message: Unit, optionalArgs: Any*): Unit = js.native
    @JSName("note")
    var note_Original: LoggerFunc = js.native
    
    def pause(message: Any, optionalArgs: Any*): Unit = js.native
    def pause(message: Unit, optionalArgs: Any*): Unit = js.native
    @JSName("pause")
    var pause_Original: LoggerFunc = js.native
    
    def pending(message: Any, optionalArgs: Any*): Unit = js.native
    def pending(message: Unit, optionalArgs: Any*): Unit = js.native
    @JSName("pending")
    var pending_Original: LoggerFunc = js.native
    
    /**
      * Defines the scope name of the logger.
      *
      * @param name Can be one or more comma delimited strings.
      */
    def scope(name: String*): Signale[DefaultMethods] = js.native
    
    def star(message: Any, optionalArgs: Any*): Unit = js.native
    def star(message: Unit, optionalArgs: Any*): Unit = js.native
    @JSName("star")
    var star_Original: LoggerFunc = js.native
    
    def start(message: Any, optionalArgs: Any*): Unit = js.native
    def start(message: Unit, optionalArgs: Any*): Unit = js.native
    @JSName("start")
    var start_Original: LoggerFunc = js.native
    
    def success(message: Any, optionalArgs: Any*): Unit = js.native
    def success(message: Unit, optionalArgs: Any*): Unit = js.native
    @JSName("success")
    var success_Original: LoggerFunc = js.native
    
    /**
      * Sets a timers and accepts an optional label. If none provided the timer will receive a unique label automatically.
      *
      * @param label Label corresponding to the timer. Each timer must have its own unique label.
      * @returns a string corresponding to the timer label.
      */
    def time(): String = js.native
    def time(label: String): String = js.native
    
    /**
      * Deactivates the timer to which the given label corresponds. If no label
      * is provided the most recent timer, that was created without providing a
      * label, will be deactivated.
      *
      * @param label Label corresponding to the timer, each timer has its own unique label.
      * @param span Total running time.
      */
    def timeEnd(): Label = js.native
    def timeEnd(label: String): Label = js.native
    def timeEnd(label: String, span: Double): Label = js.native
    def timeEnd(label: Unit, span: Double): Label = js.native
    
    /** Clears the scope name of the logger. */
    def unscope(): Unit = js.native
    
    def warn(message: Any, optionalArgs: Any*): Unit = js.native
    def warn(message: Unit, optionalArgs: Any*): Unit = js.native
    @JSName("warn")
    var warn_Original: LoggerFunc = js.native
    
    def watch(message: Any, optionalArgs: Any*): Unit = js.native
    def watch(message: Unit, optionalArgs: Any*): Unit = js.native
    @JSName("watch")
    var watch_Original: LoggerFunc = js.native
  }
}
