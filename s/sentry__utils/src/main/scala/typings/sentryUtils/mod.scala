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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/utils", "Dsn")
  @js.native
  class Dsn protected ()
    extends typings.sentryUtils.dsnMod.Dsn {
    /** Creates a new Dsn component */
    def this(from: DsnLike) = this()
  }
  
  @JSImport("@sentry/utils", "Memo")
  @js.native
  class Memo ()
    extends typings.sentryUtils.memoMod.Memo
  
  @JSImport("@sentry/utils", "PromiseBuffer")
  @js.native
  class PromiseBuffer[T] ()
    extends typings.sentryUtils.promisebufferMod.PromiseBuffer[T] {
    def this(_limit: Double) = this()
  }
  
  @JSImport("@sentry/utils", "SentryError")
  @js.native
  class SentryError protected ()
    extends typings.sentryUtils.errorMod.SentryError {
    def this(message: String) = this()
  }
  
  @JSImport("@sentry/utils", "SyncPromise")
  @js.native
  class SyncPromise[T] protected ()
    extends typings.sentryUtils.syncpromiseMod.SyncPromise[T] {
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T] | Null], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ]) = this()
  }
  object SyncPromise {
    
    /** JSDoc */
    /* static member */
    @JSImport("@sentry/utils", "SyncPromise.all")
    @js.native
    def all[U](collection: js.Array[U | js.Thenable[U]]): js.Thenable[js.Array[U]] = js.native
    
    /** JSDoc */
    /* static member */
    @JSImport("@sentry/utils", "SyncPromise.reject")
    @js.native
    def reject[T](): js.Thenable[T] = js.native
    @JSImport("@sentry/utils", "SyncPromise.reject")
    @js.native
    def reject[T](reason: js.Any): js.Thenable[T] = js.native
    
    /** JSDoc */
    /* static member */
    @JSImport("@sentry/utils", "SyncPromise.resolve")
    @js.native
    def resolve[T](value: T): js.Thenable[T] = js.native
    @JSImport("@sentry/utils", "SyncPromise.resolve")
    @js.native
    def resolve[T](value: js.Thenable[T]): js.Thenable[T] = js.native
  }
  
  @JSImport("@sentry/utils", "addContextToFrame")
  @js.native
  def addContextToFrame(lines: js.Array[String], frame: StackFrame): Unit = js.native
  @JSImport("@sentry/utils", "addContextToFrame")
  @js.native
  def addContextToFrame(lines: js.Array[String], frame: StackFrame, linesOfContext: Double): Unit = js.native
  
  @JSImport("@sentry/utils", "addExceptionMechanism")
  @js.native
  def addExceptionMechanism(event: Event): Unit = js.native
  @JSImport("@sentry/utils", "addExceptionMechanism")
  @js.native
  def addExceptionMechanism(event: Event, mechanism: StringDictionary[js.Any]): Unit = js.native
  
  @JSImport("@sentry/utils", "addExceptionTypeValue")
  @js.native
  def addExceptionTypeValue(event: Event): Unit = js.native
  @JSImport("@sentry/utils", "addExceptionTypeValue")
  @js.native
  def addExceptionTypeValue(event: Event, value: js.UndefOr[scala.Nothing], `type`: String): Unit = js.native
  @JSImport("@sentry/utils", "addExceptionTypeValue")
  @js.native
  def addExceptionTypeValue(event: Event, value: String): Unit = js.native
  @JSImport("@sentry/utils", "addExceptionTypeValue")
  @js.native
  def addExceptionTypeValue(event: Event, value: String, `type`: String): Unit = js.native
  
  @JSImport("@sentry/utils", "addInstrumentationHandler")
  @js.native
  def addInstrumentationHandler(handler: InstrumentHandler): Unit = js.native
  
  @JSImport("@sentry/utils", "basename")
  @js.native
  def basename(path: String): String = js.native
  @JSImport("@sentry/utils", "basename")
  @js.native
  def basename(path: String, ext: String): String = js.native
  
  @JSImport("@sentry/utils", "browserPerformanceTimeOrigin")
  @js.native
  val browserPerformanceTimeOrigin: js.UndefOr[Double] = js.native
  
  @JSImport("@sentry/utils", "consoleSandbox")
  @js.native
  def consoleSandbox(callback: js.Function0[_]): js.Any = js.native
  
  @JSImport("@sentry/utils", "dateTimestampInSeconds")
  @js.native
  val dateTimestampInSeconds: js.Any = js.native
  
  @JSImport("@sentry/utils", "dirname")
  @js.native
  def dirname(path: String): String = js.native
  
  @JSImport("@sentry/utils", "dropUndefinedKeys")
  @js.native
  def dropUndefinedKeys[T](`val`: T): T = js.native
  
  @JSImport("@sentry/utils", "dynamicRequire")
  @js.native
  def dynamicRequire(mod: js.Any, request: String): js.Any = js.native
  
  @JSImport("@sentry/utils", "extractExceptionKeysForMessage")
  @js.native
  def extractExceptionKeysForMessage(exception: js.Any): String = js.native
  @JSImport("@sentry/utils", "extractExceptionKeysForMessage")
  @js.native
  def extractExceptionKeysForMessage(exception: js.Any, maxLength: Double): String = js.native
  
  @JSImport("@sentry/utils", "extractNodeRequestData")
  @js.native
  def extractNodeRequestData(req: StringDictionary[js.Any]): ExtractedNodeRequestData = js.native
  @JSImport("@sentry/utils", "extractNodeRequestData")
  @js.native
  def extractNodeRequestData(req: StringDictionary[js.Any], keys: js.Array[String]): ExtractedNodeRequestData = js.native
  
  @JSImport("@sentry/utils", "fill")
  @js.native
  def fill(
    source: StringDictionary[js.Any],
    name: String,
    replacement: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  
  @JSImport("@sentry/utils", "forget")
  @js.native
  def forget(promise: js.Thenable[_]): Unit = js.native
  
  @JSImport("@sentry/utils", "getEventDescription")
  @js.native
  def getEventDescription(event: Event): String = js.native
  
  @JSImport("@sentry/utils", "getFunctionName")
  @js.native
  def getFunctionName(fn: js.Any): String = js.native
  
  @JSImport("@sentry/utils", "getGlobalObject")
  @js.native
  def getGlobalObject[T](): T with SentryGlobal = js.native
  
  @JSImport("@sentry/utils", "getLocationHref")
  @js.native
  def getLocationHref(): String = js.native
  
  @JSImport("@sentry/utils", "htmlTreeAsString")
  @js.native
  def htmlTreeAsString(elem: js.Any): String = js.native
  
  @JSImport("@sentry/utils", "isAbsolute")
  @js.native
  def isAbsolute(path: String): Boolean = js.native
  
  @JSImport("@sentry/utils", "isDOMError")
  @js.native
  def isDOMError(wat: js.Any): Boolean = js.native
  
  @JSImport("@sentry/utils", "isDOMException")
  @js.native
  def isDOMException(wat: js.Any): Boolean = js.native
  
  @JSImport("@sentry/utils", "isElement")
  @js.native
  def isElement(wat: js.Any): Boolean = js.native
  
  @JSImport("@sentry/utils", "isError")
  @js.native
  def isError(wat: js.Any): Boolean = js.native
  
  @JSImport("@sentry/utils", "isErrorEvent")
  @js.native
  def isErrorEvent(wat: js.Any): Boolean = js.native
  
  @JSImport("@sentry/utils", "isEvent")
  @js.native
  def isEvent(wat: js.Any): Boolean = js.native
  
  @JSImport("@sentry/utils", "isInstanceOf")
  @js.native
  def isInstanceOf(wat: js.Any, base: js.Any): Boolean = js.native
  
  @JSImport("@sentry/utils", "isMatchingPattern")
  @js.native
  def isMatchingPattern(value: String, pattern: String): Boolean = js.native
  @JSImport("@sentry/utils", "isMatchingPattern")
  @js.native
  def isMatchingPattern(value: String, pattern: RegExp): Boolean = js.native
  
  @JSImport("@sentry/utils", "isNodeEnv")
  @js.native
  def isNodeEnv(): Boolean = js.native
  
  @JSImport("@sentry/utils", "isPlainObject")
  @js.native
  def isPlainObject(wat: js.Any): Boolean = js.native
  
  @JSImport("@sentry/utils", "isPrimitive")
  @js.native
  def isPrimitive(wat: js.Any): Boolean = js.native
  
  @JSImport("@sentry/utils", "isRegExp")
  @js.native
  def isRegExp(wat: js.Any): Boolean = js.native
  
  @JSImport("@sentry/utils", "isString")
  @js.native
  def isString(wat: js.Any): Boolean = js.native
  
  @JSImport("@sentry/utils", "isSyntheticEvent")
  @js.native
  def isSyntheticEvent(wat: js.Any): Boolean = js.native
  
  @JSImport("@sentry/utils", "isThenable")
  @js.native
  def isThenable(wat: js.Any): Boolean = js.native
  
  @JSImport("@sentry/utils", "join")
  @js.native
  def join(args: String*): String = js.native
  
  @JSImport("@sentry/utils", "logger")
  @js.native
  val logger: Logger_ = js.native
  
  @JSImport("@sentry/utils", "normalize")
  @js.native
  def normalize(input: js.Any): js.Any = js.native
  @JSImport("@sentry/utils", "normalize")
  @js.native
  def normalize(input: js.Any, depth: Double): js.Any = js.native
  
  @JSImport("@sentry/utils", "normalizePath")
  @js.native
  def normalizePath(path: String): String = js.native
  
  @JSImport("@sentry/utils", "normalizeToSize")
  @js.native
  def normalizeToSize[T](`object`: StringDictionary[js.Any]): T = js.native
  @JSImport("@sentry/utils", "normalizeToSize")
  @js.native
  def normalizeToSize[T](`object`: StringDictionary[js.Any], depth: js.UndefOr[scala.Nothing], maxSize: Double): T = js.native
  @JSImport("@sentry/utils", "normalizeToSize")
  @js.native
  def normalizeToSize[T](`object`: StringDictionary[js.Any], depth: Double): T = js.native
  @JSImport("@sentry/utils", "normalizeToSize")
  @js.native
  def normalizeToSize[T](`object`: StringDictionary[js.Any], depth: Double, maxSize: Double): T = js.native
  
  @JSImport("@sentry/utils", "parseRetryAfterHeader")
  @js.native
  def parseRetryAfterHeader(now: Double): Double = js.native
  @JSImport("@sentry/utils", "parseRetryAfterHeader")
  @js.native
  def parseRetryAfterHeader(now: Double, header: String): Double = js.native
  @JSImport("@sentry/utils", "parseRetryAfterHeader")
  @js.native
  def parseRetryAfterHeader(now: Double, header: Double): Double = js.native
  
  @JSImport("@sentry/utils", "parseSemver")
  @js.native
  def parseSemver(input: String): SemVer = js.native
  
  @JSImport("@sentry/utils", "parseUrl")
  @js.native
  def parseUrl(url: String): Host = js.native
  
  @JSImport("@sentry/utils", "relative")
  @js.native
  def relative(from: String, to: String): String = js.native
  
  @JSImport("@sentry/utils", "resolve")
  @js.native
  def resolve(args: String*): String = js.native
  
  @JSImport("@sentry/utils", "safeJoin")
  @js.native
  def safeJoin(input: js.Array[_]): String = js.native
  @JSImport("@sentry/utils", "safeJoin")
  @js.native
  def safeJoin(input: js.Array[_], delimiter: String): String = js.native
  
  @JSImport("@sentry/utils", "snipLine")
  @js.native
  def snipLine(line: String, colno: Double): String = js.native
  
  @JSImport("@sentry/utils", "stripUrlQueryAndFragment")
  @js.native
  def stripUrlQueryAndFragment(urlPath: String): String = js.native
  
  @JSImport("@sentry/utils", "supportsDOMError")
  @js.native
  def supportsDOMError(): Boolean = js.native
  
  @JSImport("@sentry/utils", "supportsDOMException")
  @js.native
  def supportsDOMException(): Boolean = js.native
  
  @JSImport("@sentry/utils", "supportsErrorEvent")
  @js.native
  def supportsErrorEvent(): Boolean = js.native
  
  @JSImport("@sentry/utils", "supportsFetch")
  @js.native
  def supportsFetch(): Boolean = js.native
  
  @JSImport("@sentry/utils", "supportsHistory")
  @js.native
  def supportsHistory(): Boolean = js.native
  
  @JSImport("@sentry/utils", "supportsNativeFetch")
  @js.native
  def supportsNativeFetch(): Boolean = js.native
  
  @JSImport("@sentry/utils", "supportsReferrerPolicy")
  @js.native
  def supportsReferrerPolicy(): Boolean = js.native
  
  @JSImport("@sentry/utils", "supportsReportingObserver")
  @js.native
  def supportsReportingObserver(): Boolean = js.native
  
  @JSImport("@sentry/utils", "timestampInSeconds")
  @js.native
  val timestampInSeconds: js.Any = js.native
  
  @JSImport("@sentry/utils", "timestampWithMs")
  @js.native
  val timestampWithMs: js.Any = js.native
  
  @JSImport("@sentry/utils", "truncate")
  @js.native
  def truncate(str: String): String = js.native
  @JSImport("@sentry/utils", "truncate")
  @js.native
  def truncate(str: String, max: Double): String = js.native
  
  @JSImport("@sentry/utils", "urlEncode")
  @js.native
  def urlEncode(`object`: StringDictionary[js.Any]): String = js.native
  
  @JSImport("@sentry/utils", "usingPerformanceAPI")
  @js.native
  val usingPerformanceAPI: Boolean = js.native
  
  @JSImport("@sentry/utils", "uuid4")
  @js.native
  def uuid4(): String = js.native
  
  @JSImport("@sentry/utils", "walk")
  @js.native
  def walk(key: String, value: js.Any): js.Any = js.native
  @JSImport("@sentry/utils", "walk")
  @js.native
  def walk(
    key: String,
    value: js.Any,
    depth: js.UndefOr[scala.Nothing],
    memo: typings.sentryUtils.memoMod.Memo
  ): js.Any = js.native
  @JSImport("@sentry/utils", "walk")
  @js.native
  def walk(key: String, value: js.Any, depth: Double): js.Any = js.native
  @JSImport("@sentry/utils", "walk")
  @js.native
  def walk(key: String, value: js.Any, depth: Double, memo: typings.sentryUtils.memoMod.Memo): js.Any = js.native
}
