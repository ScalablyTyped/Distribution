package typings.sentryNode

import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesHubMod.Hub
import typings.sentryTypes.typesIntegrationMod.Integration
import typings.sentryTypes.typesStackframeMod.StackFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIntegrationsContextlinesMod {
  
  @JSImport("@sentry/node/types/integrations/contextlines", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/node/types/integrations/contextlines", "ContextLines")
  @js.native
  open class ContextLines ()
    extends StObject
       with Integration {
    def this(_options: ContextLinesOptions) = this()
    
    /** Get's the number of context lines to add */
    /* private */ def _contextLines: Any = js.native
    
    /* private */ val _options: Any = js.native
    
    /** Processes an event and adds context lines */
    def addSourceContext(event: Event): js.Promise[Event] = js.native
    
    /** Adds context lines to frames */
    def addSourceContextToFrames(frames: js.Array[StackFrame]): js.Promise[Unit] = js.native
    
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
  /* static members */
  object ContextLines {
    
    @JSImport("@sentry/node/types/integrations/contextlines", "ContextLines")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/node/types/integrations/contextlines", "ContextLines.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  inline def resetFileContentCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetFileContentCache")().asInstanceOf[Unit]
  
  trait ContextLinesOptions extends StObject {
    
    /**
      * Sets the number of context lines for each frame when loading a file.
      * Defaults to 7.
      *
      * Set to 0 to disable loading and inclusion of source files.
      **/
    var frameContextLines: js.UndefOr[Double] = js.undefined
  }
  object ContextLinesOptions {
    
    inline def apply(): ContextLinesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextLinesOptions]
    }
    
    extension [Self <: ContextLinesOptions](x: Self) {
      
      inline def setFrameContextLines(value: Double): Self = StObject.set(x, "frameContextLines", value.asInstanceOf[js.Any])
      
      inline def setFrameContextLinesUndefined: Self = StObject.set(x, "frameContextLines", js.undefined)
    }
  }
}
