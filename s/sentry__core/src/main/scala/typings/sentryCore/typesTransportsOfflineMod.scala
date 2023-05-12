package typings.sentryCore

import typings.sentryTypes.typesClientreportMod.EventDropReason
import typings.sentryTypes.typesDatacategoryMod.DataCategory
import typings.sentryTypes.typesEnvelopeMod.Envelope
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesTransportMod.InternalBaseTransportOptions
import typings.sentryTypes.typesTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTransportsOfflineMod {
  
  @JSImport("@sentry/core/types/transports/offline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/core/types/transports/offline", "MIN_DELAY")
  @js.native
  val MIN_DELAY: /* 100 */ Double = js.native
  
  @JSImport("@sentry/core/types/transports/offline", "START_DELAY")
  @js.native
  val START_DELAY: /* 5000 */ Double = js.native
  
  inline def makeOfflineTransport[TO](createTransport: js.Function1[/* options */ TO, Transport]): js.Function1[/* options */ TO & OfflineTransportOptions, Transport] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeOfflineTransport")(createTransport.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* options */ TO & OfflineTransportOptions, Transport]]
  
  type CreateOfflineStore = js.Function1[/* options */ OfflineTransportOptions, OfflineStore]
  
  trait OfflineStore extends StObject {
    
    def insert(env: Envelope): js.Promise[Unit]
    
    def pop(): js.Promise[js.UndefOr[Envelope]]
  }
  object OfflineStore {
    
    inline def apply(insert: Envelope => js.Promise[Unit], pop: () => js.Promise[js.UndefOr[Envelope]]): OfflineStore = {
      val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), pop = js.Any.fromFunction0(pop))
      __obj.asInstanceOf[OfflineStore]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OfflineStore] (val x: Self) extends AnyVal {
      
      inline def setInsert(value: Envelope => js.Promise[Unit]): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
      
      inline def setPop(value: () => js.Promise[js.UndefOr[Envelope]]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
    }
  }
  
  trait OfflineTransportOptions
    extends StObject
       with InternalBaseTransportOptions {
    
    /**
      * A function that creates the offline store instance.
      */
    var createStore: js.UndefOr[CreateOfflineStore] = js.undefined
    
    /**
      * Flush the offline store shortly after startup.
      *
      * Defaults: false
      */
    var flushAtStartup: js.UndefOr[Boolean] = js.undefined
    
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
  }
  object OfflineTransportOptions {
    
    inline def apply(
      recordDroppedEvent: (/* reason */ EventDropReason, /* dataCategory */ DataCategory, /* event */ js.UndefOr[Event]) => Unit
    ): OfflineTransportOptions = {
      val __obj = js.Dynamic.literal(recordDroppedEvent = js.Any.fromFunction3(recordDroppedEvent))
      __obj.asInstanceOf[OfflineTransportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OfflineTransportOptions] (val x: Self) extends AnyVal {
      
      inline def setCreateStore(value: /* options */ OfflineTransportOptions => OfflineStore): Self = StObject.set(x, "createStore", js.Any.fromFunction1(value))
      
      inline def setCreateStoreUndefined: Self = StObject.set(x, "createStore", js.undefined)
      
      inline def setFlushAtStartup(value: Boolean): Self = StObject.set(x, "flushAtStartup", value.asInstanceOf[js.Any])
      
      inline def setFlushAtStartupUndefined: Self = StObject.set(x, "flushAtStartup", js.undefined)
      
      inline def setShouldStore(
        value: (/* envelope */ Envelope, /* error */ js.Error, /* retryDelay */ Double) => Boolean | js.Promise[Boolean]
      ): Self = StObject.set(x, "shouldStore", js.Any.fromFunction3(value))
      
      inline def setShouldStoreUndefined: Self = StObject.set(x, "shouldStore", js.undefined)
    }
  }
}
