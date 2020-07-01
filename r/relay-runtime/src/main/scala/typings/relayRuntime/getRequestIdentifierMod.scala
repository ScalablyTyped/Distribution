package typings.relayRuntime

import typings.relayRuntime.relayConcreteNodeMod.RequestParameters
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/util/getRequestIdentifier", JSImport.Namespace)
@js.native
object getRequestIdentifierMod extends js.Object {
  def default(parameters: RequestParameters, variables: Variables): RequestIdentifier = js.native
  type RequestIdentifier = String
}

