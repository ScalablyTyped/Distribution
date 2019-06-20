package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcreteRequest
  extends GeneratedNode
     with _GraphQLTaggedNode {
   // 'Request';
  val fragment: ReaderFragment
  val kind: java.lang.String
  val operation: NormalizationOperation
  val params: RequestParameters
}

object ConcreteRequest {
  @scala.inline
  def apply(
    fragment: ReaderFragment,
    kind: java.lang.String,
    operation: NormalizationOperation,
    params: RequestParameters
  ): ConcreteRequest = {
    val __obj = js.Dynamic.literal(fragment = fragment, kind = kind, operation = operation, params = params)
  
    __obj.asInstanceOf[ConcreteRequest]
  }
}

