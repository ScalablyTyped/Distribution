package typings.sentryBrowser

import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesHubMod.Hub
import typings.sentryTypes.typesIntegrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProfilingIntegrationMod {
  
  @JSImport("@sentry/browser/types/profiling/integration", "BrowserProfilingIntegration")
  @js.native
  open class BrowserProfilingIntegration ()
    extends StObject
       with Integration {
    
    /**
      * @inheritDoc
      */
    def handleGlobalEvent(event: Event): Event = js.native
    
    /**
      * Returns {@link IntegrationClass.id}
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * @inheritDoc
      */
    def setupOnce(addGlobalEventProcessor: js.Function1[/* callback */ EventProcessor, Unit]): Unit = js.native
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
}
