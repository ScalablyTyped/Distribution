package typings.sentryNode

import typings.sentryNode.anon.Mode
import typings.sentryTypes.eventprocessorMod.EventProcessor
import typings.sentryTypes.hubMod.Hub
import typings.sentryTypes.integrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onunhandledrejectionMod {
  
  @JSImport("@sentry/node/types/integrations/onunhandledrejection", "OnUnhandledRejection")
  @js.native
  /**
    * @inheritDoc
    */
  open class OnUnhandledRejection ()
    extends StObject
       with Integration {
    def this(_options: Mode) = this()
    
    /**
      * Handler for `mode` option
      */
    /* private */ var _handleRejection: Any = js.native
    
    /* private */ val _options: Any = js.native
    
    /**
      * Returns {@link IntegrationClass.id}
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Send an exception with reason
      * @param reason string
      * @param promise promise
      */
    def sendUnhandledPromise(reason: Any, promise: Any): Unit = js.native
    
    /**
      * @inheritDoc
      */
    def setupOnce(): Unit = js.native
    /**
      * Sets the integration up only once.
      * This takes no options on purpose, options should be passed in the constructor
      */
    /* CompleteClass */
    override def setupOnce(
      addGlobalEventProcessor: js.Function1[/* callback */ EventProcessor, Unit],
      getCurrentHub: js.Function0[Hub]
    ): Unit = js.native
  }
  /* static members */
  object OnUnhandledRejection {
    
    @JSImport("@sentry/node/types/integrations/onunhandledrejection", "OnUnhandledRejection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/node/types/integrations/onunhandledrejection", "OnUnhandledRejection.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryNode.sentryNodeStrings.none
    - typings.sentryNode.sentryNodeStrings.warn
    - typings.sentryNode.sentryNodeStrings.strict
  */
  trait UnhandledRejectionMode extends StObject
  object UnhandledRejectionMode {
    
    inline def none: typings.sentryNode.sentryNodeStrings.none = "none".asInstanceOf[typings.sentryNode.sentryNodeStrings.none]
    
    inline def strict: typings.sentryNode.sentryNodeStrings.strict = "strict".asInstanceOf[typings.sentryNode.sentryNodeStrings.strict]
    
    inline def warn: typings.sentryNode.sentryNodeStrings.warn = "warn".asInstanceOf[typings.sentryNode.sentryNodeStrings.warn]
  }
}
