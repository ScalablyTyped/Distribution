package typings.sentryCore

import typings.sentryTypes.transportMod.InternalBaseTransportOptions
import typings.sentryTypes.transportMod.Transport
import typings.sentryTypes.transportMod.TransportRequestExecutor
import typings.sentryUtils.promisebufferMod.PromiseBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("@sentry/core/types/transports/base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/core/types/transports/base", "DEFAULT_TRANSPORT_BUFFER_SIZE")
  @js.native
  val DEFAULT_TRANSPORT_BUFFER_SIZE: /* 30 */ Double = js.native
  
  inline def createTransport(options: InternalBaseTransportOptions, makeRequest: TransportRequestExecutor): Transport = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(options.asInstanceOf[js.Any], makeRequest.asInstanceOf[js.Any])).asInstanceOf[Transport]
  inline def createTransport(
    options: InternalBaseTransportOptions,
    makeRequest: TransportRequestExecutor,
    buffer: PromiseBuffer[Unit]
  ): Transport = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(options.asInstanceOf[js.Any], makeRequest.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Transport]
}
