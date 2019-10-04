package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libUtilGetRequestIdentifierMod.RequestIdentifier
import typings.relayDashRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestDescriptor extends js.Object {
  var identifier: RequestIdentifier
  var node: ConcreteRequest
  var variables: Variables
}

object RequestDescriptor {
  @scala.inline
  def apply(identifier: RequestIdentifier, node: ConcreteRequest, variables: Variables): RequestDescriptor = {
    val __obj = js.Dynamic.literal(identifier = identifier, node = node, variables = variables)
  
    __obj.asInstanceOf[RequestDescriptor]
  }
}

