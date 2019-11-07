package typings.roarr.roarrMod.Roarr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoarrType extends js.Object {
  def apply(
    context: MessageContextType,
    message: String,
    _0: js.UndefOr[SprintfArgumentType],
    _1: js.UndefOr[SprintfArgumentType],
    _2: js.UndefOr[SprintfArgumentType],
    _3: js.UndefOr[SprintfArgumentType],
    _4: js.UndefOr[SprintfArgumentType],
    _5: js.UndefOr[SprintfArgumentType],
    _6: js.UndefOr[SprintfArgumentType],
    _7: js.UndefOr[SprintfArgumentType]
  ): Unit = js.native
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
  def child(contextOrFunction: MessageContextType): RoarrType = js.native
  def child(contextOrFunction: TranslateMessageFunctionType): RoarrType = js.native
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
    _0: js.UndefOr[SprintfArgumentType],
    _1: js.UndefOr[SprintfArgumentType],
    _2: js.UndefOr[SprintfArgumentType],
    _3: js.UndefOr[SprintfArgumentType],
    _4: js.UndefOr[SprintfArgumentType],
    _5: js.UndefOr[SprintfArgumentType],
    _6: js.UndefOr[SprintfArgumentType],
    _7: js.UndefOr[SprintfArgumentType]
  ): Unit = js.native
  def debug(
    message: String,
    _0: js.UndefOr[SprintfArgumentType],
    _1: js.UndefOr[SprintfArgumentType],
    _2: js.UndefOr[SprintfArgumentType],
    _3: js.UndefOr[SprintfArgumentType],
    _4: js.UndefOr[SprintfArgumentType],
    _5: js.UndefOr[SprintfArgumentType],
    _6: js.UndefOr[SprintfArgumentType],
    _7: js.UndefOr[SprintfArgumentType]
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
    _0: js.UndefOr[SprintfArgumentType],
    _1: js.UndefOr[SprintfArgumentType],
    _2: js.UndefOr[SprintfArgumentType],
    _3: js.UndefOr[SprintfArgumentType],
    _4: js.UndefOr[SprintfArgumentType],
    _5: js.UndefOr[SprintfArgumentType],
    _6: js.UndefOr[SprintfArgumentType],
    _7: js.UndefOr[SprintfArgumentType]
  ): Unit = js.native
  def error(
    message: String,
    _0: js.UndefOr[SprintfArgumentType],
    _1: js.UndefOr[SprintfArgumentType],
    _2: js.UndefOr[SprintfArgumentType],
    _3: js.UndefOr[SprintfArgumentType],
    _4: js.UndefOr[SprintfArgumentType],
    _5: js.UndefOr[SprintfArgumentType],
    _6: js.UndefOr[SprintfArgumentType],
    _7: js.UndefOr[SprintfArgumentType]
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
    _0: js.UndefOr[SprintfArgumentType],
    _1: js.UndefOr[SprintfArgumentType],
    _2: js.UndefOr[SprintfArgumentType],
    _3: js.UndefOr[SprintfArgumentType],
    _4: js.UndefOr[SprintfArgumentType],
    _5: js.UndefOr[SprintfArgumentType],
    _6: js.UndefOr[SprintfArgumentType],
    _7: js.UndefOr[SprintfArgumentType]
  ): Unit = js.native
  def fatal(
    message: String,
    _0: js.UndefOr[SprintfArgumentType],
    _1: js.UndefOr[SprintfArgumentType],
    _2: js.UndefOr[SprintfArgumentType],
    _3: js.UndefOr[SprintfArgumentType],
    _4: js.UndefOr[SprintfArgumentType],
    _5: js.UndefOr[SprintfArgumentType],
    _6: js.UndefOr[SprintfArgumentType],
    _7: js.UndefOr[SprintfArgumentType]
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
    _0: js.UndefOr[SprintfArgumentType],
    _1: js.UndefOr[SprintfArgumentType],
    _2: js.UndefOr[SprintfArgumentType],
    _3: js.UndefOr[SprintfArgumentType],
    _4: js.UndefOr[SprintfArgumentType],
    _5: js.UndefOr[SprintfArgumentType],
    _6: js.UndefOr[SprintfArgumentType],
    _7: js.UndefOr[SprintfArgumentType]
  ): Unit = js.native
  def info(
    message: String,
    _0: js.UndefOr[SprintfArgumentType],
    _1: js.UndefOr[SprintfArgumentType],
    _2: js.UndefOr[SprintfArgumentType],
    _3: js.UndefOr[SprintfArgumentType],
    _4: js.UndefOr[SprintfArgumentType],
    _5: js.UndefOr[SprintfArgumentType],
    _6: js.UndefOr[SprintfArgumentType],
    _7: js.UndefOr[SprintfArgumentType]
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
    _0: js.UndefOr[SprintfArgumentType],
    _1: js.UndefOr[SprintfArgumentType],
    _2: js.UndefOr[SprintfArgumentType],
    _3: js.UndefOr[SprintfArgumentType],
    _4: js.UndefOr[SprintfArgumentType],
    _5: js.UndefOr[SprintfArgumentType],
    _6: js.UndefOr[SprintfArgumentType],
    _7: js.UndefOr[SprintfArgumentType]
  ): Unit = js.native
  def trace(
    message: String,
    _0: js.UndefOr[SprintfArgumentType],
    _1: js.UndefOr[SprintfArgumentType],
    _2: js.UndefOr[SprintfArgumentType],
    _3: js.UndefOr[SprintfArgumentType],
    _4: js.UndefOr[SprintfArgumentType],
    _5: js.UndefOr[SprintfArgumentType],
    _6: js.UndefOr[SprintfArgumentType],
    _7: js.UndefOr[SprintfArgumentType]
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
    _0: js.UndefOr[SprintfArgumentType],
    _1: js.UndefOr[SprintfArgumentType],
    _2: js.UndefOr[SprintfArgumentType],
    _3: js.UndefOr[SprintfArgumentType],
    _4: js.UndefOr[SprintfArgumentType],
    _5: js.UndefOr[SprintfArgumentType],
    _6: js.UndefOr[SprintfArgumentType],
    _7: js.UndefOr[SprintfArgumentType]
  ): Unit = js.native
  def warn(
    message: String,
    _0: js.UndefOr[SprintfArgumentType],
    _1: js.UndefOr[SprintfArgumentType],
    _2: js.UndefOr[SprintfArgumentType],
    _3: js.UndefOr[SprintfArgumentType],
    _4: js.UndefOr[SprintfArgumentType],
    _5: js.UndefOr[SprintfArgumentType],
    _6: js.UndefOr[SprintfArgumentType],
    _7: js.UndefOr[SprintfArgumentType]
  ): Unit = js.native
}

