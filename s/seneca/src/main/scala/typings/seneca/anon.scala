package typings.seneca

import typings.seneca.mod.LogLevel
import typings.seneca.mod.UnknownType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Act extends StObject {
    
    var act: js.UndefOr[Boolean] = js.undefined
    
    var stack: js.UndefOr[Boolean] = js.undefined
    
    var unknown: js.UndefOr[String] = js.undefined
  }
  object Act {
    
    inline def apply(): Act = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Act]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Act] (val x: Self) extends AnyVal {
      
      inline def setAct(value: Boolean): Self = StObject.set(x, "act", value.asInstanceOf[js.Any])
      
      inline def setActUndefined: Self = StObject.set(x, "act", js.undefined)
      
      inline def setStack(value: Boolean): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      inline def setUnknown(value: String): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
      
      inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
  
  trait Actcaller extends StObject {
    
    // Trace action caller and place in args.caller$.
    var act_caller: js.UndefOr[Boolean] = js.undefined
    
    // Record and log callpoints (calling code locations).
    var callpoint: js.UndefOr[Boolean] = js.undefined
    
    // Throw (some) errors from seneca.act.
    var fragile: js.UndefOr[Boolean] = js.undefined
    
    // Print debug info to console
    var print: js.UndefOr[Options] = js.undefined
    
    // Shorten all identifiers to 2 characters.
    var short_logs: js.UndefOr[Boolean] = js.undefined
    
    // Fatal errors ... aren't fatal. Not for production!
    var undead: js.UndefOr[Boolean] = js.undefined
  }
  object Actcaller {
    
    inline def apply(): Actcaller = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Actcaller]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Actcaller] (val x: Self) extends AnyVal {
      
      inline def setAct_caller(value: Boolean): Self = StObject.set(x, "act_caller", value.asInstanceOf[js.Any])
      
      inline def setAct_callerUndefined: Self = StObject.set(x, "act_caller", js.undefined)
      
      inline def setCallpoint(value: Boolean): Self = StObject.set(x, "callpoint", value.asInstanceOf[js.Any])
      
      inline def setCallpointUndefined: Self = StObject.set(x, "callpoint", js.undefined)
      
      inline def setFragile(value: Boolean): Self = StObject.set(x, "fragile", value.asInstanceOf[js.Any])
      
      inline def setFragileUndefined: Self = StObject.set(x, "fragile", js.undefined)
      
      inline def setPrint(value: Options): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
      
      inline def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
      
      inline def setShort_logs(value: Boolean): Self = StObject.set(x, "short_logs", value.asInstanceOf[js.Any])
      
      inline def setShort_logsUndefined: Self = StObject.set(x, "short_logs", js.undefined)
      
      inline def setUndead(value: Boolean): Self = StObject.set(x, "undead", value.asInstanceOf[js.Any])
      
      inline def setUndeadUndefined: Self = StObject.set(x, "undead", js.undefined)
    }
  }
  
  trait Active extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object Active {
    
    inline def apply(): Active = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Active]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait Actrouter extends StObject {
    
    var actrouter: js.UndefOr[UnknownType] = js.undefined
    
    var clientrouter: js.UndefOr[UnknownType] = js.undefined
    
    // Close instance on these signals, if true.
    var close_signals: js.UndefOr[SIGBREAK] = js.undefined
    
    var subrouter: js.UndefOr[UnknownType] = js.undefined
  }
  object Actrouter {
    
    inline def apply(): Actrouter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Actrouter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Actrouter] (val x: Self) extends AnyVal {
      
      inline def setActrouter(value: UnknownType): Self = StObject.set(x, "actrouter", value.asInstanceOf[js.Any])
      
      inline def setActrouterUndefined: Self = StObject.set(x, "actrouter", js.undefined)
      
      inline def setClientrouter(value: UnknownType): Self = StObject.set(x, "clientrouter", value.asInstanceOf[js.Any])
      
      inline def setClientrouterUndefined: Self = StObject.set(x, "clientrouter", js.undefined)
      
      inline def setClose_signals(value: SIGBREAK): Self = StObject.set(x, "close_signals", value.asInstanceOf[js.Any])
      
      inline def setClose_signalsUndefined: Self = StObject.set(x, "close_signals", js.undefined)
      
      inline def setSubrouter(value: UnknownType): Self = StObject.set(x, "subrouter", value.asInstanceOf[js.Any])
      
      inline def setSubrouterUndefined: Self = StObject.set(x, "subrouter", js.undefined)
    }
  }
  
  trait Add extends StObject {
    
    // Adding a pattern overrides existing pattern only if matches exactly.
    var add: js.UndefOr[Boolean] = js.undefined
    
    // Delegate fixedargs override action args.
    var fixedargs: js.UndefOr[Boolean] = js.undefined
    
    // Action result must be a plain object.
    var result: js.UndefOr[Boolean] = js.undefined
  }
  object Add {
    
    inline def apply(): Add = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Add]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Add] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setFixedargs(value: Boolean): Self = StObject.set(x, "fixedargs", value.asInstanceOf[js.Any])
      
      inline def setFixedargsUndefined: Self = StObject.set(x, "fixedargs", js.undefined)
      
      inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  trait Basic extends StObject {
    
    var basic: js.UndefOr[Boolean] = js.undefined
    
    var `mem-store`: js.UndefOr[Boolean] = js.undefined
    
    var transport: js.UndefOr[Boolean] = js.undefined
    
    var web: js.UndefOr[Boolean] = js.undefined
  }
  object Basic {
    
    inline def apply(): Basic = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Basic]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Basic] (val x: Self) extends AnyVal {
      
      inline def setBasic(value: Boolean): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      inline def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
      
      inline def `setMem-store`(value: Boolean): Self = StObject.set(x, "mem-store", value.asInstanceOf[js.Any])
      
      inline def `setMem-storeUndefined`: Self = StObject.set(x, "mem-store", js.undefined)
      
      inline def setTransport(value: Boolean): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
      
      inline def setWeb(value: Boolean): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
      
      inline def setWebUndefined: Self = StObject.set(x, "web", js.undefined)
    }
  }
  
  trait Host extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
  }
  object Host {
    
    inline def apply(): Host = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  trait Interval extends StObject {
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var running: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object Interval {
    
    inline def apply(): Interval = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Interval]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Interval] (val x: Self) extends AnyVal {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
      
      inline def setRunningUndefined: Self = StObject.set(x, "running", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait Level extends StObject {
    
    var level: js.UndefOr[LogLevel] = js.undefined
    
    var short: js.UndefOr[Boolean] = js.undefined
  }
  object Level {
    
    inline def apply(): Level = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Level]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
      
      inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setShort(value: Boolean): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    }
  }
  
  trait Local extends StObject {
    
    var local: js.UndefOr[Boolean] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object Local {
    
    inline def apply(): Local = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Local]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Local] (val x: Self) extends AnyVal {
      
      inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    // Print options. Best used via --seneca.print.options.
    var options: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setOptions(value: Boolean): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait Running extends StObject {
    
    var interval: js.UndefOr[Double] = js.undefined
    
    // By default, does not run.
    var running: js.UndefOr[Boolean] = js.undefined
  }
  object Running {
    
    inline def apply(): Running = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Running]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Running] (val x: Self) extends AnyVal {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
      
      inline def setRunningUndefined: Self = StObject.set(x, "running", js.undefined)
    }
  }
  
  trait SIGBREAK extends StObject {
    
    var SIGBREAK: js.UndefOr[Boolean] = js.undefined
    
    var SIGHUP: js.UndefOr[Boolean] = js.undefined
    
    var SIGINT: js.UndefOr[Boolean] = js.undefined
    
    var SIGTERM: js.UndefOr[Boolean] = js.undefined
  }
  object SIGBREAK {
    
    inline def apply(): SIGBREAK = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SIGBREAK]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SIGBREAK] (val x: Self) extends AnyVal {
      
      inline def setSIGBREAK(value: Boolean): Self = StObject.set(x, "SIGBREAK", value.asInstanceOf[js.Any])
      
      inline def setSIGBREAKUndefined: Self = StObject.set(x, "SIGBREAK", js.undefined)
      
      inline def setSIGHUP(value: Boolean): Self = StObject.set(x, "SIGHUP", value.asInstanceOf[js.Any])
      
      inline def setSIGHUPUndefined: Self = StObject.set(x, "SIGHUP", js.undefined)
      
      inline def setSIGINT(value: Boolean): Self = StObject.set(x, "SIGINT", value.asInstanceOf[js.Any])
      
      inline def setSIGINTUndefined: Self = StObject.set(x, "SIGINT", js.undefined)
      
      inline def setSIGTERM(value: Boolean): Self = StObject.set(x, "SIGTERM", value.asInstanceOf[js.Any])
      
      inline def setSIGTERMUndefined: Self = StObject.set(x, "SIGTERM", js.undefined)
    }
  }
}
