package typings.signale

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.node.processMod.global.NodeJS.WriteStream
import typings.signale.anon.Label
import typings.signale.anon.RecordDefaultMethodsLogge
import typings.signale.anon.SignaleDefaultMethods
import typings.std.Date
import typings.std.Map
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined signale.signale.Signale<signale.signale.DefaultMethods> & {  Signale :signale.signale.SignaleConstructor,   SignaleConfig :signale.signale.SignaleConfig,   SignaleOptions :signale.signale.SignaleOptions<signale.signale.DefaultMethods>,   DefaultMethods :signale.signale.DefaultMethods} */
object mod {
  
  @JSImport("signale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.signale.signaleStrings.await
    - typings.signale.signaleStrings.complete
    - typings.signale.signaleStrings.error
    - typings.signale.signaleStrings.debug
    - typings.signale.signaleStrings.fatal
    - typings.signale.signaleStrings.fav
    - typings.signale.signaleStrings.info
    - typings.signale.signaleStrings.note
    - typings.signale.signaleStrings.pause
    - typings.signale.signaleStrings.pending
    - typings.signale.signaleStrings.star
    - typings.signale.signaleStrings.start
    - typings.signale.signaleStrings.success
    - typings.signale.signaleStrings.warn
    - typings.signale.signaleStrings.watch
    - typings.signale.signaleStrings.log
  */
  trait DefaultMethods extends StObject
  object DefaultMethods {
    
    @JSImport("signale", "DefaultMethods")
    @js.native
    val ^ : DefaultMethods = js.native
    
    @scala.inline
    def await: typings.signale.signaleStrings.await = "await".asInstanceOf[typings.signale.signaleStrings.await]
    
    @scala.inline
    def complete: typings.signale.signaleStrings.complete = "complete".asInstanceOf[typings.signale.signaleStrings.complete]
    
    @scala.inline
    def debug: typings.signale.signaleStrings.debug = "debug".asInstanceOf[typings.signale.signaleStrings.debug]
    
    @scala.inline
    def error: typings.signale.signaleStrings.error = "error".asInstanceOf[typings.signale.signaleStrings.error]
    
    @scala.inline
    def fatal: typings.signale.signaleStrings.fatal = "fatal".asInstanceOf[typings.signale.signaleStrings.fatal]
    
    @scala.inline
    def fav: typings.signale.signaleStrings.fav = "fav".asInstanceOf[typings.signale.signaleStrings.fav]
    
    @scala.inline
    def info: typings.signale.signaleStrings.info = "info".asInstanceOf[typings.signale.signaleStrings.info]
    
    @scala.inline
    def log: typings.signale.signaleStrings.log = "log".asInstanceOf[typings.signale.signaleStrings.log]
    
    @scala.inline
    def note: typings.signale.signaleStrings.note = "note".asInstanceOf[typings.signale.signaleStrings.note]
    
    @scala.inline
    def pause: typings.signale.signaleStrings.pause = "pause".asInstanceOf[typings.signale.signaleStrings.pause]
    
    @scala.inline
    def pending: typings.signale.signaleStrings.pending = "pending".asInstanceOf[typings.signale.signaleStrings.pending]
    
    @scala.inline
    def star: typings.signale.signaleStrings.star = "star".asInstanceOf[typings.signale.signaleStrings.star]
    
    @scala.inline
    def start: typings.signale.signaleStrings.start = "start".asInstanceOf[typings.signale.signaleStrings.start]
    
    @scala.inline
    def success: typings.signale.signaleStrings.success = "success".asInstanceOf[typings.signale.signaleStrings.success]
    
    @scala.inline
    def warn: typings.signale.signaleStrings.warn = "warn".asInstanceOf[typings.signale.signaleStrings.warn]
    
    @scala.inline
    def watch: typings.signale.signaleStrings.watch = "watch".asInstanceOf[typings.signale.signaleStrings.watch]
  }
  
  @JSImport("signale", "Signale")
  @js.native
  def Signale: SignaleConstructor = js.native
  type Signale[TTypes /* <: String */] = SignaleBase[TTypes] with (Record[TTypes, LoggerFunc]) with RecordDefaultMethodsLogge
  
  @js.native
  trait SignaleConfig extends StObject {
    
    /** Display the badge of the logger. */
    var displayBadge: js.UndefOr[Boolean] = js.native
    
    /** Display the current local date in `YYYY-MM-DD` format. */
    var displayDate: js.UndefOr[Boolean] = js.native
    
    /** Display the name of the file that the logger is reporting from. */
    var displayFilename: js.UndefOr[Boolean] = js.native
    
    /** Display the label of the logger. */
    var displayLabel: js.UndefOr[Boolean] = js.native
    
    /** Display the scope name of the logger. */
    var displayScope: js.UndefOr[Boolean] = js.native
    
    /** Display the current local time in `HH:MM:SS` format. */
    var displayTimestamp: js.UndefOr[Boolean] = js.native
    
    /** Underline the logger label. */
    var underlineLabel: js.UndefOr[Boolean] = js.native
    
    /** Underline the logger message. */
    var underlineMessage: js.UndefOr[Boolean] = js.native
    
    var underlinePrefix: js.UndefOr[Boolean] = js.native
    
    var underlineSuffix: js.UndefOr[Boolean] = js.native
    
    var uppercaseLabel: js.UndefOr[Boolean] = js.native
  }
  object SignaleConfig {
    
    @JSImport("signale", "SignaleConfig")
    @js.native
    val ^ : SignaleConfig = js.native
    
    @scala.inline
    implicit class SignaleConfigMutableBuilder[Self <: SignaleConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayBadge(value: Boolean): Self = StObject.set(x, "displayBadge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayBadgeUndefined: Self = StObject.set(x, "displayBadge", js.undefined)
      
      @scala.inline
      def setDisplayDate(value: Boolean): Self = StObject.set(x, "displayDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayDateUndefined: Self = StObject.set(x, "displayDate", js.undefined)
      
      @scala.inline
      def setDisplayFilename(value: Boolean): Self = StObject.set(x, "displayFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayFilenameUndefined: Self = StObject.set(x, "displayFilename", js.undefined)
      
      @scala.inline
      def setDisplayLabel(value: Boolean): Self = StObject.set(x, "displayLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayLabelUndefined: Self = StObject.set(x, "displayLabel", js.undefined)
      
      @scala.inline
      def setDisplayScope(value: Boolean): Self = StObject.set(x, "displayScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayScopeUndefined: Self = StObject.set(x, "displayScope", js.undefined)
      
      @scala.inline
      def setDisplayTimestamp(value: Boolean): Self = StObject.set(x, "displayTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayTimestampUndefined: Self = StObject.set(x, "displayTimestamp", js.undefined)
      
      @scala.inline
      def setUnderlineLabel(value: Boolean): Self = StObject.set(x, "underlineLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineLabelUndefined: Self = StObject.set(x, "underlineLabel", js.undefined)
      
      @scala.inline
      def setUnderlineMessage(value: Boolean): Self = StObject.set(x, "underlineMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineMessageUndefined: Self = StObject.set(x, "underlineMessage", js.undefined)
      
      @scala.inline
      def setUnderlinePrefix(value: Boolean): Self = StObject.set(x, "underlinePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlinePrefixUndefined: Self = StObject.set(x, "underlinePrefix", js.undefined)
      
      @scala.inline
      def setUnderlineSuffix(value: Boolean): Self = StObject.set(x, "underlineSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineSuffixUndefined: Self = StObject.set(x, "underlineSuffix", js.undefined)
      
      @scala.inline
      def setUppercaseLabel(value: Boolean): Self = StObject.set(x, "uppercaseLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUppercaseLabelUndefined: Self = StObject.set(x, "uppercaseLabel", js.undefined)
    }
  }
  
  @js.native
  trait SignaleOptions[TTypes /* <: String */] extends StObject {
    
    /** Sets the configuration of an instance overriding any existing global or local configuration. */
    var config: js.UndefOr[SignaleConfig] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var interactive: js.UndefOr[Boolean] = js.native
    
    var logLevel: js.UndefOr[String] = js.native
    
    /**
      * Name of the scope.
      */
    var scope: js.UndefOr[String] = js.native
    
    var secrets: js.UndefOr[js.Array[String | Double]] = js.native
    
    /**
      * Destination to which the data is written, can be any valid
      * [Writable stream](https://nodejs.org/api/stream.html#stream_writable_streams).
      */
    var stream: js.UndefOr[WriteStream | js.Array[WriteStream]] = js.native
    
    var timers: js.UndefOr[Map[String, Date]] = js.native
    
    /**
      * Holds the configuration of the custom and default loggers.
      */
    var types: js.UndefOr[Partial[Record[TTypes, CommandType]]] = js.native
  }
  object SignaleOptions {
    
    @JSImport("signale", "SignaleOptions")
    @js.native
    val ^ : SignaleOptions[DefaultMethods] = js.native
    
    @scala.inline
    implicit class SignaleOptionsMutableBuilder[Self <: SignaleOptions[_], TTypes /* <: String */] (val x: Self with SignaleOptions[TTypes]) extends AnyVal {
      
      @scala.inline
      def setConfig(value: SignaleConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      @scala.inline
      def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setSecrets(value: js.Array[String | Double]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretsUndefined: Self = StObject.set(x, "secrets", js.undefined)
      
      @scala.inline
      def setSecretsVarargs(value: (String | Double)*): Self = StObject.set(x, "secrets", js.Array(value :_*))
      
      @scala.inline
      def setStream(value: WriteStream | js.Array[WriteStream]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setStreamVarargs(value: WriteStream*): Self = StObject.set(x, "stream", js.Array(value :_*))
      
      @scala.inline
      def setTimers(value: Map[String, Date]): Self = StObject.set(x, "timers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimersUndefined: Self = StObject.set(x, "timers", js.undefined)
      
      @scala.inline
      def setTypes(value: Partial[Record[TTypes, CommandType]]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    }
  }
  
  @scala.inline
  def Signale_=(x: SignaleConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Signale")(x.asInstanceOf[js.Any])
  
  /**
    * Adds new secrets/sensitive-information to the targeted Signale instance.
    *
    * @param secrets Array holding the secrets/sensitive-information to be filtered out.
    */
  @JSImport("signale", "addSecrets")
  @js.native
  def addSecrets(secrets: js.Array[Double | String]): Unit = js.native
  
  @JSImport("signale", "await")
  @js.native
  def await: LoggerFunc = js.native
  @JSImport("signale", "await")
  @js.native
  def await(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  @JSImport("signale", "await")
  @js.native
  def await(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  @scala.inline
  def await_=(x: LoggerFunc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("await")(x.asInstanceOf[js.Any])
  
  /**
    * Removes all secrets/sensitive-information from the targeted Signale instance.
    */
  @JSImport("signale", "clearSecrets")
  @js.native
  def clearSecrets(): Unit = js.native
  
  @JSImport("signale", "complete")
  @js.native
  def complete: LoggerFunc = js.native
  @JSImport("signale", "complete")
  @js.native
  def complete(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  @JSImport("signale", "complete")
  @js.native
  def complete(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  @scala.inline
  def complete_=(x: LoggerFunc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("complete")(x.asInstanceOf[js.Any])
  
  /**
    * Sets the configuration of an instance overriding any existing global or local configuration.
    *
    * @param configObj Can hold any of the documented options.
    */
  @JSImport("signale", "config")
  @js.native
  def config(configObj: SignaleConfig): SignaleDefaultMethods = js.native
  
  @JSImport("signale", "debug")
  @js.native
  def debug: LoggerFunc = js.native
  @JSImport("signale", "debug")
  @js.native
  def debug(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  @JSImport("signale", "debug")
  @js.native
  def debug(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  @scala.inline
  def debug_=(x: LoggerFunc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
  
  /**
    * Disables the logging functionality of all loggers belonging to a specific instance.
    */
  @JSImport("signale", "disable")
  @js.native
  def disable(): Unit = js.native
  
  /**
    * Enables the logging functionality of all loggers belonging to a specific instance.
    */
  @JSImport("signale", "enable")
  @js.native
  def enable(): Unit = js.native
  
  @JSImport("signale", "error")
  @js.native
  def error: LoggerFunc = js.native
  @JSImport("signale", "error")
  @js.native
  def error(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  @JSImport("signale", "error")
  @js.native
  def error(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  @scala.inline
  def error_=(x: LoggerFunc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
  
  @JSImport("signale", "fatal")
  @js.native
  def fatal: LoggerFunc = js.native
  @JSImport("signale", "fatal")
  @js.native
  def fatal(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  @JSImport("signale", "fatal")
  @js.native
  def fatal(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  @scala.inline
  def fatal_=(x: LoggerFunc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fatal")(x.asInstanceOf[js.Any])
  
  @JSImport("signale", "fav")
  @js.native
  def fav: LoggerFunc = js.native
  @JSImport("signale", "fav")
  @js.native
  def fav(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  @JSImport("signale", "fav")
  @js.native
  def fav(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  @scala.inline
  def fav_=(x: LoggerFunc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fav")(x.asInstanceOf[js.Any])
  
  @JSImport("signale", "info")
  @js.native
  def info: LoggerFunc = js.native
  @JSImport("signale", "info")
  @js.native
  def info(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  @JSImport("signale", "info")
  @js.native
  def info(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  @scala.inline
  def info_=(x: LoggerFunc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
  
  /**
    * Checks whether the logging functionality of a specific instance is enabled.
    *
    * @returns a boolean that describes whether or not the logger is enabled.
    */
  @JSImport("signale", "isEnabled")
  @js.native
  def isEnabled(): Boolean = js.native
  
  @JSImport("signale", "log")
  @js.native
  def log: LoggerFunc = js.native
  @JSImport("signale", "log")
  @js.native
  def log(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  @JSImport("signale", "log")
  @js.native
  def log(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  @scala.inline
  def log_=(x: LoggerFunc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("log")(x.asInstanceOf[js.Any])
  
  @JSImport("signale", "note")
  @js.native
  def note: LoggerFunc = js.native
  @JSImport("signale", "note")
  @js.native
  def note(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  @JSImport("signale", "note")
  @js.native
  def note(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  @scala.inline
  def note_=(x: LoggerFunc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("note")(x.asInstanceOf[js.Any])
  
  @JSImport("signale", "pause")
  @js.native
  def pause: LoggerFunc = js.native
  @JSImport("signale", "pause")
  @js.native
  def pause(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  @JSImport("signale", "pause")
  @js.native
  def pause(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  @scala.inline
  def pause_=(x: LoggerFunc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pause")(x.asInstanceOf[js.Any])
  
  @JSImport("signale", "pending")
  @js.native
  def pending: LoggerFunc = js.native
  @JSImport("signale", "pending")
  @js.native
  def pending(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  @JSImport("signale", "pending")
  @js.native
  def pending(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  @scala.inline
  def pending_=(x: LoggerFunc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pending")(x.asInstanceOf[js.Any])
  
  /**
    * Defines the scope name of the logger.
    *
    * @param name Can be one or more comma delimited strings.
    */
  @JSImport("signale", "scope")
  @js.native
  def scope(name: String*): SignaleDefaultMethods = js.native
  
  @JSImport("signale", "star")
  @js.native
  def star: LoggerFunc = js.native
  @JSImport("signale", "star")
  @js.native
  def star(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  @JSImport("signale", "star")
  @js.native
  def star(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  @scala.inline
  def star_=(x: LoggerFunc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("star")(x.asInstanceOf[js.Any])
  
  @JSImport("signale", "start")
  @js.native
  def start: LoggerFunc = js.native
  @JSImport("signale", "start")
  @js.native
  def start(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  @JSImport("signale", "start")
  @js.native
  def start(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  @scala.inline
  def start_=(x: LoggerFunc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
  
  @JSImport("signale", "success")
  @js.native
  def success: LoggerFunc = js.native
  @JSImport("signale", "success")
  @js.native
  def success(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  @JSImport("signale", "success")
  @js.native
  def success(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  @scala.inline
  def success_=(x: LoggerFunc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("success")(x.asInstanceOf[js.Any])
  
  /**
    * Sets a timers and accepts an optional label. If none provided the timer will receive a unique label automatically.
    *
    * @param label Label corresponding to the timer. Each timer must have its own unique label.
    * @returns a string corresponding to the timer label.
    */
  @JSImport("signale", "time")
  @js.native
  def time(): String = js.native
  @JSImport("signale", "time")
  @js.native
  def time(label: String): String = js.native
  
  /**
    * Deactivates the timer to which the given label corresponds. If no label
    * is provided the most recent timer, that was created without providing a
    * label, will be deactivated.
    *
    * @param label Label corresponding to the timer, each timer has its own unique label.
    * @param span Total running time.
    */
  @JSImport("signale", "timeEnd")
  @js.native
  def timeEnd(): Label = js.native
  @JSImport("signale", "timeEnd")
  @js.native
  def timeEnd(label: js.UndefOr[scala.Nothing], span: Double): Label = js.native
  @JSImport("signale", "timeEnd")
  @js.native
  def timeEnd(label: String): Label = js.native
  @JSImport("signale", "timeEnd")
  @js.native
  def timeEnd(label: String, span: Double): Label = js.native
  
  /** Clears the scope name of the logger. */
  @JSImport("signale", "unscope")
  @js.native
  def unscope(): Unit = js.native
  
  @JSImport("signale", "warn")
  @js.native
  def warn: LoggerFunc = js.native
  @JSImport("signale", "warn")
  @js.native
  def warn(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  @JSImport("signale", "warn")
  @js.native
  def warn(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  @scala.inline
  def warn_=(x: LoggerFunc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warn")(x.asInstanceOf[js.Any])
  
  @JSImport("signale", "watch")
  @js.native
  def watch: LoggerFunc = js.native
  @JSImport("signale", "watch")
  @js.native
  def watch(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  @JSImport("signale", "watch")
  @js.native
  def watch(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  @scala.inline
  def watch_=(x: LoggerFunc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("watch")(x.asInstanceOf[js.Any])
  
  @js.native
  trait CommandType extends StObject {
    
    /** The icon corresponding to the logger. */
    var badge: String = js.native
    
    /**
      * The color of the label, can be any of the foreground colors supported by
      * [chalk](https://github.com/chalk/chalk#colors).
      */
    var color: String = js.native
    
    /** The label used to identify the type of the logger. */
    var label: String = js.native
    
    var logLevel: js.UndefOr[String] = js.native
    
    var stream: js.UndefOr[WriteStream | js.Array[WriteStream]] = js.native
  }
  object CommandType {
    
    @scala.inline
    def apply(badge: String, color: String, label: String): CommandType = {
      val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandType]
    }
    
    @scala.inline
    implicit class CommandTypeMutableBuilder[Self <: CommandType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setStream(value: WriteStream | js.Array[WriteStream]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setStreamVarargs(value: WriteStream*): Self = StObject.set(x, "stream", js.Array(value :_*))
    }
  }
  
  type LoggerFunc = js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]
  
  @js.native
  trait SignaleBase[TTypes /* <: String */] extends StObject {
    
    /**
      * Adds new secrets/sensitive-information to the targeted Signale instance.
      *
      * @param secrets Array holding the secrets/sensitive-information to be filtered out.
      */
    def addSecrets(secrets: js.Array[Double | String]): Unit = js.native
    
    /**
      * Removes all secrets/sensitive-information from the targeted Signale instance.
      */
    def clearSecrets(): Unit = js.native
    
    /**
      * Sets the configuration of an instance overriding any existing global or local configuration.
      *
      * @param configObj Can hold any of the documented options.
      */
    def config(configObj: SignaleConfig): Signale[TTypes] = js.native
    
    /**
      * Disables the logging functionality of all loggers belonging to a specific instance.
      */
    def disable(): Unit = js.native
    
    /**
      * Enables the logging functionality of all loggers belonging to a specific instance.
      */
    def enable(): Unit = js.native
    
    /**
      * Checks whether the logging functionality of a specific instance is enabled.
      *
      * @returns a boolean that describes whether or not the logger is enabled.
      */
    def isEnabled(): Boolean = js.native
    
    /**
      * Defines the scope name of the logger.
      *
      * @param name Can be one or more comma delimited strings.
      */
    def scope(name: String*): Signale[TTypes] = js.native
    
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
    def timeEnd(label: js.UndefOr[scala.Nothing], span: Double): Label = js.native
    def timeEnd(label: String): Label = js.native
    def timeEnd(label: String, span: Double): Label = js.native
    
    /** Clears the scope name of the logger. */
    def unscope(): Unit = js.native
  }
  
  @js.native
  trait SignaleConstructor
    extends Instantiable0[Signale[String]]
       with Instantiable1[/* options */ SignaleOptions[String], Signale[String]]
}
