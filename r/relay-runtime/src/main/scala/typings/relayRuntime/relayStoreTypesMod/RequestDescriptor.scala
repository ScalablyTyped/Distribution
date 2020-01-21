package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.getRequestIdentifierMod.RequestIdentifier
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestDescriptor extends js.Object {
  val identifier: RequestIdentifier
  val node: ConcreteRequest
  val variables: Variables
}

object RequestDescriptor {
  @scala.inline
  def apply(identifier: RequestIdentifier, node: ConcreteRequest, variables: Variables): RequestDescriptor = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequestDescriptor]
  }
}

