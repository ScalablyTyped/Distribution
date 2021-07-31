package typings.sentryBrowser

import typings.sentryBrowser.anon.Key
import typings.sentryBrowser.anon.PartialBreadcrumbsOptions
import typings.sentryBrowser.anon.PartialTryCatchOptions
import typings.sentryBrowser.globalhandlersMod.GlobalHandlersIntegrations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integrationsMod {
  
  @JSImport("@sentry/browser/dist/integrations", "Breadcrumbs")
  @js.native
  /**
    * @inheritDoc
    */
  class Breadcrumbs ()
    extends typings.sentryBrowser.breadcrumbsMod.Breadcrumbs {
    def this(options: PartialBreadcrumbsOptions) = this()
  }
  /* static members */
  object Breadcrumbs {
    
    @JSImport("@sentry/browser/dist/integrations", "Breadcrumbs")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/dist/integrations", "Breadcrumbs.id")
    @js.native
    def id: String = js.native
    @scala.inline
    def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser/dist/integrations", "GlobalHandlers")
  @js.native
  /** JSDoc */
  class GlobalHandlers ()
    extends typings.sentryBrowser.globalhandlersMod.GlobalHandlers {
    def this(options: GlobalHandlersIntegrations) = this()
  }
  /* static members */
  object GlobalHandlers {
    
    @JSImport("@sentry/browser/dist/integrations", "GlobalHandlers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/dist/integrations", "GlobalHandlers.id")
    @js.native
    def id: String = js.native
    @scala.inline
    def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser/dist/integrations", "LinkedErrors")
  @js.native
  /**
    * @inheritDoc
    */
  class LinkedErrors ()
    extends typings.sentryBrowser.linkederrorsMod.LinkedErrors {
    def this(options: Key) = this()
  }
  /* static members */
  object LinkedErrors {
    
    @JSImport("@sentry/browser/dist/integrations", "LinkedErrors")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/dist/integrations", "LinkedErrors.id")
    @js.native
    def id: String = js.native
    @scala.inline
    def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser/dist/integrations", "TryCatch")
  @js.native
  /**
    * @inheritDoc
    */
  class TryCatch ()
    extends typings.sentryBrowser.trycatchMod.TryCatch {
    def this(options: PartialTryCatchOptions) = this()
  }
  /* static members */
  object TryCatch {
    
    @JSImport("@sentry/browser/dist/integrations", "TryCatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/dist/integrations", "TryCatch.id")
    @js.native
    def id: String = js.native
    @scala.inline
    def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser/dist/integrations", "UserAgent")
  @js.native
  class UserAgent ()
    extends typings.sentryBrowser.useragentMod.UserAgent
  /* static members */
  object UserAgent {
    
    @JSImport("@sentry/browser/dist/integrations", "UserAgent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/dist/integrations", "UserAgent.id")
    @js.native
    def id: String = js.native
    @scala.inline
    def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
}
