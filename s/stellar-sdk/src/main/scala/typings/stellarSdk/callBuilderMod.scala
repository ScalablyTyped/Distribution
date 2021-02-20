package typings.stellarSdk

import typings.std.MessageEvent
import typings.stellarSdk.horizonApiMod.Horizon.BaseResponse
import typings.stellarSdk.horizonApiMod.Horizon.FeeStatsResponse
import typings.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typings.stellarSdk.stellarSdkStrings.asc
import typings.stellarSdk.stellarSdkStrings.desc
import typings.stellarSdk.stellarSdkStrings.transactions
import typings.urijs.mod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callBuilderMod {
  
  @JSImport("stellar-sdk/lib/call_builder", "CallBuilder")
  @js.native
  class CallBuilder[T /* <: FeeStatsResponse | BaseResponse[scala.Nothing] | CollectionPage[BaseResponse[scala.Nothing]] */] protected () extends StObject {
    def this(serverUrl: URI) = this()
    
    var _handleNetworkError: js.Any = js.native
    
    var _parseRecord: js.Any = js.native
    
    var _parseResponse: js.Any = js.native
    
    var _requestFnForLink: js.Any = js.native
    
    var _sendNormalRequest: js.Any = js.native
    
    var _toCollectionPage: js.Any = js.native
    
    def call(): js.Promise[T] = js.native
    
    var checkFilter: js.Any = js.native
    
    def cursor(cursor: String): this.type = js.native
    
    var filter: js.Array[js.Array[String]] = js.native
    
    @JSName("join")
    def join_transactions(include: transactions): this.type = js.native
    
    def limit(recordsNumber: Double): this.type = js.native
    
    @JSName("order")
    def order_asc(direction: asc): this.type = js.native
    @JSName("order")
    def order_desc(direction: desc): this.type = js.native
    
    var originalSegments: js.Array[String] = js.native
    
    def stream(): js.Function0[Unit] = js.native
    def stream(options: EventSourceOptions[T]): js.Function0[Unit] = js.native
    
    var url: URI = js.native
  }
  
  @js.native
  trait EventSourceOptions[T] extends StObject {
    
    var onerror: js.UndefOr[js.Function1[/* event */ MessageEvent[_], Unit]] = js.native
    
    var onmessage: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
    
    var reconnectTimeout: js.UndefOr[Double] = js.native
  }
  object EventSourceOptions {
    
    @scala.inline
    def apply[T](): EventSourceOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventSourceOptions[T]]
    }
    
    @scala.inline
    implicit class EventSourceOptionsMutableBuilder[Self <: EventSourceOptions[_], T] (val x: Self with EventSourceOptions[T]) extends AnyVal {
      
      @scala.inline
      def setOnerror(value: /* event */ MessageEvent[_] => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      @scala.inline
      def setOnmessage(value: /* value */ T => Unit): Self = StObject.set(x, "onmessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnmessageUndefined: Self = StObject.set(x, "onmessage", js.undefined)
      
      @scala.inline
      def setReconnectTimeout(value: Double): Self = StObject.set(x, "reconnectTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectTimeoutUndefined: Self = StObject.set(x, "reconnectTimeout", js.undefined)
    }
  }
}
