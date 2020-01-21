package typings.roarr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggerType extends Logger {
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
  @JSName("fatal")
  var fatal_Original: Logger = js.native
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
  @JSName("warn")
  var warn_Original: Logger = js.native
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
}

