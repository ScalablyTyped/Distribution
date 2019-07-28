package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OwnedReaderSelector extends js.Object {
  var owner: OperationDescriptor | Null
  var selector: ReaderSelector
}

object OwnedReaderSelector {
  @scala.inline
  def apply(selector: ReaderSelector, owner: OperationDescriptor = null): OwnedReaderSelector = {
    val __obj = js.Dynamic.literal(selector = selector)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[OwnedReaderSelector]
  }
}

