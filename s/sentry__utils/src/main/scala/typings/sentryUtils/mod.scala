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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    
    @JSImport("@sentry/utils", "SyncPromise")
    @js.native
    val ^ : js.Any = js.native
    
    /** JSDoc */
    /* static member */
    inline def all[U](collection: js.Array[U | js.Thenable[U]]): js.Thenable[js.Array[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(collection.asInstanceOf[js.Any]).asInstanceOf[js.Thenable[js.Array[U]]]
    
    /** JSDoc */
    /* static member */
    inline def reject[T](): js.Thenable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("reject")().asInstanceOf[js.Thenable[T]]
    inline def reject[T](reason: js.Any): js.Thenable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("reject")(reason.asInstanceOf[js.Any]).asInstanceOf[js.Thenable[T]]
    
    /** JSDoc */
    /* static member */
    inline def resolve[T](value: T): js.Thenable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(value.asInstanceOf[js.Any]).asInstanceOf[js.Thenable[T]]
    inline def resolve[T](value: js.Thenable[T]): js.Thenable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(value.asInstanceOf[js.Any]).asInstanceOf[js.Thenable[T]]
  }
  
  inline def addContextToFrame(lines: js.Array[String], frame: StackFrame): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addContextToFrame")(lines.asInstanceOf[js.Any], frame.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addContextToFrame(lines: js.Array[String], frame: StackFrame, linesOfContext: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addContextToFrame")(lines.asInstanceOf[js.Any], frame.asInstanceOf[js.Any], linesOfContext.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addExceptionMechanism(event: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionMechanism")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addExceptionMechanism(event: Event, mechanism: StringDictionary[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionMechanism")(event.asInstanceOf[js.Any], mechanism.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addExceptionTypeValue(event: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionTypeValue")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addExceptionTypeValue(event: Event, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionTypeValue")(event.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addExceptionTypeValue(event: Event, value: String, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionTypeValue")(event.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addExceptionTypeValue(event: Event, value: Unit, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionTypeValue")(event.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addInstrumentationHandler(handler: InstrumentHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addInstrumentationHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def basename(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def basename(path: String, ext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("basename")(path.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@sentry/utils", "browserPerformanceTimeOrigin")
  @js.native
  val browserPerformanceTimeOrigin: js.UndefOr[Double] = js.native
  
  inline def consoleSandbox(callback: js.Function0[js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("consoleSandbox")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("@sentry/utils", "dateTimestampInSeconds")
  @js.native
  val dateTimestampInSeconds: js.Any = js.native
  
  inline def dirname(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dropUndefinedKeys[T](`val`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("dropUndefinedKeys")(`val`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def dynamicRequire(mod: js.Any, request: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dynamicRequire")(mod.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def extractExceptionKeysForMessage(exception: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractExceptionKeysForMessage")(exception.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def extractExceptionKeysForMessage(exception: js.Any, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("extractExceptionKeysForMessage")(exception.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def extractNodeRequestData(req: StringDictionary[js.Any]): ExtractedNodeRequestData = ^.asInstanceOf[js.Dynamic].applyDynamic("extractNodeRequestData")(req.asInstanceOf[js.Any]).asInstanceOf[ExtractedNodeRequestData]
  inline def extractNodeRequestData(req: StringDictionary[js.Any], keys: js.Array[String]): ExtractedNodeRequestData = (^.asInstanceOf[js.Dynamic].applyDynamic("extractNodeRequestData")(req.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[ExtractedNodeRequestData]
  
  inline def fill(
    source: StringDictionary[js.Any],
    name: String,
    replacement: js.Function1[/* repeated */ js.Any, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(source.asInstanceOf[js.Any], name.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def forget(promise: js.Thenable[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forget")(promise.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getEventDescription(event: Event): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventDescription")(event.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getFunctionName(fn: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionName")(fn.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getGlobalObject[T](): T & SentryGlobal = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalObject")().asInstanceOf[T & SentryGlobal]
  
  inline def getLocationHref(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocationHref")().asInstanceOf[String]
  
  inline def htmlTreeAsString(elem: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlTreeAsString")(elem.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isAbsolute(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAbsolute")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDOMError(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDOMError")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDOMException(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDOMException")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isElement(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isError(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isErrorEvent(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrorEvent")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEvent(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEvent")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInstanceOf(wat: js.Any, base: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInstanceOf")(wat.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isMatchingPattern(value: String, pattern: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatchingPattern")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatchingPattern(value: String, pattern: RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatchingPattern")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNodeEnv(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeEnv")().asInstanceOf[Boolean]
  
  inline def isPlainObject(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPrimitive(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitive")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRegExp(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSyntheticEvent(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyntheticEvent")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isThenable(wat: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThenable")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def join(args: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@sentry/utils", "logger")
  @js.native
  val logger: Logger_ = js.native
  
  inline def normalize(input: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def normalize(input: js.Any, depth: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def normalizePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeToSize[T](`object`: StringDictionary[js.Any]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeToSize")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def normalizeToSize[T](`object`: StringDictionary[js.Any], depth: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeToSize")(`object`.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def normalizeToSize[T](`object`: StringDictionary[js.Any], depth: Double, maxSize: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeToSize")(`object`.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def normalizeToSize[T](`object`: StringDictionary[js.Any], depth: Unit, maxSize: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeToSize")(`object`.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def parseRetryAfterHeader(now: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRetryAfterHeader")(now.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def parseRetryAfterHeader(now: Double, header: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRetryAfterHeader")(now.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def parseRetryAfterHeader(now: Double, header: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRetryAfterHeader")(now.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def parseSemver(input: String): SemVer = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSemver")(input.asInstanceOf[js.Any]).asInstanceOf[SemVer]
  
  inline def parseUrl(url: String): Host = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Host]
  
  inline def relative(from: String, to: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def resolve(args: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def safeJoin(input: js.Array[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeJoin")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def safeJoin(input: js.Array[js.Any], delimiter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("safeJoin")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def snipLine(line: String, colno: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("snipLine")(line.asInstanceOf[js.Any], colno.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stripUrlQueryAndFragment(urlPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripUrlQueryAndFragment")(urlPath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def supportsDOMError(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsDOMError")().asInstanceOf[Boolean]
  
  inline def supportsDOMException(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsDOMException")().asInstanceOf[Boolean]
  
  inline def supportsErrorEvent(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsErrorEvent")().asInstanceOf[Boolean]
  
  inline def supportsFetch(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsFetch")().asInstanceOf[Boolean]
  
  inline def supportsHistory(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsHistory")().asInstanceOf[Boolean]
  
  inline def supportsNativeFetch(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsNativeFetch")().asInstanceOf[Boolean]
  
  inline def supportsReferrerPolicy(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsReferrerPolicy")().asInstanceOf[Boolean]
  
  inline def supportsReportingObserver(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsReportingObserver")().asInstanceOf[Boolean]
  
  @JSImport("@sentry/utils", "timestampInSeconds")
  @js.native
  val timestampInSeconds: js.Any = js.native
  
  @JSImport("@sentry/utils", "timestampWithMs")
  @js.native
  val timestampWithMs: js.Any = js.native
  
  inline def truncate(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def truncate(str: String, max: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(str.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def urlEncode(`object`: StringDictionary[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlEncode")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@sentry/utils", "usingPerformanceAPI")
  @js.native
  val usingPerformanceAPI: Boolean = js.native
  
  inline def uuid4(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid4")().asInstanceOf[String]
  
  inline def walk(key: String, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def walk(key: String, value: js.Any, depth: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def walk(key: String, value: js.Any, depth: Double, memo: typings.sentryUtils.memoMod.Memo): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def walk(key: String, value: js.Any, depth: Unit, memo: typings.sentryUtils.memoMod.Memo): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
