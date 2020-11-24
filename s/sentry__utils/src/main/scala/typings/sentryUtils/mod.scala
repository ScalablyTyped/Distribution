package typings.sentryUtils

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.dsnMod.DsnLike
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.miscMod.ExtractedNodeRequestData
import typings.sentryTypes.stackframeMod.StackFrame
import typings.sentryUtils.anon.Host
import typings.sentryUtils.instrumentMod.InstrumentHandler
import typings.sentryUtils.loggerMod.Logger_
import typings.sentryUtils.miscMod.SemVer
import typings.sentryUtils.miscMod.SentryGlobal
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addContextToFrame(lines: js.Array[String], frame: StackFrame): Unit = js.native
  def addContextToFrame(lines: js.Array[String], frame: StackFrame, linesOfContext: Double): Unit = js.native
  
  def addExceptionMechanism(event: Event): Unit = js.native
  def addExceptionMechanism(event: Event, mechanism: StringDictionary[js.Any]): Unit = js.native
  
  def addExceptionTypeValue(event: Event): Unit = js.native
  def addExceptionTypeValue(event: Event, value: js.UndefOr[scala.Nothing], `type`: String): Unit = js.native
  def addExceptionTypeValue(event: Event, value: String): Unit = js.native
  def addExceptionTypeValue(event: Event, value: String, `type`: String): Unit = js.native
  
  def addInstrumentationHandler(handler: InstrumentHandler): Unit = js.native
  
  def basename(path: String): String = js.native
  def basename(path: String, ext: String): String = js.native
  
  val browserPerformanceTimeOrigin: js.UndefOr[Double] = js.native
  
  def consoleSandbox(callback: js.Function0[_]): js.Any = js.native
  
  val dateTimestampInSeconds: js.Any = js.native
  
  def dirname(path: String): String = js.native
  
  def dropUndefinedKeys[T](`val`: T): T = js.native
  
  def dynamicRequire(mod: js.Any, request: String): js.Any = js.native
  
  def extractExceptionKeysForMessage(exception: js.Any): String = js.native
  def extractExceptionKeysForMessage(exception: js.Any, maxLength: Double): String = js.native
  
  def extractNodeRequestData(req: StringDictionary[js.Any]): ExtractedNodeRequestData = js.native
  def extractNodeRequestData(req: StringDictionary[js.Any], keys: js.Array[String]): ExtractedNodeRequestData = js.native
  
  def fill(
    source: StringDictionary[js.Any],
    name: String,
    replacement: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  
  def forget(promise: js.Thenable[_]): Unit = js.native
  
  def getEventDescription(event: Event): String = js.native
  
  def getFunctionName(fn: js.Any): String = js.native
  
  def getGlobalObject[T](): T with SentryGlobal = js.native
  
  def getLocationHref(): String = js.native
  
  def htmlTreeAsString(elem: js.Any): String = js.native
  
  def isAbsolute(path: String): Boolean = js.native
  
  def isDOMError(wat: js.Any): Boolean = js.native
  
  def isDOMException(wat: js.Any): Boolean = js.native
  
  def isElement(wat: js.Any): Boolean = js.native
  
  def isError(wat: js.Any): Boolean = js.native
  
  def isErrorEvent(wat: js.Any): Boolean = js.native
  
  def isEvent(wat: js.Any): Boolean = js.native
  
  def isInstanceOf(wat: js.Any, base: js.Any): Boolean = js.native
  
  def isMatchingPattern(value: String, pattern: String): Boolean = js.native
  def isMatchingPattern(value: String, pattern: RegExp): Boolean = js.native
  
  def isNodeEnv(): Boolean = js.native
  
  def isPlainObject(wat: js.Any): Boolean = js.native
  
  def isPrimitive(wat: js.Any): Boolean = js.native
  
  def isRegExp(wat: js.Any): Boolean = js.native
  
  def isString(wat: js.Any): Boolean = js.native
  
  def isSyntheticEvent(wat: js.Any): Boolean = js.native
  
  def isThenable(wat: js.Any): Boolean = js.native
  
  def join(args: String*): String = js.native
  
  val logger: Logger_ = js.native
  
  def normalize(input: js.Any): js.Any = js.native
  def normalize(input: js.Any, depth: Double): js.Any = js.native
  
  def normalizePath(path: String): String = js.native
  
  def normalizeToSize[T](`object`: StringDictionary[js.Any]): T = js.native
  def normalizeToSize[T](`object`: StringDictionary[js.Any], depth: js.UndefOr[scala.Nothing], maxSize: Double): T = js.native
  def normalizeToSize[T](`object`: StringDictionary[js.Any], depth: Double): T = js.native
  def normalizeToSize[T](`object`: StringDictionary[js.Any], depth: Double, maxSize: Double): T = js.native
  
  def parseRetryAfterHeader(now: Double): Double = js.native
  def parseRetryAfterHeader(now: Double, header: String): Double = js.native
  def parseRetryAfterHeader(now: Double, header: Double): Double = js.native
  
  def parseSemver(input: String): SemVer = js.native
  
  def parseUrl(url: String): Host = js.native
  
  def relative(from: String, to: String): String = js.native
  
  def resolve(args: String*): String = js.native
  
  def safeJoin(input: js.Array[_]): String = js.native
  def safeJoin(input: js.Array[_], delimiter: String): String = js.native
  
  def snipLine(line: String, colno: Double): String = js.native
  
  def stripUrlQueryAndFragment(urlPath: String): String = js.native
  
  def supportsDOMError(): Boolean = js.native
  
  def supportsDOMException(): Boolean = js.native
  
  def supportsErrorEvent(): Boolean = js.native
  
  def supportsFetch(): Boolean = js.native
  
  def supportsHistory(): Boolean = js.native
  
  def supportsNativeFetch(): Boolean = js.native
  
  def supportsReferrerPolicy(): Boolean = js.native
  
  def supportsReportingObserver(): Boolean = js.native
  
  val timestampInSeconds: js.Any = js.native
  
  val timestampWithMs: js.Any = js.native
  
  def truncate(str: String): String = js.native
  def truncate(str: String, max: Double): String = js.native
  
  def urlEncode(`object`: StringDictionary[js.Any]): String = js.native
  
  val usingPerformanceAPI: Boolean = js.native
  
  def uuid4(): String = js.native
  
  def walk(key: String, value: js.Any): js.Any = js.native
  def walk(
    key: String,
    value: js.Any,
    depth: js.UndefOr[scala.Nothing],
    memo: typings.sentryUtils.memoMod.Memo
  ): js.Any = js.native
  def walk(key: String, value: js.Any, depth: Double): js.Any = js.native
  def walk(key: String, value: js.Any, depth: Double, memo: typings.sentryUtils.memoMod.Memo): js.Any = js.native
  
  @js.native
  class Dsn protected ()
    extends typings.sentryUtils.dsnMod.Dsn {
    /** Creates a new Dsn component */
    def this(from: DsnLike) = this()
  }
  
  @js.native
  class Memo ()
    extends typings.sentryUtils.memoMod.Memo
  
  @js.native
  class PromiseBuffer[T] ()
    extends typings.sentryUtils.promisebufferMod.PromiseBuffer[T] {
    def this(_limit: Double) = this()
  }
  
  @js.native
  class SentryError protected ()
    extends typings.sentryUtils.errorMod.SentryError {
    def this(message: String) = this()
  }
  
  @js.native
  class SyncPromise[T] protected ()
    extends typings.sentryUtils.syncpromiseMod.SyncPromise[T] {
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T] | Null], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ]) = this()
  }
  /* static members */
  @js.native
  object SyncPromise extends js.Object {
    
    /** JSDoc */
    def all[U](collection: js.Array[U | js.Thenable[U]]): js.Thenable[js.Array[U]] = js.native
    
    /** JSDoc */
    def reject[T](): js.Thenable[T] = js.native
    def reject[T](reason: js.Any): js.Thenable[T] = js.native
    
    /** JSDoc */
    def resolve[T](value: T): js.Thenable[T] = js.native
    def resolve[T](value: js.Thenable[T]): js.Thenable[T] = js.native
  }
}
