package typings.sentryBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.sentryCore.typesTransportsOfflineMod.CreateOfflineStore
import typings.sentryCore.typesTransportsOfflineMod.OfflineStore
import typings.sentryCore.typesTransportsOfflineMod.OfflineTransportOptions
import typings.sentryTypes.typesClientreportMod.EventDropReason
import typings.sentryTypes.typesDatacategoryMod.DataCategory
import typings.sentryTypes.typesEnvelopeMod.Envelope
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesTransportMod.BaseTransportOptions
import typings.sentryUtils.typesEnvelopeMod.TextDecoderInternal
import typings.std.RequestInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTransportsTypesMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.sentryTypes.typesTransportMod.InternalBaseTransportOptions because Already inherited
  - typings.sentryCore.typesTransportsOfflineMod.OfflineTransportOptions because var conflicts: bufferSize, recordDroppedEvent_Original, textEncoder. Inlined flushAtStartup, createStore, shouldStore
  - typings.sentryBrowser.typesTransportsOfflineMod.BrowserOfflineTransportOptions because var conflicts: bufferSize, recordDroppedEvent_Original, textEncoder. Inlined dbName, storeName, maxQueueSize, textDecoder */ trait BaseTransportAndOfflineTransportOptions
    extends StObject
       with BaseTransportOptions {
    
    /**
      * A function that creates the offline store instance.
      */
    var createStore: js.UndefOr[CreateOfflineStore] = js.undefined
    
    /**
      * Name of indexedDb database to store envelopes in
      * Default: 'sentry-offline'
      */
    var dbName: js.UndefOr[String] = js.undefined
    
    /**
      * Flush the offline store shortly after startup.
      *
      * Defaults: false
      */
    var flushAtStartup: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum number of envelopes to store
      * Default: 30
      */
    var maxQueueSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Called before an event is stored.
      *
      * Return false to drop the envelope rather than store it.
      *
      * @param envelope The envelope that failed to send.
      * @param error The error that occurred.
      * @param retryDelay The current retry delay in milliseconds.
      */
    var shouldStore: js.UndefOr[
        js.Function3[
          /* envelope */ Envelope, 
          /* error */ js.Error, 
          /* retryDelay */ Double, 
          Boolean | js.Promise[Boolean]
        ]
      ] = js.undefined
    
    /**
      * Name of indexedDb object store to store envelopes in
      * Default: 'queue'
      */
    var storeName: js.UndefOr[String] = js.undefined
    
    /**
      * Only required for testing on node.js
      * @ignore
      */
    var textDecoder: js.UndefOr[TextDecoderInternal] = js.undefined
  }
  object BaseTransportAndOfflineTransportOptions {
    
    inline def apply(
      recordDroppedEvent: (/* reason */ EventDropReason, /* dataCategory */ DataCategory, /* event */ js.UndefOr[Event]) => Unit,
      url: String
    ): BaseTransportAndOfflineTransportOptions = {
      val __obj = js.Dynamic.literal(recordDroppedEvent = js.Any.fromFunction3(recordDroppedEvent), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseTransportAndOfflineTransportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseTransportAndOfflineTransportOptions] (val x: Self) extends AnyVal {
      
      inline def setCreateStore(value: /* options */ OfflineTransportOptions => OfflineStore): Self = StObject.set(x, "createStore", js.Any.fromFunction1(value))
      
      inline def setCreateStoreUndefined: Self = StObject.set(x, "createStore", js.undefined)
      
      inline def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
      
      inline def setDbNameUndefined: Self = StObject.set(x, "dbName", js.undefined)
      
      inline def setFlushAtStartup(value: Boolean): Self = StObject.set(x, "flushAtStartup", value.asInstanceOf[js.Any])
      
      inline def setFlushAtStartupUndefined: Self = StObject.set(x, "flushAtStartup", js.undefined)
      
      inline def setMaxQueueSize(value: Double): Self = StObject.set(x, "maxQueueSize", value.asInstanceOf[js.Any])
      
      inline def setMaxQueueSizeUndefined: Self = StObject.set(x, "maxQueueSize", js.undefined)
      
      inline def setShouldStore(
        value: (/* envelope */ Envelope, /* error */ js.Error, /* retryDelay */ Double) => Boolean | js.Promise[Boolean]
      ): Self = StObject.set(x, "shouldStore", js.Any.fromFunction3(value))
      
      inline def setShouldStoreUndefined: Self = StObject.set(x, "shouldStore", js.undefined)
      
      inline def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
      
      inline def setStoreNameUndefined: Self = StObject.set(x, "storeName", js.undefined)
      
      inline def setTextDecoder(value: TextDecoderInternal): Self = StObject.set(x, "textDecoder", value.asInstanceOf[js.Any])
      
      inline def setTextDecoderUndefined: Self = StObject.set(x, "textDecoder", js.undefined)
    }
  }
  
  trait BrowserTransportOptions
    extends StObject
       with BaseTransportAndOfflineTransportOptions {
    
    /** Fetch API init parameters. Used by the FetchTransport */
    var fetchOptions: js.UndefOr[RequestInit] = js.undefined
    
    /** Custom headers for the transport. Used by the XHRTransport and FetchTransport */
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object BrowserTransportOptions {
    
    inline def apply(
      recordDroppedEvent: (/* reason */ EventDropReason, /* dataCategory */ DataCategory, /* event */ js.UndefOr[Event]) => Unit,
      url: String
    ): BrowserTransportOptions = {
      val __obj = js.Dynamic.literal(recordDroppedEvent = js.Any.fromFunction3(recordDroppedEvent), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserTransportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BrowserTransportOptions] (val x: Self) extends AnyVal {
      
      inline def setFetchOptions(value: RequestInit): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
      
      inline def setFetchOptionsUndefined: Self = StObject.set(x, "fetchOptions", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    }
  }
}
