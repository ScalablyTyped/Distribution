package typings.sentryBrowser

import typings.sentryBrowser.anon.Key
import typings.sentryBrowser.anon.PartialBreadcrumbsOptions
import typings.sentryBrowser.anon.PartialTryCatchOptions
import typings.sentryBrowser.globalhandlersMod.GlobalHandlersIntegrations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/browser/dist/integrations", JSImport.Namespace)
@js.native
object integrationsMod extends js.Object {
  
  @js.native
  /**
    * @inheritDoc
    */
  class Breadcrumbs ()
    extends typings.sentryBrowser.breadcrumbsMod.Breadcrumbs {
    def this(options: PartialBreadcrumbsOptions) = this()
  }
  /* static members */
  @js.native
  object Breadcrumbs extends js.Object {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  /** JSDoc */
  class GlobalHandlers ()
    extends typings.sentryBrowser.globalhandlersMod.GlobalHandlers {
    def this(options: GlobalHandlersIntegrations) = this()
  }
  /* static members */
  @js.native
  object GlobalHandlers extends js.Object {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  /**
    * @inheritDoc
    */
  class LinkedErrors ()
    extends typings.sentryBrowser.linkederrorsMod.LinkedErrors {
    def this(options: Key) = this()
  }
  /* static members */
  @js.native
  object LinkedErrors extends js.Object {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  /**
    * @inheritDoc
    */
  class TryCatch ()
    extends typings.sentryBrowser.trycatchMod.TryCatch {
    def this(options: PartialTryCatchOptions) = this()
  }
  /* static members */
  @js.native
  object TryCatch extends js.Object {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  class UserAgent ()
    extends typings.sentryBrowser.useragentMod.UserAgent
  /* static members */
  @js.native
  object UserAgent extends js.Object {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
}
