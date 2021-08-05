package typings.sentryUtils

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.stackframeMod.StackFrame
import typings.sentryUtils.anon.GlobalEventProcessors
import typings.sentryUtils.anon.Host
import typings.sentryUtils.anon.Id
import typings.sentryUtils.anon.Integrations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscMod {
  
  @JSImport("@sentry/utils/dist/misc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addContextToFrame(lines: js.Array[String], frame: StackFrame): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addContextToFrame")(lines.asInstanceOf[js.Any], frame.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addContextToFrame(lines: js.Array[String], frame: StackFrame, linesOfContext: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addContextToFrame")(lines.asInstanceOf[js.Any], frame.asInstanceOf[js.Any], linesOfContext.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addExceptionMechanism(event: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionMechanism")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addExceptionMechanism(event: Event, mechanism: StringDictionary[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionMechanism")(event.asInstanceOf[js.Any], mechanism.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addExceptionTypeValue(event: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionTypeValue")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addExceptionTypeValue(event: Event, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionTypeValue")(event.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addExceptionTypeValue(event: Event, value: String, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionTypeValue")(event.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addExceptionTypeValue(event: Event, value: Unit, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionTypeValue")(event.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def consoleSandbox(callback: js.Function0[js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("consoleSandbox")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def getEventDescription(event: Event): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventDescription")(event.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getGlobalObject[T](): T & SentryGlobal = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalObject")().asInstanceOf[T & SentryGlobal]
  
  inline def getLocationHref(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocationHref")().asInstanceOf[String]
  
  inline def parseRetryAfterHeader(now: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRetryAfterHeader")(now.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def parseRetryAfterHeader(now: Double, header: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRetryAfterHeader")(now.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def parseRetryAfterHeader(now: Double, header: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRetryAfterHeader")(now.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def parseSemver(input: String): SemVer = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSemver")(input.asInstanceOf[js.Any]).asInstanceOf[SemVer]
  
  inline def parseUrl(url: String): Host = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Host]
  
  inline def stripUrlQueryAndFragment(urlPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripUrlQueryAndFragment")(urlPath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def uuid4(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid4")().asInstanceOf[String]
  
  /**
    * Represents Semantic Versioning object
    */
  trait SemVer extends StObject {
    
    var buildmetadata: js.UndefOr[String] = js.undefined
    
    var major: js.UndefOr[Double] = js.undefined
    
    var minor: js.UndefOr[Double] = js.undefined
    
    var patch: js.UndefOr[Double] = js.undefined
    
    var prerelease: js.UndefOr[String] = js.undefined
  }
  object SemVer {
    
    inline def apply(): SemVer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SemVer]
    }
    
    extension [Self <: SemVer](x: Self) {
      
      inline def setBuildmetadata(value: String): Self = StObject.set(x, "buildmetadata", value.asInstanceOf[js.Any])
      
      inline def setBuildmetadataUndefined: Self = StObject.set(x, "buildmetadata", js.undefined)
      
      inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
      
      inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      inline def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
      
      inline def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      inline def setPrerelease(value: String): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
      
      inline def setPrereleaseUndefined: Self = StObject.set(x, "prerelease", js.undefined)
    }
  }
  
  /** Internal */
  trait SentryGlobal extends StObject {
    
    var SENTRY_DSN: js.UndefOr[String] = js.undefined
    
    var SENTRY_ENVIRONMENT: js.UndefOr[String] = js.undefined
    
    var SENTRY_RELEASE: js.UndefOr[Id] = js.undefined
    
    var Sentry: js.UndefOr[Integrations] = js.undefined
    
    var __SENTRY__ : GlobalEventProcessors
  }
  object SentryGlobal {
    
    inline def apply(__SENTRY__ : GlobalEventProcessors): SentryGlobal = {
      val __obj = js.Dynamic.literal(__SENTRY__ = __SENTRY__.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentryGlobal]
    }
    
    extension [Self <: SentryGlobal](x: Self) {
      
      inline def setSENTRY_DSN(value: String): Self = StObject.set(x, "SENTRY_DSN", value.asInstanceOf[js.Any])
      
      inline def setSENTRY_DSNUndefined: Self = StObject.set(x, "SENTRY_DSN", js.undefined)
      
      inline def setSENTRY_ENVIRONMENT(value: String): Self = StObject.set(x, "SENTRY_ENVIRONMENT", value.asInstanceOf[js.Any])
      
      inline def setSENTRY_ENVIRONMENTUndefined: Self = StObject.set(x, "SENTRY_ENVIRONMENT", js.undefined)
      
      inline def setSENTRY_RELEASE(value: Id): Self = StObject.set(x, "SENTRY_RELEASE", value.asInstanceOf[js.Any])
      
      inline def setSENTRY_RELEASEUndefined: Self = StObject.set(x, "SENTRY_RELEASE", js.undefined)
      
      inline def setSentry(value: Integrations): Self = StObject.set(x, "Sentry", value.asInstanceOf[js.Any])
      
      inline def setSentryUndefined: Self = StObject.set(x, "Sentry", js.undefined)
      
      inline def set__SENTRY__(value: GlobalEventProcessors): Self = StObject.set(x, "__SENTRY__", value.asInstanceOf[js.Any])
    }
  }
}
