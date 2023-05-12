package typings.sentryBrowser

import typings.sentryCore.typesTransportsOfflineMod.OfflineTransportOptions
import typings.sentryTypes.typesClientreportMod.EventDropReason
import typings.sentryTypes.typesDatacategoryMod.DataCategory
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesTransportMod.InternalBaseTransportOptions
import typings.sentryTypes.typesTransportMod.Transport
import typings.sentryUtils.typesEnvelopeMod.TextDecoderInternal
import typings.std.IDBObjectStore
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTransportsOfflineMod {
  
  @JSImport("@sentry/browser/types/transports/offline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStore(dbName: String, storeName: String): Store = (^.asInstanceOf[js.Dynamic].applyDynamic("createStore")(dbName.asInstanceOf[js.Any], storeName.asInstanceOf[js.Any])).asInstanceOf[Store]
  
  inline def insert(store: Store, value: String, maxQueueSize: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(store.asInstanceOf[js.Any], value.asInstanceOf[js.Any], maxQueueSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def insert(store: Store, value: js.typedarray.Uint8Array, maxQueueSize: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(store.asInstanceOf[js.Any], value.asInstanceOf[js.Any], maxQueueSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def makeBrowserOfflineTransport[T /* <: InternalBaseTransportOptions */](createTransport: js.Function1[/* options */ T, Transport]): js.Function1[/* options */ T & BrowserOfflineTransportOptions, Transport] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeBrowserOfflineTransport")(createTransport.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* options */ T & BrowserOfflineTransportOptions, Transport]]
  
  inline def pop(store: Store): js.Promise[js.UndefOr[js.typedarray.Uint8Array | String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")(store.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[js.typedarray.Uint8Array | String]]]
  
  trait BrowserOfflineTransportOptions
    extends StObject
       with OfflineTransportOptions {
    
    /**
      * Name of indexedDb database to store envelopes in
      * Default: 'sentry-offline'
      */
    var dbName: js.UndefOr[String] = js.undefined
    
    /**
      * Maximum number of envelopes to store
      * Default: 30
      */
    var maxQueueSize: js.UndefOr[Double] = js.undefined
    
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
  object BrowserOfflineTransportOptions {
    
    inline def apply(
      recordDroppedEvent: (/* reason */ EventDropReason, /* dataCategory */ DataCategory, /* event */ js.UndefOr[Event]) => Unit
    ): BrowserOfflineTransportOptions = {
      val __obj = js.Dynamic.literal(recordDroppedEvent = js.Any.fromFunction3(recordDroppedEvent))
      __obj.asInstanceOf[BrowserOfflineTransportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BrowserOfflineTransportOptions] (val x: Self) extends AnyVal {
      
      inline def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
      
      inline def setDbNameUndefined: Self = StObject.set(x, "dbName", js.undefined)
      
      inline def setMaxQueueSize(value: Double): Self = StObject.set(x, "maxQueueSize", value.asInstanceOf[js.Any])
      
      inline def setMaxQueueSizeUndefined: Self = StObject.set(x, "maxQueueSize", js.undefined)
      
      inline def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
      
      inline def setStoreNameUndefined: Self = StObject.set(x, "storeName", js.undefined)
      
      inline def setTextDecoder(value: TextDecoderInternal): Self = StObject.set(x, "textDecoder", value.asInstanceOf[js.Any])
      
      inline def setTextDecoderUndefined: Self = StObject.set(x, "textDecoder", js.undefined)
    }
  }
  
  type Store = js.Function1[
    /* callback */ js.Function1[/* store */ IDBObjectStore, Any | PromiseLike[Any]], 
    js.Promise[Any]
  ]
}
