package typings.sdNotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sd-notify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sd-notify", "journalPrint")
  @js.native
  val journalPrint: JournalPrint_ = js.native
  
  @JSImport("sd-notify", "log")
  @js.native
  val log: Log_ = js.native
  
  inline def ready(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")().asInstanceOf[Unit]
  
  inline def sendState(args: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendState")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sendStatus(text: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendStatus")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def startWatchdogMode(interval: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startWatchdogMode")(interval.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def stopWatchdogMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopWatchdogMode")().asInstanceOf[Unit]
  
  inline def stopping(pid: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopping")(pid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def watchdog(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("watchdog")().asInstanceOf[Unit]
  
  inline def watchdogInterval(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("watchdogInterval")().asInstanceOf[Double]
  
  type JournalPrint_ = js.Function1[/* args */ js.Array[String], Unit]
  
  trait Log_ extends StObject {
    
    def alert(args: js.Array[String]): Unit
    @JSName("alert")
    var alert_Original: JournalPrint_
    
    def crit(args: js.Array[String]): Unit
    @JSName("crit")
    var crit_Original: JournalPrint_
    
    def critical(args: js.Array[String]): Unit
    @JSName("critical")
    var critical_Original: JournalPrint_
    
    def debug(args: js.Array[String]): Unit
    @JSName("debug")
    var debug_Original: JournalPrint_
    
    def emerg(args: js.Array[String]): Unit
    @JSName("emerg")
    var emerg_Original: JournalPrint_
    
    def emergency(args: js.Array[String]): Unit
    @JSName("emergency")
    var emergency_Original: JournalPrint_
    
    def err(args: js.Array[String]): Unit
    @JSName("err")
    var err_Original: JournalPrint_
    
    def error(args: js.Array[String]): Unit
    @JSName("error")
    var error_Original: JournalPrint_
    
    def info(args: js.Array[String]): Unit
    @JSName("info")
    var info_Original: JournalPrint_
    
    def notice(args: js.Array[String]): Unit
    @JSName("notice")
    var notice_Original: JournalPrint_
    
    def warn(args: js.Array[String]): Unit
    @JSName("warn")
    var warn_Original: JournalPrint_
    
    def warning(args: js.Array[String]): Unit
    @JSName("warning")
    var warning_Original: JournalPrint_
  }
  object Log_ {
    
    inline def apply(
      alert: /* args */ js.Array[String] => Unit,
      crit: /* args */ js.Array[String] => Unit,
      critical: /* args */ js.Array[String] => Unit,
      debug: /* args */ js.Array[String] => Unit,
      emerg: /* args */ js.Array[String] => Unit,
      emergency: /* args */ js.Array[String] => Unit,
      err: /* args */ js.Array[String] => Unit,
      error: /* args */ js.Array[String] => Unit,
      info: /* args */ js.Array[String] => Unit,
      notice: /* args */ js.Array[String] => Unit,
      warn: /* args */ js.Array[String] => Unit,
      warning: /* args */ js.Array[String] => Unit
    ): Log_ = {
      val __obj = js.Dynamic.literal(alert = js.Any.fromFunction1(alert), crit = js.Any.fromFunction1(crit), critical = js.Any.fromFunction1(critical), debug = js.Any.fromFunction1(debug), emerg = js.Any.fromFunction1(emerg), emergency = js.Any.fromFunction1(emergency), err = js.Any.fromFunction1(err), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), notice = js.Any.fromFunction1(notice), warn = js.Any.fromFunction1(warn), warning = js.Any.fromFunction1(warning))
      __obj.asInstanceOf[Log_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Log_] (val x: Self) extends AnyVal {
      
      inline def setAlert(value: /* args */ js.Array[String] => Unit): Self = StObject.set(x, "alert", js.Any.fromFunction1(value))
      
      inline def setCrit(value: /* args */ js.Array[String] => Unit): Self = StObject.set(x, "crit", js.Any.fromFunction1(value))
      
      inline def setCritical(value: /* args */ js.Array[String] => Unit): Self = StObject.set(x, "critical", js.Any.fromFunction1(value))
      
      inline def setDebug(value: /* args */ js.Array[String] => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setEmerg(value: /* args */ js.Array[String] => Unit): Self = StObject.set(x, "emerg", js.Any.fromFunction1(value))
      
      inline def setEmergency(value: /* args */ js.Array[String] => Unit): Self = StObject.set(x, "emergency", js.Any.fromFunction1(value))
      
      inline def setErr(value: /* args */ js.Array[String] => Unit): Self = StObject.set(x, "err", js.Any.fromFunction1(value))
      
      inline def setError(value: /* args */ js.Array[String] => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setInfo(value: /* args */ js.Array[String] => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setNotice(value: /* args */ js.Array[String] => Unit): Self = StObject.set(x, "notice", js.Any.fromFunction1(value))
      
      inline def setWarn(value: /* args */ js.Array[String] => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
      
      inline def setWarning(value: /* args */ js.Array[String] => Unit): Self = StObject.set(x, "warning", js.Any.fromFunction1(value))
    }
  }
}
