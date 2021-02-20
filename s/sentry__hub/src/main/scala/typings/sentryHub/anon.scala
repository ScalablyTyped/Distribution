package typings.sentryHub

import org.scalablytyped.runtime.StringDictionary
import typings.sentryHub.hubMod.Hub
import typings.sentryTypes.sessionMod.SessionStatus
import typings.sentryTypes.userMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Attrs extends StObject {
    
    var attrs: js.UndefOr[Environment] = js.native
    
    var did: js.UndefOr[String] = js.native
    
    var duration: Double = js.native
    
    var errors: Double = js.native
    
    var init: Boolean = js.native
    
    var sid: String = js.native
    
    var started: String = js.native
    
    var status: SessionStatus = js.native
    
    var timestamp: String = js.native
  }
  object Attrs {
    
    @scala.inline
    def apply(
      duration: Double,
      errors: Double,
      init: Boolean,
      sid: String,
      started: String,
      status: SessionStatus,
      timestamp: String
    ): Attrs = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attrs]
    }
    
    @scala.inline
    implicit class AttrsMutableBuilder[Self <: Attrs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: Environment): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      @scala.inline
      def setDid(value: String): Self = StObject.set(x, "did", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDidUndefined: Self = StObject.set(x, "did", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrors(value: Double): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInit(value: Boolean): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStarted(value: String): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: SessionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dictkey
    extends /** Extension methods for the hub, which are bound to the current Hub instance */
  /* key */ StringDictionary[js.Function] {
    
    /** Hack to prevent bundlers from breaking our usage of the domain package in the cross-platform Hub package */
    var domain: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: StringDictionary[js.Any]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    }
  }
  
  @js.native
  trait Environment extends StObject {
    
    var environment: js.UndefOr[String] = js.native
    
    var ip_address: js.UndefOr[String] = js.native
    
    var release: js.UndefOr[String] = js.native
    
    var user_agent: js.UndefOr[String] = js.native
  }
  object Environment {
    
    @scala.inline
    def apply(): Environment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Environment]
    }
    
    @scala.inline
    implicit class EnvironmentMutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      @scala.inline
      def setIp_address(value: String): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIp_addressUndefined: Self = StObject.set(x, "ip_address", js.undefined)
      
      @scala.inline
      def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      @scala.inline
      def setUser_agent(value: String): Self = StObject.set(x, "user_agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_agentUndefined: Self = StObject.set(x, "user_agent", js.undefined)
    }
  }
  
  @js.native
  trait Extensions extends StObject {
    
    /**
      * Extra Hub properties injected by various SDKs
      */
    var extensions: js.UndefOr[Dictkey] = js.native
    
    var hub: js.UndefOr[Hub] = js.native
  }
  object Extensions {
    
    @scala.inline
    def apply(): Extensions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Extensions]
    }
    
    @scala.inline
    implicit class ExtensionsMutableBuilder[Self <: Extensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtensions(value: Dictkey): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setHub(value: Hub): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHubUndefined: Self = StObject.set(x, "hub", js.undefined)
    }
  }
  
  /* Inlined std.Omit<@sentry/types.@sentry/types.SessionContext, 'started' | 'status'> */
  @js.native
  trait OmitSessionContextstarted extends StObject {
    
    var did: js.UndefOr[String] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var environment: js.UndefOr[String] = js.native
    
    var errors: js.UndefOr[Double] = js.native
    
    var ipAddress: js.UndefOr[String] = js.native
    
    var release: js.UndefOr[String] = js.native
    
    var sid: js.UndefOr[String] = js.native
    
    var timestamp: js.UndefOr[Double] = js.native
    
    var user: js.UndefOr[User | Null] = js.native
    
    var userAgent: js.UndefOr[String] = js.native
  }
  object OmitSessionContextstarted {
    
    @scala.inline
    def apply(): OmitSessionContextstarted = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitSessionContextstarted]
    }
    
    @scala.inline
    implicit class OmitSessionContextstartedMutableBuilder[Self <: OmitSessionContextstarted] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDid(value: String): Self = StObject.set(x, "did", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDidUndefined: Self = StObject.set(x, "did", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      @scala.inline
      def setErrors(value: Double): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      @scala.inline
      def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
      
      @scala.inline
      def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      @scala.inline
      def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      @scala.inline
      def setUserNull: Self = StObject.set(x, "user", null)
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
