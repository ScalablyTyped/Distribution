package typings.sentryNode

import typings.sentryNode.anon.Breadcrumbs
import typings.sentryNode.anon.Key
import typings.sentryNode.anon.Mode
import typings.sentryNode.anon.OnFatalError
import typings.sentryNode.typesIntegrationsContextMod.ContextOptions
import typings.sentryNode.typesIntegrationsContextlinesMod.ContextLinesOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIntegrationsMod {
  
  @JSImport("@sentry/node/types/integrations", "Console")
  @js.native
  open class Console ()
    extends typings.sentryNode.typesIntegrationsConsoleMod.Console
  /* static members */
  object Console {
    
    @JSImport("@sentry/node/types/integrations", "Console")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/node/types/integrations", "Console.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/node/types/integrations", "Context")
  @js.native
  open class Context ()
    extends typings.sentryNode.typesIntegrationsContextMod.Context {
    def this(_options: ContextOptions) = this()
  }
  /* static members */
  object Context {
    
    @JSImport("@sentry/node/types/integrations", "Context")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/node/types/integrations", "Context.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/node/types/integrations", "ContextLines")
  @js.native
  open class ContextLines ()
    extends typings.sentryNode.typesIntegrationsContextlinesMod.ContextLines {
    def this(_options: ContextLinesOptions) = this()
  }
  /* static members */
  object ContextLines {
    
    @JSImport("@sentry/node/types/integrations", "ContextLines")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/node/types/integrations", "ContextLines.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/node/types/integrations", "Http")
  @js.native
  /**
    * @inheritDoc
    */
  open class Http ()
    extends typings.sentryNode.typesIntegrationsHttpMod.Http {
    def this(options: Breadcrumbs) = this()
  }
  /* static members */
  object Http {
    
    @JSImport("@sentry/node/types/integrations", "Http")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/node/types/integrations", "Http.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/node/types/integrations", "LinkedErrors")
  @js.native
  /**
    * @inheritDoc
    */
  open class LinkedErrors ()
    extends typings.sentryNode.typesIntegrationsLinkederrorsMod.LinkedErrors {
    def this(options: Key) = this()
  }
  /* static members */
  object LinkedErrors {
    
    @JSImport("@sentry/node/types/integrations", "LinkedErrors")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/node/types/integrations", "LinkedErrors.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/node/types/integrations", "Modules")
  @js.native
  open class Modules ()
    extends typings.sentryNode.typesIntegrationsModulesMod.Modules
  /* static members */
  object Modules {
    
    @JSImport("@sentry/node/types/integrations", "Modules")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/node/types/integrations", "Modules.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/node/types/integrations", "OnUncaughtException")
  @js.native
  /**
    * @inheritDoc
    */
  open class OnUncaughtException ()
    extends typings.sentryNode.typesIntegrationsOnuncaughtexceptionMod.OnUncaughtException {
    def this(_options: OnFatalError) = this()
  }
  /* static members */
  object OnUncaughtException {
    
    @JSImport("@sentry/node/types/integrations", "OnUncaughtException")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/node/types/integrations", "OnUncaughtException.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/node/types/integrations", "OnUnhandledRejection")
  @js.native
  /**
    * @inheritDoc
    */
  open class OnUnhandledRejection ()
    extends typings.sentryNode.typesIntegrationsOnunhandledrejectionMod.OnUnhandledRejection {
    def this(_options: Mode) = this()
  }
  /* static members */
  object OnUnhandledRejection {
    
    @JSImport("@sentry/node/types/integrations", "OnUnhandledRejection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/node/types/integrations", "OnUnhandledRejection.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
}
