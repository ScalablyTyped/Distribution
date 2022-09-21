package typings.sentryBrowser

import typings.sentryBrowser.anon.PartialLinkedErrorsOption
import typings.sentryTypes.errorMod.ExtendedError
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.eventMod.EventHint
import typings.sentryTypes.eventprocessorMod.EventProcessor
import typings.sentryTypes.exceptionMod.Exception
import typings.sentryTypes.hubMod.Hub
import typings.sentryTypes.integrationMod.Integration
import typings.sentryTypes.stacktraceMod.StackParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkederrorsMod {
  
  @JSImport("@sentry/browser/types/integrations/linkederrors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/browser/types/integrations/linkederrors", "LinkedErrors")
  @js.native
  /**
    * @inheritDoc
    */
  open class LinkedErrors ()
    extends StObject
       with Integration {
    def this(options: PartialLinkedErrorsOption) = this()
    
    /**
      * @inheritDoc
      */
    /* private */ val _key: Any = js.native
    
    /**
      * @inheritDoc
      */
    /* private */ val _limit: Any = js.native
    
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
    
    @JSImport("@sentry/browser/types/integrations/linkederrors", "LinkedErrors")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/types/integrations/linkederrors", "LinkedErrors.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  inline def handler(parser: StackParser, key: String, limit: Double, event: Event): Event | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("_handler")(parser.asInstanceOf[js.Any], key.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Event | Null]
  inline def handler(parser: StackParser, key: String, limit: Double, event: Event, hint: EventHint): Event | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("_handler")(parser.asInstanceOf[js.Any], key.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], event.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[Event | Null]
  
  inline def walkErrorTree(parser: StackParser, limit: Double, error: ExtendedError, key: String): js.Array[Exception] = (^.asInstanceOf[js.Dynamic].applyDynamic("_walkErrorTree")(parser.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], error.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[Exception]]
  inline def walkErrorTree(parser: StackParser, limit: Double, error: ExtendedError, key: String, stack: js.Array[Exception]): js.Array[Exception] = (^.asInstanceOf[js.Dynamic].applyDynamic("_walkErrorTree")(parser.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], error.asInstanceOf[js.Any], key.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[js.Array[Exception]]
  
  trait LinkedErrorsOptions extends StObject {
    
    var key: String
    
    var limit: Double
  }
  object LinkedErrorsOptions {
    
    inline def apply(key: String, limit: Double): LinkedErrorsOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkedErrorsOptions]
    }
    
    extension [Self <: LinkedErrorsOptions](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    }
  }
}
