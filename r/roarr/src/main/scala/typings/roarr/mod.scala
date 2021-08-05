package typings.roarr

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("roarr", JSImport.Default)
  @js.native
  val default: LoggerType = js.native
  
  @js.native
  trait Logger extends StObject {
    
    def apply(
      context: MessageContextType,
      message: String,
      c: js.UndefOr[SprintfArgumentType],
      d: js.UndefOr[SprintfArgumentType],
      e: js.UndefOr[SprintfArgumentType],
      f: js.UndefOr[SprintfArgumentType],
      g: js.UndefOr[SprintfArgumentType],
      h: js.UndefOr[SprintfArgumentType],
      i: js.UndefOr[SprintfArgumentType],
      k: js.UndefOr[SprintfArgumentType]
    ): Unit = js.native
    def apply(
      message: String,
      b: js.UndefOr[SprintfArgumentType],
      c: js.UndefOr[SprintfArgumentType],
      d: js.UndefOr[SprintfArgumentType],
      e: js.UndefOr[SprintfArgumentType],
      f: js.UndefOr[SprintfArgumentType],
      g: js.UndefOr[SprintfArgumentType],
      h: js.UndefOr[SprintfArgumentType],
      i: js.UndefOr[SprintfArgumentType]
    ): Unit = js.native
  }
  
  @js.native
  trait LoggerType
    extends StObject
       with Logger {
    
    def child(contextOrFunction: MessageContextType): LoggerType = js.native
    /**
      * Creates a child logger appending the provided context object to the previous logger context.
      *
      * @param contextOrFunction
      * @example
      * import Roarr from 'roarr';
      *
      * const log = Roarr.child({ module: "myModule" });
      *
      * log.debug("My Message");
      * // {"context":{"logLevel":20},"Message":"My Message","sequence":0,"time":1531914529921,"version":"1.0.0"}
      *
      * @see https://www.npmjs.com/package/roarr#child
      */
    def child(contextOrFunction: TranslateMessageFunctionType): LoggerType = js.native
    
    /**
      * Convenience method for logging a message with logLevel context property value set to 20 (LogLevel.Debug)
      *
      * @example
      * import Roarr from 'roarr';
      *
      * const log = Roarr;
      *
      * log.debug('foo');
      * // {"context":{"logLevel":20},"message":"foo","sequence":0,"time":1506776210000,"version":"1.0.0"}
      *
      * @see https://www.npmjs.com/package/roarr#trace
      */
    def debug(
      context: MessageContextType,
      message: String,
      c: js.UndefOr[SprintfArgumentType],
      d: js.UndefOr[SprintfArgumentType],
      e: js.UndefOr[SprintfArgumentType],
      f: js.UndefOr[SprintfArgumentType],
      g: js.UndefOr[SprintfArgumentType],
      h: js.UndefOr[SprintfArgumentType],
      i: js.UndefOr[SprintfArgumentType],
      k: js.UndefOr[SprintfArgumentType]
    ): Unit = js.native
    /**
      * Convenience method for logging a message with logLevel context property value set to 20 (LogLevel.Debug)
      *
      * @example
      * import Roarr from 'roarr';
      *
      * const log = Roarr;
      *
      * log.debug('foo');
      * // {"context":{"logLevel":20},"message":"foo","sequence":0,"time":1506776210000,"version":"1.0.0"}
      *
      * @see https://www.npmjs.com/package/roarr#trace
      */
    def debug(
      message: String,
      b: js.UndefOr[SprintfArgumentType],
      c: js.UndefOr[SprintfArgumentType],
      d: js.UndefOr[SprintfArgumentType],
      e: js.UndefOr[SprintfArgumentType],
      f: js.UndefOr[SprintfArgumentType],
      g: js.UndefOr[SprintfArgumentType],
      h: js.UndefOr[SprintfArgumentType],
      i: js.UndefOr[SprintfArgumentType]
    ): Unit = js.native
    /**
      * Convenience method for logging a message with logLevel context property value set to 20 (LogLevel.Debug)
      *
      * @example
      * import Roarr from 'roarr';
      *
      * const log = Roarr;
      *
      * log.debug('foo');
      * // {"context":{"logLevel":20},"message":"foo","sequence":0,"time":1506776210000,"version":"1.0.0"}
      *
      * @see https://www.npmjs.com/package/roarr#trace
      */
    @JSName("debug")
    var debug_Original: Logger = js.native
    
    /**
      * Convenience method for logging a message with logLevel context property value set to 50 (LogLevel.Error)
      *
      * @example
      * import Roarr from 'roarr';
      *
      * const log = Roarr;
      *
      * log.error('foo');
      * // {"context":{"logLevel":50},"message":"foo","sequence":0,"time":1506776210000,"version":"1.0.0"}
      *
      * @see https://www.npmjs.com/package/roarr#trace
      */
    def error(
      context: MessageContextType,
      message: String,
      c: js.UndefOr[SprintfArgumentType],
      d: js.UndefOr[SprintfArgumentType],
      e: js.UndefOr[SprintfArgumentType],
      f: js.UndefOr[SprintfArgumentType],
      g: js.UndefOr[SprintfArgumentType],
      h: js.UndefOr[SprintfArgumentType],
      i: js.UndefOr[SprintfArgumentType],
      k: js.UndefOr[SprintfArgumentType]
    ): Unit = js.native
    /**
      * Convenience method for logging a message with logLevel context property value set to 50 (LogLevel.Error)
      *
      * @example
      * import Roarr from 'roarr';
      *
      * const log = Roarr;
      *
      * log.error('foo');
      * // {"context":{"logLevel":50},"message":"foo","sequence":0,"time":1506776210000,"version":"1.0.0"}
      *
      * @see https://www.npmjs.com/package/roarr#trace
      */
    def error(
      message: String,
      b: js.UndefOr[SprintfArgumentType],
      c: js.UndefOr[SprintfArgumentType],
      d: js.UndefOr[SprintfArgumentType],
      e: js.UndefOr[SprintfArgumentType],
      f: js.UndefOr[SprintfArgumentType],
      g: js.UndefOr[SprintfArgumentType],
      h: js.UndefOr[SprintfArgumentType],
      i: js.UndefOr[SprintfArgumentType]
    ): Unit = js.native
    /**
      * Convenience method for logging a message with logLevel context property value set to 50 (LogLevel.Error)
      *
      * @example
      * import Roarr from 'roarr';
      *
      * const log = Roarr;
      *
      * log.error('foo');
      * // {"context":{"logLevel":50},"message":"foo","sequence":0,"time":1506776210000,"version":"1.0.0"}
      *
      * @see https://www.npmjs.com/package/roarr#trace
      */
    @JSName("error")
    var error_Original: Logger = js.native
    
    /**
      * Convenience method for logging a message with logLevel context property value set to 60 (LogLevel.Fatal)
      *
      * @example
      * import Roarr from 'roarr';
      *
      * const log = Roarr;
      *
      * log.fatal('foo');
      * // {"context":{"logLevel":60},"message":"foo","sequence":0,"time":1506776210000,"version":"1.0.0"}
      *
      * @see https://www.npmjs.com/package/roarr#trace
      */
    def fatal(
      context: MessageContextType,
      message: String,
      c: js.UndefOr[SprintfArgumentType],
      d: js.UndefOr[SprintfArgumentType],
      e: js.UndefOr[SprintfArgumentType],
      f: js.UndefOr[SprintfArgumentType],
      g: js.UndefOr[SprintfArgumentType],
      h: js.UndefOr[SprintfArgumentType],
      i: js.UndefOr[SprintfArgumentType],
      k: js.UndefOr[SprintfArgumentType]
    ): Unit = js.native
    /**
      * Convenience method for logging a message with logLevel context property value set to 60 (LogLevel.Fatal)
      *
      * @example
      * import Roarr from 'roarr';
      *
      * const log = Roarr;
      *
      * log.fatal('foo');
      * // {"context":{"logLevel":60},"message":"foo","sequence":0,"time":1506776210000,"version":"1.0.0"}
      *
      * @see https://www.npmjs.com/package/roarr#trace
      */
    def fatal(
      message: String,
      b: js.UndefOr[SprintfArgumentType],
      c: js.UndefOr[SprintfArgumentType],
      d: js.UndefOr[SprintfArgumentType],
      e: js.UndefOr[SprintfArgumentType],
      f: js.UndefOr[SprintfArgumentType],
      g: js.UndefOr[SprintfArgumentType],
      h: js.UndefOr[SprintfArgumentType],
      i: js.UndefOr[SprintfArgumentType]
    ): Unit = js.native
    /**
      * Convenience method for logging a message with logLevel context property value set to 60 (LogLevel.Fatal)
      *
      * @example
      * import Roarr from 'roarr';
      *
      * const log = Roarr;
      *
      * log.fatal('foo');
      * // {"context":{"logLevel":60},"message":"foo","sequence":0,"time":1506776210000,"version":"1.0.0"}
      *
      * @see https://www.npmjs.com/package/roarr#trace
      */
    @JSName("fatal")
    var fatal_Original: Logger = js.native
    
    /**
      * Returns the current context.
      */
    def getContext(): MessageContextType = js.native
    
    /**
      * Convenience method for logging a message with logLevel context property value set to 30 (LogLevel.Info)
      *
      * @example
      * import Roarr from 'roarr';
      *
      * const log = Roarr;
      *
      * log.info('foo');
      * // {"context":{"logLevel":30},"message":"foo","sequence":0,"time":1506776210000,"version":"1.0.0"}
      *
      * @see https://www.npmjs.com/package/roarr#trace
      */
    def info(
      context: MessageContextType,
      message: String,
      c: js.UndefOr[SprintfArgumentType],
      d: js.UndefOr[SprintfArgumentType],
      e: js.UndefOr[SprintfArgumentType],
      f: js.UndefOr[SprintfArgumentType],
      g: js.UndefOr[SprintfArgumentType],
      h: js.UndefOr[SprintfArgumentType],
      i: js.UndefOr[SprintfArgumentType],
      k: js.UndefOr[SprintfArgumentType]
    ): Unit = js.native
    /**
      * Convenience method for logging a message with logLevel context property value set to 30 (LogLevel.Info)
      *
      * @example
      * import Roarr from 'roarr';
      *
      * const log = Roarr;
      *
      * log.info('foo');
      * // {"context":{"logLevel":30},"message":"foo","sequence":0,"time":1506776210000,"version":"1.0.0"}
      *
      * @see https://www.npmjs.com/package/roarr#trace
      */
    def info(
      message: String,
      b: js.UndefOr[SprintfArgumentType],
      c: js.UndefOr[SprintfArgumentType],
      d: js.UndefOr[SprintfArgumentType],
      e: js.UndefOr[SprintfArgumentType],
      f: js.UndefOr[SprintfArgumentType],
      g: js.UndefOr[SprintfArgumentType],
      h: js.UndefOr[SprintfArgumentType],
      i: js.UndefOr[SprintfArgumentType]
    ): Unit = js.native
    /**
      * Convenience method for logging a message with logLevel context property value set to 30 (LogLevel.Info)
      *
      * @example
      * import Roarr from 'roarr';
      *
      * const log = Roarr;
      *
      * log.info('foo');
      * // {"context":{"logLevel":30},"message":"foo","sequence":0,"time":1506776210000,"version":"1.0.0"}
      *
      * @see https://www.npmjs.com/package/roarr#trace
      */
    @JSName("info")
    var info_Original: Logger = js.native
    
    /**
      * Convenience method for logging a message with logLevel context property value set to 10 (LogLevel.Trace)
      *
      * @example
      * import Roarr from 'roarr';
      *
      * const log = Roarr;
      *
      * log.trace('foo');
      * // {"context":{"logLevel":10},"message":"foo","sequence":0,"time":1506776210000,"version":"1.0.0"}
      *
      * @see https://www.npmjs.com/package/roarr#trace
      */
    def trace(
      context: MessageContextType,
      message: String,
      c: js.UndefOr[SprintfArgumentType],
      d: js.UndefOr[SprintfArgumentType],
      e: js.UndefOr[SprintfArgumentType],
      f: js.UndefOr[SprintfArgumentType],
      g: js.UndefOr[SprintfArgumentType],
      h: js.UndefOr[SprintfArgumentType],
      i: js.UndefOr[SprintfArgumentType],
      k: js.UndefOr[SprintfArgumentType]
    ): Unit = js.native
    /**
      * Convenience method for logging a message with logLevel context property value set to 10 (LogLevel.Trace)
      *
      * @example
      * import Roarr from 'roarr';
      *
      * const log = Roarr;
      *
      * log.trace('foo');
      * // {"context":{"logLevel":10},"message":"foo","sequence":0,"time":1506776210000,"version":"1.0.0"}
      *
      * @see https://www.npmjs.com/package/roarr#trace
      */
    def trace(
      message: String,
      b: js.UndefOr[SprintfArgumentType],
      c: js.UndefOr[SprintfArgumentType],
      d: js.UndefOr[SprintfArgumentType],
      e: js.UndefOr[SprintfArgumentType],
      f: js.UndefOr[SprintfArgumentType],
      g: js.UndefOr[SprintfArgumentType],
      h: js.UndefOr[SprintfArgumentType],
      i: js.UndefOr[SprintfArgumentType]
    ): Unit = js.native
    /**
      * Convenience method for logging a message with logLevel context property value set to 10 (LogLevel.Trace)
      *
      * @example
      * import Roarr from 'roarr';
      *
      * const log = Roarr;
      *
      * log.trace('foo');
      * // {"context":{"logLevel":10},"message":"foo","sequence":0,"time":1506776210000,"version":"1.0.0"}
      *
      * @see https://www.npmjs.com/package/roarr#trace
      */
    @JSName("trace")
    var trace_Original: Logger = js.native
    
    /**
      * Convenience method for logging a message with logLevel context property value set to 40 (LogLevel.Warn)
      *
      * @example
      * import Roarr from 'roarr';
      *
      * const log = Roarr;
      *
      * log.warn('foo');
      * // {"context":{"logLevel":40},"message":"foo","sequence":0,"time":1506776210000,"version":"1.0.0"}
      *
      * @see https://www.npmjs.com/package/roarr#trace
      */
    def warn(
      context: MessageContextType,
      message: String,
      c: js.UndefOr[SprintfArgumentType],
      d: js.UndefOr[SprintfArgumentType],
      e: js.UndefOr[SprintfArgumentType],
      f: js.UndefOr[SprintfArgumentType],
      g: js.UndefOr[SprintfArgumentType],
      h: js.UndefOr[SprintfArgumentType],
      i: js.UndefOr[SprintfArgumentType],
      k: js.UndefOr[SprintfArgumentType]
    ): Unit = js.native
    /**
      * Convenience method for logging a message with logLevel context property value set to 40 (LogLevel.Warn)
      *
      * @example
      * import Roarr from 'roarr';
      *
      * const log = Roarr;
      *
      * log.warn('foo');
      * // {"context":{"logLevel":40},"message":"foo","sequence":0,"time":1506776210000,"version":"1.0.0"}
      *
      * @see https://www.npmjs.com/package/roarr#trace
      */
    def warn(
      message: String,
      b: js.UndefOr[SprintfArgumentType],
      c: js.UndefOr[SprintfArgumentType],
      d: js.UndefOr[SprintfArgumentType],
      e: js.UndefOr[SprintfArgumentType],
      f: js.UndefOr[SprintfArgumentType],
      g: js.UndefOr[SprintfArgumentType],
      h: js.UndefOr[SprintfArgumentType],
      i: js.UndefOr[SprintfArgumentType]
    ): Unit = js.native
    /**
      * Convenience method for logging a message with logLevel context property value set to 40 (LogLevel.Warn)
      *
      * @example
      * import Roarr from 'roarr';
      *
      * const log = Roarr;
      *
      * log.warn('foo');
      * // {"context":{"logLevel":40},"message":"foo","sequence":0,"time":1506776210000,"version":"1.0.0"}
      *
      * @see https://www.npmjs.com/package/roarr#trace
      */
    @JSName("warn")
    var warn_Original: Logger = js.native
  }
  
  trait MessageContextType
    extends StObject
       with /* k */ StringDictionary[js.Any] {
    
    @JSName("package")
    var _package: js.UndefOr[String] = js.undefined
    
    var application: js.UndefOr[String] = js.undefined
    
    var logLevel: js.UndefOr[Double] = js.undefined
    
    var namespace: js.UndefOr[String] = js.undefined
  }
  object MessageContextType {
    
    inline def apply(): MessageContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageContextType]
    }
    
    extension [Self <: MessageContextType](x: Self) {
      
      inline def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
      
      inline def setLogLevel(value: Double): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
      
      inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
    }
  }
  
  type MessageEventHandlerType = js.Function1[/* message */ MessageType, Unit]
  
  trait MessageType extends StObject {
    
    var context: MessageContextType
    
    var message: String
    
    var sequence: Double
    
    var time: Double
    
    var version: String
  }
  object MessageType {
    
    inline def apply(context: MessageContextType, message: String, sequence: Double, time: Double, version: String): MessageType = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageType]
    }
    
    extension [Self <: MessageType](x: Self) {
      
      inline def setContext(value: MessageContextType): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoarrGlobalStateType
    extends StObject
       with WriterType {
    
    var sequence: Double
    
    var versions: js.Array[String]
  }
  object RoarrGlobalStateType {
    
    inline def apply(sequence: Double, versions: js.Array[String], write: String => Unit): RoarrGlobalStateType = {
      val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[RoarrGlobalStateType]
    }
    
    extension [Self <: RoarrGlobalStateType](x: Self) {
      
      inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setVersions(value: js.Array[String]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsVarargs(value: String*): Self = StObject.set(x, "versions", js.Array(value :_*))
    }
  }
  
  type SprintfArgumentType = String | Double | Boolean | Null
  
  type TranslateMessageFunctionType = js.Function1[/* message */ MessageType, MessageType]
  
  trait WriterType extends StObject {
    
    def write(message: String): Unit
  }
  object WriterType {
    
    inline def apply(write: String => Unit): WriterType = {
      val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[WriterType]
    }
    
    extension [Self <: WriterType](x: Self) {
      
      inline def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  type _To = LoggerType
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: LoggerType = default
}
