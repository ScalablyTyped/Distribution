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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscMod {
  
  @JSImport("@sentry/utils/dist/misc", "addContextToFrame")
  @js.native
  def addContextToFrame(lines: js.Array[String], frame: StackFrame): Unit = js.native
  @JSImport("@sentry/utils/dist/misc", "addContextToFrame")
  @js.native
  def addContextToFrame(lines: js.Array[String], frame: StackFrame, linesOfContext: Double): Unit = js.native
  
  @JSImport("@sentry/utils/dist/misc", "addExceptionMechanism")
  @js.native
  def addExceptionMechanism(event: Event): Unit = js.native
  @JSImport("@sentry/utils/dist/misc", "addExceptionMechanism")
  @js.native
  def addExceptionMechanism(event: Event, mechanism: StringDictionary[js.Any]): Unit = js.native
  
  @JSImport("@sentry/utils/dist/misc", "addExceptionTypeValue")
  @js.native
  def addExceptionTypeValue(event: Event): Unit = js.native
  @JSImport("@sentry/utils/dist/misc", "addExceptionTypeValue")
  @js.native
  def addExceptionTypeValue(event: Event, value: js.UndefOr[scala.Nothing], `type`: String): Unit = js.native
  @JSImport("@sentry/utils/dist/misc", "addExceptionTypeValue")
  @js.native
  def addExceptionTypeValue(event: Event, value: String): Unit = js.native
  @JSImport("@sentry/utils/dist/misc", "addExceptionTypeValue")
  @js.native
  def addExceptionTypeValue(event: Event, value: String, `type`: String): Unit = js.native
  
  @JSImport("@sentry/utils/dist/misc", "consoleSandbox")
  @js.native
  def consoleSandbox(callback: js.Function0[_]): js.Any = js.native
  
  @JSImport("@sentry/utils/dist/misc", "getEventDescription")
  @js.native
  def getEventDescription(event: Event): String = js.native
  
  @JSImport("@sentry/utils/dist/misc", "getGlobalObject")
  @js.native
  def getGlobalObject[T](): T with SentryGlobal = js.native
  
  @JSImport("@sentry/utils/dist/misc", "getLocationHref")
  @js.native
  def getLocationHref(): String = js.native
  
  @JSImport("@sentry/utils/dist/misc", "parseRetryAfterHeader")
  @js.native
  def parseRetryAfterHeader(now: Double): Double = js.native
  @JSImport("@sentry/utils/dist/misc", "parseRetryAfterHeader")
  @js.native
  def parseRetryAfterHeader(now: Double, header: String): Double = js.native
  @JSImport("@sentry/utils/dist/misc", "parseRetryAfterHeader")
  @js.native
  def parseRetryAfterHeader(now: Double, header: Double): Double = js.native
  
  @JSImport("@sentry/utils/dist/misc", "parseSemver")
  @js.native
  def parseSemver(input: String): SemVer = js.native
  
  @JSImport("@sentry/utils/dist/misc", "parseUrl")
  @js.native
  def parseUrl(url: String): Host = js.native
  
  @JSImport("@sentry/utils/dist/misc", "stripUrlQueryAndFragment")
  @js.native
  def stripUrlQueryAndFragment(urlPath: String): String = js.native
  
  @JSImport("@sentry/utils/dist/misc", "uuid4")
  @js.native
  def uuid4(): String = js.native
  
  /**
    * Represents Semantic Versioning object
    */
  @js.native
  trait SemVer extends StObject {
    
    var buildmetadata: js.UndefOr[String] = js.native
    
    var major: js.UndefOr[Double] = js.native
    
    var minor: js.UndefOr[Double] = js.native
    
    var patch: js.UndefOr[Double] = js.native
    
    var prerelease: js.UndefOr[String] = js.native
  }
  object SemVer {
    
    @scala.inline
    def apply(): SemVer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SemVer]
    }
    
    @scala.inline
    implicit class SemVerMutableBuilder[Self <: SemVer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuildmetadata(value: String): Self = StObject.set(x, "buildmetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildmetadataUndefined: Self = StObject.set(x, "buildmetadata", js.undefined)
      
      @scala.inline
      def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
      
      @scala.inline
      def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
      
      @scala.inline
      def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      @scala.inline
      def setPrerelease(value: String): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrereleaseUndefined: Self = StObject.set(x, "prerelease", js.undefined)
    }
  }
  
  /** Internal */
  @js.native
  trait SentryGlobal extends StObject {
    
    var SENTRY_DSN: js.UndefOr[String] = js.native
    
    var SENTRY_ENVIRONMENT: js.UndefOr[String] = js.native
    
    var SENTRY_RELEASE: js.UndefOr[Id] = js.native
    
    var Sentry: js.UndefOr[Integrations] = js.native
    
    var __SENTRY__ : GlobalEventProcessors = js.native
  }
  object SentryGlobal {
    
    @scala.inline
    def apply(__SENTRY__ : GlobalEventProcessors): SentryGlobal = {
      val __obj = js.Dynamic.literal(__SENTRY__ = __SENTRY__.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentryGlobal]
    }
    
    @scala.inline
    implicit class SentryGlobalMutableBuilder[Self <: SentryGlobal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSENTRY_DSN(value: String): Self = StObject.set(x, "SENTRY_DSN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSENTRY_DSNUndefined: Self = StObject.set(x, "SENTRY_DSN", js.undefined)
      
      @scala.inline
      def setSENTRY_ENVIRONMENT(value: String): Self = StObject.set(x, "SENTRY_ENVIRONMENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSENTRY_ENVIRONMENTUndefined: Self = StObject.set(x, "SENTRY_ENVIRONMENT", js.undefined)
      
      @scala.inline
      def setSENTRY_RELEASE(value: Id): Self = StObject.set(x, "SENTRY_RELEASE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSENTRY_RELEASEUndefined: Self = StObject.set(x, "SENTRY_RELEASE", js.undefined)
      
      @scala.inline
      def setSentry(value: Integrations): Self = StObject.set(x, "Sentry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSentryUndefined: Self = StObject.set(x, "Sentry", js.undefined)
      
      @scala.inline
      def set__SENTRY__(value: GlobalEventProcessors): Self = StObject.set(x, "__SENTRY__", value.asInstanceOf[js.Any])
    }
  }
}
