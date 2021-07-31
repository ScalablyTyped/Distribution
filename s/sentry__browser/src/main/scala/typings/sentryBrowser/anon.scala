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
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachStacktrace(value: Boolean): Self = StObject.set(x, "attachStacktrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachStacktraceUndefined: Self = StObject.set(x, "attachStacktrace", js.undefined)
    }
  }
  
  trait AttachStacktrace extends StObject {
    
    var attachStacktrace: js.UndefOr[Boolean] = js.undefined
    
    var rejection: js.UndefOr[Boolean] = js.undefined
  }
  object AttachStacktrace {
    
    @scala.inline
    def apply(): AttachStacktrace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttachStacktrace]
    }
    
    @scala.inline
    implicit class AttachStacktraceMutableBuilder[Self <: AttachStacktrace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachStacktrace(value: Boolean): Self = StObject.set(x, "attachStacktrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachStacktraceUndefined: Self = StObject.set(x, "attachStacktrace", js.undefined)
      
      @scala.inline
      def setRejection(value: Boolean): Self = StObject.set(x, "rejection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectionUndefined: Self = StObject.set(x, "rejection", js.undefined)
    }
  }
  
  trait Email extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Email {
    
    @scala.inline
    def apply(): Email = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
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
    
    @scala.inline
    def apply(): Key = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
  
  trait Mechanism extends StObject {
    
    var mechanism: js.UndefOr[typings.sentryTypes.mechanismMod.Mechanism] = js.undefined
  }
  object Mechanism {
    
    @scala.inline
    def apply(): Mechanism = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mechanism]
    }
    
    @scala.inline
    implicit class MechanismMutableBuilder[Self <: Mechanism] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMechanism(value: typings.sentryTypes.mechanismMod.Mechanism): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMechanismUndefined: Self = StObject.set(x, "mechanism", js.undefined)
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
    
    @scala.inline
    def apply(): PartialBreadcrumbsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialBreadcrumbsOptions]
    }
    
    @scala.inline
    implicit class PartialBreadcrumbsOptionsMutableBuilder[Self <: PartialBreadcrumbsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsole(value: Boolean): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
      
      @scala.inline
      def setDom(value: Boolean): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomUndefined: Self = StObject.set(x, "dom", js.undefined)
      
      @scala.inline
      def setFetch(value: Boolean): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      @scala.inline
      def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      @scala.inline
      def setSentry(value: Boolean): Self = StObject.set(x, "sentry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSentryUndefined: Self = StObject.set(x, "sentry", js.undefined)
      
      @scala.inline
      def setXhr(value: Boolean): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
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
    
    @scala.inline
    def apply(): PartialTryCatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTryCatchOptions]
    }
    
    @scala.inline
    implicit class PartialTryCatchOptionsMutableBuilder[Self <: PartialTryCatchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventTarget(value: Boolean | js.Array[String]): Self = StObject.set(x, "eventTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTargetUndefined: Self = StObject.set(x, "eventTarget", js.undefined)
      
      @scala.inline
      def setEventTargetVarargs(value: String*): Self = StObject.set(x, "eventTarget", js.Array(value :_*))
      
      @scala.inline
      def setRequestAnimationFrame(value: Boolean): Self = StObject.set(x, "requestAnimationFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestAnimationFrameUndefined: Self = StObject.set(x, "requestAnimationFrame", js.undefined)
      
      @scala.inline
      def setSetInterval(value: Boolean): Self = StObject.set(x, "setInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetIntervalUndefined: Self = StObject.set(x, "setInterval", js.undefined)
      
      @scala.inline
      def setSetTimeout(value: Boolean): Self = StObject.set(x, "setTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetTimeoutUndefined: Self = StObject.set(x, "setTimeout", js.undefined)
      
      @scala.inline
      def setXMLHttpRequest(value: Boolean): Self = StObject.set(x, "XMLHttpRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXMLHttpRequestUndefined: Self = StObject.set(x, "XMLHttpRequest", js.undefined)
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
