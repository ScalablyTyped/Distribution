package typings.sentryCore

import org.scalablytyped.runtime.StringDictionary
import typings.sentryCore.typesHubMod.Hub
import typings.sentryTypes.typesBreadcrumbMod.Breadcrumb
import typings.sentryTypes.typesBreadcrumbMod.BreadcrumbHint
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesEventMod.EventHint
import typings.sentryTypes.typesIntegrationMod.Integration
import typings.sentryTypes.typesScopeMod.Scope
import typings.sentryTypes.typesSessionMod.SerializedSession
import typings.sentryTypes.typesSeverityMod.Severity
import typings.sentryTypes.typesSeverityMod.SeverityLevel
import typings.sentryTypes.typesTransactionMod.CustomSamplingContext
import typings.sentryTypes.typesTransactionMod.Transaction
import typings.sentryTypes.typesTransactionMod.TransactionContext
import typings.sentryTypes.typesUserMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var user: js.UndefOr[Email] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def setUser(value: Email): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait Domain
    extends StObject
       with /** Extension methods for the hub, which are bound to the current Hub instance */
  /* key */ StringDictionary[js.Function] {
    
    /** Hack to prevent bundlers from breaking our usage of the domain package in the cross-platform Hub package */
    var domain: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object Domain {
    
    inline def apply(): Domain = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Domain]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
      
      inline def setDomain(value: StringDictionary[Any]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    }
  }
  
  trait Email extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Email {
    
    inline def apply(): Email = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait Extensions extends StObject {
    
    var extensions: js.UndefOr[Domain] = js.undefined
    
    var hub: js.UndefOr[Hub] = js.undefined
    
    /**
      * Extra Hub properties injected by various SDKs
      */
    var integrations: js.UndefOr[js.Array[Integration]] = js.undefined
  }
  object Extensions {
    
    inline def apply(): Extensions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Extensions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Extensions] (val x: Self) extends AnyVal {
      
      inline def setExtensions(value: Domain): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setHub(value: Hub): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
      
      inline def setHubUndefined: Self = StObject.set(x, "hub", js.undefined)
      
      inline def setIntegrations(value: js.Array[Integration]): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
      
      inline def setIntegrationsVarargs(value: Integration*): Self = StObject.set(x, "integrations", js.Array(value*))
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(exception: Any): String = js.native
    def apply(exception: Any, hint: EventHint): String = js.native
  }
  
  @js.native
  trait FnCallBreadcrumbHint extends StObject {
    
    def apply(breadcrumb: Breadcrumb): Unit = js.native
    def apply(breadcrumb: Breadcrumb, hint: BreadcrumbHint): Unit = js.native
  }
  
  @js.native
  trait FnCallCallback extends StObject {
    
    def apply(
      callback: js.Function1[(/* scope */ Scope) | (/* scope */ typings.sentryCore.typesScopeMod.Scope), Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait FnCallContextCustomSamplingContext extends StObject {
    
    def apply(context: TransactionContext): Transaction = js.native
    def apply(context: TransactionContext, customSamplingContext: CustomSamplingContext): Transaction = js.native
  }
  
  @js.native
  trait FnCallEventHint extends StObject {
    
    def apply(event: Event): String = js.native
    def apply(event: Event, hint: EventHint): String = js.native
  }
  
  @js.native
  trait FnCallMessageLevelHint extends StObject {
    
    def apply(message: String): String = js.native
    def apply(message: String, level: Unit, hint: EventHint): String = js.native
    def apply(message: String, level: Severity): String = js.native
    def apply(message: String, level: SeverityLevel): String = js.native
    def apply(message: String, level: SeverityLevel, hint: EventHint): String = js.native
    def apply(message: String, level: Severity, hint: EventHint): String = js.native
  }
  
  @js.native
  trait FnCallNameContext extends StObject {
    
    def apply(name: String): Unit = js.native
    def apply(name: String, context: StringDictionary[Any]): Unit = js.native
  }
  
  @js.native
  trait FnCallUser extends StObject {
    
    def apply(): Unit = js.native
    def apply(user: User): Unit = js.native
  }
  
  /* Inlined std.Omit<@sentry/types.@sentry/types.SessionContext, 'started' | 'status'> */
  trait OmitSessionContextstarted extends StObject {
    
    var did: js.UndefOr[String] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var environment: js.UndefOr[String] = js.undefined
    
    var errors: js.UndefOr[Double] = js.undefined
    
    var ignoreDuration: js.UndefOr[Boolean] = js.undefined
    
    var init: js.UndefOr[Boolean] = js.undefined
    
    var ipAddress: js.UndefOr[String] = js.undefined
    
    var release: js.UndefOr[String] = js.undefined
    
    var sid: js.UndefOr[String] = js.undefined
    
    var timestamp: js.UndefOr[Double] = js.undefined
    
    var toJSON: js.UndefOr[js.Function0[SerializedSession]] = js.undefined
    
    var user: js.UndefOr[User | Null] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
  }
  object OmitSessionContextstarted {
    
    inline def apply(): OmitSessionContextstarted = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitSessionContextstarted]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitSessionContextstarted] (val x: Self) extends AnyVal {
      
      inline def setDid(value: String): Self = StObject.set(x, "did", value.asInstanceOf[js.Any])
      
      inline def setDidUndefined: Self = StObject.set(x, "did", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setErrors(value: Double): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setIgnoreDuration(value: Boolean): Self = StObject.set(x, "ignoreDuration", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDurationUndefined: Self = StObject.set(x, "ignoreDuration", js.undefined)
      
      inline def setInit(value: Boolean): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
      
      inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setToJSON(value: () => SerializedSession): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
      
      inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      inline def setUserNull: Self = StObject.set(x, "user", null)
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@sentry/core.@sentry/core/types/integrations/inboundfilters.InboundFiltersOptions> */
  trait PartialInboundFiltersOpti extends StObject {
    
    var allowUrls: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    var denyUrls: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    var ignoreErrors: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    var ignoreInternal: js.UndefOr[Boolean] = js.undefined
  }
  object PartialInboundFiltersOpti {
    
    inline def apply(): PartialInboundFiltersOpti = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialInboundFiltersOpti]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialInboundFiltersOpti] (val x: Self) extends AnyVal {
      
      inline def setAllowUrls(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "allowUrls", value.asInstanceOf[js.Any])
      
      inline def setAllowUrlsUndefined: Self = StObject.set(x, "allowUrls", js.undefined)
      
      inline def setAllowUrlsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "allowUrls", js.Array(value*))
      
      inline def setDenyUrls(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "denyUrls", value.asInstanceOf[js.Any])
      
      inline def setDenyUrlsUndefined: Self = StObject.set(x, "denyUrls", js.undefined)
      
      inline def setDenyUrlsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "denyUrls", js.Array(value*))
      
      inline def setIgnoreErrors(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      inline def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
      
      inline def setIgnoreErrorsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "ignoreErrors", js.Array(value*))
      
      inline def setIgnoreInternal(value: Boolean): Self = StObject.set(x, "ignoreInternal", value.asInstanceOf[js.Any])
      
      inline def setIgnoreInternalUndefined: Self = StObject.set(x, "ignoreInternal", js.undefined)
    }
  }
}
