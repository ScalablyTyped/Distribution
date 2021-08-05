package typings.sentryBrowser

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.sentryBrowser.globalhandlersMod.GlobalHandlersIntegrations
import typings.sentryBrowser.integrationsMod.Breadcrumbs
import typings.sentryBrowser.integrationsMod.GlobalHandlers
import typings.sentryBrowser.integrationsMod.LinkedErrors
import typings.sentryBrowser.integrationsMod.TryCatch
import typings.sentryBrowser.integrationsMod.UserAgent
import typings.sentryCore.mod.Integrations.FunctionToString
import typings.sentryCore.mod.Integrations.InboundFilters
import typings.sentryTypes.requestMod.SentryRequestType
import typings.sentryTypes.responseMod.Response
import typings.std.Record
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var attachStacktrace: js.UndefOr[Boolean] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setAttachStacktrace(value: Boolean): Self = StObject.set(x, "attachStacktrace", value.asInstanceOf[js.Any])
      
      inline def setAttachStacktraceUndefined: Self = StObject.set(x, "attachStacktrace", js.undefined)
    }
  }
  
  trait AttachStacktrace extends StObject {
    
    var attachStacktrace: js.UndefOr[Boolean] = js.undefined
    
    var rejection: js.UndefOr[Boolean] = js.undefined
  }
  object AttachStacktrace {
    
    inline def apply(): AttachStacktrace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttachStacktrace]
    }
    
    extension [Self <: AttachStacktrace](x: Self) {
      
      inline def setAttachStacktrace(value: Boolean): Self = StObject.set(x, "attachStacktrace", value.asInstanceOf[js.Any])
      
      inline def setAttachStacktraceUndefined: Self = StObject.set(x, "attachStacktrace", js.undefined)
      
      inline def setRejection(value: Boolean): Self = StObject.set(x, "rejection", value.asInstanceOf[js.Any])
      
      inline def setRejectionUndefined: Self = StObject.set(x, "rejection", js.undefined)
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
    
    extension [Self <: Email](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait Headers extends StObject {
    
    var headers: Record[String, String | Null] = js.native
    
    def reject(): Unit = js.native
    def reject(reason: js.Any): Unit = js.native
    
    var requestType: SentryRequestType = js.native
    
    def resolve(): Unit = js.native
    def resolve(value: js.Thenable[Response]): Unit = js.native
    def resolve(value: Response): Unit = js.native
    
    var response: typings.std.Response | XMLHttpRequest = js.native
  }
  
  trait Key extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
  }
  object Key {
    
    inline def apply(): Key = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
  
  trait Mechanism extends StObject {
    
    var mechanism: js.UndefOr[typings.sentryTypes.mechanismMod.Mechanism] = js.undefined
  }
  object Mechanism {
    
    inline def apply(): Mechanism = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mechanism]
    }
    
    extension [Self <: Mechanism](x: Self) {
      
      inline def setMechanism(value: typings.sentryTypes.mechanismMod.Mechanism): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
      
      inline def setMechanismUndefined: Self = StObject.set(x, "mechanism", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@sentry/browser.@sentry/browser/dist/integrations/breadcrumbs.BreadcrumbsOptions> */
  trait PartialBreadcrumbsOptions extends StObject {
    
    var console: js.UndefOr[Boolean] = js.undefined
    
    var dom: js.UndefOr[Boolean] = js.undefined
    
    var fetch: js.UndefOr[Boolean] = js.undefined
    
    var history: js.UndefOr[Boolean] = js.undefined
    
    var sentry: js.UndefOr[Boolean] = js.undefined
    
    var xhr: js.UndefOr[Boolean] = js.undefined
  }
  object PartialBreadcrumbsOptions {
    
    inline def apply(): PartialBreadcrumbsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialBreadcrumbsOptions]
    }
    
    extension [Self <: PartialBreadcrumbsOptions](x: Self) {
      
      inline def setConsole(value: Boolean): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
      
      inline def setDom(value: Boolean): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      inline def setDomUndefined: Self = StObject.set(x, "dom", js.undefined)
      
      inline def setFetch(value: Boolean): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setSentry(value: Boolean): Self = StObject.set(x, "sentry", value.asInstanceOf[js.Any])
      
      inline def setSentryUndefined: Self = StObject.set(x, "sentry", js.undefined)
      
      inline def setXhr(value: Boolean): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@sentry/browser.@sentry/browser/dist/integrations/trycatch.TryCatchOptions> */
  trait PartialTryCatchOptions extends StObject {
    
    var XMLHttpRequest: js.UndefOr[Boolean] = js.undefined
    
    var eventTarget: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    var requestAnimationFrame: js.UndefOr[Boolean] = js.undefined
    
    var setInterval: js.UndefOr[Boolean] = js.undefined
    
    var setTimeout: js.UndefOr[Boolean] = js.undefined
  }
  object PartialTryCatchOptions {
    
    inline def apply(): PartialTryCatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTryCatchOptions]
    }
    
    extension [Self <: PartialTryCatchOptions](x: Self) {
      
      inline def setEventTarget(value: Boolean | js.Array[String]): Self = StObject.set(x, "eventTarget", value.asInstanceOf[js.Any])
      
      inline def setEventTargetUndefined: Self = StObject.set(x, "eventTarget", js.undefined)
      
      inline def setEventTargetVarargs(value: String*): Self = StObject.set(x, "eventTarget", js.Array(value :_*))
      
      inline def setRequestAnimationFrame(value: Boolean): Self = StObject.set(x, "requestAnimationFrame", value.asInstanceOf[js.Any])
      
      inline def setRequestAnimationFrameUndefined: Self = StObject.set(x, "requestAnimationFrame", js.undefined)
      
      inline def setSetInterval(value: Boolean): Self = StObject.set(x, "setInterval", value.asInstanceOf[js.Any])
      
      inline def setSetIntervalUndefined: Self = StObject.set(x, "setInterval", js.undefined)
      
      inline def setSetTimeout(value: Boolean): Self = StObject.set(x, "setTimeout", value.asInstanceOf[js.Any])
      
      inline def setSetTimeoutUndefined: Self = StObject.set(x, "setTimeout", js.undefined)
      
      inline def setXMLHttpRequest(value: Boolean): Self = StObject.set(x, "XMLHttpRequest", value.asInstanceOf[js.Any])
      
      inline def setXMLHttpRequestUndefined: Self = StObject.set(x, "XMLHttpRequest", js.undefined)
    }
  }
  
  @js.native
  trait TypeofBreadcrumbs
    extends StObject
       with Instantiable0[Breadcrumbs]
       with Instantiable1[/* options */ PartialBreadcrumbsOptions, Breadcrumbs] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  trait TypeofCoreIntegrations
    extends StObject
       with Instantiable0[FunctionToString] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  trait TypeofCoreIntegrationsInstantiable
    extends StObject
       with Instantiable0[InboundFilters] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  trait TypeofGlobalHandlers
    extends StObject
       with Instantiable0[GlobalHandlers]
       with Instantiable1[/* options */ GlobalHandlersIntegrations, GlobalHandlers] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  trait TypeofLinkedErrors
    extends StObject
       with Instantiable0[LinkedErrors]
       with Instantiable1[/* options */ Key, LinkedErrors] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  trait TypeofTryCatch
    extends StObject
       with Instantiable0[TryCatch]
       with Instantiable1[/* options */ PartialTryCatchOptions, TryCatch] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  trait TypeofUserAgent
    extends StObject
       with Instantiable0[UserAgent] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
}
