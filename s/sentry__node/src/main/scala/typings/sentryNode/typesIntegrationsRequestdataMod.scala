package typings.sentryNode

import typings.sentryNode.anon.Cookies
import typings.sentryNode.anon.PartialRequestDataOptions
import typings.sentryNode.typesRequestdataMod.AddRequestDataToEventOptions
import typings.sentryNode.typesRequestdataMod.TransactionNamingScheme
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesHubMod.Hub
import typings.sentryTypes.typesIntegrationMod.Integration
import typings.sentryTypes.typesPolymorphicsMod.PolymorphicRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIntegrationsRequestdataMod {
  
  @JSImport("@sentry/node/types/integrations/requestdata", "RequestData")
  @js.native
  /**
    * @inheritDoc
    */
  open class RequestData ()
    extends StObject
       with Integration {
    def this(options: PartialRequestDataOptions) = this()
    
    /* private */ var _options: Any = js.native
    
    /**
      * Returns {@link IntegrationClass.id}
      */
    /* CompleteClass */
    var name: String = js.native
    
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
  object RequestData {
    
    @JSImport("@sentry/node/types/integrations/requestdata", "RequestData")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/node/types/integrations/requestdata", "RequestData.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  trait RequestDataOptions extends StObject {
    
    /**
      * Function for adding request data to event. Defaults to `addRequestDataToEvent` from `@sentry/node` for now, but
      * left injectable so this integration can be moved to `@sentry/core` and used in browser-based SDKs in the future.
      *
      * @hidden
      */
    def addRequestData(event: Event, req: PolymorphicRequest): Event
    def addRequestData(event: Event, req: PolymorphicRequest, options: AddRequestDataToEventOptions): Event
    /**
      * Function for adding request data to event. Defaults to `addRequestDataToEvent` from `@sentry/node` for now, but
      * left injectable so this integration can be moved to `@sentry/core` and used in browser-based SDKs in the future.
      *
      * @hidden
      */
    @JSName("addRequestData")
    var addRequestData_Original: js.Function3[
        /* event */ Event, 
        /* req */ PolymorphicRequest, 
        /* options */ js.UndefOr[AddRequestDataToEventOptions], 
        Event
      ]
    
    /**
      * Controls what data is pulled from the request and added to the event
      */
    var include: Cookies
    
    /** Whether to identify transactions by parameterized path, parameterized path with method, or handler name */
    var transactionNamingScheme: TransactionNamingScheme
  }
  object RequestDataOptions {
    
    inline def apply(
      addRequestData: (/* event */ Event, /* req */ PolymorphicRequest, /* options */ js.UndefOr[AddRequestDataToEventOptions]) => Event,
      include: Cookies,
      transactionNamingScheme: TransactionNamingScheme
    ): RequestDataOptions = {
      val __obj = js.Dynamic.literal(addRequestData = js.Any.fromFunction3(addRequestData), include = include.asInstanceOf[js.Any], transactionNamingScheme = transactionNamingScheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestDataOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestDataOptions] (val x: Self) extends AnyVal {
      
      inline def setAddRequestData(
        value: (/* event */ Event, /* req */ PolymorphicRequest, /* options */ js.UndefOr[AddRequestDataToEventOptions]) => Event
      ): Self = StObject.set(x, "addRequestData", js.Any.fromFunction3(value))
      
      inline def setInclude(value: Cookies): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setTransactionNamingScheme(value: TransactionNamingScheme): Self = StObject.set(x, "transactionNamingScheme", value.asInstanceOf[js.Any])
    }
  }
}
