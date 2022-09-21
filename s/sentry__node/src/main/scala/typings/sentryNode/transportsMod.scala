package typings.sentryNode

import typings.sentryNode.transportsHttpMod.NodeTransportOptions
import typings.sentryTypes.transportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportsMod {
  
  @JSImport("@sentry/node/types/transports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeNodeTransport(options: NodeTransportOptions): Transport = ^.asInstanceOf[js.Dynamic].applyDynamic("makeNodeTransport")(options.asInstanceOf[js.Any]).asInstanceOf[Transport]
}
