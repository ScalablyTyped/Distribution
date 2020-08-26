package typings.stickyCluster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stickyclusterworkerindex extends js.Object {
  var stickycluster_worker_index: Double = js.native
}

object Stickyclusterworkerindex {
  @scala.inline
  def apply(stickycluster_worker_index: Double): Stickyclusterworkerindex = {
    val __obj = js.Dynamic.literal(stickycluster_worker_index = stickycluster_worker_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stickyclusterworkerindex]
  }
  @scala.inline
  implicit class StickyclusterworkerindexOps[Self <: Stickyclusterworkerindex] (val x: Self) extends AnyVal {
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
    def setStickycluster_worker_index(value: Double): Self = this.set("stickycluster_worker_index", value.asInstanceOf[js.Any])
  }
  
}

