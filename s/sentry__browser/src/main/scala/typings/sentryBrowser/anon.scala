package typings.sentryBrowser

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.sentryBrowser.typesIntegrationsGlobalhandlersMod.GlobalHandlersIntegrations
import typings.sentryBrowser.typesIntegrationsMod.Breadcrumbs
import typings.sentryBrowser.typesIntegrationsMod.Dedupe
import typings.sentryBrowser.typesIntegrationsMod.GlobalHandlers
import typings.sentryBrowser.typesIntegrationsMod.HttpContext
import typings.sentryBrowser.typesIntegrationsMod.LinkedErrors
import typings.sentryBrowser.typesIntegrationsMod.TryCatch
import typings.sentryCore.mod.Integrations.FunctionToString
import typings.sentryCore.mod.Integrations.InboundFilters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
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
  
  /* Inlined std.Error & {  framesToPop :number | undefined,   stacktrace :string | undefined} */
  trait ErrorframesToPopnumberund extends StObject {
    
    /* standard es2022.error */
    var cause: js.UndefOr[Any] = js.undefined
    
    var framesToPop: js.UndefOr[Double] = js.undefined
    
    /* standard es5 */
    var message: String
    
    /* standard es5 */
    var name: String
    
    /* standard es5 */
    var stack: js.UndefOr[String] = js.undefined
    
    var stacktrace: js.UndefOr[String] = js.undefined
  }
  object ErrorframesToPopnumberund {
    
    inline def apply(message: String, name: String): ErrorframesToPopnumberund = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorframesToPopnumberund]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorframesToPopnumberund] (val x: Self) extends AnyVal {
      
      inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      inline def setFramesToPop(value: Double): Self = StObject.set(x, "framesToPop", value.asInstanceOf[js.Any])
      
      inline def setFramesToPopUndefined: Self = StObject.set(x, "framesToPop", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      inline def setStacktrace(value: String): Self = StObject.set(x, "stacktrace", value.asInstanceOf[js.Any])
      
      inline def setStacktraceUndefined: Self = StObject.set(x, "stacktrace", js.undefined)
    }
  }
  
  trait Mechanism extends StObject {
    
    var mechanism: js.UndefOr[typings.sentryTypes.typesMechanismMod.Mechanism] = js.undefined
  }
  object Mechanism {
    
    inline def apply(): Mechanism = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mechanism]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mechanism] (val x: Self) extends AnyVal {
      
      inline def setMechanism(value: typings.sentryTypes.typesMechanismMod.Mechanism): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
      
      inline def setMechanismUndefined: Self = StObject.set(x, "mechanism", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@sentry/browser.@sentry/browser/types/integrations/breadcrumbs.BreadcrumbsOptions> */
  trait PartialBreadcrumbsOptions extends StObject {
    
    var console: js.UndefOr[Boolean] = js.undefined
    
    var dom: js.UndefOr[Boolean | SerializeAttribute] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialBreadcrumbsOptions] (val x: Self) extends AnyVal {
      
      inline def setConsole(value: Boolean): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
      
      inline def setDom(value: Boolean | SerializeAttribute): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined std.Partial<@sentry/browser.@sentry/browser/types/integrations/linkederrors.LinkedErrorsOptions> */
  trait PartialLinkedErrorsOption extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
  }
  object PartialLinkedErrorsOption {
    
    inline def apply(): PartialLinkedErrorsOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLinkedErrorsOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialLinkedErrorsOption] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@sentry/browser.@sentry/browser/types/integrations/trycatch.TryCatchOptions> */
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialTryCatchOptions] (val x: Self) extends AnyVal {
      
      inline def setEventTarget(value: Boolean | js.Array[String]): Self = StObject.set(x, "eventTarget", value.asInstanceOf[js.Any])
      
      inline def setEventTargetUndefined: Self = StObject.set(x, "eventTarget", js.undefined)
      
      inline def setEventTargetVarargs(value: String*): Self = StObject.set(x, "eventTarget", js.Array(value*))
      
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
  
  /* Inlined std.Readonly<@sentry/browser.@sentry/browser/types/integrations/breadcrumbs.BreadcrumbsOptions> */
  trait ReadonlyBreadcrumbsOption extends StObject {
    
    val console: Boolean
    
    val dom: Boolean | SerializeAttribute
    
    val fetch: Boolean
    
    val history: Boolean
    
    val sentry: Boolean
    
    val xhr: Boolean
  }
  object ReadonlyBreadcrumbsOption {
    
    inline def apply(
      console: Boolean,
      dom: Boolean | SerializeAttribute,
      fetch: Boolean,
      history: Boolean,
      sentry: Boolean,
      xhr: Boolean
    ): ReadonlyBreadcrumbsOption = {
      val __obj = js.Dynamic.literal(console = console.asInstanceOf[js.Any], dom = dom.asInstanceOf[js.Any], fetch = fetch.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], sentry = sentry.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyBreadcrumbsOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyBreadcrumbsOption] (val x: Self) extends AnyVal {
      
      inline def setConsole(value: Boolean): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setDom(value: Boolean | SerializeAttribute): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      inline def setFetch(value: Boolean): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setSentry(value: Boolean): Self = StObject.set(x, "sentry", value.asInstanceOf[js.Any])
      
      inline def setXhr(value: Boolean): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    }
  }
  
  trait SerializeAttribute extends StObject {
    
    var serializeAttribute: String | js.Array[String]
  }
  object SerializeAttribute {
    
    inline def apply(serializeAttribute: String | js.Array[String]): SerializeAttribute = {
      val __obj = js.Dynamic.literal(serializeAttribute = serializeAttribute.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializeAttribute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializeAttribute] (val x: Self) extends AnyVal {
      
      inline def setSerializeAttribute(value: String | js.Array[String]): Self = StObject.set(x, "serializeAttribute", value.asInstanceOf[js.Any])
      
      inline def setSerializeAttributeVarargs(value: String*): Self = StObject.set(x, "serializeAttribute", js.Array(value*))
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
  trait TypeofDedupe
    extends StObject
       with Instantiable0[Dedupe] {
    
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
  trait TypeofHttpContext
    extends StObject
       with Instantiable0[HttpContext] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  trait TypeofLinkedErrors
    extends StObject
       with Instantiable0[LinkedErrors]
       with Instantiable1[/* options */ PartialLinkedErrorsOption, LinkedErrors] {
    
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
}
