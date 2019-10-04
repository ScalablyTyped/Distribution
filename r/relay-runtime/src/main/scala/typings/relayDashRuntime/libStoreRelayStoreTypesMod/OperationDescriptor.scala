package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationDescriptor extends js.Object {
  var fragment: SingularReaderSelector
  var request: RequestDescriptor
  var root: NormalizationSelector
}

object OperationDescriptor {
  @scala.inline
  def apply(fragment: SingularReaderSelector, request: RequestDescriptor, root: NormalizationSelector): OperationDescriptor = {
    val __obj = js.Dynamic.literal(fragment = fragment, request = request, root = root)
  
    __obj.asInstanceOf[OperationDescriptor]
  }
}

