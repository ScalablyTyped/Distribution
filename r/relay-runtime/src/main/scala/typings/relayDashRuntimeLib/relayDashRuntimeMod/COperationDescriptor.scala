package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait COperationDescriptor[TReaderNode, TNormalizationNode, TRequest] extends js.Object {
  var fragment: CReaderSelector[TReaderNode]
  var node: TRequest
  var root: CNormalizationSelector[TNormalizationNode]
  var variables: Variables
}

object COperationDescriptor {
  @scala.inline
  def apply[TReaderNode, TNormalizationNode, TRequest](
    fragment: CReaderSelector[TReaderNode],
    node: TRequest,
    root: CNormalizationSelector[TNormalizationNode],
    variables: Variables
  ): COperationDescriptor[TReaderNode, TNormalizationNode, TRequest] = {
    val __obj = js.Dynamic.literal(fragment = fragment, node = node.asInstanceOf[js.Any], root = root, variables = variables)
  
    __obj.asInstanceOf[COperationDescriptor[TReaderNode, TNormalizationNode, TRequest]]
  }
}

