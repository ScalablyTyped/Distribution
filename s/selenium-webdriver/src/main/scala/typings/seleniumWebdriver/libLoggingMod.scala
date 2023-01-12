package typings.seleniumWebdriver

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoggingMod {
  
  @JSImport("selenium-webdriver/lib/logging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("selenium-webdriver/lib/logging", "Entry")
  @js.native
  open class Entry protected () extends StObject {
    def this(level: String, message: String) = this()
    def this(level: Double, message: String) = this()
    /**
      * @param {(!logging.Level|string)} level The entry level.
      * @param {string} message The log message.
      * @param {number=} opt_timestamp The time this entry was generated, in
      *     milliseconds since 0:00:00, January 1, 1970 UTC. If omitted, the
      *     current time will be used.
      * @param {string=} opt_type The log type, if known.
      * @constructor
      */
    def this(level: Level, message: String) = this()
    def this(level: String, message: String, opt_timestamp: Double) = this()
    def this(level: Double, message: String, opt_timestamp: Double) = this()
    def this(level: Level, message: String, opt_timestamp: Double) = this()
    def this(level: String, message: String, opt_timestamp: Double, opt_type: String) = this()
    def this(level: String, message: String, opt_timestamp: Double, opt_type: IType) = this()
    def this(level: String, message: String, opt_timestamp: Unit, opt_type: String) = this()
    def this(level: String, message: String, opt_timestamp: Unit, opt_type: IType) = this()
    def this(level: Double, message: String, opt_timestamp: Double, opt_type: String) = this()
    def this(level: Double, message: String, opt_timestamp: Double, opt_type: IType) = this()
    def this(level: Double, message: String, opt_timestamp: Unit, opt_type: String) = this()
    def this(level: Double, message: String, opt_timestamp: Unit, opt_type: IType) = this()
    def this(level: Level, message: String, opt_timestamp: Double, opt_type: String) = this()
    def this(level: Level, message: String, opt_timestamp: Double, opt_type: IType) = this()
    def this(level: Level, message: String, opt_timestamp: Unit, opt_type: String) = this()
    def this(level: Level, message: String, opt_timestamp: Unit, opt_type: IType) = this()
    
    /** @type {!logging.Level} */
    var level: Level = js.native
    
    /** @type {string} */
    var message: String = js.native
    
    /** @type {number} */
    var timestamp: Double = js.native
    
    /**
      * @return {{level: string, message: string, timestamp: number,
      *           type: string}} The JSON representation of this entry.
      */
    def toJSON(): IEntryJSON = js.native
    
    /** @type {string} */
    var `type`: String = js.native
  }
  
  @JSImport("selenium-webdriver/lib/logging", "Level")
  @js.native
  open class Level protected () extends StObject {
    /**
      * @param {string} name the level's name.
      * @param {number} level the level's numeric value.
      */
    def this(name: String, level: Double) = this()
    
    /** This logger's name. */
    var name: String = js.native
    
    var name_ : String = js.native
    
    /** The numeric log level. */
    var value: Double = js.native
    
    var value_ : Double = js.native
  }
  /* static members */
  object Level {
    
    @JSImport("selenium-webdriver/lib/logging", "Level")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Indicates all log messages should be recorded.
      * @const
      */
    @JSImport("selenium-webdriver/lib/logging", "Level.ALL")
    @js.native
    def ALL: Level = js.native
    inline def ALL_=(x: Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `700` or higher.
      * @const
      */
    @JSImport("selenium-webdriver/lib/logging", "Level.DEBUG")
    @js.native
    def DEBUG: Level = js.native
    inline def DEBUG_=(x: Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `500` or higher.
      * @const
      */
    @JSImport("selenium-webdriver/lib/logging", "Level.FINE")
    @js.native
    def FINE: Level = js.native
    
    /**
      * Log messages with a level of `400` or higher.
      * @const
      */
    @JSImport("selenium-webdriver/lib/logging", "Level.FINER")
    @js.native
    def FINER: Level = js.native
    inline def FINER_=(x: Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FINER")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `300` or higher.
      * @const
      */
    @JSImport("selenium-webdriver/lib/logging", "Level.FINEST")
    @js.native
    def FINEST: Level = js.native
    inline def FINEST_=(x: Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FINEST")(x.asInstanceOf[js.Any])
    
    inline def FINE_=(x: Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FINE")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `800` or higher.
      * @const
      */
    @JSImport("selenium-webdriver/lib/logging", "Level.INFO")
    @js.native
    def INFO: Level = js.native
    inline def INFO_=(x: Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
    
    /**
      * Indicates no log messages should be recorded.
      * @const
      */
    @JSImport("selenium-webdriver/lib/logging", "Level.OFF")
    @js.native
    def OFF: Level = js.native
    inline def OFF_=(x: Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OFF")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `1000` or higher.
      * @const
      */
    @JSImport("selenium-webdriver/lib/logging", "Level.SEVERE")
    @js.native
    def SEVERE: Level = js.native
    inline def SEVERE_=(x: Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEVERE")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `900` or higher.
      * @const
      */
    @JSImport("selenium-webdriver/lib/logging", "Level.WARNING")
    @js.native
    def WARNING: Level = js.native
    inline def WARNING_=(x: Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARNING")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("selenium-webdriver/lib/logging", "LogManager")
  @js.native
  open class LogManager () extends StObject {
    
    /**
      * Creates a new logger.
      *
      * @param {string} name the logger's name.
      * @param {!Logger} parent the logger's parent.
      * @return {!Logger} the new logger.
      * @private
      */
    def createLogger_(name: String, parent: Logger): Logger = js.native
    
    /**
      * Retrieves a named logger, creating it in the process. This function will
      * implicitly create the requested logger, and any of its parents, if they
      * do not yet exist.
      *
      * @param {string} name the logger's name.
      * @return {!Logger} the requested logger.
      */
    def getLogger(): Logger = js.native
    def getLogger(name: String): Logger = js.native
  }
  
  @JSImport("selenium-webdriver/lib/logging", "Logger")
  @js.native
  open class Logger protected () extends StObject {
    /**
      * @param {string} name the name of this logger.
      * @param {Level=} opt_level the initial level for this logger.
      */
    def this(name: String) = this()
    def this(name: String, opt_level: Level) = this()
    
    /**
      * Adds a handler to this logger. The handler will be invoked for each message
      * logged with this instance, or any of its descendants.
      *
      * @param {function(!Entry)} handler the handler to add.
      */
    def addHandler(handler: Any): Unit = js.native
    
    /**
      * Logs a message at the {@link Level.DEBUG} log level.
      * @param {(string|function(): string)} loggable the message to log, or a
      *     function that will return the message.
      */
    def debug(loggable: String): Unit = js.native
    def debug(loggable: js.Function): Unit = js.native
    
    /**
      * Logs a message at the {@link Level.FINE} log level.
      * @param {(string|function(): string)} loggable the message to log, or a
      *     function that will return the message.
      */
    def fine(loggable: String): Unit = js.native
    def fine(loggable: js.Function): Unit = js.native
    
    /**
      * Logs a message at the {@link Level.FINER} log level.
      * @param {(string|function(): string)} loggable the message to log, or a
      *     function that will return the message.
      */
    def finer(loggable: String): Unit = js.native
    def finer(loggable: js.Function): Unit = js.native
    
    /**
      * Logs a message at the {@link Level.FINEST} log level.
      * @param {(string|function(): string)} loggable the message to log, or a
      *     function that will return the message.
      */
    def finest(loggable: String): Unit = js.native
    def finest(loggable: js.Function): Unit = js.native
    
    /**
      * @return {!Level} the effective level for this logger.
      */
    def getEffectiveLevel(): Level = js.native
    
    /** @return {Level} the log level for this logger. */
    def getLevel(): Level = js.native
    
    /** @return {string} the name of this logger. */
    def getName(): String = js.native
    
    /** @private {Set<function(!Entry)>} */
    var handlers_ : Any = js.native
    
    /**
      * Logs a message at the {@link Level.INFO} log level.
      * @param {(string|function(): string)} loggable the message to log, or a
      *     function that will return the message.
      */
    def info(loggable: String): Unit = js.native
    def info(loggable: js.Function): Unit = js.native
    
    /**
      * @param {!Level} level the level to check.
      * @return {boolean} whether messages recorded at the given level are loggable
      *     by this instance.
      */
    def isLoggable(level: Level): Boolean = js.native
    
    /** @private {Level} */
    var level_ : Level = js.native
    
    /**
      * Logs a message at the given level. The message may be defined as a string
      * or as a function that will return the message. If a function is provided,
      * it will only be invoked if this logger's
      * {@linkplain #getEffectiveLevel() effective log level} includes the given
      * `level`.
      *
      * @param {!Level} level the level at which to log the message.
      * @param {(string|function(): string)} loggable the message to log, or a
      *     function that will return the message.
      */
    def log(level: Level, loggable: String): Unit = js.native
    def log(level: Level, loggable: js.Function): Unit = js.native
    
    /** @private {string} */
    var name_ : String = js.native
    
    /** @private {Logger} */
    var parent_ : Logger = js.native
    
    /**
      * Removes a handler from this logger.
      *
      * @param {function(!Entry)} handler the handler to remove.
      * @return {boolean} whether a handler was successfully removed.
      */
    def removeHandler(handler: Any): Unit = js.native
    
    /**
      * @param {Level} level the new level for this logger, or `null` if the logger
      *     should inherit its level from its parent logger.
      */
    def setLevel(level: Level): Unit = js.native
    
    /**
      * Logs a message at the {@link Level.SEVERE} log level.
      * @param {(string|function(): string)} loggable the message to log, or a
      *     function that will return the message.
      */
    def severe(loggable: String): Unit = js.native
    def severe(loggable: js.Function): Unit = js.native
    
    /**
      * Logs a message at the {@link Level.WARNING} log level.
      * @param {(string|function(): string)} loggable the message to log, or a
      *     function that will return the message.
      */
    def warning(loggable: String): Unit = js.native
    def warning(loggable: js.Function): Unit = js.native
  }
  
  @JSImport("selenium-webdriver/lib/logging", "Preferences")
  @js.native
  open class Preferences () extends StObject {
    
    var prefs_ : Map[String, Level] = js.native
    
    /**
      * Sets the desired logging level for a particular log type.
      * @param {(string|Type)} type The log type.
      * @param {(!Level|string|number)} level The desired log level.
      * @throws {TypeError} if `type` is not a `string`.
      */
    def setLevel(`type`: String, level: Level): Unit = js.native
    def setLevel(`type`: IType, level: Level): Unit = js.native
    
    /**
      * Converts this instance to its JSON representation.
      * @return {!Object<string, string>} The JSON representation of this set of
      *     preferences.
      */
    def toJSON(): StringDictionary[String] = js.native
  }
  
  @JSImport("selenium-webdriver/lib/logging", "Type")
  @js.native
  val Type: IType = js.native
  
  inline def addConsoleHandler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addConsoleHandler")().asInstanceOf[Unit]
  inline def addConsoleHandler(opt_logger: Logger): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addConsoleHandler")(opt_logger.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getLevel(nameOrValue: String): Level = ^.asInstanceOf[js.Dynamic].applyDynamic("getLevel")(nameOrValue.asInstanceOf[js.Any]).asInstanceOf[Level]
  inline def getLevel(nameOrValue: Double): Level = ^.asInstanceOf[js.Dynamic].applyDynamic("getLevel")(nameOrValue.asInstanceOf[js.Any]).asInstanceOf[Level]
  
  inline def getLogger(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")().asInstanceOf[Logger]
  inline def getLogger(name: String): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")(name.asInstanceOf[js.Any]).asInstanceOf[Logger]
  
  inline def installConsoleHandler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installConsoleHandler")().asInstanceOf[Unit]
  
  inline def removeConsoleHandler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeConsoleHandler")().asInstanceOf[Unit]
  inline def removeConsoleHandler(opt_logger: Logger): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeConsoleHandler")(opt_logger.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait IEntryJSON extends StObject {
    
    var level: String
    
    var message: String
    
    var timestamp: Double
    
    var `type`: String
  }
  object IEntryJSON {
    
    inline def apply(level: String, message: String, timestamp: Double, `type`: String): IEntryJSON = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEntryJSON]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IEntryJSON] (val x: Self) extends AnyVal {
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IType extends StObject {
    
    /** Logs originating from the browser. */
    var BROWSER: String
    
    /** Logs from a WebDriver client. */
    var CLIENT: String
    
    /** Logs from a WebDriver implementation. */
    var DRIVER: String
    
    /** Logs related to performance. */
    var PERFORMANCE: String
    
    /** Logs from the remote server. */
    var SERVER: String
  }
  object IType {
    
    inline def apply(BROWSER: String, CLIENT: String, DRIVER: String, PERFORMANCE: String, SERVER: String): IType = {
      val __obj = js.Dynamic.literal(BROWSER = BROWSER.asInstanceOf[js.Any], CLIENT = CLIENT.asInstanceOf[js.Any], DRIVER = DRIVER.asInstanceOf[js.Any], PERFORMANCE = PERFORMANCE.asInstanceOf[js.Any], SERVER = SERVER.asInstanceOf[js.Any])
      __obj.asInstanceOf[IType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IType] (val x: Self) extends AnyVal {
      
      inline def setBROWSER(value: String): Self = StObject.set(x, "BROWSER", value.asInstanceOf[js.Any])
      
      inline def setCLIENT(value: String): Self = StObject.set(x, "CLIENT", value.asInstanceOf[js.Any])
      
      inline def setDRIVER(value: String): Self = StObject.set(x, "DRIVER", value.asInstanceOf[js.Any])
      
      inline def setPERFORMANCE(value: String): Self = StObject.set(x, "PERFORMANCE", value.asInstanceOf[js.Any])
      
      inline def setSERVER(value: String): Self = StObject.set(x, "SERVER", value.asInstanceOf[js.Any])
    }
  }
}
