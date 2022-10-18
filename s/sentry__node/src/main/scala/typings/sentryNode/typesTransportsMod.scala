package typings.sentryNode

import typings.sentryNode.typesTransportsHttpMod.NodeTransportOptions
import typings.sentryTypes.typesTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTransportsMod {
  
  @JSImport("@sentry/node/types/transports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeNodeTransport(options: NodeTransportOptions): Transport = ^.asInstanceOf[js.Dynamic].applyDynamic("makeNodeTransport")(options.asInstanceOf[js.Any]).asInstanceOf[Transport]
}
