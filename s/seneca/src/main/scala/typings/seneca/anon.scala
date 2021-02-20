package typings.seneca

import typings.seneca.mod.LogLevel
import typings.seneca.mod.UnknownType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Act extends StObject {
    
    var act: js.UndefOr[Boolean] = js.native
    
    var stack: js.UndefOr[Boolean] = js.native
    
    var unknown: js.UndefOr[String] = js.native
  }
  object Act {
    
    @scala.inline
    def apply(): Act = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Act]
    }
    
    @scala.inline
    implicit class ActMutableBuilder[Self <: Act] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAct(value: Boolean): Self = StObject.set(x, "act", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActUndefined: Self = StObject.set(x, "act", js.undefined)
      
      @scala.inline
      def setStack(value: Boolean): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      @scala.inline
      def setUnknown(value: String): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
  
  @js.native
  trait Actcaller extends StObject {
    
    // Trace action caller and place in args.caller$.
    var act_caller: js.UndefOr[Boolean] = js.native
    
    // Record and log callpoints (calling code locations).
    var callpoint: js.UndefOr[Boolean] = js.native
    
    // Throw (some) errors from seneca.act.
    var fragile: js.UndefOr[Boolean] = js.native
    
    // Print debug info to console
    var print: js.UndefOr[Options] = js.native
    
    // Shorten all identifiers to 2 characters.
    var short_logs: js.UndefOr[Boolean] = js.native
    
    // Fatal errors ... aren't fatal. Not for production!
    var undead: js.UndefOr[Boolean] = js.native
  }
  object Actcaller {
    
    @scala.inline
    def apply(): Actcaller = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Actcaller]
    }
    
    @scala.inline
    implicit class ActcallerMutableBuilder[Self <: Actcaller] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAct_caller(value: Boolean): Self = StObject.set(x, "act_caller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAct_callerUndefined: Self = StObject.set(x, "act_caller", js.undefined)
      
      @scala.inline
      def setCallpoint(value: Boolean): Self = StObject.set(x, "callpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallpointUndefined: Self = StObject.set(x, "callpoint", js.undefined)
      
      @scala.inline
      def setFragile(value: Boolean): Self = StObject.set(x, "fragile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragileUndefined: Self = StObject.set(x, "fragile", js.undefined)
      
      @scala.inline
      def setPrint(value: Options): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
      
      @scala.inline
      def setShort_logs(value: Boolean): Self = StObject.set(x, "short_logs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShort_logsUndefined: Self = StObject.set(x, "short_logs", js.undefined)
      
      @scala.inline
      def setUndead(value: Boolean): Self = StObject.set(x, "undead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUndeadUndefined: Self = StObject.set(x, "undead", js.undefined)
    }
  }
  
  @js.native
  trait Active extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[Double] = js.native
  }
  object Active {
    
    @scala.inline
    def apply(): Active = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Active]
    }
    
    @scala.inline
    implicit class ActiveMutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait Actrouter extends StObject {
    
    var actrouter: js.UndefOr[UnknownType] = js.native
    
    var clientrouter: js.UndefOr[UnknownType] = js.native
    
    // Close instance on these signals, if true.
    var close_signals: js.UndefOr[SIGBREAK] = js.native
    
    var subrouter: js.UndefOr[UnknownType] = js.native
  }
  object Actrouter {
    
    @scala.inline
    def apply(): Actrouter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Actrouter]
    }
    
    @scala.inline
    implicit class ActrouterMutableBuilder[Self <: Actrouter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActrouter(value: UnknownType): Self = StObject.set(x, "actrouter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActrouterUndefined: Self = StObject.set(x, "actrouter", js.undefined)
      
      @scala.inline
      def setClientrouter(value: UnknownType): Self = StObject.set(x, "clientrouter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientrouterUndefined: Self = StObject.set(x, "clientrouter", js.undefined)
      
      @scala.inline
      def setClose_signals(value: SIGBREAK): Self = StObject.set(x, "close_signals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClose_signalsUndefined: Self = StObject.set(x, "close_signals", js.undefined)
      
      @scala.inline
      def setSubrouter(value: UnknownType): Self = StObject.set(x, "subrouter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubrouterUndefined: Self = StObject.set(x, "subrouter", js.undefined)
    }
  }
  
  @js.native
  trait Add extends StObject {
    
    // Adding a pattern overrides existing pattern only if matches exactly.
    var add: js.UndefOr[Boolean] = js.native
    
    // Delegate fixedargs override action args.
    var fixedargs: js.UndefOr[Boolean] = js.native
    
    // Action result must be a plain object.
    var result: js.UndefOr[Boolean] = js.native
  }
  object Add {
    
    @scala.inline
    def apply(): Add = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Add]
    }
    
    @scala.inline
    implicit class AddMutableBuilder[Self <: Add] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      @scala.inline
      def setFixedargs(value: Boolean): Self = StObject.set(x, "fixedargs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedargsUndefined: Self = StObject.set(x, "fixedargs", js.undefined)
      
      @scala.inline
      def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  @js.native
  trait Basic extends StObject {
    
    var basic: js.UndefOr[Boolean] = js.native
    
    var `mem-store`: js.UndefOr[Boolean] = js.native
    
    var transport: js.UndefOr[Boolean] = js.native
    
    var web: js.UndefOr[Boolean] = js.native
  }
  object Basic {
    
    @scala.inline
    def apply(): Basic = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Basic]
    }
    
    @scala.inline
    implicit class BasicMutableBuilder[Self <: Basic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasic(value: Boolean): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
      
      @scala.inline
      def `setMem-store`(value: Boolean): Self = StObject.set(x, "mem-store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMem-storeUndefined`: Self = StObject.set(x, "mem-store", js.undefined)
      
      @scala.inline
      def setTransport(value: Boolean): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
      
      @scala.inline
      def setWeb(value: Boolean): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebUndefined: Self = StObject.set(x, "web", js.undefined)
    }
  }
  
  @js.native
  trait Host extends StObject {
    
    var host: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
  }
  object Host {
    
    @scala.inline
    def apply(): Host = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  @js.native
  trait Interval extends StObject {
    
    var interval: js.UndefOr[Double] = js.native
    
    var running: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[Double] = js.native
  }
  object Interval {
    
    @scala.inline
    def apply(): Interval = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Interval]
    }
    
    @scala.inline
    implicit class IntervalMutableBuilder[Self <: Interval] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunningUndefined: Self = StObject.set(x, "running", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait Level extends StObject {
    
    var level: js.UndefOr[LogLevel] = js.native
    
    var short: js.UndefOr[Boolean] = js.native
  }
  object Level {
    
    @scala.inline
    def apply(): Level = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Level]
    }
    
    @scala.inline
    implicit class LevelMutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setShort(value: Boolean): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    }
  }
  
  @js.native
  trait Local extends StObject {
    
    var local: js.UndefOr[Boolean] = js.native
    
    var prefix: js.UndefOr[String] = js.native
  }
  object Local {
    
    @scala.inline
    def apply(): Local = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Local]
    }
    
    @scala.inline
    implicit class LocalMutableBuilder[Self <: Local] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    // Print options. Best used via --seneca.print.options.
    var options: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: Boolean): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  @js.native
  trait Running extends StObject {
    
    var interval: js.UndefOr[Double] = js.native
    
    // By default, does not run.
    var running: js.UndefOr[Boolean] = js.native
  }
  object Running {
    
    @scala.inline
    def apply(): Running = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Running]
    }
    
    @scala.inline
    implicit class RunningMutableBuilder[Self <: Running] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunningUndefined: Self = StObject.set(x, "running", js.undefined)
    }
  }
  
  @js.native
  trait SIGBREAK extends StObject {
    
    var SIGBREAK: js.UndefOr[Boolean] = js.native
    
    var SIGHUP: js.UndefOr[Boolean] = js.native
    
    var SIGINT: js.UndefOr[Boolean] = js.native
    
    var SIGTERM: js.UndefOr[Boolean] = js.native
  }
  object SIGBREAK {
    
    @scala.inline
    def apply(): SIGBREAK = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SIGBREAK]
    }
    
    @scala.inline
    implicit class SIGBREAKMutableBuilder[Self <: SIGBREAK] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSIGBREAK(value: Boolean): Self = StObject.set(x, "SIGBREAK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGBREAKUndefined: Self = StObject.set(x, "SIGBREAK", js.undefined)
      
      @scala.inline
      def setSIGHUP(value: Boolean): Self = StObject.set(x, "SIGHUP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGHUPUndefined: Self = StObject.set(x, "SIGHUP", js.undefined)
      
      @scala.inline
      def setSIGINT(value: Boolean): Self = StObject.set(x, "SIGINT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGINTUndefined: Self = StObject.set(x, "SIGINT", js.undefined)
      
      @scala.inline
      def setSIGTERM(value: Boolean): Self = StObject.set(x, "SIGTERM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGTERMUndefined: Self = StObject.set(x, "SIGTERM", js.undefined)
    }
  }
}
