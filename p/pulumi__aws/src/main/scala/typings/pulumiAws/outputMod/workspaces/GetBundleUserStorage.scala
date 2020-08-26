package typings.pulumiAws.outputMod.workspaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBundleUserStorage extends js.Object {
  /**
    * The size of the user storage.
    */
  var capacity: String = js.native
}

object GetBundleUserStorage {
  @scala.inline
  def apply(capacity: String): GetBundleUserStorage = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBundleUserStorage]
  }
  @scala.inline
  implicit class GetBundleUserStorageOps[Self <: GetBundleUserStorage] (val x: Self) extends AnyVal {
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

