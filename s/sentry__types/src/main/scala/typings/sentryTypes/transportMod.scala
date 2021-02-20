package typings.sentryTypes

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.dsnMod.DsnLike
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.responseMod.Response
import typings.sentryTypes.sessionMod.Session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportMod {
  
  @js.native
  trait Transport extends StObject {
    
    /**
      * Call this function to wait until all pending requests have been sent.
      *
      * @param timeout Number time in ms to wait until the buffer is drained.
      */
    def close(): js.Thenable[Boolean] = js.native
    def close(timeout: Double): js.Thenable[Boolean] = js.native
    
    /**
      * Sends the event to the Store endpoint in Sentry.
      *
      * @param event Event that should be sent to Sentry.
      */
    def sendEvent(event: Event): js.Thenable[Response] = js.native
    
    /**
      * Sends the session to the Store endpoint in Sentry.
      *
      * @param body Session that should be sent to Sentry.
      */
    var sendSession: js.UndefOr[js.Function1[/* session */ Session, js.Thenable[Response]]] = js.native
  }
  
  type TransportClass[T /* <: Transport */] = Instantiable1[/* options */ TransportOptions, T]
  
  @js.native
  trait TransportOptions extends StObject {
    
    /** HTTPS proxy certificates path */
    var caCerts: js.UndefOr[String] = js.native
    
    /** Sentry DSN */
    var dsn: DsnLike = js.native
    
    /** Fetch API init parameters */
    var fetchParameters: js.UndefOr[StringDictionary[String]] = js.native
    
    /** Define custom headers */
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    /** Set a HTTP proxy that should be used for outbound requests. */
    var httpProxy: js.UndefOr[String] = js.native
    
    /** Set a HTTPS proxy that should be used for outbound requests. */
    var httpsProxy: js.UndefOr[String] = js.native
  }
  object TransportOptions {
    
    @scala.inline
    def apply(dsn: DsnLike): TransportOptions = {
      val __obj = js.Dynamic.literal(dsn = dsn.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransportOptions]
    }
    
    @scala.inline
    implicit class TransportOptionsMutableBuilder[Self <: TransportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaCerts(value: String): Self = StObject.set(x, "caCerts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaCertsUndefined: Self = StObject.set(x, "caCerts", js.undefined)
      
      @scala.inline
      def setDsn(value: DsnLike): Self = StObject.set(x, "dsn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchParameters(value: StringDictionary[String]): Self = StObject.set(x, "fetchParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchParametersUndefined: Self = StObject.set(x, "fetchParameters", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHttpProxy(value: String): Self = StObject.set(x, "httpProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpProxyUndefined: Self = StObject.set(x, "httpProxy", js.undefined)
      
      @scala.inline
      def setHttpsProxy(value: String): Self = StObject.set(x, "httpsProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsProxyUndefined: Self = StObject.set(x, "httpsProxy", js.undefined)
    }
  }
}
