package typings.sentryBrowser

import typings.sentryBrowser.anon.Key
import typings.sentryTypes.eventprocessorMod.EventProcessor
import typings.sentryTypes.hubMod.Hub
import typings.sentryTypes.integrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkederrorsMod {
  
  @JSImport("@sentry/browser/dist/integrations/linkederrors", "LinkedErrors")
  @js.native
  /**
    * @inheritDoc
    */
  class LinkedErrors ()
    extends StObject
       with Integration {
    def this(options: Key) = this()
    
    /**
      * @inheritDoc
      */
    /* private */ var _handler: js.Any = js.native
    
    /**
      * @inheritDoc
      */
    /* private */ val _key: js.Any = js.native
    
    /**
      * @inheritDoc
      */
    /* private */ val _limit: js.Any = js.native
    
    /**
      * @inheritDoc
      */
    /* private */ var _walkErrorTree: js.Any = js.native
    
    /**
      * Returns {@link IntegrationClass.id}
      */
    /* CompleteClass */
    var name: String = js.native
    
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
  object LinkedErrors {
    
    @JSImport("@sentry/browser/dist/integrations/linkederrors", "LinkedErrors")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/dist/integrations/linkederrors", "LinkedErrors.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
}
