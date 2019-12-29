package typings.relayDashRuntime

import typings.relayDashRuntime.libUtilRelayConcreteNodeMod.RequestParameters
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/util/getRequestIdentifier", JSImport.Namespace)
@js.native
object libUtilGetRequestIdentifierMod extends js.Object {
  def getRequestIdentifier(parameters: RequestParameters, variables: Variables): RequestIdentifier = js.native
  type RequestIdentifier = String
}

