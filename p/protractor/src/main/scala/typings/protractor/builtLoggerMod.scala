package typings.protractor

import org.scalablytyped.runtime.TopLevel
import typings.protractor.builtConfigMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/logger", JSImport.Namespace)
@js.native
object builtLoggerMod extends js.Object {
  @js.native
  sealed trait LogLevel extends js.Object
  
  @js.native
  class Logger protected () extends js.Object {
    /**
      * Creates a logger instance with an ID for the logger.
      * @constructor
      */
    def this(id: String) = this()
    var id: js.Any = js.native
    /**
      * Log DEBUG
      * @param ...msgs multiple arguments to be logged.
      */
    def debug(msgs: js.Any*): Unit = js.native
    /**
      * Log ERROR
      * @param ...msgs multiple arguments to be logged.
      */
    def error(msgs: js.Any*): Unit = js.native
    /**
      * Log INFO
      * @param ...msgs multiple arguments to be logged.
      */
    def info(msgs: js.Any*): Unit = js.native
    /**
      * For the log level set, check to see if the messages should be logged.
      * @param logLevel The log level of the message.
      * @param msgs The messages to be logged
      */
    def log_(logLevel: LogLevel, msgs: js.Array[_]): Unit = js.native
    /**
      * Format with timestamp, log level, identifier, and message and log to
      * specified medium (console, file, both, none).
      * @param logLevel The log level of the message.
      * @param msgs The messages to be logged.
      */
    def print_(logLevel: LogLevel, msgs: js.Array[_]): Unit = js.native
    /**
      * Log WARN
      * @param ...msgs multiple arguments to be logged.
      */
    def warn(msgs: js.Any*): Unit = js.native
  }
  
  @js.native
  sealed trait WriteTo extends js.Object
  
  @js.native
  object LogLevel extends js.Object {
    @js.native
    sealed trait DEBUG extends LogLevel
    
    @js.native
    sealed trait ERROR extends LogLevel
    
    @js.native
    sealed trait INFO extends LogLevel
    
    @js.native
    sealed trait WARN extends LogLevel
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
    /* 3 */ @js.native
    object DEBUG extends TopLevel[DEBUG with Double]
    
    /* 0 */ @js.native
    object ERROR extends TopLevel[ERROR with Double]
    
    /* 2 */ @js.native
    object INFO extends TopLevel[INFO with Double]
    
    /* 1 */ @js.native
    object WARN extends TopLevel[WARN with Double]
    
  }
  
  /* static members */
  @js.native
  object Logger extends js.Object {
    var fd: js.Any = js.native
    var firstWrite: Boolean = js.native
    var logLevel: LogLevel = js.native
    var showId: Boolean = js.native
    var showTimestamp: Boolean = js.native
    var writeTo: WriteTo = js.native
    /**
      * Get the identifier of the logger as '/<id>'
      * @param logLevel The log level of the message.
      * @param writeTo The enum for where to write the logs.
      * @return The string of the formatted id
      */
    def id_(logLevel: LogLevel, id: String, writeTo: WriteTo): String = js.native
    /**
      * Get the log level formatted with the first letter. For info, it is I.
      * @param logLevel The log level of the message.
      * @param writeTo The enum for where to write the logs.
      * @return The string of the formatted log level
      */
    def level_(logLevel: LogLevel, id: String, writeTo: WriteTo): String = js.native
    /**
      * Convert the list of messages to a single string message.
      * @param msgs The list of messages.
      * @return The string of the formatted messages
      */
    def msgToFile_(msgs: js.Array[_]): String = js.native
    /**
      * Set up the logging configuration from the protractor configuration file.
      * @param config The protractor configuration
      */
    def set(config: Config): Unit = js.native
    /**
      * Set up the write location. If writing to a file, get the file descriptor.
      * @param writeTo The enum for where to write the logs.
      * @param opt_logFile An optional parameter to override the log file location.
      */
    def setWrite(writeTo: WriteTo): Unit = js.native
    def setWrite(writeTo: WriteTo, opt_logFile: String): Unit = js.native
    /**
      * Get a timestamp formatted with [hh:mm:ss]
      * @param writeTo The enum for where to write the logs.
      * @return The string of the formatted timestamp
      */
    def timestamp_(writeTo: WriteTo): String = js.native
  }
  
  @js.native
  object WriteTo extends js.Object {
    @js.native
    sealed trait BOTH extends WriteTo
    
    @js.native
    sealed trait CONSOLE extends WriteTo
    
    @js.native
    sealed trait FILE extends WriteTo
    
    @js.native
    sealed trait NONE extends WriteTo
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WriteTo with Double] = js.native
    /* 2 */ @js.native
    object BOTH extends TopLevel[BOTH with Double]
    
    /* 0 */ @js.native
    object CONSOLE extends TopLevel[CONSOLE with Double]
    
    /* 1 */ @js.native
    object FILE extends TopLevel[FILE with Double]
    
    /* 3 */ @js.native
    object NONE extends TopLevel[NONE with Double]
    
  }
  
}

