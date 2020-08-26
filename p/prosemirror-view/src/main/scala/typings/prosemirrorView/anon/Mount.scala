package typings.prosemirrorView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mount extends js.Object {
  var mount: typings.std.Node = js.native
}

object Mount {
  @scala.inline
  def apply(mount: typings.std.Node): Mount = {
    val __obj = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mount]
  }
  @scala.inline
  implicit class MountOps[Self <: Mount] (val x: Self) extends AnyVal {
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
    def setMount(value: typings.std.Node): Self = this.set("mount", value.asInstanceOf[js.Any])
  }
  
}

