package typings.relayRuntime.relayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationDescriptor extends js.Object {
  val fragment: SingularReaderSelector = js.native
  val request: RequestDescriptor = js.native
  val root: NormalizationSelector = js.native
}

object OperationDescriptor {
  @scala.inline
  def apply(fragment: SingularReaderSelector, request: RequestDescriptor, root: NormalizationSelector): OperationDescriptor = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationDescriptor]
  }
  @scala.inline
  implicit class OperationDescriptorOps[Self <: OperationDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFragment(value: SingularReaderSelector): Self = this.set("fragment", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: RequestDescriptor): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: NormalizationSelector): Self = this.set("root", value.asInstanceOf[js.Any])
  }
  
}

