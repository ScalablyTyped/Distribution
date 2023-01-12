package typings.sentryBrowser

import typings.sentryBrowser.anon.PartialTryCatchOptions
import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesHubMod.Hub
import typings.sentryTypes.typesIntegrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIntegrationsTrycatchMod {
  
  @JSImport("@sentry/browser/types/integrations/trycatch", "TryCatch")
  @js.native
  /**
    * @inheritDoc
    */
  open class TryCatch ()
    extends StObject
       with Integration {
    def this(options: PartialTryCatchOptions) = this()
    
    /** JSDoc */
    /* private */ val _options: Any = js.native
    
    /**
      * Returns {@link IntegrationClass.id}
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Wrap timer functions and event targets to catch errors
      * and provide better metadata.
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
  object TryCatch {
    
    @JSImport("@sentry/browser/types/integrations/trycatch", "TryCatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/types/integrations/trycatch", "TryCatch.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  /** JSDoc */
  trait TryCatchOptions extends StObject {
    
    var XMLHttpRequest: Boolean
    
    var eventTarget: Boolean | js.Array[String]
    
    var requestAnimationFrame: Boolean
    
    var setInterval: Boolean
    
    var setTimeout: Boolean
  }
  object TryCatchOptions {
    
    inline def apply(
      XMLHttpRequest: Boolean,
      eventTarget: Boolean | js.Array[String],
      requestAnimationFrame: Boolean,
      setInterval: Boolean,
      setTimeout: Boolean
    ): TryCatchOptions = {
      val __obj = js.Dynamic.literal(XMLHttpRequest = XMLHttpRequest.asInstanceOf[js.Any], eventTarget = eventTarget.asInstanceOf[js.Any], requestAnimationFrame = requestAnimationFrame.asInstanceOf[js.Any], setInterval = setInterval.asInstanceOf[js.Any], setTimeout = setTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[TryCatchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TryCatchOptions] (val x: Self) extends AnyVal {
      
      inline def setEventTarget(value: Boolean | js.Array[String]): Self = StObject.set(x, "eventTarget", value.asInstanceOf[js.Any])
      
      inline def setEventTargetVarargs(value: String*): Self = StObject.set(x, "eventTarget", js.Array(value*))
      
      inline def setRequestAnimationFrame(value: Boolean): Self = StObject.set(x, "requestAnimationFrame", value.asInstanceOf[js.Any])
      
      inline def setSetInterval(value: Boolean): Self = StObject.set(x, "setInterval", value.asInstanceOf[js.Any])
      
      inline def setSetTimeout(value: Boolean): Self = StObject.set(x, "setTimeout", value.asInstanceOf[js.Any])
      
      inline def setXMLHttpRequest(value: Boolean): Self = StObject.set(x, "XMLHttpRequest", value.asInstanceOf[js.Any])
    }
  }
}
