package typings.relayDashRuntime.libUtilRelayConcreteNodeMod

import typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationOperation
import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderFragment
import typings.relayDashRuntime.relayDashRuntimeMod._GraphQLTaggedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcreteRequest
  extends GeneratedNode
     with _GraphQLTaggedNode {
   // 'Request';
  val fragment: ReaderFragment
  val kind: String
  val operation: NormalizationOperation
  val params: RequestParameters
}

object ConcreteRequest {
  @scala.inline
  def apply(
    fragment: ReaderFragment,
    kind: String,
    operation: NormalizationOperation,
    params: RequestParameters
  ): ConcreteRequest = {
    val __obj = js.Dynamic.literal(fragment = fragment, kind = kind, operation = operation, params = params)
  
    __obj.asInstanceOf[ConcreteRequest]
  }
}

