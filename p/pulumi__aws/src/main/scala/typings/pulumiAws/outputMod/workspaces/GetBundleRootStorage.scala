package typings.pulumiAws.outputMod.workspaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBundleRootStorage extends js.Object {
  /**
    * The size of the user storage.
    */
  var capacity: String = js.native
}

object GetBundleRootStorage {
  @scala.inline
  def apply(capacity: String): GetBundleRootStorage = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBundleRootStorage]
  }
  @scala.inline
  implicit class GetBundleRootStorageOps[Self <: GetBundleRootStorage] (val x: Self) extends AnyVal {
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
    def setCapacity(value: String): Self = this.set("capacity", value.asInstanceOf[js.Any])
  }
  
}

