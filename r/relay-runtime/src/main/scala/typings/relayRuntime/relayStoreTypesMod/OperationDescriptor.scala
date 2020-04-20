package typings.relayRuntime.relayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationDescriptor extends js.Object {
  val fragment: SingularReaderSelector
  val request: RequestDescriptor
  val root: NormalizationSelector
}

object OperationDescriptor {
  @scala.inline
  def apply(fragment: SingularReaderSelector, request: RequestDescriptor, root: NormalizationSelector): OperationDescriptor = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationDescriptor]
  }
}

